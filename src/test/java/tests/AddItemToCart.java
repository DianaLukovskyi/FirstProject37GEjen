package tests;

import dto.UserDTO;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class AddItemToCart extends TestBase {
    @BeforeClass
    public void preCondition() {

        app.getItemCartHelper();
        UserDTO user = new UserDTO().setEmail("feling@protomail.com").setPassword("Karin2020@");


    }


    @Test
    public void addProductToCart() throws InterruptedException {


        app.getUserHelper().clickAddToCart();


        app.getUserHelper().clickOnTheSecondProductBtn();


        app.getUserHelper().clickOnTheProductPicture();

;
        WebElement actualRes = app.getItemCartHelper().getTextBase();
        Assert.assertEquals(actualRes, "14.1-inch Laptop");


    }


}




