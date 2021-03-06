package search;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TagNamePage;
import reporting.TestLogger;

import java.io.IOException;

public class TagNamePageTest extends TagNamePage {
    TagNamePage searchObject;
    @BeforeMethod
    public void init(){
        searchObject = PageFactory.initElements(driver,TagNamePage.class);
    }
    @Test
    public void searchTagName()throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        registryATest();
    }
}
