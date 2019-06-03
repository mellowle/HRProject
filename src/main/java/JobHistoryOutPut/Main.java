package JobHistoryOutPut;

import common.FileUtil;
import org.apache.poi.openxml4j.exceptions.NotOfficeXmlFileException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import statics.Constants;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        List<WWIDWithJobHistorys> outputInstances = new ArrayList<>();
        List<String> filePaths = FileUtil.getFilePaths(Constants.INPUT_FILE_PATH + "/docx", Constants.DOCX_FILE_EXTENSION);
        outer:
        for (String s : filePaths) {
            //        String s = "src/main/resources/docx/out_a5161c32ae333634d3aef839cbe177e2.docx";
            //            System.err.println(s);
            String wwid = s.subSequence(28, s.length() - 5).toString();
            WWIDWithJobHistorys instance = new WWIDWithJobHistorys();
            instance.setWWID(wwid);

            FileInputStream file = new FileInputStream(s);
            try {
                XWPFDocument doc = new XWPFDocument(file);


                Iterator<XWPFTable> tableI = doc.getTablesIterator();
                List<JobHistory> jbs = new ArrayList<>();
                List<JobHistory> jbsE = new ArrayList<>();

                while (tableI.hasNext()) {
                    XWPFTable t = tableI.next();
                    List<XWPFTableRow> rs = t.getRows();
                    loop:
                    for (int i = 0; i < rs.size(); i++) {
                        XWPFTableRow r = rs.get(i);
                        List<XWPFTableCell> tcs = r.getTableCells();
                        if (tcs.size() == 1) {
                            try {
                                if (tcs.get(0).getText().contains("J&J Job History")) {
                                    here:
                                    for (int j = 1; j < 10; j++) {
                                        int k = i + j;
                                        XWPFTableRow rNext = rs.get(k);
                                        if (rNext.getTableICells().size() == 1) {
                                            break;
                                        }
                                        if (rNext.getTableICells().size() != 1) {
                                            List<XWPFTableCell> tcsNext = rNext.getTableCells();
                                            if (tcsNext.get(0).getText().toLowerCase().equals("year")) {
                                                continue here;
                                            }
                                            JobHistory jb = new JobHistory();
                                            jb.setYear(tcsNext.get(0).getText());
                                            jb.setTitle(tcsNext.get(1).getText());
                                            jb.setCompany(tcsNext.get(2).getText());
                                            jb.setLocation(tcsNext.get(3).getText());
                                            if (jb.getYear().equals("") && jb.getTitle().equals("") && jb.getCompany().equals("") && jb.getLocation().equals("")) {
                                                continue here;
                                            }
                                            else {

                                                jbs.add(jb);
                                            }
                                        }
                                    }
                                }
                            } catch (IndexOutOfBoundsException e) {
                                continue loop;
                            }

                            try {
                                if (tcs.get(0).getText().contains("External Job History")) {
                                    here:
                                    for (int j = 1; j < 10; j++) {
                                        int k = i + j;
                                        XWPFTableRow rNext = rs.get(k);
                                        if (rNext.getTableICells().size() == 1) {
                                            break;
                                        }
                                        if (rNext.getTableICells().size() != 1) {
                                            List<XWPFTableCell> tcsNext = rNext.getTableCells();
                                            if (tcsNext.get(0).getText().toLowerCase().equals("year")) {
                                                continue here;
                                            }
                                            JobHistory jb = new JobHistory();
                                            jb.setYear(tcsNext.get(0).getText());
                                            jb.setTitle(tcsNext.get(1).getText());
                                            jb.setCompany(tcsNext.get(2).getText());
                                            jb.setLocation(tcsNext.get(3).getText());
                                            if (jb.getYear().equals("") && jb.getTitle().equals("") && jb.getCompany().equals("") && jb.getLocation().equals("")) {
                                                continue here;
                                            }
                                            else {

                                                jbsE.add(jb);
                                            }
                                        }
                                    }
                                }
                            } catch (IndexOutOfBoundsException e) {
                                continue loop;
                            }
                        }
                    }
                }
                Collections.sort(jbs);
                Collections.sort(jbsE);

                instance.setJnjJobHistory(jbs);
                instance.setExternalJobHistory(jbsE);
                instance.setNumberOfJnjRoles();
                instance.setNumberOfExternalRoles();
                instance.calcAverageRoleWorkingYear(jbs, true);
                instance.calcAverageRoleWorkingYear(jbsE, false);

                System.err.println(instance.toString());

                outputInstances.add(instance);
                file.close();
                //one output test
//                break;


            } catch (NotOfficeXmlFileException e) {
                file.close();
                continue outer;
            }
        }



        FileOutputStream outFile = new FileOutputStream(new File(Constants.INPUT_FILE_PATH + "/JobHistory.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook();
        Map<Integer, String> headers = new HashMap<>();
        headers.put(0, "WWID");
        headers.put(1, "JNJJobHistory1/year");
        headers.put(2, "JNJJobHistory1/title");
        headers.put(3, "JNJJobHistory1/company");
        headers.put(4, "JNJJobHistory1/location");
        headers.put(5, "JNJJobHistory2/year");
        headers.put(6, "JNJJobHistory2/title");
        headers.put(7, "JNJJobHistory2/company");
        headers.put(8, "JNJJobHistory2/location");
        headers.put(9, "JNJJobHistory3/year");
        headers.put(10, "JNJJobHistory3/title");
        headers.put(11, "JNJJobHistory3/company");
        headers.put(12, "JNJJobHistory3/location");
        headers.put(13, "JNJJobHistory4/year");
        headers.put(14, "JNJJobHistory4/title");
        headers.put(15, "JNJJobHistory4/company");
        headers.put(16, "JNJJobHistory4/location");
        headers.put(17, "JNJJobHistory5/year");
        headers.put(18, "JNJJobHistory5/title");
        headers.put(19, "JNJJobHistory5/company");
        headers.put(20, "JNJJobHistory5/location");

        headers.put(21, "ExternalJobHistory1/year");
        headers.put(22, "ExternalJobHistory1/title");
        headers.put(23, "ExternalJobHistory1/company");
        headers.put(24, "ExternalJobHistory1/location");
        headers.put(25, "ExternalJobHistory2/year");
        headers.put(26, "ExternalJobHistory2/title");
        headers.put(27, "ExternalJobHistory2/company");
        headers.put(28, "ExternalJobHistory2/location");
        headers.put(29, "ExternalJobHistory3/year");
        headers.put(30, "ExternalJobHistory3/title");
        headers.put(31, "ExternalJobHistory3/company");
        headers.put(32, "ExternalJobHistory3/location");
        headers.put(33, "ExternalJobHistory4/year");
        headers.put(34, "ExternalJobHistory4/title");
        headers.put(35, "ExternalJobHistory4/company");
        headers.put(36, "ExternalJobHistory4/location");
        headers.put(37, "ExternalJobHistory5/year");
        headers.put(38, "ExternalJobHistory5/title");
        headers.put(39, "ExternalJobHistory5/company");
        headers.put(40, "ExternalJobHistory5/location");
        headers.put(41, "NumberOfJnJRoles");
        headers.put(42, "AverageTimeOfJnJRole");
        headers.put(43, "NumberOfExternalRoles");
        headers.put(44, "AverageTimeOfExternalRoles");

        XSSFSheet sheet = workbook.createSheet();
        XSSFRow headerRow = sheet.createRow(0);
        for (int i = 0; i < headers.size(); i++) {
            headerRow.createCell(i).setCellValue(headers.get(i));
        }
        for (int i = 0; i < outputInstances.size(); i++) {
            WWIDWithJobHistorys tmp = outputInstances.get(i);
            XSSFRow row = sheet.createRow(i + 1);
            row.createCell(0).setCellValue(tmp.getWWID() == null ? "" : tmp.getWWID());
            List<JobHistory> jnj = tmp.getJnjJobHistory();
            for (int j = 0; j < jnj.size(); j++) {
                JobHistory jnjTmp = jnj.get(j);
                row.createCell(j * 4 + 1).setCellValue(jnjTmp.getYear() == null ? "" : jnjTmp.getYear());
                row.createCell(j * 4 + 2).setCellValue(jnjTmp.getTitle() == null ? "" : jnjTmp.getTitle());
                row.createCell(j * 4 + 3).setCellValue(jnjTmp.getCompany() == null ? "" : jnjTmp.getCompany());
                row.createCell(j * 4 + 4).setCellValue(jnjTmp.getLocation() == null ? "" : jnjTmp.getLocation());

            }

            List<JobHistory> external = tmp.getExternalJobHistory();
            for (int j = 0; j < external.size(); j++) {
                JobHistory externalTmp = external.get(j);
                row.createCell(j * 4 + 20 + 1).setCellValue(externalTmp.getYear() == null ? "" : externalTmp.getYear());
                row.createCell(j * 4 + 20 + 2).setCellValue(externalTmp.getTitle() == null ? "" : externalTmp.getTitle());
                row.createCell(j * 4 + 20 + 3).setCellValue(externalTmp.getCompany() == null ? "" : externalTmp.getCompany());
                row.createCell(j * 4 + 20 + 4).setCellValue(externalTmp.getLocation() == null ? "" : externalTmp.getLocation());

            }
            row.createCell(41).setCellValue(tmp.getNumberOfJnjRoles());
            row.createCell(42).setCellValue(tmp.getAverageJnjRoleWorkingYear());
            row.createCell(43).setCellValue(tmp.getNumberOfExternalRoles());
            row.createCell(44).setCellValue(tmp.getAverageExternalRoleWorkingYear());
            headers.put(41, "NumberOfJnJRoles");
            headers.put(42, "AverageTimeOfJnJRole");
            headers.put(43, "NumberOfExternalRoles");
            headers.put(44, "AverageTimeOfExternalRoles");
        }
        workbook.write(outFile);
        outFile.close();

    }
}
