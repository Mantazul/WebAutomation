package pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HomePage extends CommonAPI {


    @FindBy(how = How.CSS, using = "#twotabsearchtextbox") WebElement searchboxwebelement;
    @FindBy(how = How.CSS, using = ".nav-input") WebElement submitbuttonwebelement;
    /*//login
    @FindBy(xpath = "/html/body/div[2]/header/div/div[2]/div[2]/div/a[2]/span[1]") WebElement HelloSignInButton;
    @FindBy(xpath = "/html/body/div[2]/header/div/div[1]/div[4]/div[3]/div[2]/div/div[1]/div/a/span") WebElement signinLink;
    @FindBy(id = "ap_email") WebElement emailBox;*/
    public WebElement getSearchboxwebelement() {
        return searchboxwebelement;
    }
    public WebElement getSubmitbuttonwebelement() {
        return submitbuttonwebelement;
    }
    public void searchFor(String value) {
        getSearchboxwebelement().sendKeys(value);
    }
    public void submitButton() {
        getSubmitbuttonwebelement().click();
    }
    public void clearInput() {
        getSearchboxwebelement().clear();
    }
    public List<String> getItemData() {
        List<String> data = new ArrayList<>();
        data.add("coffee");
        data.add("pajama");
        data.add("face wash");
        return data;
    }
    public void searchItemsAndSubmitButton() throws IOException {
        List<String> list1 = getItemValue();
        for (int i = 0; i < list1.size(); i++) {
            searchFor(list1.get(i));
            submitButton();
            clearInput();
        }
    }
    public WebElement getSearchInputField() {
        return searchboxwebelement;
    }
    public void setSearchInputField(WebElement searchInputField) {
        this.searchboxwebelement = searchInputField;
    }
    public void searchItems() throws InterruptedException {
        List<String> itemList = getItemValue();
        for (String st : itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
        }
    }
    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("cooking book");
        itemsList.add("makeup Book");
        itemsList.add("coffee");
        itemsList.add("face wash");
        itemsList.add("Toothpaste");
        itemsList.add("ear-ring");
        itemsList.add("ps4games");
        itemsList.add("macAir");
        return itemsList;
    }

    /*//Go to Login Page
    public void goToLoginPage() {
        HelloSignInButton.click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(signinLink));
        signinLink.click();*/
    }





