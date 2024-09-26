package com.ciranet.utilities;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtils {

    public static List<Object[]> getDataFromExcel(String filePath, String sheetName) {
        List<Object[]> data = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(new File(filePath));
             Workbook workbook = WorkbookFactory.create(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);
            for (Row row : sheet) {
                String username = row.getCell(0).getStringCellValue();
                String password = row.getCell(1).getStringCellValue();
                String role = row.getCell(2).getStringCellValue();
                data.add(new Object[]{username, password, role});
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
