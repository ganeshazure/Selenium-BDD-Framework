package utils;

import java.io.File;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {

    public static Map<String, String> getJsonData(String filePath) {

        try {

            ObjectMapper mapper = new ObjectMapper();

            return mapper.readValue(
                    new File(filePath),
                    new TypeReference<Map<String, String>>() {}
            );

        } catch (Exception e) {

            throw new RuntimeException(
                    "Unable to read JSON file: " + filePath, e);
        }
    }
}