package Valtech.co.uk;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by welcome on 23/11/2016.
 */
public class Utils extends DriverManager {

    public static void webDriverWaitImplicitly(int time) {
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }
    public static void enterText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);

    }
    public static void clickOnElement (WebElement element){
        element.click();
    }
    public static String get_Text(WebElement element){
        return element.getText();
    }
    public static boolean isElement_Present(WebElement element){
        return element.isDisplayed();
    }

    public static void driverWaitExplicitly(WebElement element , int time) {
        WebDriverWait explicitlyWait = new WebDriverWait(driver, time);
        explicitlyWait.until(ExpectedConditions.visibilityOf(element));
    }
}
