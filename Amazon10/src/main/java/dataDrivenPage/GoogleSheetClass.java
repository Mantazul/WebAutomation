package dataDrivenPage;
import com.google.api.services.sheets.v4.model.*;
import com.google.api.services.sheets.v4.Sheets;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static googleAPI.GoogleSheetReader.getSheetsService;

public class GoogleSheetClass extends LoginPage {
    LoginPage loginPageObject;
    @BeforeMethod
    public void init(){
     loginPageObject = PageFactory.initElements(driver,LoginPage.class);
    }
    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        // Build a new authorized API client service.
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }

    //LogIn by using Google Sheet sheet data
    public List<String> signInByInvalidIdPass(String spreadsheetId, String range) throws IOException, InterruptedException {
        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : col2Value) {
            Thread.sleep(5000);
            inputValueInTextBoxByWebElement(emailBox, row.get(1).toString());
            Thread.sleep(5000);
            //actual.add(getCurrentPageTitle());
            actual.add(getTextByWebElement(errorMessage));
            System.out.println(getTextByWebElement(errorMessage));
            clearInputBox(emailBox);
            Thread.sleep(5000);
        }
        return actual;
    }
    public void inputValueInTextBoxByWebElement(WebElement webElement, String value){
        webElement.sendKeys(value + Keys.ENTER);
    }
    public void clearInputBox(WebElement webElement){
        webElement.clear();
    }
    public String getTextByWebElement(WebElement webElement){
        String text = webElement.getText();
        return text;
    }
}
