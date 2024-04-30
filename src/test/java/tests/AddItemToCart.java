package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;




public class AddItemToCart extends TestBase {

    @Test
    public void loginAndAddToCart() throws InterruptedException {

        loginEmail();

        loginPassword();

        clickSeccondProduct();


        clickOnTheProduct();

        clickOnTheProductName();

        Thread.sleep(3000);


        String actualRes = getTextBase();
        Assert.assertEquals(actualRes, "14.1-inch Laptop");


                }

    public String getTextBase() {
        WebElement product = driver.findElement(By.xpath("//a[@class='product-name']"));
        String actualRes = product.getText();
        return actualRes;
    }

   public void clickOnTheProductName() {
        WebElement shoppingCart = driver.findElement(By.xpath("(//td[@class='product-picture'])[1]"));
    }

    public void clickOnTheProduct() {
        driver.findElement(By.xpath("//a[@class='ico-cart']")).click();
    }

    public void clickSeccondProduct() {
        WebElement secondProduct = driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]"));
        secondProduct.click();
    }

    public void loginPassword() {
        WebElement inputPassword = driver.findElement(By
                .xpath("//input[@id='Password']"));
        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys("Karin2020@");
        driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
    }

    public void loginEmail() {
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();
        WebElement inputEmail = driver.findElement(By
                .xpath("//input[@id='Email']"));
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("feling@protonmail.com");
    }
}
