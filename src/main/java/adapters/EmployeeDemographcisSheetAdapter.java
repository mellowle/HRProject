package adapters;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import sheets.EmployeeDemographcisSheet;

public class EmployeeDemographcisSheetAdapter {

    public EmployeeDemographcisSheet toDomain(Workbook workbook) {
        Sheet sheet = workbook.getSheet("Employee Demographics");
        return setProperties(sheet);
    }

    private EmployeeDemographcisSheet setProperties(Sheet sheet) {
        EmployeeDemographcisSheet employeeDemographcisSheet = new EmployeeDemographcisSheet();

        employeeDemographcisSheet.setWwwid(null);
        employeeDemographcisSheet.setInternationalAssignee(false);
        employeeDemographcisSheet.setFirstName(null);
        employeeDemographcisSheet.setLastName(null);
        employeeDemographcisSheet.setEmployeePayGrade(0);
        employeeDemographcisSheet.setLocationCode(null);
        employeeDemographcisSheet.setPosition(null);
        employeeDemographcisSheet.setJobProfile(null);
        employeeDemographcisSheet.setJobProfileID(null);
        employeeDemographcisSheet.setJobFunction(null);
        employeeDemographcisSheet.setJobSubFunction(null);
        employeeDemographcisSheet.setTimeType(null);
        employeeDemographcisSheet.setLegalEntityCode(null);
        employeeDemographcisSheet.setLegalEntityDescription(null);
        employeeDemographcisSheet.setMrcCode(0);
        employeeDemographcisSheet.setMrcDescription(null);
        employeeDemographcisSheet.setSector(null);
        employeeDemographcisSheet.setTimeInPosition(0);
        employeeDemographcisSheet.setManagerWWID(null);
        employeeDemographcisSheet.setManagerName(null);
        employeeDemographcisSheet.setLengthOfServiceInYearsIncludingPartialYearPosition(0);
        employeeDemographcisSheet.setTimeInPositionCore(0);
        employeeDemographcisSheet.setOriginalHireDate(null);
        employeeDemographcisSheet.setHireDate(null);
        employeeDemographcisSheet.setTargetJobList(null);
        employeeDemographcisSheet.setPotentialFromPG(null);
        employeeDemographcisSheet.setManagerRatingList(null);
        employeeDemographcisSheet.setEmployeeType(null);
        employeeDemographcisSheet.setWorkingLocationAddress(null);
        employeeDemographcisSheet.setWorkingLocationPostalCode(0);
        employeeDemographcisSheet.setPositionIsJobExempt(false);
        employeeDemographcisSheet.setPrimaryPositionisJobExempt(false);

        return employeeDemographcisSheet;
    }
}
