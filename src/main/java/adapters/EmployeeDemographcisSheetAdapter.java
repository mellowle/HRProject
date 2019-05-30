package adapters;

import com.sun.tools.internal.jxc.ap.Const;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import sheets.EmployeeDemographcisSheet;

public class EmployeeDemographcisSheetAdapter {

    public EmployeeDemographcisSheet toDomain(Row row) {

        return setProperties(row);
    }

    private EmployeeDemographcisSheet setProperties(Row row) {
        EmployeeDemographcisSheet employeeDemographcisSheet = new EmployeeDemographcisSheet();

        employeeDemographcisSheet.setWwwid(null);
        employeeDemographcisSheet.setInternationalAssignee(false);
        employeeDemographcisSheet.setFirstName(null);
        employeeDemographcisSheet.setLastName(null);
        employeeDemographcisSheet.setEmployeePayGrade(row.getCell(Constants.payGrade).getStringCellValue());
        employeeDemographcisSheet.setLocationCode(row.getCell(Constants.locationCode).getStringCellValue());
        employeeDemographcisSheet.setPosition(row.getCell(Constants.position).getStringCellValue());
        employeeDemographcisSheet.setJobProfile(row.getCell(Constants.jobProfile).getStringCellValue());
        employeeDemographcisSheet.setJobProfileID(row.getCell(Constants.jobProfileID).getStringCellValue());
        employeeDemographcisSheet.setJobFunction(null);
        employeeDemographcisSheet.setJobSubFunction(null);
        employeeDemographcisSheet.setTimeType(null);
        employeeDemographcisSheet.setLegalEntityCode(null);
        employeeDemographcisSheet.setLegalEntityDescription(null);
        employeeDemographcisSheet.setMrcCode(0);
        employeeDemographcisSheet.setMrcDescription(null);
        employeeDemographcisSheet.setSector(row.getCell(Constants.sector).getStringCellValue());
        employeeDemographcisSheet.setTimeInPosition(0);
        employeeDemographcisSheet.setManagerWWID(null);
        employeeDemographcisSheet.setManagerName(null);
        employeeDemographcisSheet.setLengthOfServiceInYearsIncludingPartialYearPosition(row.getCell(Constants.sector).getNumericCellValue());
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

    public class Constants {
        public static final int payGrade = 5;
        public static final int locationCode = 7;
        public static final int position = 12;
        public static final int jobProfile = 14;
        public static final int jobProfileID = 15;
        public static final int sector = 32;
    }
}
