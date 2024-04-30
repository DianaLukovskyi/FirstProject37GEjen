package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tests.TestBase;

import static tests.TestBase.driver;

public class CreateAccountTest extends TestBase {


    @BeforeClass
    public void setUp() {
        navigateBar();
    }

    public void navigateBar() {
        driver.navigate().to("https://demowebshop.tricentis.com/");
    }

    @Test
    public void positiveRegisterTest() {


        registrationBtn();
        firstName();
        lastName();
        email();
        password();
        createPassword();

        clickOnRegisterBtn();

        WebElement successMessage = getTextBase();
        Assert.assertTrue((successMessage.isDisplayed()), "You register");

    }

    public WebElement getTextBase() {
        return driver.findElement(By.xpath("//div[contains(@class,'result')]"));

    }

    public void clickOnRegisterBtn() {
        driver.findElement(By.xpath("//input[@id='register-button']")).click();
    }

    public void createPassword() {
        WebElement confirmPassword = driver.findElement(By
                .xpath("//input[@id='ConfirmPassword']"));
        confirmPassword.click();
        confirmPassword.clear();
        confirmPassword.sendKeys("Karin2020@");
    }

    public void password() {
        WebElement inputPassword = driver.findElement(By
                .xpath("//input[@id='Password']"));
        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys("Karin2020@");
    }

    public void email() {
        WebElement inputEmail = driver.findElement(By
                .xpath("//input[@id='Email']"));
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("feling@protonmail.com");
    }

    public void lastName() {
        WebElement lastName = driver.findElement(By
                .xpath("//input[@id='LastName']"));
        lastName.click();
        lastName.clear();
        lastName.sendKeys("Lukovsky");
    }

    public void firstName() {
        WebElement firstName = driver.findElement(By
                .xpath("//input[@id='FirstName']"));
        firstName.click();
        firstName.clear();
        firstName.sendKeys("Diana");
    }

    public void registrationBtn() {
        driver.findElement(By.xpath("//a[@href='/register']")).click();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}








