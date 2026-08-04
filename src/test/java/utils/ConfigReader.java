package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    public static Properties initializeProperties() {

        Properties prop = new Properties();

        // Read environment from Maven command
        String env = System.getProperty("env");

        // Default environment
        if (env == null || env.isEmpty()) {
            env = "qa";
        }

        System.out.println("Running in Environment : " + env);

        String path = System.getProperty("user.dir")
                + "\\src\\main\\resources\\config\\config-" + env + ".properties";

        try {
            FileInputStream fis = new FileInputStream(new File(path));
            prop.load(fis);
        } catch (Exception e) {
            throw new RuntimeException("Unable to load config file : " + path, e);
        }

        return prop;
    }
}