package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPage extends CommonAPI {
    @FindBy(id="ap_email")public static WebElement emailBox;
    @FindBy(className ="a-button-input")public static WebElement continueButton;
    @FindBy(className ="a-list-item")public static WebElement errorMessage;

    public void sendEmail(String email){
        driver.navigate().to("https://www.amazon.com/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fs%2Fref%3Dnav_signin%3Furl%3Dsearch-alias%253Daps%26field-keywords%3Dlaptop%26sprefix%3Dlap%252Caps%252C150%26crid%3D3I3FSEKFYREJR&switch_account=");
        emailBox.sendKeys(email);
        continueButton.click();
    }
    public String getErrorMessage(){
        String message = errorMessage.getText();
        return message;
    }

}