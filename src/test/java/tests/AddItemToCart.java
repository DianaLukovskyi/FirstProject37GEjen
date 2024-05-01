package tests;
import config.ApplicationManager;
import dto.UserDTO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

            String actualRes = getTextBase();
            Assert.assertEquals(actualRes, "14.1-inch Laptop");

        }

        public String getTextBase() {
            WebElement product = ApplicationManager.getDriver().findElement(By.xpath("//a[@class='product-name']"));
            String actualRes = product.getText();
            return actualRes;
        }

    }