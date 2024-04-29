package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemCartHelper extends BaseHelper {

    public ItemCartHelper(WebDriver driver) {
        super(driver);
    }

    public WebElement getResultMessage() {
        return driver.findElement(By.xpath("//div[contains(@class,'result')]"));
    }

    public void clickRegisterNavBar() {
        driver.findElement(By.xpath("//a[@href='/register']")).click();
    }

    public WebElement getTextBase() {
       return driver.findElement(By.xpath("14.1-inch Laptop"));

    }
}






