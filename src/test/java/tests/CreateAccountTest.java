package tests;


import config.ApplicationManager;
import dto.UserDTO;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class CreateAccountTest extends TestBase {

    public void preConditions() {
        app.getItemCartHelper().navigateToHomePage();

        app.getItemCartHelper().clickOnLoginNavBar();

        UserDTO user = new UserDTO().setEmail("feling@protomail.com").setPassword("Karin2020@");

    }

    @Test
    public void positiveRegisterTest() throws InterruptedException {

        WebElement firstName = app.getUserHelper().getElementLastName();
        firstName.click();
        firstName.clear();
        firstName.sendKeys("Diana");

        WebElement lastName =app.getUserHelper().getElementLastName();
        lastName.click();
        lastName.clear();
        lastName.sendKeys("Lukovsky");

        WebElement inputEmail = app.getUserHelper().getElementInputEmail();
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("feling@protonmail.com");

        WebElement inputPassword = app.getUserHelper().getElementInputPassword();
        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys("Karin2020@");


        WebElement confirmPassword = app.getUserHelper().getElementConfirmPassword();
        confirmPassword.click();
        confirmPassword.clear();
        confirmPassword.sendKeys("Karin2020@");

        Thread.sleep(3000);

        app.getUserHelper().clickAddRegisterBtn();

        WebElement resultMessage = app.getItemCartHelper().getResultMessage();
        Assert.assertTrue(resultMessage.isDisplayed(), "Your registration completed");
    }

}





