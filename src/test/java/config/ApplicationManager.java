package config;

import helpers.BaseHelper;
import helpers.ItemCartHelper;
import helpers.UserHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ApplicationManager {
 static  WebDriver driver;
 String browser;
 ItemCartHelper itemCartHelper;
 UserHelper userHelper;

    public ItemCartHelper getItemCartHelper() {
        return itemCartHelper;
    }

    public UserHelper getUserHelper() {
        return userHelper;
    }

    public ApplicationManager(String browser) {
        this.browser = browser;
    }
    public  void init(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--lang=en");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.navigate().to("https://demowebshop.tricentis.com/");

        itemCartHelper = new ItemCartHelper(driver);
        userHelper = new UserHelper(driver);
    }
    public static void quit(){
        driver.quit();
    }

    public static  WebDriver getDriver(){
        return driver;
    }
}

