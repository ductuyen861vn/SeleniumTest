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
    public static String user = "mngr78109";
    public static String pass = "gYhYvyt";

    //Expected
    public static final String Expect_Error_Messenger = "User or Password is not valid";
    public static final String pageHeader = "Guru99 Bank";

    //Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //<Medthods>
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

    public static String getAlertMessenger(){
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        alert.accept();
        return text;

    }

    //</Medthods>

    @DataProvider(name = "userData")
    public Object[][] testData() {

        Object[][] data = new Object[3][2];


        //2nd row
        data[1][0] = "invalid";
        data[1][1] = pass;
        //3rd row
        data[2][0] = user;
        data[2][1] = "invalid";
        //4th row
        data[3][0] = "invalid";
        data[3][1] = "invalid";
        return data;
    }









}
