package output.model;

import java.util.List;

public class Performance {
    public List<Rating> resultsRating;
    public List<Rating> leadershipRating;
    public List<Rating> overallRating;
    public String accomplishments;
    public String strength;
    public String development;
    public String awards;

    public List<Rating> getResultsRating() {
        return resultsRating;
    }

    public void setResultsRating(List<Rating> resultsRating) {
        this.resultsRating = resultsRating;
    }

    public List<Rating> getLeadershipRating() {
        return leadershipRating;
    }

    public void setLeadershipRating(List<Rating> leadershipRating) {
        this.leadershipRating = leadershipRating;
    }

    public List<Rating> getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(List<Rating> overallRating) {
        this.overallRating = overallRating;
    }

    public String getAccomplishments() {
        return accomplishments;
    }

    public void setAccomplishments(String accomplishments) {
        this.accomplishments = accomplishments;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getDevelopment() {
        return development;
    }

    public void setDevelopment(String development) {
        this.development = development;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }
}
