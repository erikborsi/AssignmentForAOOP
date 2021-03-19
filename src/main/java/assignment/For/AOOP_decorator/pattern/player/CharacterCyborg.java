package assignment.For.AOOP_decorator.pattern.player;

/**
 *
 * @author Erik Borsi, CAN BRIBE FROM START AS PART OF HUMAN
 */
public class CharacterCyborg extends Player {

    public CharacterCyborg() {
        typeOfCharacter = "You are a cyborg named:" + " nameInputFromUser,";
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
        return 5;
    }

}
