package assignment.For.AOOP_decorator.pattern.player;

/**
 *
 * @author Erik Borsi, CANNOT BRIBE FROM START AS NOT HUMAN, CAN STUDY IT BY
 * READING A BOOK IN THE LIBRARY OF THE SPACESHIP
 */
public class CharacterAndroid extends Player {

    public CharacterAndroid() {
        typeOfCharacter = "You are an android named:" + " nameInputFromUser,";
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
