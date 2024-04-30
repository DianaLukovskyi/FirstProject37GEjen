package tests;

import dto.UserDTO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;




public class AddItemToCart extends TestBase {

    @Test
    public void loginAndAddToCart() throws InterruptedException {

        String mail = "feling@protonmail.com";
        String password = "Karin2020@";
        UserDTO user = new UserDTO().setMail("feling@protonmail.com").setPassword("Karin2020@");
        login(user);

        clickSeccondProduct();


        clickOnTheProduct();

        clickOnTheProductName();

        Thread.sleep(3000);


        String actualRes = getTextBase();
        Assert.assertEquals(actualRes, "14.1-inch Laptop");

    }

    public String getTextBase() {
        WebElement product = driver.findElement(By.xpath("//a[@class='product-name']"));
        String actualRes = product.getText();
        return actualRes;
    }

}