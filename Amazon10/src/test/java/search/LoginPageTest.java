package search;

import base.XlsDataReaderUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.util.ArrayList;
import java.util.Iterator;

public class LoginPageTest extends LoginPage {
    LoginPage object;
    @BeforeMethod
    public void init() {
        object = PageFactory.initElements(driver, LoginPage.class);
    }
    @DataProvider
    public Iterator<Object[]> supplyData(){

        ArrayList<Object[]> testData =
                XlsDataReaderUtil.getDataFromExcel();

        return testData.iterator();

    }
    @Test(dataProvider = "supplyData")
    public void loginPageTest(String email,String errormessage)  {
        sendEmail(email);
        String message = getErrorMessage();
        Assert.assertEquals(message,errormessage);
    }
}


