package pages;

import base.CommonAPI;
import database.XlsDataReaderUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class LoginPage extends CommonAPI{
    @FindBy(id="ap_email")public static WebElement emailBox;
    @FindBy(className ="a-button-input")public static WebElement continueButton;
    @FindBy(className ="a-list-item")public static WebElement errorMessage;
    @FindBy(css = "#nav-link-accountList> .nav-line-1")
    public static WebElement signInButton;
    public void signinClick()throws InterruptedException{
        signInButton.click();
        Thread.sleep(2000);
    }
    public void submit(){
        continueButton.click();
    }
    public String sendEmail(String email){
        emailBox.sendKeys(email);
        submit();
        String message = errorMessage.getText();
        clearTextBox(emailBox);
        return message;
    }
    public void clearTextBox(WebElement element){
        element.clear();
    }
    @DataProvider
    public Iterator<Object[]> supplyData(){
        ArrayList<Object[]> testData =
                XlsDataReaderUtil.getDataFromExcel();
        return testData.iterator();
    }
}