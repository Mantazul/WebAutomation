package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Tests extends CommonAPI {
    @Test
    public void search(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop", Keys.ENTER);
    }
    @Test
    public void search1(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("little boy socks",Keys.ENTER);
        driver.findElement(By.cssSelector("#result_4 > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > a:nth-child(1)")).click();
    }
    @Test
    public void search2(){
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[1]/div/span/a")).click();
    }
    @Test
    public void search3(){
        driver.navigate().forward();
    }
    @Test
    public void search4(){
        driver.navigate().back();
    }
    @Test
    public void search5(){
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(4)")).click();
    }
    @Test
    public void search6(){
        driver.findElement(By.cssSelector("#nav-link-shopall > span:nth-child(2)")).isDisplayed();
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[4]/div[4]/div[2]/span[2]/span")).isDisplayed();
    }
    @Test
    public void search7(){
        driver.getTitle().length();
    }
    @Test
    public void search8() {
        driver.findElement(By.cssSelector(".icp-nav-language")).isDisplayed();
    }
    @Test
    public void clickhelp8(){
        driver.findElement(By.linkText("Help")).click();
    }
    @Test
    public void clicksell9(){
        driver.findElement(By.className("nav-a")).click();
    }
    @Test
    public void YourAmazonCom10(){
        driver.findElement(By.id("nav-your-amazon")).click();
    }
    @Test
    public void Registry11(){
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[3]/div[2]/div/a[4]")).click();
    }
    @Test
    public void TodayDeal12(){
        driver.findElement(By.className("nav-a")).isDisplayed();
    }
    @Test
    public void Orders13(){
        List<WebElement> allLinks = driver.findElements(By.tagName("span"));
        System.out.println("Links count is: "+allLinks.size());
        for(WebElement link : allLinks)
            System.out.println(link.getText());
    }
    @Test
    public void Cart14(){
        String dropdown = driver.findElement(By.tagName("span")).getText();
    }
    @Test
    public void Title15(){
        WebElement title = driver.findElement(By.tagName("title"));
        System.out.println(title.getText());
    }
    @Test
    public void Coupons16(){
        driver.findElement(By.className("nav-a")).click();
        driver.findElement(By.linkText("Coupons")).click();
    }
}

