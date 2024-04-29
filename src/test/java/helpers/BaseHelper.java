package helpers;

import config.ApplicationManager;
import dto.UserDTO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseHelper {
    WebDriver driver;

    public BaseHelper(WebDriver driver) {
        this.driver = driver;
    }





    public void clickOnTheProductPicture() {
       driver.findElement(By.xpath("(//td[@class='product-picture'])[1]"));
    }

    public void clickOnTheSecondProductBtn() {
        driver.findElement(By.xpath("//a[@class='ico-cart']")).click();
    }

    public void clickLoginBtn() {

        driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
    }


    public void fillPasswordOnLogin(String password) {
        driver.findElement(By
                .xpath("//input[@id='Password']"));

    }

    public void fillEmailOnLogin(String email) {
        driver.findElement(By.xpath("//input[@id='Email']"));

    }

    public void clickAddToCart() {
        driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
    }
    public void clickOnLoginNavBar() {
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();
   }



    public void clickRegisterNavBar() {
    }

    public void navigateToHomePage() {
        ApplicationManager.getDriver().navigate().to("https://demowebshop.tricentis.com/");
    }

}




