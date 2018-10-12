package dataDrivenPage;

import base.CommonAPI;
import database.XlsDataReaderUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import reporting.TestLogger;
import utility.DataReader1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class LoginWithExcel extends CommonAPI {
    @FindBy(id="ap_email")public static WebElement emailBox;
    @FindBy(className ="a-button-input")public static WebElement continueButton;
    @FindBy(className ="a-list-item")public static WebElement errorMessage;
    public static void navigateToLoginPage(){
        TestLogger.log(LoginWithExcel.class.getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.navigate().to("https://www.amazon.com/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&switch_account=");
    }
    public void clickContinue(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        continueButton.click();
    }
    public void clearInputBox(WebElement webElement){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        webElement.clear();
    }
    public String SendLoginInfo(String email) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        emailBox.sendKeys(email);
        Thread.sleep(2000);
        clickContinue();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("a-list-item")));
        String errMessage = errorMessage.getText();
        clearInputBox(emailBox);
        return errMessage;
    }
    @DataProvider
    public Iterator<Object[]> supplyData(){
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ArrayList<Object[]> testData =
                XlsDataReaderUtil.getDataFromExcel();
        return testData.iterator();
    }
    DataReader1 reader = new DataReader1();
    public String[] getDataFromSignInKeyword(String fileName) throws IOException {
        String path = "../Amazon10/data/" + fileName;
        String[] output = reader.colReader(path, 2);
        return output;
    }
}
