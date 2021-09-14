package Helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    private static final String CONFIGPATH="src/test/resources/config.properties";

    public static String getValue(String key) throws IOException {
        File file = new File(CONFIGPATH);
        FileInputStream fileInputStream = new FileInputStream(file);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        return properties.getProperty(key);
    }

    public Long getTimeout() throws IOException {
        String timeout=PropertiesReader.getValue("timeout");
        return Long.parseLong(timeout);
    }
}
