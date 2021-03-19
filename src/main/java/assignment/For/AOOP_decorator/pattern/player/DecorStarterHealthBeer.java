package assignment.For.AOOP_decorator.pattern.player;

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
public class DecorStarterHealthBeer extends PlayerDecorator {

    Player player;

    public DecorStarterHealthBeer(Player player) {
        this.player = player;
    }

    @Override
    public String getTypeOfCharacterOfPlayer() {
        return player.getTypeOfCharacterOfPlayer() + " drank a beer,";

    }

    @Override
    public double getHealthPointsOfPlayer() {
        return player.getHealthPointsOfPlayer() + 10;

    }

    @Override
    public double getWeaponDamagePointsOfPlayer() {
        return player.getWeaponDamagePointsOfPlayer() - 5;

    }

    @Override
    public double getArmourPointsOfPlayer() {
        return player.getArmourPointsOfPlayer();

    }

    @Override
    public double getWeightOfPlayerOfPlayer() {
        return player.getWeightOfPlayerOfPlayer() + 5;
    }

}
