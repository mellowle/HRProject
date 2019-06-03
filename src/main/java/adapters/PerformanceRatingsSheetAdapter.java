package adapters;

import org.apache.poi.ss.usermodel.Row;
import sheets.PerformanceRatingsSheet;
import sheets.model.PerformanceRating;

public class PerformanceRatingsSheetAdapter {

    public static PerformanceRatingsSheet toDomain(Row row) {
        if (row != null) {
            return setProperties(row);
        }
        return null;
    }

    private static PerformanceRatingsSheet setProperties(Row row) {
        System.err.println(row.getCell(2).getStringCellValue());
        PerformanceRatingsSheet performanceRatingsSheet = new PerformanceRatingsSheet();

        performanceRatingsSheet.setSupervisoryOrganization(null);
        performanceRatingsSheet.setIncludeSubordinateOrganizations(false);
        performanceRatingsSheet.setExcludeUnionMembers(false);

        PerformanceRating performanceRating = new PerformanceRating();
        System.err.println(row.getCell(Constants.reviewPeirodStart).getDateCellValue());

        performanceRating.setReviewPeriodStartDate(row.getCell(Constants.reviewPeirodStart).getDateCellValue());
        System.err.println(row.getCell(Constants.resultRating));

        performanceRating.setResultsRating(row.getCell(Constants.resultRating).getStringCellValue());
        System.err.println(row.getCell(Constants.reviewPeirodEnd).getDateCellValue());

        performanceRating.setReviewPeriodEndDate(row.getCell(Constants.reviewPeirodEnd).getDateCellValue());
        System.err.println(row.getCell(Constants.reviewOverallRating));

        performanceRating.setOverallRating(row.getCell(Constants.reviewOverallRating).getStringCellValue());
        System.err.println(row.getCell(Constants.reviewLeadershipRating).getStringCellValue());
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
