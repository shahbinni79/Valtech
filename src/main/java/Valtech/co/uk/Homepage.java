package Valtech.co.uk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.ObjectInputStream;
import java.util.List;

/**
 * Created by welcome on 23/11/2016.
 */
public class Homepage extends DriverManager {

    @FindBy(xpath = "//i[@data-icon='earth-contact']")
    private WebElement _globsigh;

    @FindBy(className = "contactheader")
    private WebElement _contactheadertext;

    @FindBy(xpath = "//div[@class='contactbody']/div")
    private WebElement _countyrName;


    public void homePage() {
        Utils.clickOnElement(_globsigh);


    }

    public String getTextfromContactHeader() {
        return Utils.get_Text(_contactheadertext);
    }

    public void countryList() {
        List<WebElement> countrylist = driver.findElements(By.xpath("//div[@class='contactbody']/div"));
        for (int i = 1; i <= countrylist.size(); i++) {
            System.out.println("\n" + driver.findElement(By.xpath("//div[@class='contactbody']/div[" + i + "]/h3")).getText());
            System.out.println("--------------");
            List<WebElement> cityList = driver.findElements(By.xpath("//div[@class='contactbody']/div[" + i + "]/ul/li"));
            for (int j = 1; j <= cityList.size(); j++) {
                System.out.print(j + "). ");
                System.out.println(driver.findElement(By.xpath("//div[@class='contactbody']/div[" + i + "]/ul/li[" + j + "]/a[2]")).getText());
                System.out.println("\n--------------");
                //SetupCity(cityList, i);
            }
        }
    }
}