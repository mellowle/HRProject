package output;

import output.model.Compensation;
import output.model.DemoGraphics;
import output.model.Movement;
import output.model.Performance;

public class Hypothesis {
    public String WWID;
    public DemoGraphics demoGraphics;
    public Compensation compensation;
    public Performance performance;
    public Movement movement;

    public String getWWID() {
        return WWID;
    }

    public void setWWID(String WWID) {
        this.WWID = WWID;
    }

    public DemoGraphics getDemoGraphics() {
        return demoGraphics;
    }

    public void setDemoGraphics(DemoGraphics demoGraphics) {
        this.demoGraphics = demoGraphics;
    }

    public Compensation getCompensation() {
        return compensation;
    }

    public void setCompensation(Compensation compensation) {
        this.compensation = compensation;
    }

    public Performance getPerformance() {
        return performance;
    }

    public void setPerformance(Performance performance) {
        this.performance = performance;
    }

    public Movement getMovement() {
        return movement;
    }

    public void setMovement(Movement movement) {
        this.movement = movement;
    }
}
