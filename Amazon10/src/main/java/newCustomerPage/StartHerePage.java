package newCustomerPage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class StartHerePage extends CommonAPI {
   @FindBy(tagName = "starthere") public static WebElement startHere;
   public void clickStartHere(){
       startHere.click();
       startHere.getTagName();
       startHere.getSize();
   }
}
