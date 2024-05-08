package helpers;

import org.openqa.selenium.WebDriver;

public class HomePageHelper extends BaseHelper {
    public HomePageHelper(WebDriver driver) {
        super(driver);
    }


    public void navigateBar() {
       driver.navigate().to("https://demowebshop.tricentis.com/");

    }
}


