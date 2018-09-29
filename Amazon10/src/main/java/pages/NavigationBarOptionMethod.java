package pages;

import base.CommonAPI;
import base.CommonClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationBarOptionMethod extends CommonAPI {
    @FindBy(css="#nav-upnav > a")public static WebElement topBar;
    @FindBy(className ="hm-icon nav-sprite")public static WebElement threeLines;
    @FindBy(className ="nav-sprite nav-logo-base")public static WebElement amazon;
    @FindBy(className ="nav-sprite nav-logo-tagline nav-prime-try")public static WebElement tryPrimeUnderAmazon;
    @FindBy(css="#twotabsearchtextbox")public static WebElement searchbox;
    @FindBy(css="#nav-search > form > div.nav-right > div > input")public static WebElement submitButton;
    @FindBy(xpath = "//*[@id=\"nav-search\"]/form/div[2]/div/input")public static WebElement submitButton1;
    @FindBy(css="#navSwmHoliday > a > img")public static WebElement discoverSmallMediumBusiness;
    @FindBy(id="nav-packard-glow-loc-icon")public static WebElement dropwater;
    @FindBy(id = "glow-ingress-line1") public static WebElement deliverTo;
    @FindBy(id="glow-ingress-line2")public static WebElement zipcode;
    @FindBy(id="nav-your-amazon")public static  WebElement yourAmazonCom;
    @FindBy(css="#nav-xshop > a:nth-child(3)") public static WebElement todaysDeals;
    @FindBy(css="#nav-xshop > a:nth-child(4)")public static WebElement giftCard;
    @FindBy(css="#nav-xshop > a:nth-child(5)")public static WebElement registry;
    @FindBy(css="#nav-xshop > a:nth-child(6)")public static WebElement sell;
    @FindBy(css="#nav-xshop > a:nth-child(7)")public static WebElement treasureTruck;
    @FindBy(css="#nav-xshop > a:nth-child(8)")public static WebElement help;
    @FindBy(className = "icp-nav-language")public static WebElement en;
    @FindBy(css="#glow-ingress-line1")public static WebElement helloSignIn;
    @FindBy(css="#glow-ingress-line2")public static WebElement accountLists;
    @FindBy(css="#icp-nav-flyout > span.icp-nav-link-inner > span.nav-line-2")public static WebElement orders;
    @FindBy(css="#nav-link-prime > span.nav-line-2")public static WebElement tryPrime;
    @FindBy(css="#nav-cart > span.nav-line-2")public static WebElement cart;
    @FindBy(xpath = "//*[@id=\"nav-link-shopall\"]/span[2]")public static WebElement departments;
   @FindBy(xpath = "//*[@id=\"rhf-container\"]/div/div[2]/div[1]/a/span")public static WebElement signIn;
    public void topBar(){
       topBar.click();
   }

   public void threeLines(){
       WebDriverWait wait = new WebDriverWait(driver,10);
       wait.until(ExpectedConditions.visibilityOf(threeLines));
       threeLines.click();
   }
    public void amazon(){
       amazon.click();
    }
    public void tryPrimeUnderAmazon(){
       tryPrimeUnderAmazon.click();
   }
    public void searchBox(){
        searchbox.click();
    }
    public void submitButton(){
        submitButton.click();
    }
    public void setSubmitButton1(){submitButton1.click(); }
    public void discoverSmallMediumBusiness(){
        discoverSmallMediumBusiness.click();
    }
    public void dropwater(){
       dropwater.click();
   }
    public void deliverTo(){
       deliverTo.click();
   }
    public void zipcode(){
       zipcode.click();
   }
    public void yourAmazonCom(){
       yourAmazonCom.click();
   }
    public void todaysDeals(){
       todaysDeals.click();
   }
    public void giftCard(){
       giftCard.click();
   }
    public void registry(){
       registry.click();
   }
    public void sell(){
       sell.click();
   }
    public void treasureTruck(){
       treasureTruck.click();
   }
    public void help(){
       help.click();
   }
    public void en(){ en.click(); }
    public void helloSignIn(){
       helloSignIn.click();
   }
    public void accountLists(){
       accountLists.click();
   }
    public void orders(){
       orders.click();
   }
    public void tryPrime(){
       tryPrime.click();
   }
    public void cart(){
       cart.click();
   }
    public void departments(){departments.isDisplayed();}
    public void signIn(){signIn.click();}
}



