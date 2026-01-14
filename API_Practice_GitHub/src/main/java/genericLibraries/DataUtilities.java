package genericLibraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataUtilities implements AutoConstant {
    private Properties prop;

    public DataUtilities() {
        try {
            FileInputStream file = new FileInputStream(propertyFilePath);
            prop = new Properties();
            prop.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getDataFromProperty(String key) {
        return prop.getProperty(key);
    }
}
