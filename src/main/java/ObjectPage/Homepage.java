package ObjectPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by QAVN on 5/15/2017.
 */
public class Homepage {

    WebDriver driver;


    By username = By.xpath("//table//tr[@class='heading3']");

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public String getUserName() {
        return driver.findElement(username).getText();
    }

    public String getAlign(){
        return driver.findElement(username).getAttribute("align");
    }
}
