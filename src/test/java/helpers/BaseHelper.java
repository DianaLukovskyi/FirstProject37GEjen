package helpers;

import config.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class BaseHelper {
    WebDriver driver;

    public BaseHelper(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findElementBase(By by){
        return driver.findElement(by);
    }
    public List<WebElement> findElementsBase(By by){
        return driver.findElements(by);
    }

    public void pause( int time) {
        try {
            Thread.sleep(time);
        }catch(InterruptedException e) {
            throw new RuntimeException(e);
        }

    }



    }









