package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class LocatorsCss {
//    WebDriver driver;
//
//    @BeforeClass
//    public void init() {
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--lang=en");
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver(chromeOptions);
//
//        driver.manage().window().maximize();
//
//        // implicit waiting's
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//        driver.navigate().to("https://demowebshop.tricentis.com/");
//
//    }
//
//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }
//
//    @Test
//    public void testCss() {
//
//        WebElement byId = driver.findElement(By.cssSelector("#topcartlink"));
//
//        WebElement byClass = driver.findElement(By.cssSelector(".header-logo"));
//
//
//        //Attribute: in DOM: attributeName = "attributeValue"
//        //[attributeName=attributeValue
//        WebElement byAttrNameAndValue = driver.findElement(By.cssSelector("[type='text/javascript']"));
//
//        WebElement byAttrName = driver.findElement(By.cssSelector("[type]"));
//
//        WebElement byAttrNameAndPartlyValue = driver.findElement(By.cssSelector("[type*='text/javascript']"));
//
//        WebElement byAttrNameAndStartsWithValue = driver.findElement(By.cssSelector("[type^='text/javascript']"));
//
//        WebElement byAttrNameAndOverWithInValue = driver.findElement(By.cssSelector("[type$='script']"));
//
//        WebElement byTag = driver.findElement(By.cssSelector("div"));
//
//        //by tag and class
//        //<tagName class="classValue>text</tegName>
//        //tagName.classValue
//
//        WebElement byTagAnClassValue = driver.findElement(By.cssSelector("div.header"));
//
//        WebElement byTagIdValueAndClassValue = driver.findElement(By.cssSelector("div#flyout-cart.flyout-cart"));
//
//        WebElement byTagIdAndAttribute = driver.findElement(By.cssSelector("input#small-searchterms[type='text']"));
//
//
//        driver.quit();
//
//
//    }
//
//    @Test
//    public void find10LocatorsByCssSelector() {
//
//        WebElement findByClass = driver.findElement(By.cssSelector(".product-item"));
//        WebElement findById = driver.findElement(By.cssSelector("#flyout-cart"));
//        WebElement findByAttribute = driver.findElement(By.cssSelector("[name=pollanswers-1]"));
//        WebElement findByName = driver.findElement(By.cssSelector("[name]"));
//        WebElement findByTag = driver.findElement(By.cssSelector("input[type='text']"));
//        WebElement findByTagIdAndAttribute = driver.findElement(By.cssSelector("input[id*='subscribe']"));
//        WebElement findByAttributeAndAttributeValue = driver.findElement(By.cssSelector("[href*='/computers']"));
//        WebElement findByChild = driver.findElement(By.cssSelector("div>p"));
//        WebElement findByClassValue = driver.findElement(By.cssSelector(".ico-login"));
//        WebElement findByTagAndClass = driver.findElement(By.cssSelector("div.top-menu-triangle"));
//
//
//    }

}
