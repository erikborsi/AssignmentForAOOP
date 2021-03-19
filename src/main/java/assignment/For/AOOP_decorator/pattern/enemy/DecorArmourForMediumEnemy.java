package assignment.For.AOOP_decorator.pattern.enemy;

import assignment.For.AOOP_strategy.pattern.*;

/**
 *
 * @author Erik Borsi, Pick up armour type one from the locker from locker room,
 * Giving different points, Damage point minus as the armour is heavy so its is
 * harder to move and attack, Armour points to maximum
 *
 * CHANGED - player can put on more armour put getting heavier, if too heavy, no
 * move then die
 */
public class DecorArmourForMediumEnemy extends EnemyDecorator {

    Enemy enemy;

    public DecorArmourForMediumEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public String getTypeOfCharacterOfEnemy() {
        return enemy.getTypeOfCharacterOfEnemy() + " with armour,";

    }

    @Override
    public double getHealthPointsOfEnemy() {
        return enemy.getHealthPointsOfEnemy();

    }

    @Override
    public double getWeaponDamagePointsOfEnemy() {
        return enemy.getWeaponDamagePointsOfEnemy();

    }

    @Override
    public double getArmourPointsOfEnemy() {
        return enemy.getArmourPointsOfEnemy() + 75;

    }

    @Override
    public double getWeightOfPlayerOfEnemy() {
        return enemy.getWeightOfPlayerOfEnemy() + 7.5;
    }

}
