package Valtech.co.uk;

import com.sun.glass.ui.View;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by welcome on 23/11/2016.
 */
public class DriverManager {

    protected static WebDriver driver ;
    public DriverManager (){PageFactory.initElements(driver,this);}

    public static void browseropening(){
        String browser="InternetExplorer";
        if (browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
            driver=new ChromeDriver();
        }
        else if((browser.equalsIgnoreCase("InternetExplorer"))){

            System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");
            driver=new InternetExplorerDriver();
        }
        else {
            driver = new FirefoxDriver();}

        driver.get("https://www.valtech.co.uk/contact/bangalore/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

//    public static void browserclosing(){
//        driver.quit();
//    }
}



