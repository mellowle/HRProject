package sheets;

import sheets.model.PerformanceRating;

import java.util.List;

public class PerformanceRatingsSheet {
    public String supervisoryOrganization;
    public boolean includeSubordinateOrganizations;
    public boolean excludeUnionMembers;
    public List<PerformanceRating> performanceRatingList;
}
