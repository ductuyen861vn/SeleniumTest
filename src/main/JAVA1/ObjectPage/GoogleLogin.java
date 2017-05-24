package ObjectPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by QAVN on 5/24/2017.
 */
public class GoogleLogin {
    public WebDriver driver;
    public static By header = By.id("headingText");
    public static By account1 = By.xpath("//div[@role='button' and @data-profileindex='0']");
    public static By password = By.xpath("//input[@type='password']");
    public static By buttonNext = By.xpath("//span[contains(text(),'Next')]");
    public static By enterMail = By.id("identifierId");




    //Expected
    public static String expectedheader = "Choose an account";

    public GoogleLogin(WebDriver driver) {
        this.driver = driver;
    }

    public void clickChooseAcc1 (){
        driver.findElement(account1).click();
    }

    public void inputEmail(){
        driver.findElement(enterMail).clear();
        driver.findElement(enterMail).sendKeys("ductuyen861vn@gmail.com");

    }

    public void inputPass(){
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys("unlockok123");

    }

    public void clickNext(){
        driver.findElement(buttonNext).click();
    }

}
