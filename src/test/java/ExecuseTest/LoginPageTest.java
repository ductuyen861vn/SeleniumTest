package ExecuseTest;

import ObjectPage.Homepage;
import ObjectPage.LoginPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

/**
 * Created by QAVN on 5/15/2017.
 */
public class LoginPageTest {
    WebDriver driver;
    Homepage objHome;
    LoginPage objLogin;


    @DataProvider(name = "userData")
    public Object[][] testData() {

        Object[][] data = new Object[3][2];

        // 1st row
        data[0][0] = LoginPage.user;
        data[0][1] = "invalid";
        //2nd row
        data[1][0] = "invalid";
        data[1][1] = LoginPage.pass;
        //3rd row
        data[2][0] = "invalid";
        data[2][1] = "invalid";

        return data;
    }

    @BeforeTest
    @Parameters("browser")
    public void setup(String browser) {
        if(browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "D:\\JAVA_SE_2\\gecko\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        if(browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver", "D:\\JAVA_SE_2\\edge\\MicrosoftWebDriver.exe");
            driver = new EdgeDriver();
        }

        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "D:\\JAVA_SE_2\\chrome\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/index.php");
        objHome = new Homepage(driver);
        objLogin = new LoginPage(driver);



    }





    @Test(priority = 0)

    public void testHomeDisplayCorrected() {

        String login = LoginPage.getTitle();
        Assert.assertEquals(login, LoginPage.pageHeader);

    }

    @Test(priority = 2)
    public void passWordCorrectly() {
        objLogin.loginTo(LoginPage.user, LoginPage.pass);
        Assert.assertEquals(objHome.getUserName(),"Manger Id : "+LoginPage.user);
        Assert.assertEquals(objHome.getAlign(),"center");
    }

    @Test(priority = 1, dataProvider = "userData")
    public void passWordIncorrectly(String user, String pass){
        objLogin.loginTo(user,pass);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals(LoginPage.getAlertMessenger(),LoginPage.Expect_Error_Messenger);
        String login = LoginPage.getTitle();
        Assert.assertEquals(login, LoginPage.pageHeader);


    }

    @AfterTest
    public void aftertest(){
        driver.quit();
    }


}