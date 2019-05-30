package output.model;

import java.util.List;

public class Movement {
    public boolean promotions;
    public boolean lateralMovements;
    public boolean functionMovements;
    public boolean sectorMovements;
    public boolean countryMovements;
    public boolean differentExperience;
    public List<externalJobHistory> externalJobHistoryList;

    public boolean isPromotions() {
        return promotions;
    }

    public void setPromotions(boolean promotions) {
        this.promotions = promotions;
    }

    public boolean isLateralMovements() {
        return lateralMovements;
    }

    public void setLateralMovements(boolean lateralMovements) {
        this.lateralMovements = lateralMovements;
    }

    public boolean isFunctionMovements() {
        return functionMovements;
    }

    public void setFunctionMovements(boolean functionMovements) {
        this.functionMovements = functionMovements;
    }

    public boolean isSectorMovements() {
        return sectorMovements;
    }

    public void setSectorMovements(boolean sectorMovements) {
        this.sectorMovements = sectorMovements;
    }

    public boolean isCountryMovements() {
        return countryMovements;
    }

    public void setCountryMovements(boolean countryMovements) {
        this.countryMovements = countryMovements;
    }

    public boolean isDifferentExperience() {
        return differentExperience;
    }

    public void setDifferentExperience(boolean differentExperience) {
        this.differentExperience = differentExperience;
    }

    public List<externalJobHistory> getExternalJobHistoryList() {
        return externalJobHistoryList;
    }

    public void setExternalJobHistoryList(List<externalJobHistory> externalJobHistoryList) {
        this.externalJobHistoryList = externalJobHistoryList;
    }
}
