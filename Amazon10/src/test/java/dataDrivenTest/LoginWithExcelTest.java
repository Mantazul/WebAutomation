package dataDrivenTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import dataDrivenPage.LoginWithExcel;
import reporting.TestLogger;

public class LoginWithExcelTest extends LoginWithExcel {
    LoginWithExcel loginObject;
        @BeforeMethod
        public void init() {
            loginObject = PageFactory.initElements(driver, LoginWithExcel.class);
            navigateToLoginPage();
        }
        @Test(dataProvider = "supplyData")
        public void signInWithInvalidIDPassUsingExcel(String email,String message) throws InterruptedException {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            Assert.assertEquals(message,SendLoginInfo(email));
        }
    }

