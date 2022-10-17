package locations_places_npc;

import hero.HeroInventory;
import hero.Player;

import java.util.Scanner;

public class PlayerHome {

    public void sweetHome(Player player) {
        Scanner sc = new Scanner(System.in);

        boolean isInHome = true;
        while (isInHome)
            if (player.isHasKeyToHome()) {
                player.printHud();
                System.out.println("Me: Home.. sweet home");
                System.out.println("1.  in bed");
                System.out.println("2. Change equipment");
                System.out.println("3. Go out");
                System.out.println("What are you going to do?: >");
                int userChoice = sc.nextInt();
                switch (userChoice) {
                    case 1:
                        rest();
                        break;
                    case 2:
                        HeroInventory HI = new HeroInventory();
                        HI.inventory(player);
                        break;
                    case 3:
                        System.out.println("Time to go.");
                        isInHome = false;
                        break;
                    default:
                        System.out.println("I'm not here for having fun");
                }
            } else {
                System.out.println("I do not know this way");
            }
    }

    private void rest() {

        System.out.println("you fill rest. Your HP is back to the maximum capacity");
    }
}
