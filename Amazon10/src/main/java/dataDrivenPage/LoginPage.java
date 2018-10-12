
package dataDrivenPage;

import base.CommonAPI;
import database.XlsDataReaderUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;

public class LoginPage extends CommonAPI {
    @FindBy(xpath="//*[@id=\"nav-signin-tooltip\"]/a/span")
    public static WebElement signIn;
    @FindBy(id = "ap_email")
    public static WebElement emailBox;
    @FindBy(className = "a-button-input")
    public static WebElement continueButton;
    @FindBy(className = "a-list-item")
    public static WebElement errorMessage;

  @FindBy(className = "a-input-text a-span12 auth-autofocus auth-required-field")
public static WebElement mobileAccounts;
@FindBy(css="#continue")
public static WebElement mobileContinue;

  public void clickSignIn() throws InterruptedException {
        signIn.click();
        Thread.sleep(2000);
    }
    public void Sendkeys(){
        emailBox.sendKeys("abbytext");
    }
    public void getMobileAccount(){
        mobileAccounts.sendKeys("6465332678");
    }
    public void submit() {
        continueButton.click();
    }
    public String sendEmail(String email) throws InterruptedException {
        emailBox.sendKeys(email);
        Thread.sleep(2000);
        continueButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("a-list-item")));
        String message = errorMessage.getText();
        clearTextBox(emailBox);
        return message;
    }
    public void clearTextBox(WebElement element) {
        element.clear();
    }
    @DataProvider
    public Iterator<Object[]> supplyData() {
        ArrayList<Object[]> testData =
                XlsDataReaderUtil.getDataFromExcel();
        return testData.iterator();
    }
    //Sign In By Mobile Number link status
    public boolean signInByMobileNumberLink() {
        boolean bl = mobileAccounts.isEnabled();
        return bl;
    }
    // Sign In BY invalid Mobile Number
   /* public String signInByMobileNumber() {
         mobileAccounts.click();
        try {
            wait(driver,5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mobileAccounts.sendKeys("6465332678");
        mobileContinue.click();
        implicitWait(driver,5);
        String actualErrorMessage = errorMessage.getText();
        System.out.println("Print error message " + actualErrorMessage);
        return actualErrorMessage;
    }*/

}
