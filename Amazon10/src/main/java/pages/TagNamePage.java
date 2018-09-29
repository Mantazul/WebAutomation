package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TagNamePage extends CommonAPI {
    @FindBy(tagName = "a")public static WebElement registryA;
    public void registryA(){registryA.click();}
}
