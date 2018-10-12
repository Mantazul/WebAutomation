package search;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import reporting.TestLogger;

import java.io.IOException;

public class HomePageTest extends HomePage {
    HomePage object;
    @BeforeMethod
    public void init(){
        object = PageFactory.initElements(driver,HomePage.class);
    }
     @Test
     public void search(){
         TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
         typeOnInputBox("#searchDropdownBox","coffee");
     }
     @Test
     public void searchData()throws IOException {
         TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
         HomePage homePage=PageFactory.initElements(driver,HomePage.class);
         homePage.searchItemsAndSubmitButton();
    }
}


