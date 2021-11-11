package racing;

import static racing.RacingConstant.*;

/**
 * @author han
 */
public class Car {
    private final int step;

    private Car(int step) {
        this.step = step;
    }

    public int getStep() {
        return this.step;
    }

    public static Car create() {
        return new Car(0);
    }

    public Car getInstanceByForward(int random) {
        if (isForward(random)) {
            int newStep = this.step + 1;
            return new Car(newStep);
        }
        return this;
    }

    private boolean isForward(int random) {
        return random >= FORWARD_STANDARD;
    }
}