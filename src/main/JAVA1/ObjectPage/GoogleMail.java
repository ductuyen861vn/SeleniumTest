package ObjectPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by QAVN on 5/24/2017.
 */
public class GoogleMail {

    public WebDriver driver;

    public static By googleAccount = By.xpath("//div/div/a/span[@class='gb_8a gbii']");
    public static By profile = By.xpath("//div[@class='gb_tb gbip' and @title='Profile']");
    public static By openUploadImage = By.xpath("//div[@class='a-b-c d-u d-u-Q' and @role='button']");
    public static String mainHandle;


    public GoogleMail(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnGoogleAcc(){
        driver.findElement(googleAccount).click();
    }

    public void clickOnProfile(){
        driver.findElement(profile).click();
    }

    public void clickOpenUploadImage(){
        driver.findElement(openUploadImage).click();
    }

}
