package tests;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class AddItemToCart extends TestBase {

    @BeforeClass
    public void preCondition() {
        login(user);

    }

        @Test
        public void loginAndAddToCart() throws InterruptedException {

            app.getUserHelper().clickSeccondProduct();
            app.getUserHelper().clickOnTheProduct();
            app.getUserHelper().clickOnTheProductName();
            app.getHomePageHelper().pause(3000);

            String actualRes = app.getUserHelper().getTextBase();
            Assert.assertEquals(actualRes, "14.1-inch Laptop");

        }



    }