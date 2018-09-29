package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkTestPage extends CommonAPI {

    @FindBy(linkText="Your Amazon.com")public static WebElement yourAzcom;
    public void yourAzcom(){
        yourAzcom.click();
    }
    @FindBy(partialLinkText = "Your")public static WebElement your;
    public void your(){
        your.click();
    }
}
