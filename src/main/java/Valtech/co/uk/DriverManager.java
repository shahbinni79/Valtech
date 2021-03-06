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
static LoadPrperties loadprops = new LoadPrperties();
    public static void browseropening(){

       // String browser=loadprops.getProperty("browser");
        String browser = System.getProperty("browser");
        if (browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
            driver=new ChromeDriver();
        }
        else if((browser.equalsIgnoreCase("ie"))){

            System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");
            driver=new InternetExplorerDriver();
        }
        else if((browser.equalsIgnoreCase("firefox"))){
            driver = new FirefoxDriver();}

        driver.get("https://www.valtech.co.uk/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static void browserclosing(){
        driver.quit();
    }
}



