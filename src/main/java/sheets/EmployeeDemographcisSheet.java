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
    public String employeePayGrade;
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

    public String getWwwid() {
        return wwwid;
    }

    public void setWwwid(String wwwid) {
        this.wwwid = wwwid;
    }

    public boolean isInternationalAssignee() {
        return isInternationalAssignee;
    }

    public void setInternationalAssignee(boolean internationalAssignee) {
        isInternationalAssignee = internationalAssignee;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployeePayGrade() {
        return employeePayGrade;
    }

    public void setEmployeePayGrade(String employeePayGrade) {
        this.employeePayGrade = employeePayGrade;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getJobProfile() {
        return jobProfile;
    }

    public void setJobProfile(String jobProfile) {
        this.jobProfile = jobProfile;
    }

    public String getJobProfileID() {
        return jobProfileID;
    }

    public void setJobProfileID(String jobProfileID) {
        this.jobProfileID = jobProfileID;
    }

    public String getJobFunction() {
        return jobFunction;
    }

    public void setJobFunction(String jobFunction) {
        this.jobFunction = jobFunction;
    }

    public String getJobSubFunction() {
        return jobSubFunction;
    }

    public void setJobSubFunction(String jobSubFunction) {
        this.jobSubFunction = jobSubFunction;
    }

    public String getTimeType() {
        return timeType;
    }

    public void setTimeType(String timeType) {
        this.timeType = timeType;
    }

    public String getLegalEntityCode() {
        return legalEntityCode;
    }

    public void setLegalEntityCode(String legalEntityCode) {
        this.legalEntityCode = legalEntityCode;
    }

    public String getLegalEntityDescription() {
        return legalEntityDescription;
    }

    public void setLegalEntityDescription(String legalEntityDescription) {
        this.legalEntityDescription = legalEntityDescription;
    }

    public long getMrcCode() {
        return mrcCode;
    }

    public void setMrcCode(long mrcCode) {
        this.mrcCode = mrcCode;
    }

    public String getMrcDescription() {
        return mrcDescription;
    }

    public void setMrcDescription(String mrcDescription) {
        this.mrcDescription = mrcDescription;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public double getTimeInPosition() {
        return timeInPosition;
    }

    public void setTimeInPosition(double timeInPosition) {
        this.timeInPosition = timeInPosition;
    }

    public String getManagerWWID() {
        return managerWWID;
    }

    public void setManagerWWID(String managerWWID) {
        this.managerWWID = managerWWID;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public double getLengthOfServiceInYearsIncludingPartialYearPosition() {
        return lengthOfServiceInYearsIncludingPartialYearPosition;
    }

    public void setLengthOfServiceInYearsIncludingPartialYearPosition(
            double lengthOfServiceInYearsIncludingPartialYearPosition) {
        this.lengthOfServiceInYearsIncludingPartialYearPosition = lengthOfServiceInYearsIncludingPartialYearPosition;
    }

    public double getTimeInPositionCore() {
        return timeInPositionCore;
    }

    public void setTimeInPositionCore(double timeInPositionCore) {
        this.timeInPositionCore = timeInPositionCore;
    }

    public Date getOriginalHireDate() {
        return originalHireDate;
    }

    public void setOriginalHireDate(Date originalHireDate) {
        this.originalHireDate = originalHireDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public List<TargetJob> getTargetJobList() {
        return targetJobList;
    }

    public void setTargetJobList(List<TargetJob> targetJobList) {
        this.targetJobList = targetJobList;
    }

    public String getPotentialFromPG() {
        return potentialFromPG;
    }

    public void setPotentialFromPG(String potentialFromPG) {
        this.potentialFromPG = potentialFromPG;
    }

    public List<ManagerRating> getManagerRatingList() {
        return managerRatingList;
    }

    public void setManagerRatingList(List<ManagerRating> managerRatingList) {
        this.managerRatingList = managerRatingList;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getWorkingLocationAddress() {
        return workingLocationAddress;
    }

    public void setWorkingLocationAddress(String workingLocationAddress) {
        this.workingLocationAddress = workingLocationAddress;
    }

    public int getWorkingLocationPostalCode() {
        return workingLocationPostalCode;
    }

    public void setWorkingLocationPostalCode(int workingLocationPostalCode) {
        this.workingLocationPostalCode = workingLocationPostalCode;
    }

    public boolean isPositionIsJobExempt() {
        return positionIsJobExempt;
    }

    public void setPositionIsJobExempt(boolean positionIsJobExempt) {
        this.positionIsJobExempt = positionIsJobExempt;
    }

    public boolean isPrimaryPositionisJobExempt() {
        return primaryPositionisJobExempt;
    }

    public void setPrimaryPositionisJobExempt(boolean primaryPositionisJobExempt) {
        this.primaryPositionisJobExempt = primaryPositionisJobExempt;
    }
}
