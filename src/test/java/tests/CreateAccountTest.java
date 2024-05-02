package tests;

import config.ApplicationManager;
import dto.ContactDTO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.DataProvider;

public class CreateAccountTest extends TestBase {


    @BeforeClass
    public void setUp() {
        app.getHomePageHelper().navigateBar();

    }


    @Test(dataProvider = "addNewContact", dataProviderClass = DataProvider.class)
    public void positiveAddContactProvider(String name, String lastName,String email) {

        ContactDTO contactDTO = new ContactDTO()
                .setName(name)
                .setLastname(lastName)
                .setEmail(email)
                .setPassword("Karin2020@");



//        WebElement successMessage = getTextBase();
//        Assert.assertTrue((successMessage.isDisplayed()), "You register");

    }

//    public WebElement getTextBase() {
//        return ApplicationManager.getDriver().findElement(By.xpath("//div[contains(@class,'result')]"));



    @AfterClass
     public static void tearDown() {
        app.quit();
    }

}