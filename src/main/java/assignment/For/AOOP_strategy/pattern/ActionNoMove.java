package assignment.For.AOOP_strategy.pattern;

/**
 *
 * @author Erik Borsi
 */
public class ActionNoMove implements BehaviourMove {

    @Override
    public void move() {
        System.out.println("Cannot move");
    }

}
