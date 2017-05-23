package ExecuseTest;

import ObjectPage.Homepage;
import ObjectPage.LoginPage;
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


    @DataProvider(name = "userDATA")
    public Object[][] testData() {

        Object[][] data = new Object[3][2];


        //2nd row
        data[1][0] = "invalid";
        data[1][1] = LoginPage.pass;
        //3rd row
        data[2][0] = LoginPage.user;
        data[2][1] = "invalid";
        //4th row
        data[3][0] = "invalid";
        data[3][1] = "invalid";
        return data;
    }


    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "D:\\JAVA_SE_2\\gecko\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/index.php");
        objHome = new Homepage(driver);
        objLogin = new LoginPage(driver);

    }





    @Test(dataProvider = "userData")
    public void passWordIncorrectly(String user, String pass){
        objLogin.loginTo(user,pass);
        Assert.assertEquals(LoginPage.getAlertMessenger(),LoginPage.Expect_Error_Messenger);
        String login = LoginPage.getTitle();
        Assert.assertEquals(login, LoginPage.pageHeader);
    }

    @AfterTest
    public void aftertest(){
        driver.quit();
    }

}