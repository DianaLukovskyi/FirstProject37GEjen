package tests;

import config.ApplicationManager;
import dto.UserDTO;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class TestBase {
    static ApplicationManager app = new ApplicationManager(System.getProperty("browser", Browser.CHROME.browserName()));
    UserDTO user = new UserDTO().setMail("feling@protonmail.com").setPassword("Karin2020@");

    @BeforeSuite
    public static void startBrowser() {
        app.init();

    }

    @AfterSuite
    public static void tearDown() {
        app.quit();

    }

    public void login(UserDTO user) {
        app.getUserHelper().loginEmail(user.getMail());
        app.getUserHelper().loginPassword(user.getPassword());
    }
}




















