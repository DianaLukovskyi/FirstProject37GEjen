package tests;

import config.ApplicationManager;
import dto.UserDTO;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class TestBase {
    static ApplicationManager app = new ApplicationManager(System
            .getProperty("browser", Browser.CHROME.browserName()));

    UserDTO user = new UserDTO().setEmail("feling@protomail.com").setPassword("Karin2020@");


    @BeforeSuite
    public static void startBrowser() {
        app.init();

    }

    @AfterSuite
    public static void tearDown() {
        app.quit();
    }

    public void login(UserDTO user) {
        app.getUserHelper().fillEmailOnLogin(user.getEmail());

        app.getUserHelper().fillPasswordOnLogin(user.getPassword());

        app.getItemCartHelper().clickLoginBtn();
    }
}

//
//
//    public WebElement getElementFirstName() {
//        return driver.findElement(By
//                .xpath("//input[@id='FirstName']"));
//
//        public WebElement getElementProduct () {
//            return driver.findElement(By.xpath("//a[@class='product-name']"));
//        }
//        public void clickAddToCart () {
//            driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
//
//        }
