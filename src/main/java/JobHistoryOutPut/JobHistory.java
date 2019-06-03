package JobHistoryOutPut;

public class JobHistory implements Comparable {
    public String year;
    public String title;
    public String company;
    public String location;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "JobHistory{" +
                "year='" + year + '\'' +
                ", title='" + title + '\'' +
                ", company='" + company + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof JobHistory) {
            JobHistory j = (JobHistory) o;
            int thisYear = 0;
            int jYear = 0;
            if (j.getYear().trim().equals("")) {
                jYear = 9999;
            }
            else {
                jYear = Integer.valueOf(j.getYear());
            }
            if (this.getYear().trim().equals("")) {
                thisYear = 9999;
            }
            else {
                thisYear = Integer.valueOf(this.year);
            }
            return thisYear - jYear;
        }
        return 0;
    }
}
