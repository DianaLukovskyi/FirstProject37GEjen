package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class DemoWebShop {

//    @Test
//    public void webShopTest(){
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--lang=en");
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver(chromeOptions);
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//
//
//        driver.navigate().to("https://demowebshop.tricentis.com/");
//
//
//
//       WebElement detailsClass = driver.findElement(By.className("details"));
//        System.out.println(detailsClass.getText());
//
//
//        WebElement elementTagLi =  driver.findElement(By.tagName("li"));
//        System.out.println(elementTagLi.getAttribute("topcarlink"));
//
//       WebElement pageBody = driver.findElement(By.className("page-body"));
//        System.out.println(pageBody.getAttribute("class"));
//
//
//        driver.quit();
//
//    }
}
