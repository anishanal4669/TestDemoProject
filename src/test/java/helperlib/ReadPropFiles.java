package helperlib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropFiles {

    static String value = null;
    static InputStream inputStream = null;
    protected static String filePath = "\\src\\test\\resources\\config.properties";

    public static String getPropertyValue(String key) throws IOException {
        Properties prop = new Properties();
        File file = new File(System.getProperty("user.dir")+filePath);
        inputStream = new FileInputStream(file);
        prop.load(inputStream);
        value = prop.getProperty(key);
        return value;
    }

}
