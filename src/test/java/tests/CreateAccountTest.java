package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {


    @Test
    public void positiveRegisterTest() {
        driver.navigate().to("https://demowebshop.tricentis.com/");

        driver.findElement(By.xpath("//a[@href='/register']")).click();

        WebElement firstName = getElementFirstName();
        firstName.click();
        firstName.clear();
        firstName.sendKeys("Diana");

        WebElement lastName = getElementLastName();
        lastName.click();
        lastName.clear();
        lastName.sendKeys("Lukovsky");

        WebElement inputEmail = getElementInputEmail();
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("feling@protonmail.com");

        WebElement inputPassword = clickPassword();
        inputPassword.sendKeys("Karin2020@");


        WebElement confirmPassword = getElementConfirmPassword();
        confirmPassword.click();
        confirmPassword.clear();
        confirmPassword.sendKeys("Karin2020@");


        driver.findElement(By.xpath("//input[@id='register-button']")).click();

        WebElement signOutBtn = getElementSignOutBtn();
        String actualRes = getTexBase(signOutBtn);
        System.out.println(actualRes);


        Assert.assertEquals(actualRes, "Sign Out");


    }

}
