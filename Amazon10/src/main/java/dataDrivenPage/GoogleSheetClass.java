package dataDrivenPage;
import base.CommonAPI;
import com.google.api.services.sheets.v4.model.*;
import com.google.api.services.sheets.v4.Sheets;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import reporting.TestLogger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static googleAPI.GoogleSheetReader.getSheetsService;

public class GoogleSheetClass extends CommonAPI {
    /*@FindBy(css = "#nav-flyout-ya-signin > a > span")//#nav-signin-tooltip > a > span
    public static WebElement signIn;*/
    @FindBy(css = "#ap_email")
    public static WebElement emailId;
    @FindBy(id = "continue")
    public static WebElement continueButton;
    @FindBy(css = "#auth-error-message-box > div > div > ul > li")
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
//    public List<String> searchItemsByName() throws IOException, InterruptedException, Exception {
//        TestLogger.log(getClass().getSimpleName()+": "+converToString((new Object(){}.getClass().getEnclosingMethod().getName())));
//        List<List<Object>> values = getSpreadSheetRecords("1vyXCpuy3an7XOPL69fJH0p5YsHoSFwta1_GK2BQ7Ys4", "Sheet1!A1:A");
//        List<String> actual = new ArrayList<>();
//
//        for (List row : values) {
//            int i = 0;
//            sleepFor(2);
//            if (i <= row.size()) {
//                inputValueInTextBoxByWebElement(searchBar, row.get(i).toString());
//                sleepFor(2);
//                //actual.add(getCurrentPageUrl());
//                clearInputBox(searchBar);
//                sleepFor(2);
//                i++;
//            }
//        }
//        return actual;
//    }











//    LoginPage loginObject = PageFactory.initElements(driver,LoginPage.class);
//    public static List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
//        // Build a new authorized API client service.
//        Sheets service = getSheetsService();
//        ValueRange response = service.spreadsheets().values()
//                .get(spreadsheetId, range)
//                .execute();
//        List<List<Object>> values = response.getValues();
//        if (values == null || values.size() == 0) {
//            return null;
//        } else {
//            return values;
//        }
//    }
//    //LogIn by using Google Sheet sheet data
//    public void signInByInvalidIdPass(String spreadsheetId, String range) throws IOException, InterruptedException {
//        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
//        /*driver.navigate().to("https://www.amazon.com/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_custrec_signin&switch_account=");
//     */
//        for (List row : col2Value) {
//            /*String expectedMessage = sendEmail(row.get(0).toString());
//            String actualMessage = row.get(1).toString();
//            Assert.assertEquals(actualMessage, expectedMessage);*/
//            System.out.println(row.get(0).toString());
//            System.out.println(row.get(1).toString());
//        }
//    }
//    public  static List<List<String>> main1() throws IOException, InterruptedException {
//        /*LoginPage loginObject= new LoginPage();
//        //int i = 0;
//        driver.navigate().to("https://www.amazon.com/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_custrec_signin&switch_account=");
//     */
//        String spreadsheetId = "1kUYAHIHH38QvfvRzCv-jG1yUfxmLWAKtph-pJZxW8kE";
//        String range = "Sheet1!A2:B";
//        List<List<Object>> expectedErrorMessage = getSpreadSheetRecords(spreadsheetId, range);
//        List<String> actualEmail = new ArrayList<>();
//        List<String> actualError = new ArrayList<>();
//        for (List row : expectedErrorMessage) {
//            actualEmail.add(row.get(0).toString());
//            actualError.add(row.get(1).toString());
//        }
//        List<List<String>> result = new ArrayList<>();
//        result.add(actualEmail);
//        result.add(actualError);
//        return result;
//    }
    }


