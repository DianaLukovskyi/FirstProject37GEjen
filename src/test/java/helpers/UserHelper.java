package helpers;

import config.ApplicationManager;
import dto.ContactDTO;

import dto.UserDTO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class UserHelper extends BaseHelper {
    public UserHelper(WebDriver driver) {
        super(driver);
    }

    By registerBtn = By.xpath("//input[@id='register-button']");
    By firstRegistrationButton = By.xpath("//a[@href='/register']");
    By laptopPicture = By.xpath("(//td[@class='product-picture'])[1]");
    By productBtn = By.xpath("//a[@class='ico-cart']");
    By secondProductBtn = By.xpath("(//input[@value='Add to cart'])[2]");
    By loginPassword = By.xpath("//input[@class='button-1 login-button']");
    By loginEmail = By.xpath("//a[@class='ico-login']");
    By text = By.xpath("//a[@class='product-name']");

    public void clickOnRegisterBtn() {
        clickBase(registerBtn);

    }
    protected void clickBase(By by){
        findElementBase(by).click();

    }

    public void registrationBtn() {
        findElementBase(firstRegistrationButton).click();
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
        findElementBase(laptopPicture);
    }

    public void clickOnTheProduct() {
        findElementBase(productBtn).click();
    }

    public void clickSeccondProduct() { findElementBase(secondProductBtn).click();


    }


    public void createPassword() {
        By createPassword = By
                .xpath("//input[@id='ConfirmPassword']");
        WebElement confirmPassword = driver.findElement(createPassword);
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



    public void loginPassword(String password) {
        password(password);
        findElementBase(loginPassword).click();

    }

    public void loginEmail(String email) {
       findElementBase(loginEmail).click();
        email(email);
    }
    public String getTextBase() {
        WebElement product = driver.findElement(text);
        String actualRes = product.getText();
        return actualRes;
    }

    public void login(UserDTO user) {

    }
}




