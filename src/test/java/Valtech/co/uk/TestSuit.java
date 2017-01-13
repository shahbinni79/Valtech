package Valtech.co.uk;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by welcome on 23/11/2016.
 */
public class TestSuit extends DriverManager {

    @BeforeTest
public static void open(){
        DriverManager.browseropening();
    }

    @AfterTest
    public static void close(){
        DriverManager.browserclosing();
    }

    @Test
    public static void getCities(){
        Homepage homepage = new Homepage();
        homepage.homePage();
        Assert.assertEquals(homepage.getTextfromContactHeader(),"Contact our other offices");
        homepage.countryList();

    }

    @Test
    public static void countrynames(){



    }
}
