package adapters;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import sheets.TalentMovementSheet;

public class TalentMovementSheetAdapter {

    public TalentMovementSheet toDomain(Workbook workbook) {
        Sheet sheet = workbook.getSheet("Talent Movement");
        return setProperties(sheet);
    }

    private TalentMovementSheet setProperties(Sheet sheet) {
        TalentMovementSheet talentMovementSheet = new TalentMovementSheet();

        talentMovementSheet.setWWID(null);
        talentMovementSheet.setLegalName(null);
        talentMovementSheet.setHRBP(null);
        talentMovementSheet.setEmployeePayGrade(0);
        talentMovementSheet.setDegrees(null);
        talentMovementSheet.setHighestDegree(null);
        talentMovementSheet.setLocation(null);
        talentMovementSheet.setPositionName(null);
        talentMovementSheet.setJobProfileID(null);
        talentMovementSheet.setJobProfileName(null);
        talentMovementSheet.setSector(null);
        talentMovementSheet.setRegion(null);
        talentMovementSheet.setJobFunction(null);
        talentMovementSheet.setJobSubFunction(null);
        talentMovementSheet.setHomeAddressCountry(null);
        talentMovementSheet.setWorkingCountry(null);
        talentMovementSheet.setInternationalAssignee(false);
        talentMovementSheet.setMRC(null);
        talentMovementSheet.setTimeInPosition(null);
        talentMovementSheet.setLengthOfService(0);
        talentMovementSheet.setLengthOfServiceNumeric(0);
        talentMovementSheet.setOriginalHireDate(null);
        talentMovementSheet.setLatestHireDate(null);
        talentMovementSheet.setNewHire(false);
        talentMovementSheet.setRehire(false);
        talentMovementSheet.setEmployeePayGradeChange(false);
        talentMovementSheet.setEmployeePayGradeAsOfStartDate(null);
        talentMovementSheet.setEmployeePayGradeAsOfEndDate(null);
        talentMovementSheet.setJobProfileGradeChange(false);
        talentMovementSheet.setJobProfileGradeAsOfStartDate(null);
        talentMovementSheet.setJobProfileGradeAsOfEndDate(null);
        talentMovementSheet.setPromotion(false);
        talentMovementSheet.setDemotion(false);
        talentMovementSheet.setLateral(false);
        talentMovementSheet.setJobProfileIDAsOfStartDate(null);
        talentMovementSheet.setJobProfileIDAsOfEndDate(null);
        talentMovementSheet.setExternalHire(false);
        talentMovementSheet.setInternalMovement(false);
        talentMovementSheet.setPositionNameChange(false);
        talentMovementSheet.setPositionNameAsOfStartDate(null);
        talentMovementSheet.setPositionNameAsOfEndDate(null);
        talentMovementSheet.setPositionIDChange(false);
        talentMovementSheet.setPositionIDAsOfStartDate(null);
        talentMovementSheet.setPositionIDAsOfEndDate(null);
        talentMovementSheet.setEmployeePayGradeTypeAsOfStartDate(null);
        talentMovementSheet.setEmployeePayGradeTypeAsOfEndDate(null);
        talentMovementSheet.setTerminationDate(null);
        talentMovementSheet.setTerminationReason(null);
        talentMovementSheet.setTerminationCategory(null);
        talentMovementSheet.setWorkerActive(false);
        talentMovementSheet.setActiveStatus(false);
        talentMovementSheet.setOnLeave(false);
        talentMovementSheet.setRegionChange(false);
        talentMovementSheet.setRegionAsOfStartDate(null);
        talentMovementSheet.setRegionAsOfEndDate(null);
        talentMovementSheet.setWorkingCountryChange(false);
        talentMovementSheet.setWorkingCountryAsOfStartDate(null);
        talentMovementSheet.setWorkingCountryAsOfEndDate(null);
        talentMovementSheet.setIsJobFunctionChange(false);
        talentMovementSheet.setJobFunctionAsOfStartDate(null);
        talentMovementSheet.setJobFunctionAsOfEndDate(null);
        talentMovementSheet.setSectorChange(false);
        talentMovementSheet.setSectorAsOfStartDate(null);
        talentMovementSheet.setSectorAsOfEndDate(null);
        talentMovementSheet.setSupervisoryOrgHierarchyChange(false);
        talentMovementSheet.setSupervisoryOrgHierarchyAsOfStartDate(null);
        talentMovementSheet.setSupervisoryOrgHierarchyAsOfEndDate(null);
        talentMovementSheet.setManagerChange(false);
        talentMovementSheet.setManagerAsOfStartDate(null);
        talentMovementSheet.setManagerAsOfEndDate(null);
        talentMovementSheet.setMostRecentYearManagerRating(null);
        talentMovementSheet.setMostRecentYear(null);
        talentMovementSheet.setMostRecentYearPriorManagerRating(null);
        talentMovementSheet.setMostRecentYearPrior(null);
        talentMovementSheet.setInternationalAssignmentChange(false);
        talentMovementSheet.setOnIAAsOfStartDate(false);
        talentMovementSheet.setOnIAAsOfEndDate(false);
        talentMovementSheet.setIaStartDate(null);
        talentMovementSheet.setIsExpectedEndDate(null);
        talentMovementSheet.setIaActualEndDate(null);
        talentMovementSheet.setTargetJob1CompGrade(null);
        talentMovementSheet.setTargetJob1Title(null);
        talentMovementSheet.setTargetJob1Readiness(null);
        talentMovementSheet.setTargetJob2CompGrade(null);
        talentMovementSheet.setTargetJob2Title(null);
        talentMovementSheet.setTargetJob2Readiness(null);
        talentMovementSheet.setTargetJob3CompGrade(null);
        talentMovementSheet.setTargetJob3Title(null);
        talentMovementSheet.setTargetJob3Readiness(null);
        talentMovementSheet.setLocationID(null);
        talentMovementSheet.setSupervisoryOrganizationHierarchy(null);
        talentMovementSheet.setWorkingCountryLocationID(null);
        talentMovementSheet.setMRCChange(false);
        talentMovementSheet.setMrcAsOfStartDate(null);
        talentMovementSheet.setMrcAsOfEndDate(null);

        return talentMovementSheet;
    }

}
