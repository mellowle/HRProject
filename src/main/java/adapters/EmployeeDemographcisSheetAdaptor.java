package adapters;

import common.FileUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import sheets.EducationSheet;
import sheets.EmployeeDemographcisSheet;
import sheets.model.ManagerRating;
import sheets.model.TargetJob;
import statics.Constants;

import java.util.Date;
import java.util.List;

public class EmployeeDemographcisSheetAdaptor {
    public EmployeeDemographcisSheet getEmployeeDemoSheet() throws Exception{
        Workbook workbook = FileUtil.getWorkBook(Constants.INPUT_FILE_PATH);
        Sheet educationSheet = workbook.getSheet("Employee Demographics");

        EmployeeDemographcisSheet returnedEmployeeDemoSheet = getEmployeeDemoSheetProperties(educationSheet);

        return returnedEmployeeDemoSheet;
    }

    private EmployeeDemographcisSheet getEmployeeDemoSheetProperties(Sheet sheet) {
        EmployeeDemographcisSheet employeeDemographcisSheet = new EmployeeDemographcisSheet();

        employeeDemographcisSheet.setWwwid(null);
        employeeDemographcisSheet.setInternationalAssignee(false);
        employeeDemographcisSheet.setFirstName(null);
        employeeDemographcisSheet.setLastName(null);
        employeeDemographcisSheet.setEmployeePayGrade(0);
        employeeDemographcisSheet.setLocationCode(null);
        employeeDemographcisSheet.setPosition(null);
        employeeDemographcisSheet.setJobProfile(null);
        employeeDemographcisSheet.setJobProfile(null);
        employeeDemographcisSheet.setJobFunction(null);
        employeeDemographcisSheet.setJobSubFunction(null);
        employeeDemographcisSheet.setTimeType(null);
        employeeDemographcisSheet.setLegalEntityCode(null);
        employeeDemographcisSheet.setLegalEntityDescription(null);
        employeeDemographcisSheet.setSector(null);
        employeeDemographcisSheet.setTimeInPosition(0);
        employeeDemographcisSheet.setLengthOfServiceInYearsIncludingPartialYearPosition(0);
        employeeDemographcisSheet.setTimeInPosition(0);
        employeeDemographcisSheet.setOriginalHireDate(null);
        employeeDemographcisSheet.setHireDate(null);
        employeeDemographcisSheet.setTargetJobList(null);
        employeeDemographcisSheet.setPotentialFromPG(null);
        employeeDemographcisSheet.setEmployeeType(null);
        employeeDemographcisSheet.setWorkingLocationAddress(null);
        employeeDemographcisSheet.setWorkingLocationPostalCode(0);
        employeeDemographcisSheet.setPositionIsJobExempt(false);
        employeeDemographcisSheet.setPrimaryPositionisJobExempt(false);


        return employeeDemographcisSheet;
    }
}
