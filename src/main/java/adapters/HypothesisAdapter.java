package adapters;

import output.Hypothesis;
import output.model.*;
import sheets.EducationSheet;
import sheets.EmployeeDemographcisSheet;
import sheets.TalentMovementSheet;

import java.util.List;

public class HypothesisAdapter {

    public Hypothesis toDomain(EmployeeDemographcisSheet ed, EducationSheet e, PerformanceRatingsSheetAdapter pr,
                               TalentMovementSheet tm) {
        return setProperties(ed, e, pr, tm);
    }

    private Hypothesis setProperties(EmployeeDemographcisSheet ed, EducationSheet e, PerformanceRatingsSheetAdapter pr,
                                     TalentMovementSheet tm) {
        Hypothesis hypothesis = new Hypothesis();

        String WWID = null;

        DemoGraphics demoGraphics = new DemoGraphics();
        demoGraphics.setJobLevel(ed.getEmployeePayGrade());
        demoGraphics.setLocation(ed.getLocationCode());
        demoGraphics.setSector(ed.getSector());
        demoGraphics.setTenure(ed.getLengthOfServiceInYearsIncludingPartialYearPosition());
        demoGraphics.setCitizenship(null);
        demoGraphics.setDateOfBirth(null);
        demoGraphics.setJobProfile(ed.getJobProfile());
        demoGraphics.setJobID(ed.getJobProfileID());
        demoGraphics.setPosition(ed.getPosition());
        demoGraphics.setTimeInCurrentPosition(ed.getTimeInPosition());
        demoGraphics.setTitle(null);
        demoGraphics.setHireDateOrigin(ed.getOriginalHireDate());
        demoGraphics.setHireDateMostRecent(ed.getHireDate());
        demoGraphics.setHighestDegreeReceived(e.getHighestDegreeReceived());
        demoGraphics.setEducationSchool(e.getSchoolName());
        demoGraphics.setExtraEductionMBA(e.getHighestDegreeReceived());
        demoGraphics.setMobilityWillingnessShotTerm(null);
        demoGraphics.setMobilityWillingnessLongTerm(null);

        Compensation compensation = new Compensation();
        compensation.setBonusPaid(0);
        compensation.setCompaRatio(0);
        compensation.setNumberOfCompensation(null);

        Performance performance = new Performance();
        performance.setResultsRating(null);
        performance.setLeadershipRating(null);
        performance.setOverallRating(null);
        performance.setAccomplishments(null);
        performance.setStrength(null);
        performance.setDevelopment(null);
        performance.setAwards(null);

        Movement movement = new Movement();
        movement.setPromotions(tm.isPromotion());
        movement.setLateralMovements(tm.isLateral());
        movement.setFunctionMovements(tm.getIsJobFunctionChange());
        movement.setSectorMovements(tm.isSectorChange());
        movement.setCountryMovements(tm.isWorkingCountryChange());
        movement.setDifferentExperience(false);
        movement.setExternalJobHistoryList(null);

        hypothesis.setWWID(WWID);
        hypothesis.setDemoGraphics(demoGraphics);
        hypothesis.setCompensation(compensation);
        hypothesis.setPerformance(performance);
        hypothesis.setMovement(movement);

        return hypothesis;
    }
}
