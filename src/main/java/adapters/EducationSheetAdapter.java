package adapters;

import org.apache.poi.ss.usermodel.Row;
import sheets.EducationSheet;

public class EducationSheetAdapter {

    public static EducationSheet toDomain(Row row) {
        if (row != null) {
            return setProperties(row);
        }
        return null;
    }

    private static EducationSheet setProperties(Row row) {
        EducationSheet educationSheet = new EducationSheet();

        educationSheet.setWWID(null);
        educationSheet.setWorker(null);
        educationSheet.setWorkerType(null);
        educationSheet.setActiveStatus(null);
        educationSheet.setHighestDegreeReceived(row.getCell(Constants.highestDegreeReceived).getStringCellValue());
        educationSheet.setEducation(null);
        educationSheet.setSkillReferenceID(null);
        educationSheet.setSchoolName(row.getCell(Constants.schoolName).getStringCellValue());
        educationSheet.setSchoolLocation(null);
        educationSheet.setStateAndProvince(null);
        educationSheet.setCountry(null);
        educationSheet.setSchoolType(null);
        educationSheet.setDegree(null);
        educationSheet.setDegreeReceived(null);
        educationSheet.setFieldOfStudy(null);
        educationSheet.setFirstYearAttended(null);
        educationSheet.setLastYearAttended(null);
        educationSheet.setYearDegreeReceived(null);
        educationSheet.setGradeAverage(null);
        educationSheet.setHighestDegreeReceived(null);

        return educationSheet;
    }

    public class Constants {
        public static final int highestDegreeReceived = 4;
        public static final int schoolName = 7;
    }
}
