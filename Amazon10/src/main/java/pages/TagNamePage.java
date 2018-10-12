package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TagNamePage extends CommonAPI {
    @FindBy(tagName = "a")public static WebElement registryA;
    public void registryATest(){
        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println("Number of links: "+list.size());
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getText());
        }
        //registryA.click();
    }
}
