package assignment.For.AOOP_decorator.pattern.player;

/**
 *
 * @author Erik Borsi, Pick up weapon type one from the "PLACE IT HAS BEEN FOUND
 * - UNDER CONSTRUCITON" Giving different damage points
 *
 * CHANGED - weapon should be chosen at the beginning of the game and the player
 * will stick with it until the game ends, WEAPON MIGHT BE CHANGABLE
 */
public class DecorWeaponLaserGun extends PlayerDecorator {

    Player player;

    public DecorWeaponLaserGun(Player player) {
        this.player = player;
    }

    @Override
    public String getTypeOfCharacterOfPlayer() {
        return player.getTypeOfCharacterOfPlayer() + " with a lasergun,";

    }

    @Override
    public double getHealthPointsOfPlayer() {
        return player.getHealthPointsOfPlayer();

    }

    @Override
    public double getWeaponDamagePointsOfPlayer() {
        return player.getWeaponDamagePointsOfPlayer() + 50;

    }

    @Override
    public double getArmourPointsOfPlayer() {
        return player.getArmourPointsOfPlayer();

    }

    @Override
    public double getWeightOfPlayerOfPlayer() {
        return player.getWeightOfPlayerOfPlayer() + 10;
    }
}
