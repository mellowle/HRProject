package sheets;

import com.sun.tools.javadoc.Start;
import com.sun.xml.internal.bind.v2.model.core.ID;

public class ExternalJobHistorySheet {

    private String worker;
    private String employeeID;
    private String jobTitle;
    private String company;
    private String startDate;
    private String endDate;
    private String extJobHistoryID;
    private String responsibilitiesAndAchievements;

    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getExtJobHistoryID() {
        return extJobHistoryID;
    }

    public void setExtJobHistoryID(String extJobHistoryID) {
        this.extJobHistoryID = extJobHistoryID;
    }

    public String getResponsibilitiesAndAchievements() {
        return responsibilitiesAndAchievements;
    }

    public void setResponsibilitiesAndAchievements(String responsibilitiesAndAchievements) {
        this.responsibilitiesAndAchievements = responsibilitiesAndAchievements;
    }
}
