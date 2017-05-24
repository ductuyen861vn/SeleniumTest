package ExecuseTest;

import ObjectPage.Homepage;
import ObjectPage.LoginPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

/**
 * Created by QAVN on 5/23/2017.
 */
public class InvalidUserTest {
    WebDriver driver;
    Homepage objHome;
    LoginPage objLogin;





    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "D:\\JAVA_SE_2\\gecko\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/index.php");
        objHome = new Homepage(driver);
        objLogin = new LoginPage(driver);

    }


    @Test
    public void passWordIncorrectly() throws InterruptedException {
        objLogin.loginTo("123", "321");
        Thread.sleep(5);
        Alert alt = driver.switchTo().alert();
        String actualBoxMsg = alt.getText(); // get content of the Alter Message
        System.out.print("Messenge la: "+actualBoxMsg);
        alt.accept();
        // Compare Error Text with Expected Error Value
        Assert.assertEquals(actualBoxMsg, LoginPage.Expect_Error_Messenger);
    }



}


