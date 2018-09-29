package search;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.NavigationBarOptionMethod;

public class NavigationBarTest extends NavigationBarOptionMethod {
    NavigationBarOptionMethod object;
    @BeforeMethod
    public void init(){
    object = PageFactory.initElements(driver,NavigationBarOptionMethod.class);
    }
    @Test
    public void NavigationBar1(){
    topBar();
    }
    @Test//f
    public void NavigationBar2(){
        threeLines();
    }
    @Test//f
    public void NavigationBar3(){
       amazon();
    }
    @Test
    public void NavigationBar4(){
        tryPrimeUnderAmazon();
    }
    @Test
    public void NavigationBar5(){
        searchBox();
    }
    @Test
    public void NavigationBar6(){
        submitButton();
    }
    @Test
    public void NavigationBar06(){setSubmitButton1();}
    @Test
    public void NavigationBar7(){
        discoverSmallMediumBusiness();
    }
    @Test
    public void NavigationBar8(){
        dropwater();
    }
    @Test
    public void NavigationBar9(){
        deliverTo();
    }
    @Test
    public void NavigationBar10(){
        zipcode();
    }
    @Test
    public void NavigationBar11(){
        yourAmazonCom();
    }
    @Test
    public void NavigationBar12(){
        todaysDeals();
    }
    @Test
    public void NavigationBar13(){
        giftCard();
    }
    @Test
    public void NavigationBar14(){
        registry();
    }
    @Test
    public void NavigationBar15(){
        sell();
    }
    @Test
    public void NavigationBar16(){
        treasureTruck();
    }
    @Test
    public void NavigationBar17(){
        help();
    }
    @Test //f
    public void NavigationBar18(){
        en();
    }
    @Test//n
    public void NavigationBar19(){
        helloSignIn();
    }
    @Test//n
    public void NavigationBar20(){
        accountLists();
    }
    @Test
    public void NavigationBar21(){
        orders();
    }
    @Test
    public void NavigationBar22(){
        tryPrime();
    }
    @Test
    public void NavigationBar23(){
        cart();
    }
    @Test
    public void display(){departments();}
    @Test
    public void signInBottom(){signIn();}
 }










