package ExecuseTest;

import ObjectPage.GoogleLogin;
import ObjectPage.Homepage;
import ObjectPage.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

/**
 * Created by QAVN on 5/24/2017.
 */
public class TestUploadFileTest {
    WebDriver driver;
    GoogleLogin googleLogin;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.gecko.driver", "D:\\JAVA_SE_2\\gecko\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://gmail.com");
        googleLogin = new GoogleLogin(driver);


    }

    @Test(priority = 0)
    public void login(){
        googleLogin.inputEmail();
        googleLogin.clickNext();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(GoogleLogin.password));
        googleLogin.inputPass();
        googleLogin.clickNext();

    }



}