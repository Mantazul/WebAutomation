package newCustomerPageTest;

import keyWordDrivenPage.Features;
import newCustomerPage.StartHerePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StartHerePageTest extends StartHerePage {
    StartHerePage objSH;
    @BeforeMethod
    public void initializeObjects(){
        objSH = PageFactory.initElements(driver, StartHerePage.class);
    }
    @Test
    public void startHerePageTest(){
        objSH.clickStartHere();
    }
}
