package assignment.For.AOOP_decorator.pattern.player;

/**
 *
 * @author Erik Borsi, Pick up armour type one from the locker from locker room
 * Giving different points, Damage point minus as the armour is heavy so its is
 * harder to move and attack, Armour points to maximum
 *
 * CHANGED - player can put on more armour put getting heavier, if too heavy, no
 * move then die
 */
public class DecorArmourLight extends PlayerDecorator {

    Player player;

    public DecorArmourLight(Player player) {
        this.player = player;
    }

    @Override
    public String getTypeOfCharacterOfPlayer() {
        return player.getTypeOfCharacterOfPlayer() + " with a light armour,";

    }

    @Override
    public double getHealthPointsOfPlayer() {
        return player.getHealthPointsOfPlayer();

    }

    @Override
    public double getWeaponDamagePointsOfPlayer() {
        return player.getWeaponDamagePointsOfPlayer();

    }

    @Override
    public double getArmourPointsOfPlayer() {
        return player.getArmourPointsOfPlayer() + 50;

    }

    @Override
    public double getWeightOfPlayerOfPlayer() {
        return player.getWeightOfPlayerOfPlayer() + 5;
    }

}
