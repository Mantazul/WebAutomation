package search;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LinkTestPage;
import pages.NavigationBarOptionMethod;

import static pages.LinkTestPage.yourAzcom;

public class LinkTestPageTest extends LinkTestPage {
    LinkTestPage object;
    @BeforeMethod
    public void init(){
        object = PageFactory.initElements(driver,LinkTestPage.class);
    }
    @Test
    public void LinkTestPage() throws InterruptedException {
        yourAzcom();
        Thread.sleep(3000);
    }
    @Test
    public void LinkTestPage1(){your();}
}
