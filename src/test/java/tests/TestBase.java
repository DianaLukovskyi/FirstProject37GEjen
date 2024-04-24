package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class TestBase {

    static WebDriver driver;

    @BeforeSuite
    public void init() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--lang=en");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        // implicit waiting's
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.navigate().to("https://demowebshop.tricentis.com/");
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

    public String getTexBase(WebElement element) {
        return  element.getText().trim();

    }

    public WebElement getElementSignOutBtn() {
        return driver.findElement(By.xpath("//div[@class='result')]")
        );

    }

    public WebElement getElementConfirmPassword() {
        return driver.findElement(By
                .xpath("//input[@id='ConfirmPassword']"));

    }

    public WebElement getElementInputPassword() {
        return driver.findElement(By
                .xpath("//input[@id='Password']"));

    }

    public WebElement getElementInputEmail() {
        return driver.findElement(By
                .xpath("//input[@id='Email']"));

    }

    public WebElement getElementLastName() {
        return driver.findElement(By
                .xpath("//input[@id='LastName']"));

    }

    public WebElement getElementFirstName() {
        return driver.findElement(By
                .xpath("//input[@id='FirstName']"));

    }

    public void clickCare() {
        driver.findElement(By.xpath("//a[@class='ico-cart']")).click();
    }

    public void fillPassword(String password) {
        WebElement inputPassword = clickPassword();
        inputPassword.sendKeys("password");
        clickPasswordOnNavBar();
    }

    public void fillEmail(String email) {
        WebElement inputEmail = clickEmail();
        inputEmail.sendKeys(email);
    }

    public void clickPasswordOnNavBar() {
        driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
    }

    public String getElementProduct() {
        WebElement product = driver.findElement(By.xpath("//a[@class='product-name']"));
        String actualRes = product.getText();
        return actualRes;
    }

    public void clickAShopingCart() {
        navigateToShopingCart();
    }

    public void navigateToShopingCart() {
        driver.findElement(By.xpath("(//td[@class='product-picture'])[1]"));
    }

    public void clickSeccondProduct() {
        navigateToSeccondProduct();

    }

    public void navigateToSeccondProduct() {
        driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
    }

    public WebElement clickPassword() {
        WebElement inputPassword = getElementInputPassword();
        inputPassword.click();
        inputPassword.clear();
        return inputPassword;
    }

    public WebElement clickEmail() {
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();
        WebElement inputEmail = getElementInputEmail();
        inputEmail.click();
        inputEmail.clear();
        return inputEmail;
    }
}
