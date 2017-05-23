package ObjectPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by QAVN on 5/18/2017.
 */
public class Debug {
    WebDriver driver;
    By pagename = By.className("barone");
    By username = By.name("uid");
    By password = By.name("password");
    By login = By.name("btnLogin");
    By reset = By.name("btnReset");

    public Debug(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }

    public void setPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void login() {
        driver.findElement(login).click();
    }

    public void loginTo(String user, String pass) {
        this.setUsername(user);
        this.setPassword(pass);
        this.login();
    }

    public String getTitle() {
        return driver.findElement(pagename).getText();
    }

}
