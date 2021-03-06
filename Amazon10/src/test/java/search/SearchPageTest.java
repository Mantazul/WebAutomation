package search;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SearchPage;
import reporting.TestLogger;

import java.io.IOException;

public class SearchPageTest extends SearchPage {
    SearchPage searchObject;
    @BeforeMethod
    public void init(){
        searchObject = PageFactory.initElements(driver,SearchPage.class);
    }
    @Test
    public void searchData()throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchItemsAndSubmitButton();
    }
}