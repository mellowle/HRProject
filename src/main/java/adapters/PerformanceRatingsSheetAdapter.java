package adapters;

import com.sun.tools.internal.jxc.ap.Const;
import com.sun.tools.javac.code.Attribute;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import sheets.PerformanceRatingsSheet;
import sheets.model.PerformanceRating;

public class PerformanceRatingsSheetAdapter {

    public PerformanceRatingsSheet toDomain(Row row) {
        return setProperties(row);
    }

    private PerformanceRatingsSheet setProperties(Row row) {
        PerformanceRatingsSheet performanceRatingsSheet = new PerformanceRatingsSheet();

        performanceRatingsSheet.setSupervisoryOrganization(null);
        performanceRatingsSheet.setIncludeSubordinateOrganizations(false);
        performanceRatingsSheet.setExcludeUnionMembers(false);

        PerformanceRating performanceRating = new PerformanceRating();
        performanceRating.setReviewPeriodStartDate(row.getCell(Constants.reviewPeirodStart).getDateCellValue());
        performanceRating.setReviewPeriodEndDate(row.getCell(Constants.reviewPeirodEnd).getDateCellValue());
        performanceRating.setResultsRating(row.getCell(Constants.resultRating).getStringCellValue());
        performanceRating.setOverallRating(row.getCell(Constants.reviewOverallRating).getStringCellValue());
        performanceRating.setLeadershipRating(row.getCell(Constants.reviewLeadershipRating).getStringCellValue());
        performanceRatingsSheet.setPerformanceRating(performanceRating);

        return performanceRatingsSheet;
    }

    public class Constants {
        public static final int reviewPeirodStart = 6;
        public static final int reviewPeirodEnd = 7;
        public static final int resultRating = 8;
        public static final int reviewLeadershipRating = 9;
        public static final int reviewOverallRating = 10;
    }
}
