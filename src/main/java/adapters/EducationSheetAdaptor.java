package adapters;

import common.FileUtil;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import sheets.EducationSheet;
import statics.Constants;

public class EducationSheetAdaptor {
    public EducationSheet getEducationSheet() throws Exception{
        Workbook workbook = FileUtil.getWorkBook(Constants.INPUT_FILE_PATH);
        Sheet educationSheet = workbook.getSheet("Education");

        EducationSheet returnedEducationSheet = getEducationSheetProperties(educationSheet);

        return returnedEducationSheet;
    }

    private EducationSheet getEducationSheetProperties(Sheet sheet) {
        EducationSheet returnedEducationSheet = new EducationSheet();
        returnedEducationSheet.setWWID(null);
        returnedEducationSheet.setWorker(null);
        returnedEducationSheet.setWorkerType(null);
        returnedEducationSheet.setActiveStatus(null);
        returnedEducationSheet.setHighestDegreeReceived(null);
        returnedEducationSheet.setEducation(null);
        returnedEducationSheet.setSkillReferenceID(null);
        returnedEducationSheet.setSchoolName(null);
        returnedEducationSheet.setSchoolLocation(null);
        returnedEducationSheet.setStateAndProvince(null);
        returnedEducationSheet.setCountry(null);
        returnedEducationSheet.setSchoolType(null);
        returnedEducationSheet.setDegree(null);
        returnedEducationSheet.setDegreeReceived(null);
        returnedEducationSheet.setFieldOfStudy(null);
        returnedEducationSheet.setFirstYearAttended(null);
        returnedEducationSheet.setLastYearAttended(null);
        returnedEducationSheet.setYearDegreeReceived(null);
        returnedEducationSheet.setGradeAverage(null);
        returnedEducationSheet.setHighestDegreeReceived(null);


        return returnedEducationSheet;
    }
}
