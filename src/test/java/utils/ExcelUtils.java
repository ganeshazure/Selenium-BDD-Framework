package utils;

import java.io.FileInputStream;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.*;

public class ExcelUtils {

    public static Map<String, String> getRegistrationData() {

        Map<String, String> data = new LinkedHashMap<>();

        String path =
                "src/test/resources/testdata/Testdata.xlsx";

        try (FileInputStream fis = new FileInputStream(path);
             Workbook workbook = WorkbookFactory.create(fis)) {

            Sheet sheet = workbook.getSheet("Registration");

            Row header = sheet.getRow(0);
            Row row = sheet.getRow(1);

            for (int i = 0; i < header.getLastCellNum(); i++) {

                String key =
                        header.getCell(i).getStringCellValue();

                String value =
                        row.getCell(i).toString();

                data.put(key, value);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public static Map<String, String> getFirstRegistrationData() {
        Map<String, String> data = getRegistrationData();

        if (data != null && !data.isEmpty()) {
            return data;
        }

        Map<String, String> fallback = new LinkedHashMap<>();
        fallback.put("FirstName", "John");
        fallback.put("LastName", "Doe");
        fallback.put("Email", "john.doe@test.com");
        fallback.put("Telephone", "1234567890");
        fallback.put("Password", "Password@123");
        fallback.put("Confirm", "Password@123");
        fallback.put("PasswordConfirm", "Password@123");
        fallback.put("Newsletter", "No");
        return fallback;
    }
}