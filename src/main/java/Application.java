import adapters.EducationSheetAdapter;
import adapters.EmployeeDemographcisSheetAdapter;
import adapters.PerformanceRatingsSheetAdapter;
import adapters.TalentMovementSheetAdapter;
import common.FileUtil;
import common.RelatedRows;
import output.Hypothesis;
import sheets.EducationSheet;
import sheets.EmployeeDemographcisSheet;
import sheets.PerformanceRatingsSheet;
import sheets.TalentMovementSheet;

import java.util.List;
import java.util.Set;

public class Application {
    public static void main(String... args) throws Exception {
        Set<String> wwidSet = FileUtil.getWWIDSet();
        List<Hypothesis> hypothesisList = FileUtil.getHypothesisList(wwidSet);
        for (Hypothesis h : hypothesisList) {
            RelatedRows relatedRows = FileUtil.getRelatedRows(h);

            EmployeeDemographcisSheet ed = EmployeeDemographcisSheetAdapter.toDomain(relatedRows.getEmployeeDemographcisRow());
            EducationSheet educationSheet = EducationSheetAdapter.toDomain(relatedRows.getEducationRow());
            PerformanceRatingsSheet performanceSheet = PerformanceRatingsSheetAdapter.toDomain(relatedRows.getPerformanceRatingRow());
            TalentMovementSheet talentMovementSheet = TalentMovementSheetAdapter.toDomain(relatedRows.getTalentMovementRow());

        }
    }
}
