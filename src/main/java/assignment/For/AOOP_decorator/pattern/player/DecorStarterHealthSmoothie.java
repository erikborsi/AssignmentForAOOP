package assignment.For.AOOP_decorator.pattern.player;

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
public class DecorStarterHealthSmoothie extends PlayerDecorator {

    Player player;

    public DecorStarterHealthSmoothie(Player player) {
        this.player = player;
    }

    @Override
    public String getTypeOfCharacterOfPlayer() {
        return player.getTypeOfCharacterOfPlayer() + " drank a smoothie,";

    }

    @Override
    public double getHealthPointsOfPlayer() {
        return player.getHealthPointsOfPlayer() + 25;

    }

    @Override
    public double getWeaponDamagePointsOfPlayer() {
        return player.getWeaponDamagePointsOfPlayer() + 15;

    }

    @Override
    public double getArmourPointsOfPlayer() {
        return player.getArmourPointsOfPlayer();

    }

    @Override
    public double getWeightOfPlayerOfPlayer() {
        return player.getWeightOfPlayerOfPlayer() + 2;
    }

}
