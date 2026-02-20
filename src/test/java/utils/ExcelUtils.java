package utils;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    public static String getCellData(String sheetName, int rowNum, int colNum) {
        try {
            FileInputStream fis = new FileInputStream(
                "src/test/resources/testdata/LoginData.xlsx"
            );

            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheet(sheetName);
            Row row = sheet.getRow(rowNum);
            Cell cell = row.getCell(colNum);

            workbook.close();
            return cell.getStringCellValue();

        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}

