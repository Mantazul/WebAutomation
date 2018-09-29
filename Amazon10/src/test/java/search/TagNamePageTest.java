package search;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SearchPage;
import pages.TagNamePage;

import java.io.IOException;

public class TagNamePageTest extends TagNamePage {
    TagNamePage searchObject;
    @BeforeMethod
    public void init(){
        searchObject = PageFactory.initElements(driver,TagNamePage.class);
    }
    @Test
    public void searchTagName()throws IOException {
        registryA();
    }

}
