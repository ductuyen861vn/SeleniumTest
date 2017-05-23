package ObjectPage;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

/**
 * Created by QAVN on 5/15/2017.
 */

public class LoginPage {

    public static WebDriver driver;
    public static By pagename = By.className("barone");
    public static By username = By.name("uid");
    public static By password = By.name("password");
    public static By login = By.name("btnLogin");
    public static By reset = By.name("btnReset");

    //Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    //Set username
    public static void setUsername(String user) {
        driver.findElement(username).clear();
        driver.findElement(username).sendKeys(user);
    }
    //set password
    public static void setPassword(String pass) {
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(pass);
    }
    //click on Login button
    public static void login() {
        driver.findElement(login).click();
    }

    //Set username + password and click on Login button
    public static void loginTo(String user, String pass) {
        setUsername(user);
        setPassword(pass);
        login();
    }

    //Get String of header
    public static String getTitle() {
        return driver.findElement(pagename).getText();
    }


    //Get Alert messenger text

    public static String getAlertMessenger(WebDriver driver){
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        return text;

    }







}
