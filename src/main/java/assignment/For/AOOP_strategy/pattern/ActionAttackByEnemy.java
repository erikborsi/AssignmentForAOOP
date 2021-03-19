package assignment.For.AOOP_strategy.pattern;

/**
 *
 * @author Erik Borsi
 */
public class ActionAttackByEnemy implements BehaviourAttack {

    @Override
    public void attack() {
        System.out.println("The enemy attacked YOU");
    }

}
