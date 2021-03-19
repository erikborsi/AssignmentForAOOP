package assignment.For.AOOP_strategy.pattern;

/**
 *
 * @author Erik Borsi
 */
public class ActionBribeByEnemy implements BehaviourBribe {

    @Override
    public void bribe() {
        System.out.println("The enemy bribed YOU");
        
    }

}
