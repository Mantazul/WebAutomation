package dataDrivenTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import dataDrivenPage.GoogleSheetClass;
import pages.HomePage;
import pages.LoginPage;

import java.io.IOException;
import java.util.List;

public class GoogleSheetsPageTest extends GoogleSheetClass {
    LoginPage loginObject;
    GoogleSheetClass googleSheetsPage;
    @BeforeMethod
    public void init(){
        loginObject = PageFactory.initElements(driver, LoginPage.class);
        googleSheetsPage = PageFactory.initElements(driver,GoogleSheetClass.class);
    }
    //Verify log in by taking data from a google sheets file
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        //Thread.sleep(3000);
        Thread.sleep(3000);
        int i = 0;
        String spreadsheetId = "1LafbFeuchpSKI5XoxP9YHYvdNDhAg137mKRlv6e-Oe0";
        String range = "Sheet1!A2:B";
        loginObject.signinClick();
        List<String> actualErrorMessage = googleSheetsPage.signInByInvalidIdPass(spreadsheetId, range);
        loginObject.submit();
        List<List<Object>> expectedErrorMessage = googleSheetsPage.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
             Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(2).toString()));
            //System.out.println("expected"+row.get(3).toString());
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }
}
