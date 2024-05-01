package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;

public class BaseHelper {
    WebDriver driver;

    public BaseHelper(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement findElementBase(By by){
        return driver.findElement(by);
    }
    protected List<WebElement> findElementsBase(By by){
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









