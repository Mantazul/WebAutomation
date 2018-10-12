package keyWordDrivenPage;

import base.CommonAPI;
import dataDrivenPage.LoginWithExcel;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import dataDrivenPage.LoginPage;
import pages.NavigationBarOptionMethod;
import pages.SearchPage;
import utility.DataReader1;

import java.io.IOException;

public class Features extends CommonAPI {
    NavigationBarOptionMethod objBar = PageFactory.initElements(driver, NavigationBarOptionMethod.class);
    SearchPage objOfNBOPage = PageFactory.initElements(driver, SearchPage.class);
    LoginPage objOfSignInPage = PageFactory.initElements(driver, LoginPage.class);
    LoginWithExcel objOfByInputFromExls = PageFactory.initElements(driver, LoginWithExcel.class);
    //KeyWord ClickSigIn
    public void clickSignIn() {
        objBar.helloSignIn();
    }
    public void getSendKeys() {
        objOfSignInPage.Sendkeys();
    }
    public void searchProduct() throws IOException {
        objOfNBOPage.searchItemsAndSubmitButton();
    }
    public void selectAction(String featureName) throws IOException, InterruptedException {
        switch (featureName) {
            case "ClickSignIn":
                clickSignIn();
                break;
            case "Submit":
                getSendKeys();
                break;
            case "Search":
                searchProduct();
                break;
            default:
                throw new InvalidArgumentException("Invalid feature choice");
        }
    }
    public void selectFeature() throws IOException, InterruptedException {
        String[] keyword = objOfByInputFromExls.getDataFromSignInKeyword("Keyword.xls");
        for (int i = 0; i < keyword.length; i++) {
            selectAction(keyword[i]);
        }
    }
}

