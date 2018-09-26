package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class CommonClass {
    public static WebDriver driver = null;
    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.gecko.driver","/Users/renxing/SeleniumTest18/WebAutomation/Generic/browser-driver/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");

    }
    @BeforeMethod
    public void fullScreen(){
        driver.manage().window().fullscreen();
    }
    @AfterMethod
    public void end() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}
