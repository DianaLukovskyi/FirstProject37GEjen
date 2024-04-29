package helpers;

import config.ApplicationManager;
import dto.UserDTO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserHelper extends BaseHelper {
    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void clickAddRegisterBtn() {
        ApplicationManager.getDriver().findElement(By.xpath("//input[@id='register-button']")).click();
    }

    public WebElement getElementConfirmPassword() {
        return ApplicationManager.getDriver().findElement(By
                .xpath("//input[@id='ConfirmPassword']"));
    }

    public WebElement getElementInputPassword() {
        return ApplicationManager.getDriver().findElement(By.xpath("//input[@id='Password']"));
    }

    public WebElement getElementInputEmail() {
        return ApplicationManager.getDriver().findElement(By
                .xpath("//input[@id='Email']"));
    }

    public WebElement getElementLastName() {
        return ApplicationManager.getDriver().findElement(By
                .xpath("//input[@id='LastName']"));
    }
}

