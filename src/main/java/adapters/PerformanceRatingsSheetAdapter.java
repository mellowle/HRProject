package adapters;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import sheets.PerformanceRatingsSheet;

public class PerformanceRatingsSheetAdapter {

    public PerformanceRatingsSheet toDomain(Workbook workbook) {
        Sheet sheet = workbook.getSheet("performance ratings");
        return setProperties(sheet);
    }

    private PerformanceRatingsSheet setProperties(Sheet sheet) {
        PerformanceRatingsSheet performanceRatingsSheet = new PerformanceRatingsSheet();

        performanceRatingsSheet.setSupervisoryOrganization(null);
        performanceRatingsSheet.setIncludeSubordinateOrganizations(false);
        performanceRatingsSheet.setExcludeUnionMembers(false);
        performanceRatingsSheet.setPerformanceRatingList(null);

        return performanceRatingsSheet;
    }
}
