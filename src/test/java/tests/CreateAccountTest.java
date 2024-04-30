package tests;

import dto.UserDTO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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

        String name = "Diana";
        String lastname = "Lukovsky";
        String email = "feling@protonmail.com";
        String password = "Karin2020@";

        register(name, lastname, email, password);


        WebElement successMessage = getTextBase();
        Assert.assertTrue((successMessage.isDisplayed()), "You register");

    }

    public WebElement getTextBase() {
        return driver.findElement(By.xpath("//div[contains(@class,'result')]"));

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}