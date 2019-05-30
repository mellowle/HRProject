package adapters;

import output.Hypothesis;
import output.model.Compensation;
import output.model.DemoGraphics;
import output.model.Movement;
import output.model.Performance;

public class HypothesisAdapter {

    public Hypothesis toDomain() {
        return setProperties();
    }

    private Hypothesis setProperties() {
        Hypothesis hypothesis = new Hypothesis();

        String WWID = null;
        DemoGraphics demoGraphics = new DemoGraphics();
        Compensation compensation = new Compensation();
        Performance performance = new Performance();
        Movement movement = new Movement();

        hypothesis.setWWID(WWID);
        hypothesis.setDemoGraphics(demoGraphics);
        hypothesis.setCompensation(compensation);
        hypothesis.setPerformance(performance);
        hypothesis.setMovement(movement);

        return hypothesis;
    }
}
