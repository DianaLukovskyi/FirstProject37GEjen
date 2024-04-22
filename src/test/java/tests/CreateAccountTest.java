package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {



    @Test
    public void positiveRegisterTest() {
        driver.navigate().to("https://demowebshop.tricentis.com/");

        driver.findElement(By.xpath("//a[@href='/register']")).click();

        WebElement firstName = driver.findElement(By
                .xpath("//input[@id='FirstName']"));
        firstName.sendKeys("Diana");

        WebElement lastName = driver.findElement(By
                .xpath("//input[@id='LastName']"));
        lastName.sendKeys("Lukovsky");


        WebElement inputEmail = driver.findElement(By
                .xpath("//input[@id='Email']"));
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("feling@protonmail.com");

        WebElement inputPassword = driver.findElement(By
                .xpath("//input[@id='Password']"));
        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys("Karin2020@");


        WebElement confirmPassword = driver.findElement(By
                .xpath("//input[@id='ConfirmPassword']"));
        confirmPassword.click();
        confirmPassword.clear();
        confirmPassword.sendKeys("Karin2020@");


        driver.findElement(By.xpath("//input[@id='register-button']")).click();

        WebElement signOutBtn = driver.findElement(By.xpath("//div[@class='result')]")
        );
        String actualRes = signOutBtn.getText().trim();
        System.out.println(actualRes);


        Assert.assertEquals(actualRes, "Sign Out");


    }
}
