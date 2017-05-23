package ObjectPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by QAVN on 5/15/2017.
 */
public class Homepage {

    public static WebDriver driver;


    public static By username = By.xpath("//table//tr[@class='heading3']");

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public static String getUserName() {
        return driver.findElement(username).getText();
    }

    public static String getAlign(){
        return driver.findElement(username).getAttribute("align");
    }
}
