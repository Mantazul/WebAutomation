package menu;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MenuPage extends CommonAPI {
    /*public void readMenuTest(){
        List<String> actualData = new ArrayList<>();
        List<WebElement> element =getListOfWebElementsByCss(".nav-search-dropdown.searchSelect option");
        for(WebElement text:element){
        actualData.add(text.getText());
        System.out.println(text.getText());
    }
    //to be implemented,to read from database
    List<String> menuData = new ArrayList<>();
    Assert.assertEquals(menuData,actualData);
    }*/
    //.nav-home.search-dropdown.searchSelect option
    public void readMenuText() {
        //List<String> menu =  getTextFromWebElements(".nav-home.search-dropdown.searchSelect option");
        List<WebElement> element = getListOfWebElementsByCss(".nav-search-dropdown.searchSelect option");
        List<String> listOfText = getListOfString(element);
        for (String text : listOfText) {
            System.out.println(text);
        }
        List<String> expectedMenu = listOfText;
        Assert.assertEquals(listOfText, expectedMenu);
    }
}
