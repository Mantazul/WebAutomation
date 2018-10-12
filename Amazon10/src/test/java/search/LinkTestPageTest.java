package search;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LinkTestPage;
import pages.NavigationBarOptionMethod;
import reporting.TestLogger;

import static pages.LinkTestPage.yourAzcom;

public class LinkTestPageTest extends LinkTestPage {
    LinkTestPage object;
    @BeforeMethod
    public void init(){
        object = PageFactory.initElements(driver,LinkTestPage.class);
    }
    @Test
    public void LinkTestPage() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        yourAzcom();
        Thread.sleep(3000);
    }
    @Test
    public void LinkTestPage1()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        your();
        Thread.sleep(3000);
    }
}
