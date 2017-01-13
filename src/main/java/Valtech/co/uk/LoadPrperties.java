package Valtech.co.uk;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by welcome on 11/12/2016.
 */
public class  LoadPrperties {
     public String getProperty(String key) {
        Properties prop = new Properties();
        FileInputStream input;

        try {
            input = new FileInputStream("src\\test\\Resources\\Properties\\DataConfig.properties");
            prop.load(input);
            input.close ();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}

