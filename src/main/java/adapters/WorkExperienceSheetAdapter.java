package adapters;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import sheets.WorkExperienceSheet;

public class WorkExperienceSheetAdapter {

    public WorkExperienceSheet toDomain(Workbook workbook) throws Exception {
        Sheet sheet = workbook.getSheet("Work Experience");
        return setProperties(sheet);
    }

    private WorkExperienceSheet setProperties(Sheet sheet) {
        WorkExperienceSheet workExperienceSheet = new WorkExperienceSheet();

        workExperienceSheet.setWorker(null);
        workExperienceSheet.setEmployeeID(null);
        workExperienceSheet.setWorkExperience(null);
        workExperienceSheet.setExperienceLevel(false);
        workExperienceSheet.setWorkExperienceID(null);

        return workExperienceSheet;
    }
}
