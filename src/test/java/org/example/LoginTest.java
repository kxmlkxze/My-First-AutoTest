package org.example;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class LoginTest {

    private static WebDriver driver;
    private static LoginPage loginPage;
    private static ProfilePage profilePage;

    @BeforeEach
    void setup(){
        System.setProperty("webdriver.chrome.driver","D:\\Driver Chrome\\chromedriver-win64\\chromedriver.exe");

        driver =  new ChromeDriver();
        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://github.com");
    }
    @Test
    void loginTest(){
        loginPage.setAccountButton();
        loginPage.setLogin("kamlkxze");
        loginPage.setPasswordField("aslan00089");
        loginPage.setSignIn();
    }

    @AfterEach
    void tearDown(){
        profilePage.setAccountButton2();
        profilePage.setSignOut();
        profilePage.setSignOutButton();
        driver.quit();

    }
}
