package helpers;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.File;
import java.io.IOException;
import java.util.List;

public class BaseHelper {
    WebDriver driver;
    static Logger logger = LoggerFactory.getLogger(BaseHelper.class);

    public BaseHelper(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement findElementBase(By by) {
        return driver.findElement(by);
    }

    protected List<WebElement> findElementsBase(By by) {
        return driver.findElements(by);
    }

    public void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        }

    public String takeScreenshot() {

        logger.info("start screenshot");
        File tmp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File screenshot = new File("screenshots/screen" + System.currentTimeMillis()
                + ".png");
        return screenshot.getPath();

    }
}














