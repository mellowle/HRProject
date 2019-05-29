package adapters;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import sheets.EducationSheet;

public class EducationSheetAdapter {

    public EducationSheet toDomain(Workbook workbook) {
        Sheet sheet = workbook.getSheet("Education");
        return setProperties(sheet);
    }

    private EducationSheet setProperties(Sheet sheet) {
        EducationSheet educationSheet = new EducationSheet();

        educationSheet.setWWID(null);
        educationSheet.setWorker(null);
        educationSheet.setWorkerType(null);
        educationSheet.setActiveStatus(null);
        educationSheet.setHighestDegreeReceived(null);
        educationSheet.setEducation(null);
        educationSheet.setSkillReferenceID(null);
        educationSheet.setSchoolName(null);
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
}
