package ExecuseTest;

import ObjectPage.GoogleLogin;
import ObjectPage.GoogleMail;
import ObjectPage.Homepage;
import ObjectPage.LoginPage;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

/**
 * Created by QAVN on 5/24/2017.
 */
public class TestUploadFileTest {
    WebDriver driver;
    GoogleLogin googleLogin;
    GoogleMail googleMail;



    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.gecko.driver", "D:\\JAVA_SE_2\\gecko\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://gmail.com");
        googleLogin = new GoogleLogin(driver);
        googleMail = new GoogleMail(driver);



    }

    @Test(priority = 0)
    public void login() throws InterruptedException {

        googleLogin.inputEmail();
        googleLogin.clickNext();
        WebDriverWait wait = new WebDriverWait(driver,10);;
        wait.until(ExpectedConditions.visibilityOfElementLocated(GoogleLogin.password));
        googleLogin.inputPass();
        googleLogin.clickNext();


    }


    @Test(priority = 1)
    public void openUploadFile() throws InterruptedException {
        /*String mainHandle = driver.getWindowHandle();
        System.out.println(driver.getWindowHandle());*/
        googleMail.clickOnGoogleAcc();
        googleMail.clickOnProfile();
        Thread.sleep(10000);
        driver.switchTo().frame(8);
        googleMail.clickOpenUploadImage();

        /*//Chay vong lap de tim nhung frame nao chua element openUploadImage
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);
        for(int i=0; i<=size; i++){
            driver.switchTo().frame(i);
            int total=driver.findElements(GoogleMail.openUploadImage).size();
            System.out.println(total);
            driver.switchTo().defaultContent();}*/


        /*driver.switchTo().frame("I2_1495708172281");
        googleMail.clickOpenUploadImage();*/

        /*Set<String> winHandles = driver.getWindowHandles();
        Iterator<String> it = winHandles.iterator();
        System.out.println(winHandles);
        while (it.hasNext()){
            String childHandle = it.next();
            if(!mainHandle.equalsIgnoreCase(childHandle)){
                driver.switchTo().window(childHandle);
                ;
            }
        }*/
    }

    /*@AfterTest
    public void quit(){
        driver.close();
    }*/





}