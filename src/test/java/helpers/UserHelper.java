package helpers;

import config.ApplicationManager;
import dto.ContactDTO;
import dto.UserDTO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class UserHelper extends BaseHelper {
    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnRegisterBtn() {
       driver.findElement(By.xpath("//input[@id='register-button']")).click();
    }

    public void createPassword() {
        WebElement confirmPassword = driver.findElement(By
                .xpath("//input[@id='ConfirmPassword']"));
        confirmPassword.click();
        confirmPassword.clear();
        confirmPassword.sendKeys("Karin2020@");
    }

    public void password(String password) {
        WebElement inputPassword = driver.findElement(By
                .xpath("//input[@id='Password']"));
        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys(password);
    }

    public void email(String email) {
        WebElement inputEmail = driver.findElement(By
                .xpath("//input[@id='Email']"));
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys(email);
    }

    public void lastName(String lastname) {
        WebElement lastName = driver.findElement(By
                .xpath("//input[@id='LastName']"));
        lastName.click();
        lastName.clear();
        lastName.sendKeys(lastname);
    }

    public void firstName(String name) {
        WebElement firstName =driver.findElement(By
                .xpath("//input[@id='FirstName']"));
        firstName.click();
        firstName.clear();
        firstName.sendKeys(name);
    }

    public void registrationBtn() {
        driver.findElement(By.xpath("//a[@href='/register']")).click();
    }

    public void register(ContactDTO contactDTO) {
        registrationBtn();
        firstName(contactDTO.getName());
        lastName(contactDTO.getLastname());
        email(contactDTO.getEmail());
        password(contactDTO.getPassword());
        createPassword();
        clickOnRegisterBtn();
    }



    public void clickOnTheProductName() {
        WebElement shoppingCart = driver.findElement(By.xpath("(//td[@class='product-picture'])[1]"));
    }

    public void clickOnTheProduct() {
        driver.findElement(By.xpath("//a[@class='ico-cart']")).click();
    }

    public void clickSeccondProduct() {
        WebElement secondProduct =driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]"));
        secondProduct.click();
    }

    public void loginPassword(String password) {
        password(password);
        driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
    }

    public void loginEmail(String email) {
       driver.findElement(By.xpath("//a[@class='ico-login']")).click();
        email(email);
    }

}




