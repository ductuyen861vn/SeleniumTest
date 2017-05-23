package ExecuseTest;

import ObjectPage.Homepage;
import ObjectPage.LoginPage;
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
    public static String user = "mngr78109";
    public static String pass = "gYhYvyt";



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

        String login = objLogin.getTitle();
        Assert.assertEquals(login, "Guru99 Bank");

    }

    @Test(priority = 1)
    public void testLoginSuccessful() {
        objLogin.loginTo(user, pass);
        Assert.assertEquals(objHome.getUserName(),"Manger Id : "+user);
        Assert.assertEquals(objHome.getAlign(),"center");
        

    }

    @AfterTest
    public void aftertest(){
        driver.quit();
    }


}