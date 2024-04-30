package tests;

import dto.UserDTO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;




public class AddItemToCart extends TestBase {

    @Test
    public void loginAndAddToCart() throws InterruptedException {


        login(user);
        clickSeccondProduct();
        clickOnTheProduct();
        clickOnTheProductName();
        pause(3000);

        String actualRes = getTextBase();
        Assert.assertEquals(actualRes, "14.1-inch Laptop");

    }

    public void pause( int time) {
        try {
            Thread.sleep(time);
        }catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getTextBase() {
        WebElement product = driver.findElement(By.xpath("//a[@class='product-name']"));
        String actualRes = product.getText();
        return actualRes;
    }

}


