package assignment.For.AOOP_decorator.pattern.enemy;

/**
 *
 * @author Erik Borsi
 */
public class CharacterEnemyMedium extends Enemy{

    public CharacterEnemyMedium() {
        typeOfCharacter = "The enemy is a medium sized space monster";
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
