package tests;

import dto.ContactDTO;
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

        ContactDTO contactDTO = new ContactDTO()
                .setName("Diana")
                .setLastname("Lukovsky")
                .setEmail("feling@protonmail.com")
                .setPassword("Karin2020@");


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