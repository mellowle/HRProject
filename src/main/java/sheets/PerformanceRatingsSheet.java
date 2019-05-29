package sheets;

import sheets.model.PerformanceRating;

import java.util.List;

public class PerformanceRatingsSheet {
    public String supervisoryOrganization;
    public boolean includeSubordinateOrganizations;
    public boolean excludeUnionMembers;
    public List<PerformanceRating> performanceRatingList;

    public String getSupervisoryOrganization() {
        return supervisoryOrganization;
    }

    public void setSupervisoryOrganization(String supervisoryOrganization) {
        this.supervisoryOrganization = supervisoryOrganization;
    }

    public boolean isIncludeSubordinateOrganizations() {
        return includeSubordinateOrganizations;
    }

    public void setIncludeSubordinateOrganizations(boolean includeSubordinateOrganizations) {
        this.includeSubordinateOrganizations = includeSubordinateOrganizations;
    }

    public boolean isExcludeUnionMembers() {
        return excludeUnionMembers;
    }

    public void setExcludeUnionMembers(boolean excludeUnionMembers) {
        this.excludeUnionMembers = excludeUnionMembers;
    }

    public List<PerformanceRating> getPerformanceRatingList() {
        return performanceRatingList;
    }

    public void setPerformanceRatingList(List<PerformanceRating> performanceRatingList) {
        this.performanceRatingList = performanceRatingList;
    }
}
