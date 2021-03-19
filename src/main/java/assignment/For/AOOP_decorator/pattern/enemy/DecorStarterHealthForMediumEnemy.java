package assignment.For.AOOP_decorator.pattern.enemy;

import assignment.For.AOOP_strategy.pattern.*;

/**
 *
 * @author Erik Borsi, Pick up health type one from the fridge from canteen,
 * Giving different points, Damage point plus as the health is on the maximum,
 * NAME OF OBJECT TO PICK: BEER Damage point minus as drinking beer is not
 * healthy (TRAP)
 *
 * CHANGED - Before the game starts the player need to decide what to drink
 * before going on the mission/dispatched. Smoothie is healthy now!!! instead of
 * pizza
 */
public class DecorStarterHealthForMediumEnemy extends EnemyDecorator {

    Enemy enemy;

    public DecorStarterHealthForMediumEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public String getTypeOfCharacterOfEnemy() {
        return enemy.getTypeOfCharacterOfEnemy();

    }

    @Override
    public double getHealthPointsOfEnemy() {
        return enemy.getHealthPointsOfEnemy() + 75;

    }

    @Override
    public double getWeaponDamagePointsOfEnemy() {
        return enemy.getWeaponDamagePointsOfEnemy();

    }

    @Override
    public double getArmourPointsOfEnemy() {
        return enemy.getArmourPointsOfEnemy();

    }

    @Override
    public double getWeightOfPlayerOfEnemy() {
        return enemy.getWeightOfPlayerOfEnemy() + 7.5;
    }

}
