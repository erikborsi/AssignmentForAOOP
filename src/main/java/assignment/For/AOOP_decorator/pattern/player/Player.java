package assignment.For.AOOP_decorator.pattern.player;

import assignment.For.AOOP_strategy.pattern.*;



/**
 *
 * @author Erik Borsi
 *
 *
 * ENERGY OF THE PLAYER, TAKE AND STORE DIFFERENT ARMOUR AND WEAPON AND PIZZA
 * AND BEER STORE THE STUFF IN A BAG ENERGY POINTS - EAT THE PIZZA FROM THE BAG
 * PLAYER CAN DIE IF HEALTH OR ENERGY IS LOW HUD ON THE SCREEN TO SEE THE PLAYER
 * STATS
 *
 * Take stuff from the fridge, food and drink, gives health back, ??? player can
 * die ??? if health is too low, or weight is too much, so collecting stuff will
 * kill the player !!!player stats displayed!!!
 *
 */
public abstract class Player {

    BehaviourMove behaviourMove;
    BehaviourAttack behaviourAttack;
    BehaviourBribe behaviourBribe;
    BehaviourDodge behaviourDodge;

    String typeOfCharacter = "Unknown";

    
    public Player() {

    }

    public void setBehaviourMove(BehaviourMove bM) {
        this.behaviourMove = bM;
    }

    public void setBehaviourAttack(BehaviourAttack bA) {
        this.behaviourAttack = bA;
    }

    public void setBehaviourBribe(BehaviourBribe bB) {
        this.behaviourBribe = bB;
    }

    public void setBehaviourDodge(BehaviourDodge bD) {
        this.behaviourDodge = bD;
    }

    public void performMove() {
        behaviourMove.move();
    }

    public void performAttack() {
        behaviourAttack.attack();
    }

    public void performBribe() {
        behaviourBribe.bribe();
    }

    public void performDodge() {
        behaviourDodge.dodge();
    }

    public String getTypeOfCharacterOfPlayer() {
        return typeOfCharacter;
    }

    public abstract double getHealthPointsOfPlayer();

    public abstract double getWeaponDamagePointsOfPlayer();

    public abstract double getArmourPointsOfPlayer();

    public abstract double getWeightOfPlayerOfPlayer();
    
    

}
