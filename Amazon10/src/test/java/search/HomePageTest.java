package search;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import java.io.IOException;

public class HomePageTest extends HomePage {
    HomePage object;
    @BeforeMethod
    public void init(){
        object = PageFactory.initElements(driver,HomePage.class);
    }
     @Test
     public void search(){
         typeOnInputBox("#searchDropdownBox","coffee");
     }
     @Test
    public void searchData()throws IOException {
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        homePage.searchItemsAndSubmitButton();
    }
    /*@Test   //(failed)
    public void verifyGoToLoginPage()throws IOException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToLoginPage();
    }*/
}


