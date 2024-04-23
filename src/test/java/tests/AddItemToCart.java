package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




public class AddItemToCart extends TestBase {

    @Test
    public void positiveRegisterTest() throws InterruptedException {

       driver.findElement(By.xpath("//a[@class='ico-login']")).click();
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
        driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

       WebElement secondProduct = driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]"));
       secondProduct.click();


       driver.findElement(By.xpath("//a[@class='ico-cart']")).click();

        WebElement shoppingCart = driver.findElement(By.xpath("(//td[@class='product-picture'])[1]"));

        Thread.sleep(3000);












    }
}




