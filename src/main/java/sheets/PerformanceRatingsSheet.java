package sheets;

import sheets.model.PerformanceRating;

import java.util.List;

public class PerformanceRatingsSheet {
    public String supervisoryOrganization;
    public boolean includeSubordinateOrganizations;
    public boolean excludeUnionMembers;
    public PerformanceRating performanceRating;

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

    public PerformanceRating getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(PerformanceRating performanceRating) {
        this.performanceRating = performanceRating;
    }
}
