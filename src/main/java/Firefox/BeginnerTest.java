/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Firefox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author QAVN
 */
public class BeginnerTest {

    /**
     * @param args the command line arguments
     */

    public static WebDriver webdriver = null;

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.setProperty("webdriver.gecko.driver", "D:\\JAVA_SE_2\\gecko\\geckodriver.exe");

        webdriver = new FirefoxDriver();
        webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webdriver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");

        webdriver.findElement(By.id("timingAlert")).click();
        //cach 1:
//        WebDriverWait wait = new WebDriverWait(webdriver, 10);
//        
//        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        //
        WebDriverWait wait = new WebDriverWait(webdriver, 10);


        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = webdriver.switchTo().alert();
        //cach 2:
//        Thread.sleep(10000);
//        Alert alert = webdriver.switchTo().alert();
        alert.accept();
        webdriver.close();
    }

}
