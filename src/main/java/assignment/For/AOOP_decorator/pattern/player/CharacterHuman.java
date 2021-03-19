package assignment.For.AOOP_decorator.pattern.player;

/**
 *
 * @author Erik Borsi, CAN BRIBE FROM START AS HUMAN
 */
public class CharacterHuman extends Player {

    public CharacterHuman() {
        typeOfCharacter = "You are a human named:" + " nameInputFromUser,";
    }

    @Override
    public double getHealthPointsOfPlayer() {
        return 100;

    }

    @Override
    public double getWeaponDamagePointsOfPlayer() {
        return 0;

    }

    @Override
    public double getArmourPointsOfPlayer() {
        return 0;

    }

    @Override
    public double getWeightOfPlayerOfPlayer() {
        return 8;
    }

}
