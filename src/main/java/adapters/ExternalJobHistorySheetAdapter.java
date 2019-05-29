package adapters;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import sheets.ExternalJobHistorySheet;

public class ExternalJobHistorySheetAdapter {

    public ExternalJobHistorySheet toDomain(Workbook workbook) {
        Sheet sheet = workbook.getSheet("External Job History");
        return setProperties(sheet);
    }

    private ExternalJobHistorySheet setProperties(Sheet sheet) {
        ExternalJobHistorySheet externalJobHistorySheet = new ExternalJobHistorySheet();

        externalJobHistorySheet.setWorker(null);
        externalJobHistorySheet.setEmployeeID(null);
        externalJobHistorySheet.setJobTitle(null);
        externalJobHistorySheet.setCompany(null);
        externalJobHistorySheet.setStartDate(null);
        externalJobHistorySheet.setEndDate(null);
        externalJobHistorySheet.setExtJobHistoryID(null);
        externalJobHistorySheet.setResponsibilitiesAndAchievements(null);

        return externalJobHistorySheet;
    }
}
