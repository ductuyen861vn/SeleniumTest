/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Firefox;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author QAVN
 */
public class SwitchWindow {

    /**
     * @param args the command line arguments
     */

    public static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here

        System.setProperty("webdriver.gecko.driver", "D:\\JAVA_SE_2\\gecko\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");

        String webname = driver.getWindowHandle();
        System.out.println("webname: " + webname);

        driver.findElement(By.xpath("//div[@id='content' and @class='content']//*[contains(text(), 'New Browser Tab')]")).click();


//        driver.findElement(By.xpath("//*[@id='content']/p[3]/button")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.id("button1")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
//        
//        Set<String> handles = driver.getWindowHandles();
//        System.out.println(handles);
//        
//        for (String handle: handles){
//            System.out.println(handle);
//            driver.switchTo().window(handle);
//        }


    }

}
