package assignment.For.AOOP_decorator.pattern.enemy;

import assignment.For.AOOP_strategy.pattern.*;

/**
 *
 * @author Erik Borsi, Pick up weapon type one from the "PLACE IT HAS BEEN FOUND
 * - UNDER CONSTRUCITON" Giving different damage points
 *
 * CHANGED - weapon should be chosen at the beginning of the game and the player
 * will stick with it until the game ends, WEAPON MIGHT BE CHANGABLE
 */
public class DecorWeaponLaserGunForEnemy extends EnemyDecorator {

    Enemy enemy;

    public DecorWeaponLaserGunForEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public String getTypeOfCharacterOfEnemy() {
        return enemy.getTypeOfCharacterOfEnemy() + " with a lasergun,";

    }

    @Override
    public double getHealthPointsOfEnemy() {
        return enemy.getHealthPointsOfEnemy();

    }

    @Override
    public double getWeaponDamagePointsOfEnemy() {
        return enemy.getWeaponDamagePointsOfEnemy() + 50;

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
