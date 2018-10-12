package dataDrivenTest;

import base.CommonAPI;
import dataDrivenPage.GoogleSheetClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;
import java.util.List;

public class GoogleSheetsPageTest extends GoogleSheetClass {
    GoogleSheetClass googleSheetClass;
    @BeforeMethod
    public void initializationOfElement(){
        googleSheetClass=PageFactory.initElements(CommonAPI.driver, GoogleSheetClass.class);
    }
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        sleepFor(2);
        //signIn.click();
        //sleepFor(3);
        int i = 0;
        String spreadsheetId = "1brVSk1FuLXaUJOZF7S7oNd2m9b9XDyMuir0diS-vR5c";
        String range = "Sheet1!A2:C";
        List<String> actualErrorMessage = googleSheetClass.signInByInvalidIdPass(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = googleSheetClass.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
            Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(3).toString()));
            System.out.println("expected" + row.get(3).toString());
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }
}
