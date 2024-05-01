package tests;

import config.ApplicationManager;
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
        app.getHomePageHelper().navigateBar();

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
        return ApplicationManager.getDriver().findElement(By.xpath("//div[contains(@class,'result')]"));

    }

    @AfterClass
     public static void tearDown() {
        app.quit();
    }

}