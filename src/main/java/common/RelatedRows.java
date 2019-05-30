package common;

import org.apache.poi.ss.usermodel.Row;

public class RelatedRows {
    public Row EmployeeDemographcisRow;
    public Row educationRow;
    public Row performanceRatingRow;
    public Row talentMovementRow;

    public Row getEmployeeDemographcisRow() {
        return EmployeeDemographcisRow;
    }

    public void setEmployeeDemographcisRow(Row employeeDemographcisRow) {
        EmployeeDemographcisRow = employeeDemographcisRow;
    }

    public Row getEducationRow() {
        return educationRow;
    }

    public void setEducationRow(Row educationRow) {
        this.educationRow = educationRow;
    }

    public Row getPerformanceRatingRow() {
        return performanceRatingRow;
    }

    public void setPerformanceRatingRow(Row performanceRatingRow) {
        this.performanceRatingRow = performanceRatingRow;
    }

    public Row getTalentMovementRow() {
        return talentMovementRow;
    }

    public void setTalentMovementRow(Row talentMovementRow) {
        this.talentMovementRow = talentMovementRow;
    }
}
