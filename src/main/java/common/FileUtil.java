package common;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    public static List<String> getFIlePaths(String path, String fileExtension) {
        List<String> filePaths = new ArrayList<>();
        File file = new File(path);
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.getPath().contains(fileExtension)) {
                filePaths.add(f.getPath());
            }
        }
        return filePaths;
    }

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