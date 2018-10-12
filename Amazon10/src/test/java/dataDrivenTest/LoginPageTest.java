
package dataDrivenTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import dataDrivenPage.LoginPage;
import org.testng.asserts.SoftAssert;
import reporting.TestLogger;

public class LoginPageTest extends LoginPage {
    LoginPage object;

    @BeforeMethod
    public void init() {
        object = PageFactory.initElements(driver, LoginPage.class);
    }

    @Test(dataProvider = "supplyData")
    public void loginPageTest(String email, String errormessage) throws InterruptedException {
        clickSignIn();
        String message = sendEmail(email);
        Assert.assertEquals(message, errormessage);
    }

    @Test
    public void submitTest() {
        submit();
    }
}
   /* @Test(priority = 2, enabled = true)
    public void signInByMobileLinkStatusTest() throws InterruptedException {
      clickSignIn();
      boolean bl = object.signInByMobileNumberLink();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(bl, true);
        // Assert.assertEquals(bl, true);
        System.out.println("Test Case signInByMobileLinkStatusTest Passed");
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
    }
}*/
