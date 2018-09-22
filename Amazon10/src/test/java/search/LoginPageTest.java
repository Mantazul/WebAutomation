package search;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends LoginPage {
    HomePage homePage;
    LoginPage loginPage;
    @Test(enabled=true)
    public void testEmailBox() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage.goToLoginPage();
        boolean actual = loginPage.checkEmailTextBoxEnable();
        Assert.assertEquals(actual,true);
        System.out.println("testEmailBox test passed");
    }

   /* @Test(enabled=true)
    public void testPasswordBox() {
        homePage.goToLoginPage();
        boolean actual = loginPage.checkPasswordTextBoxEnable();
        Assert.assertEquals(actual,true);
        System.out.println("testPasswordBox test passed");
    }

    @Test(enabled=true)
    public void testSignInButton() {
        homePage.goToLoginPage();
        boolean actual = loginPage.checkSignInButton();
        Assert.assertEquals(actual,true);
        System.out.println("testClearBox test passed");
    }*/

    /*@Test(enabled=false)
    public void testInvalidEmail() {
        homePage.goToLoginPage();
        String actualError = loginPage.invalidEmail();
        String expectedError = "Please provide your email address, formatted as you@domain.com.";
        Assert.assertTrue(actualError.contains(expectedError));
        System.out.println("testInvalidEmail test passed");
    }

    @Test(enabled=true)
    public void testInvalidPassword() {
        homePage.goToLoginPage();
        String actualError = loginPage.invalidPassword();
        String expectedError = "Please provide your password.";
        Assert.assertTrue(actualError.contains(expectedError));
        System.out.println("testInvalidPassword test passed");
    }

    @Test(enabled=false)
    public void testMyAccount() throws InterruptedException {
        homePage.goToLoginPage();
        String actual = loginPage.verifyMyAccount();
        String expected = "https://www.amazon.com/c/PH_MyAccount";     //"My Account Terms & Conditions";
        System.out.println(actual);
        //  Assert.assertTrue(actual.contains(expected));
        //  System.out.println("testMyAccount test passed");
    }

*/
}
