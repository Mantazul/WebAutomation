package dataDrivenPage;
import base.CommonAPI;
import com.google.api.services.sheets.v4.model.*;
import com.google.api.services.sheets.v4.Sheets;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static googleAPI.GoogleSheetReader.getSheetsService;

public class GoogleSheetClass extends CommonAPI {
    @FindBy(xpath = " //input[@type='email']")
    public static WebElement emailId;
    @FindBy(id = "continue")
    public static WebElement continueButton;
    @FindBy(xpath="//span[@class='a-list-item']")
    public static WebElement errorMsg;
    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
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
    // LogIn by using Google Sheet sheet data
    public List<String> signInByInvalidIdPass(String spreadsheetId, String range) throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : col2Value) {
            sleepFor(1);
            inputValueInTextBoxByWebElement(emailId,row.get(1).toString());
            sleepFor(1);
            continueButton.click();
            actual.add(getTextByWebElement(errorMsg));
            System.out.println(getTextByWebElement(errorMsg));
            clearInputBox(emailId);
            sleepFor(1);
        }
        return actual;
    }
}


