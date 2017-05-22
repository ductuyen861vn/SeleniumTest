package ExecuseTest;

import ObjectPage.Debug;
import ObjectPage.Homepage;
import ObjectPage.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

/**
 * Created by QAVN on 5/18/2017.
 */
public class DebugTest {
    WebDriver driver;
    Homepage objHome;
    Debug objDebug;
    String user = "mngr78109";
    String pass = "gYhYvyt";

    @BeforeTest

    public void setup() {



        //System.setProperty("webdriver.chrome.driver", "D:\\JAVA_SE_2\\chrome\\chromedriver.exe");
        //driver = new ChromeDriver();

        System.setProperty("webdriver.edge.driver", "D:\\JAVA_SE_2\\edge\\MicrosoftWebDriver.exe");
        driver = new EdgeDriver();



        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/index.php");
        objDebug = new Debug(driver);
        objHome = new Homepage(driver);

    }


    @Test(priority = 0)

    public void testCorrectLoginpage(){
        String pagename = objDebug.getTitle();
        Assert.assertEquals(pagename, "Guru99 Bank");

    }

    @Test(priority = 1)

    public void testLoginSuccessful() {
        objDebug.loginTo(user,pass);
        Assert.assertEquals(objHome.getUserName(),"Manger Id : "+user);
        Assert.assertEquals(objHome.getAlign(),"center");
        driver.close();
    }



}