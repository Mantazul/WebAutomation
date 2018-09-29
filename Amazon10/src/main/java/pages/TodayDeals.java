package pages;

import base.CommonAPI;
import base.CommonClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class TodayDeals extends CommonAPI {
    public List<WebElement> retMenuList(){
        driver.navigate().to("https://www.amazon.com/gp/goldbox?ref=nav_cs_gb");
        List<WebElement>todaysDealsList = driver.findElements(By.xpath("//div[@id='nav-subnav']/a/span"));
        return todaysDealsList;
    }

}
