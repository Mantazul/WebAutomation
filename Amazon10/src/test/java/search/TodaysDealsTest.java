package search;

import database.ConnectToMongoDB;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TodayDeals;

import java.util.List;

public class TodaysDealsTest extends TodayDeals {
    TodayDeals object;
    @BeforeMethod
    public void init(){
        object = PageFactory.initElements(driver, TodayDeals.class);
    }
    @Test
    public void testMenuItems(){
        List<String> spanText = ConnectToMongoDB.readFromMongoDB();
        List<WebElement> element = retMenuList();
        for(int index=0;index<spanText.size();index++){
            Assert.assertEquals(element.get(index).getText(),spanText.get(index));
        }
    }
}
