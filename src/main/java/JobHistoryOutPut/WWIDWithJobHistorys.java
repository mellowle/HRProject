package JobHistoryOutPut;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class WWIDWithJobHistorys {
    public String WWID;
    public List<JobHistory> jnjJobHistory;
    public List<JobHistory> externalJobHistory;
    public double averageJnjRoleWorkingYear;
    public double averageExternalRoleWorkingYear;
    public int numberOfJnjRoles;
    public int numberOfExternalRoles;

    public String getWWID() {
        return WWID;
    }

    public void setWWID(String WWID) {
        this.WWID = WWID;
    }

    public List<JobHistory> getJnjJobHistory() {
        return jnjJobHistory;
    }

    public void setJnjJobHistory(List<JobHistory> jnjJobHistory) {
        this.jnjJobHistory = jnjJobHistory;
    }

    public List<JobHistory> getExternalJobHistory() {
        return externalJobHistory;
    }

    public void setExternalJobHistory(List<JobHistory> externalJobHistory) {
        this.externalJobHistory = externalJobHistory;
    }

    public void setNumberOfExternalRoles() {
        this.numberOfExternalRoles = externalJobHistory.size();
    }

    public void setNumberOfJnjRoles() {
        this.numberOfJnjRoles = jnjJobHistory.size();
    }

    public double getAverageJnjRoleWorkingYear() {
        return averageJnjRoleWorkingYear;
    }

    public double getAverageExternalRoleWorkingYear() {
        return averageExternalRoleWorkingYear;
    }

    public int getNumberOfJnjRoles() {
        return this.numberOfJnjRoles;
    }

    public int getNumberOfExternalRoles() {
        return this.numberOfExternalRoles;
    }

    public double calcAverageRoleWorkingYear(List<JobHistory> list, boolean isJnJ) {
        double result = 0;
        if (list.size() > 1) {
            List<Integer> workYear = new ArrayList<>();
            List<Integer> workYearDelta = new ArrayList<>();
            for (JobHistory j : list) {
                if (!j.getYear().trim().equals("")) {
                    workYear.add(Integer.valueOf(j.getYear()));
                }
                else {
                    workYear.add(2019);
                }
            }
            for (int i = 0; i < workYear.size() - 1; i++) {
                int delta = workYear.get(i + 1) - workYear.get(i);
                workYearDelta.add(delta);
            }
            System.out.println(workYear);
            System.out.println(workYearDelta);
            int sum = 0;
            for (int e : workYearDelta) {
                sum = sum + e;
            }
            System.out.println(sum);
            System.out.println(workYearDelta.size());
            DecimalFormat df = new DecimalFormat("0.00");
            result = Double.valueOf(df.format((double) sum / workYearDelta.size()));
        }
        System.out.println(result);
        if (isJnJ) {
            this.averageJnjRoleWorkingYear = result;
        }
        else {
            this.averageExternalRoleWorkingYear = result;
        }
        return result;
    }

    @Override
    public String toString() {
        return "WWIDWithJobHistorys{" +
                "WWID='" + WWID + '\'' +
                ", jnjJobHistory=" + jnjJobHistory +
                ", externalJobHistory=" + externalJobHistory +
                ", averageJnjRoleWorkingYear=" + averageJnjRoleWorkingYear +
                ", averageExternalRoleWorkingYear=" + averageExternalRoleWorkingYear +
                ", numberOfJnjRoles=" + numberOfJnjRoles +
                ", numberOfExternalRoles=" + numberOfExternalRoles +
                '}';
    }
}
