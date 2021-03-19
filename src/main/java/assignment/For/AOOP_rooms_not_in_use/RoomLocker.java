package assignment.For.AOOP_rooms_not_in_use;

import assignment.For.AOOP_decorator.pattern.enemy.*;
import assignment.For.AOOP_decorator.pattern.player.*;
import assignment.For.AOOP_main.*;
import assignment.For.AOOP_strategy.pattern.*;

/**
 *
 * @author Erik Borsi
 */
public class RoomLocker implements RoomsOnSpaceStation {

    @Override
    public void storyOfTheRoom() {
        System.out.println("---------------------------");
        System.out.println("     LOCKER ROOM STORY     ");
        System.out.println("---------------------------");
        System.out.println(" ");
    }

}
