package assignment.For.AOOP_main;

import assignment.For.AOOP_strategy.pattern.*;
import assignment.For.AOOP_decorator.pattern.enemy.*;
import assignment.For.AOOP_decorator.pattern.player.*;
import java.util.Scanner;

/**
 *
 * @author Erik Borsi
 */
public class Game {

    Player alien;
    Player android;
    Player cyborg;
    Player human;
    Enemy easyEnemy;
    Enemy mediumEnemy;
    Enemy hardEnemy;

    public static void main(String[] args) {
        Game menu = new Game();
        menu.startMenu();
//        menu.chooseCharacter();

    }

    private void printMainMenu() {
        System.out.println("\n---------------------------");
        System.out.println("         Game Menu         ");
        System.out.println("---------------------------");
        System.out.println("Select from options:");
        System.out.println("1. Start the game");
        System.out.println("2. Story/How to play");
        System.out.println("3. Exit");
    }

    private void startMenu() {
        printMainMenu();
        Scanner sc = new Scanner(System.in);
        int startMenuOptions = 0;
        while (true) {
            System.out.print("Enter a number: ");
            try {
                startMenuOptions = sc.nextInt();
            } catch (NumberFormatException e) {

            }
            switch (startMenuOptions) {
                case 1:
                    chooseCharacter();
                    break;
                case 2:
                    runReadMe();
                    break;
                case 3:
                    System.exit(0);
                    System.out.println("Exited the game.");
                    break;
                default:
                    System.out.println("ERROR - WRONG SELECTION");
            }
        }
    }

    private void printCharacterOptions() {
        System.out.println("\n\n---------------------------");
        System.out.println("    Character options:     ");
        System.out.println("---------------------------");
        System.out.println("    Select from below:     ");
        System.out.println("1. Alien");
        System.out.println("2. Android");
        System.out.println("3. Cyborg");
        System.out.println("4. Human");
        System.out.println("5. Main Menu");
    }

    private void createAlienPlayer() {
        Player alien = new CharacterAlien();
        alien = new DecorArmourLight(alien);
        alien = new DecorWeaponLaserGun(alien);
        alien.setBehaviourAttack(new ActionAttack());
        alien.setBehaviourMove(new ActionMove());
        System.out.println("Alien Character Info");
        this.alien = alien;
    }

    private void createAndroidPlayer() {
        Player android = new CharacterAndroid();
        android = new DecorArmourHeavy(android);
        android = new DecorWeaponLaserGun(android);
        android.setBehaviourAttack(new ActionAttack());
        android.setBehaviourMove(new ActionMove());
        System.out.println("Android Character Info");
        this.android = android;
    }

    private void createCyborgPlayer() {
        Player cyborg = new CharacterCyborg();
        cyborg = new DecorArmourHeavy(cyborg);
        cyborg = new DecorWeaponLaserGun(cyborg);
        cyborg.setBehaviourAttack(new ActionAttack());
        cyborg.setBehaviourMove(new ActionMove());
        System.out.println("Cyborg Character Info");
        this.cyborg = cyborg;
    }

    private void createHumanPlayer() {
        Player human = new CharacterHuman();
        human = new DecorArmourLight(human);
        human = new DecorWeaponLightSaber(human);
        human.setBehaviourAttack(new ActionAttack());
        human.setBehaviourMove(new ActionMove());
        human.setBehaviourBribe(new ActionBribe());
        human.setBehaviourDodge(new ActionDodge());
        System.out.println("Human Character Info");
        this.human = human;
    }

    private void chooseCharacter() {
        printCharacterOptions();
        Scanner sc = new Scanner(System.in);
        int chooseCharacterOption = 0;
        while (true) {
            System.out.print("Enter a number: ");
            try {
                chooseCharacterOption = sc.nextInt();
            } catch (NumberFormatException e) {

            }
            switch (chooseCharacterOption) {
                case 1:
                    createAlienPlayer();
                    runGame();
                    break;
                case 2:
                    createAndroidPlayer();
                    runGame();
                    break;
                case 3:
                    createCyborgPlayer();
                    runGame();
                    break;
                case 4:
                    createHumanPlayer();
                    runGame();
                    break;
                case 5:
                    System.out.println("Back to the main menu");
                    startMenu();
                    break;
                default:
                    System.out.println("ERROR - WRONG SELECTION");
            }
        }
    }

    private void runGame() {
        printOptionsForRunGame();
        Scanner sc = new Scanner(System.in);
        int runGameInput = 0;
        while (true) {
            System.out.print("Enter a number: ");
            try {
                runGameInput = sc.nextInt();
            } catch (NumberFormatException e) {

            }
            switch (runGameInput) {
                case 1:
                    mainCorridor();
                    break;
                case 2:
                    storyOfTheSleepingQuarters();
                    break;
                case 3:
                    storyOfTheLockerRoom();
                    break;
                case 4:
                    storyOfTheLibrary();
                    break;
                case 5:
                    storyOfTheEngineRoom();
                    break;
                case 6:
                    storyOfTheDinnerHall();
                    break;
                case 7:
                    System.out.println("Back to the main menu");
                    startMenu();
                    break;
                default:
                    System.out.println("ERROR - WRONG SELECTION");
            }
        }
    }

    private void printOptionsForRunGame() {
        System.out.println("\n\n---------------------------");
        System.out.println("  PLACES ON THE SPACESHIP:  ");
        System.out.println("---------------------------");
        System.out.println("    Select from below:     ");
        System.out.println("1. Main Corridor");
        System.out.println("2. Sleeping Quarters");
        System.out.println("3. Locker Room");
        System.out.println("4. Library");
        System.out.println("5. Engine Room");
        System.out.println("6. Dinner Hall");
        System.out.println("7. Main Menu");
    }

    private void runReadMe() {
        System.out.println("\n\n---------------------------");
        System.out.println("    STORY/HOW TO PLAY:     ");
        System.out.println("---------------------------");
        System.out.println("TEXT GOES HERE FOR PLAYER");
        System.out.println("    Select from below:     ");
        System.out.println("1. Main Menu");
        Scanner sc = new Scanner(System.in);
        int startMenuOptions = 0;
        while (true) {
            System.out.print("Enter a number: ");
            try {
                startMenuOptions = sc.nextInt();
            } catch (NumberFormatException e) {

            }
            switch (startMenuOptions) {
                case 1:
                    startMenu();
                    break;
                default:
                    System.out.println("ERROR - WRONG SELECTION");
            }
        }
    }

    private void createEasyEnemy() {
        Enemy easyEnemy = new CharacterEnemyEasy();
        easyEnemy = new DecorArmourForEasyEnemy(easyEnemy);
        easyEnemy = new DecorStarterHealthForEasyEnemy(easyEnemy);
        easyEnemy = new DecorWeaponLaserGunForEnemy(easyEnemy);
        easyEnemy.setBehaviourAttack(new ActionAttackByEnemy());
        easyEnemy.setBehaviourMove(new ActionMoveByEnemy());
        easyEnemy.setBehaviourBribe(new ActionBribeByEnemy());
        this.easyEnemy = easyEnemy;
    }

    private void createMediumEnemy() {
        Enemy mediumEnemy = new CharacterEnemyMedium();
        mediumEnemy = new DecorArmourForMediumEnemy(mediumEnemy);
        mediumEnemy = new DecorStarterHealthForMediumEnemy(mediumEnemy);
        mediumEnemy = new DecorWeaponLaserGunForEnemy(mediumEnemy);
        mediumEnemy.setBehaviourAttack(new ActionAttackByEnemy());
        mediumEnemy.setBehaviourMove(new ActionMoveByEnemy());
        mediumEnemy.setBehaviourBribe(new ActionBribeByEnemy());
        this.mediumEnemy = mediumEnemy;
    }

    private void createHardEnemy() {
        Enemy hardEnemy = new CharacterEnemyHard();
        hardEnemy = new DecorArmourForHardEnemy(hardEnemy);
        hardEnemy = new DecorStarterHealthForHardEnemy(hardEnemy);
        hardEnemy = new DecorWeaponLightSaberForEnemy(hardEnemy);
        hardEnemy.setBehaviourAttack(new ActionAttackByEnemy());
        hardEnemy.setBehaviourMove(new ActionMoveByEnemy());
        hardEnemy.setBehaviourBribe(new ActionBribeByEnemy());
        this.hardEnemy = hardEnemy;
    }

    private void mainCorridor() {
        System.out.println("\n\n---------------------------");
        System.out.println("       MAIN CORRIDOR       ");
        System.out.println("---------------------------");
        System.out.println("STORY");
        System.out.println("    Select from below:     ");
        System.out.println("1. Sleeping Quarters");
        System.out.println("2. Locker Room");
        System.out.println("3. Library");
        System.out.println("4. Engine Room");
        System.out.println("5. Dinner Hall");
        System.out.println("6. Main Menu");
        Scanner sc = new Scanner(System.in);
        int mainCorridorInput = 0;
        while (true) {
            System.out.print("Enter a number: ");
            try {
                mainCorridorInput = sc.nextInt();
            } catch (NumberFormatException e) {

            }
            switch (mainCorridorInput) {
                case 1:
                    storyOfTheSleepingQuarters();
                    break;
                case 2:
                    storyOfTheLockerRoom();
                    break;
                case 3:
                    storyOfTheLibrary();
                    break;
                case 4:
                    storyOfTheEngineRoom();
                    break;
                case 5:
                    storyOfTheDinnerHall();
                    break;
                case 6:
                    System.out.println("Back to the main menu");
                    startMenu();
                    break;
                default:
                    System.out.println("ERROR - WRONG SELECTION");
            }
        }
    }

    private void storyOfTheSleepingQuarters() {
        System.out.println("\n\n---------------------------");
        System.out.println("     SLEEPING QUARTERS     ");
        System.out.println("---------------------------");
        System.out.println("STORY");
        System.out.println("    Select from below:     ");
        System.out.println("1. ACTION");
        System.out.println("2. ACTION");
        System.out.println("3. ACTION");
        System.out.println("4. ACTION");
        System.out.println("5. ACTION");
        System.out.println("6. Main Corridor");
        createEasyEnemy();
        Scanner sc = new Scanner(System.in);
        int roomInput = 0;
        while (true) {
            System.out.print("Enter a number: ");
            try {
                roomInput = sc.nextInt();
            } catch (NumberFormatException e) {
            }
            switch (roomInput) {
                case 1:
                    System.out.println("ACTION 1");
                    break;
                case 2:
                    System.out.println("ACTION 2");
                    break;
                case 3:
                    System.out.println("ACTION 3");
                    break;
                case 4:
                    System.out.println("ACTION 4");
                    break;
                case 5:
                    System.out.println("ACTION 5");
                    break;
                case 6:
                    System.out.println("Back to the main corridor");
                    mainCorridor();
                    break;
                default:
                    System.out.println("ERROR - WRONG SELECTION");
            }
        }
    }

    private void storyOfTheLockerRoom() {
        System.out.println("\n\n---------------------------");
        System.out.println("        LOCKER ROOM        ");
        System.out.println("---------------------------");
        System.out.println("STORY");
        System.out.println("    Select from below:     ");
        System.out.println("1. ACTION");
        System.out.println("2. ACTION");
        System.out.println("3. ACTION");
        System.out.println("4. ACTION");
        System.out.println("5. ACTION");
        System.out.println("6. Main Corridor");
        Scanner sc = new Scanner(System.in);
        int roomInput = 0;
        while (true) {
            System.out.print("Enter a number: ");
            try {
                roomInput = sc.nextInt();
            } catch (NumberFormatException e) {

            }
            switch (roomInput) {
                case 1:
                    System.out.println("ACTION 1");
                    break;
                case 2:
                    System.out.println("ACTION 2");
                    break;
                case 3:
                    System.out.println("ACTION 3");
                    break;
                case 4:
                    System.out.println("ACTION 4");
                    break;
                case 5:
                    System.out.println("ACTION 5");
                    break;
                case 6:
                    System.out.println("Back to the main corridor");
                    mainCorridor();
                    break;
                default:
                    System.out.println("ERROR - WRONG SELECTION");
            }
        }
    }

    private void storyOfTheLibrary() {
        System.out.println("\n\n---------------------------");
        System.out.println("          LIBRARY          ");
        System.out.println("---------------------------");
        System.out.println("STORY");
        System.out.println("    Select from below:     ");
        System.out.println("1. ACTION");
        System.out.println("2. ACTION");
        System.out.println("3. Main Corridor");
        Scanner sc = new Scanner(System.in);
        int roomInput = 0;
        while (true) {
            System.out.print("Enter a number: ");
            try {
                roomInput = sc.nextInt();
            } catch (NumberFormatException e) {

            }
            switch (roomInput) {
                case 1:
                    System.out.println("ACTION 1");
                    break;
                case 2:
                    System.out.println("ACTION 2");
                    break;
                case 3:
                    System.out.println("Back to the main corridor");
                    mainCorridor();
                    break;
                default:
                    System.out.println("ERROR - WRONG SELECTION");
            }
        }
    }

    private void storyOfTheEngineRoom() {
        System.out.println("\n\n---------------------------");
        System.out.println("        ENGINE ROOM        ");
        System.out.println("---------------------------");
        System.out.println("STORY");
        System.out.println("    Select from below:     ");
        System.out.println("1. ACTION");
        System.out.println("2. ACTION");
        System.out.println("3. ACTION");
        System.out.println("4. ACTION");
        System.out.println("5. ACTION");
        System.out.println("6. Main Corridor");
        createHardEnemy();
        Scanner sc = new Scanner(System.in);
        int roomInput = 0;
        while (true) {
            System.out.print("Enter a number: ");
            try {
                roomInput = sc.nextInt();
            } catch (NumberFormatException e) {
            }
            switch (roomInput) {
                case 1:
                    System.out.println("ACTION 1");
                    break;
                case 2:
                    System.out.println("ACTION 2");
                    break;
                case 3:
                    System.out.println("ACTION 3");
                    break;
                case 4:
                    System.out.println("ACTION 4");
                    break;
                case 5:
                    System.out.println("ACTION 5");
                    break;
                case 6:
                    System.out.println("Back to the main corridor");
                    mainCorridor();
                    break;
                default:
                    System.out.println("ERROR - WRONG SELECTION");
            }
        }
    }

    private void storyOfTheDinnerHall() {
        System.out.println("\n\n---------------------------");
        System.out.println("        DINNER HALL        ");
        System.out.println("---------------------------");
        System.out.println("STORY");
        System.out.println("    Select from below:     ");
        System.out.println("1. ACTION");
        System.out.println("2. ACTION");
        System.out.println("3. ACTION");
        System.out.println("4. ACTION");
        System.out.println("5. ACTION");
        System.out.println("6. Main Corridor");
        createMediumEnemy();
        Scanner sc = new Scanner(System.in);
        int roomInput = 0;
        while (true) {
            System.out.print("Enter a number: ");
            try {
                roomInput = sc.nextInt();
            } catch (NumberFormatException e) {
            }
            switch (roomInput) {
                case 1:
                    System.out.println("ACTION 1");
                    break;
                case 2:
                    System.out.println("ACTION 2");
                    break;
                case 3:
                    System.out.println("ACTION 3");
                    break;
                case 4:
                    System.out.println("ACTION 4");
                    break;
                case 5:
                    System.out.println("ACTION 5");
                    break;
                case 6:
                    System.out.println("Back to the main corridor");
                    mainCorridor();
                    break;
                default:
                    System.out.println("ERROR - WRONG SELECTION");
            }
        }
    }

}
