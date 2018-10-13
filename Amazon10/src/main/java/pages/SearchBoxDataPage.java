package pages;

import base.CommonAPI;
import base.CommonClass;
import database.ConnectToSqlDB;
import database.ConnectToSqlDB2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

import static pages.NavigationBarOptionMethod.searchBox;

public class SearchBoxDataPage extends CommonAPI {
    @FindBy(how = How.CSS, using ="#twotabsearchtextbox")
    public static WebElement searchBox;
    @FindBy(how = How.CSS, using =".nav-input")
    public static WebElement searchClick;

    public List<String> getMenuData(){
        List<String> data = new ArrayList<>();
        data.add("Laptop");
        data.add("honey");
        data.add("power bank");
        return data;
    }
    public void searchItemsFromDB() throws Exception {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ConnectToSqlDB2.insertDataFromArrayListToMySql(getMenuData(), "searchtest", "test");
        List<String> itemsToSearch = ConnectToSqlDB2.readDataBase("searchtest", "test");
        for (String e: itemsToSearch){
            searchBox.sendKeys(e);
            searchClick.click();
            sleepFor(2);
            driver.navigate().back();
        }
}
}
