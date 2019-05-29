package common;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileUtil {
    public static Workbook getWorkBook(String path) throws Exception {
        FileInputStream input = new FileInputStream(new File(path));
        return new XSSFWorkbook(input);
    }

    public static void writeReport(String path, Workbook workbook) throws Exception {
        FileOutputStream output = new FileOutputStream(new File(path));
        workbook.write(output);
        output.close();
    }
}