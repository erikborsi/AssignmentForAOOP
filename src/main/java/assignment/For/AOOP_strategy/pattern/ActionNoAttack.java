package assignment.For.AOOP_strategy.pattern;

/**
 *
 * @author Erik Borsi
 */
public class ActionNoAttack implements BehaviourAttack {


    @Override
    public void attack() {
        System.out.println("Cannot attack");
    }
    
}
