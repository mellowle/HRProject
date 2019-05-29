package sheets;

import sheets.model.ManagerRating;
import sheets.model.TargetJob;

import java.util.Date;
import java.util.List;

public class EmployeeDemographcisSheet {
    public String wwwid;
    public boolean isInternationalAssignee;
    public String firstName;
    public String lastName;
    public int employeePayGrade;

    public String locationCode;
    public String position;
    public String jobProfile;
    public String jobProfileID;
    public String jobFunction;
    public String jobSubFunction;
    public String timeType;
    public String legalEntityCode;
    public String legalEntityDescription;
    public long mrcCode;
    public String mrcDescription;
    public String sector;
    public double timeInPosition;
    public String managerWWID;
    public String managerName;
    public double lengthOfServiceInYearsIncludingPartialYearPosition;
    public double timeInPositionCore;
    public Date originalHireDate;
    public Date hireDate;

    public List<TargetJob> targetJobList;

    public String potentialFromPG;

    public List<ManagerRating> managerRatingList;

    public String employeeType;
    public String workingLocationAddress;
    public int workingLocationPostalCode;
    public boolean positionIsJobExempt;
    public boolean primaryPositionisJobExempt;
}
