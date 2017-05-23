package ExecuseTest;

import ObjectPage.Guru99LoginPage;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.*;

/**
 * Created by QAVN on 5/22/2017.
 */
public class Guru99LoginPageTest {

    private WebDriver driver; // Selenium control driver
    private String baseUrl; // baseUrl of website Guru99


    /**
     * create test data for testing The test data include set of username,
     * password
     *
     * @return
     */
    @DataProvider(name = "GuruTest")
    public Object[][] testData() {

        Object[][] data = new Object[4][2];

        // 1st row
        data[0][0] = Guru99LoginPage.USER_NAME;
        data[0][1] = Guru99LoginPage.PASSWD;
        //2nd row
        data[1][0] = "invalid";
        data[1][1] = Guru99LoginPage.PASSWD;
        //3rd row
        data[2][0] = Guru99LoginPage.USER_NAME;
        data[2][1] = "invalid";
        //4th row
        data[3][0] = "invalid";
        data[3][1] = "invalid";
        return data;
    }

    /**
     * Before Executing Test, Setup test environment
     *
     * @throws Exception
     *
     */
    @BeforeMethod
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "D:\\JAVA_SE_2\\gecko\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Go to http://www.demo.guru99.com/V4/
        driver.get("http://demo.guru99.com/V4/index.php");
    }

    /**
     * Start Testing Test script 05
     * 1) Go to http://www.demo.guru99.com/V4/
     * 2) Enter valid UserId
     * 3) Enter valid Password
     * 4) Click Login Expected
     * result: Login successful home page shown Message shown Welcome
     * <managerid>
     *
     * @throws Exception
     */

    @Test(dataProvider = "GuruTest")
    public void testCase05(String username, String password) throws Exception {
        String actualTitle;
        String actualBoxMsg;
        // Enter valid UserId
        driver.findElement(By.name("uid")).clear();
        driver.findElement(By.name("uid")).sendKeys(username);
        // Enter valid Password
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(password);
        // Click Login
        driver.findElement(By.name("btnLogin")).click();

        try{
            Alert alt = driver.switchTo().alert();
            actualBoxMsg = alt.getText(); // get content of the Alter Message
            alt.accept();
            // Compare Error Text with Expected Error Value
            assertEquals(actualBoxMsg,Guru99LoginPage.EXPECT_ERROR);


        }
        catch (NoAlertPresentException Ex){

            // Get text displayes on login page
            String pageText = driver.findElement(By.tagName("tbody")).getText();

            // Extract the dynamic text mngrXXXX on page
            String[] parts = pageText.split(Guru99LoginPage.PATTERN);
            String dynamicText = parts[1];

            // Check that the dynamic text is of pattern mngrXXXX
            // First 4 characters must be "mngr"
            assertTrue(dynamicText.substring(1, 5).equals(Guru99LoginPage.FIRST_PATTERN));
            // remain stores the "XXXX" in pattern mngrXXXX
            String remain = dynamicText.substring(dynamicText.length() - 4);
            // Check remain string must be numbers;
            assertTrue(remain.matches(Guru99LoginPage.SECOND_PATTERN));
            // Code to take Screenshot
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            // Code to save screenshot at desired location
            //FileGuru99LoginPages.copyFile(scrFile, new File("c:\\screenshot.png"));
        }
    }





    /**
     * Complete the testing
     *
     * @throws Exception
     */
    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }

}