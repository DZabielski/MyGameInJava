package locations_places_npc;

import hero.Player;

import java.util.Scanner;

public class NobilityDistrict {

    public  void nobility(Player player) {
        Scanner sc = new Scanner(System.in);

        if (player.isHasInvitation()) {
            System.out.println("Welcome to nobility district");
        } else {
            System.out.println("You don't have permission to enter Sir");
        }
    }

}
