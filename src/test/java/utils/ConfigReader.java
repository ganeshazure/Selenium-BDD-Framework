package utils;

import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
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

        Path path = Paths.get(
                System.getProperty("user.dir"),
                "src",
                "main",
                "resources",
                "config",
                "config-" + env + ".properties"
        );

        try {
            FileInputStream fis = new FileInputStream(path.toFile());
            prop.load(fis);
            fis.close();

        } catch (Exception e) {
            throw new RuntimeException(
                    "Unable to load config file : " + path, e
            );
        }

        return prop;
    }
}