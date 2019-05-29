package sheets;

public class WorkExperienceSheet {
    private String worker;
    private String employeeID;
    private String workExperience;
    private boolean experienceLevel;
    private String WorkExperienceID;

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

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public boolean isExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(boolean experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public String getWorkExperienceID() {
        return WorkExperienceID;
    }

    public void setWorkExperienceID(String workExperienceID) {
        WorkExperienceID = workExperienceID;
    }
}
