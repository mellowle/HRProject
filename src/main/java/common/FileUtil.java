package common;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import output.Hypothesis;
import statics.Constants;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public static Set<String> getWWIDSet() throws Exception {
        List<String> filePaths = FileUtil.getFIlePaths(Constants.INPUT_FILE_PATH, Constants.EXCELX_FILE_EXTENSION);
                filePaths.stream().forEach(System.err::println);

        Set<String> wwidSet = new HashSet<>();
        //        List<String> wwidList = new ArrayList<>();
        for (String filePath : filePaths) {
            Workbook workbook = FileUtil.getWorkBook(filePath);
            Sheet sheet = workbook.getSheetAt(0);
            Row row;
            // Ignore head start with index 1
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                row = sheet.getRow(i);
                if (row != null) {
                    //                    System.err.println(row.getCell(getWWIDColumn(filePath)).getStringCellValue());
                    wwidSet.add(row.getCell(getWWIDColumn(filePath)).getStringCellValue());
                    //                    wwidList.add(row.getCell(getWWIDColumn(filePath)).getStringCellValue());
                }
            }
        }

        //        System.err.println(wwidSet.size());
        //        System.err.println(wwidList.size());
        return wwidSet;
    }

    public static int getWWIDColumn(String filePath) {
        int columnIndex = 0;
        if (filePath.toLowerCase().contains("demographics")) {
            columnIndex = 0;
        }
        else if (filePath.toLowerCase().contains("education")) {
            columnIndex = 0;
        }
        else if (filePath.toLowerCase().contains("performance")) {
            columnIndex = 2;
        }
        else if (filePath.toLowerCase().contains("direct")) {
            columnIndex = 0;
        }
        else if (filePath.toLowerCase().contains("transfer")) {
            columnIndex = 0;
        }
        else if (filePath.toLowerCase().contains("rewards")) {
            columnIndex = 0;
        }
        else if (filePath.toLowerCase().contains("movement")) {
            columnIndex = 0;
        }
        return columnIndex;
    }

    public static List<Hypothesis> getHypothesisList(Set<String> wwidSet) {
        List<Hypothesis> hypothesisList = new ArrayList<>();
        Hypothesis hypothesis;
        for (String wwid : wwidSet) {
            hypothesis = new Hypothesis();
            hypothesis.setWWID(wwid);
            hypothesisList.add(hypothesis);
        }
        return hypothesisList;
    }

    public static RelatedRows getRelatedRows(Hypothesis hypothesis) throws Exception {
        List<String> filePaths = FileUtil.getFIlePaths(Constants.INPUT_FILE_PATH, Constants.EXCELX_FILE_EXTENSION);
        String wwid = hypothesis.getWWID();
        RelatedRows relatedRows = new RelatedRows();
        Row row;
        for (String filePath : filePaths) {
            Workbook workbook = FileUtil.getWorkBook(filePath);
            Sheet sheet = workbook.getSheetAt(0);
            // Ignore head start with index 1
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                row = sheet.getRow(i);
                if (row != null) {
                    if(row.getCell(getWWIDColumn(filePath)).getStringCellValue().contains(wwid)){
                        if (filePath.toLowerCase().contains("demographics")) {
                            relatedRows.setEmployeeDemographcisRow(row);
                        }
                        else if (filePath.toLowerCase().contains("education")) {
                            relatedRows.setEducationRow(row);
                        }
                        else if (filePath.toLowerCase().contains("performance")) {
                            relatedRows.setPerformanceRatingRow(row);
                        }
                        else if (filePath.toLowerCase().contains("direct")) {
                        }
                        else if (filePath.toLowerCase().contains("transfer")) {
                        }
                        else if (filePath.toLowerCase().contains("rewards")) {
                        }
                        else if (filePath.toLowerCase().contains("movement")) {
                            relatedRows.setTalentMovementRow(row);
                        }
                    }
                }
            }
        }
        return relatedRows;
    }
}