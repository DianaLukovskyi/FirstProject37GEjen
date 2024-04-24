package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AddItemToCart extends TestBase {

    @Test
    public void positiveRegisterTest()  {

        fillEmail("feling@protonmail.com");

        fillPassword("Karin2020@");

        clickSeccondProduct();


        clickCare();


        clickAShopingCart();

        String actualRes = getElementProduct();
        Assert.assertEquals(actualRes, "14.1-inch Laptop");


    }

}




