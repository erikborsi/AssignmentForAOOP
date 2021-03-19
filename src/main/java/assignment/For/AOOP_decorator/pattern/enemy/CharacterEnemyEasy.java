package assignment.For.AOOP_decorator.pattern.enemy;

/**
 *
 * @author Erik Borsi
 */
public class CharacterEnemyEasy extends Enemy{

    public CharacterEnemyEasy() {
        typeOfCharacter = "The enemy is a small sized space monster";
    }

    @Override
    public double getHealthPointsOfEnemy() {
        return 0;
    }

    @Override
    public double getWeaponDamagePointsOfEnemy() {
        return 0;
    }

    @Override
    public double getArmourPointsOfEnemy() {
        return 0;
    }

    @Override
    public double getWeightOfPlayerOfEnemy() {
        return 0;
    }
    
}
