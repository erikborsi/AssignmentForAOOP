package assignment.For.AOOP_decorator.pattern.enemy;

import assignment.For.AOOP_strategy.pattern.*;

/**
 *
 * @author Erik Borsi, Pick up health type one from the fridge from canteen,
 * Giving different points, Damage point plus as the health is on the maximum,
 * NAME OF OBJECT TO PICK: PIZZA Damage point plus as pizza is food and food is
 * healthy
 *
 * CHANGED - Before the game starts the player need to decide what to drink
 * before going on the mission/dispatched. Smoothie is healthy now!!! instead of
 * pizza
 */
public class DecorStarterHealthForHardEnemy extends EnemyDecorator {

    Enemy enemy;

    public DecorStarterHealthForHardEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public String getTypeOfCharacterOfEnemy() {
        return enemy.getTypeOfCharacterOfEnemy();

    }

    @Override
    public double getHealthPointsOfEnemy() {
        return enemy.getHealthPointsOfEnemy() + 100;

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
        return enemy.getWeightOfPlayerOfEnemy() + 10;
    }

}
