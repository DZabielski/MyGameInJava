package locations_places_npc;

import hero.Player;
import upgrades.PlayerRest;

import java.util.Scanner;

public class Tavern {
    Scanner sc = new Scanner(System.in);
    public void tavern(Player player) {

        boolean tavern = true;
        while (tavern) {
            player.printHud();
            System.out.println("John the innkeeper: What can I offer to you, my friend.");
            System.out.println("1. Show me your goods");
            System.out.println("2. Rent a room");
            System.out.println("3. Speak");
            System.out.println("4. Quit");

            int userChoice = sc.nextInt();
            switch (userChoice) {
                case 1:
                    player.printHud();
                    tavernStore(player);
                    player.setHasMerchartDoneSomething(true);
                    break;
                case 2:
                    player.printHud();
                    if (player.getGold() >= 5) {
                        player.setGold(player.getGold() - 5);
                        PlayerRest PR = new PlayerRest();
                        PR.rest(player);
                        player.setHasMerchartDoneSomething(true);
                    } else {
                        System.out.println("Innkeeper: Sorry, but you do not have enough gold");
                    }
                    break;
                case 3:
                    player.printHud();
                    innkeeperConversation();
                    player.setHasMerchartDoneSomething(true);
                    break;
                case 4:
                    if (player.HasMerchartDoneSomething()) {
                        System.out.println("Thank you for coming.");
                    } else {
                        System.out.println("Ehh... People this days...");
                    }
                    tavern = false;
                    break;
                default:
                    System.out.println("Innkeeper do not offer any more actions");
            }
        }


    }
    private void tavernStore(Player player) {
        player.printHud();
        System.out.println("That's all ive got now. Sir");
        System.out.println("1. 15 Gold - Black Bear (Add +10 to dmg for the next adventure");
        System.out.println("2. 20 Gold - Red Sugar with extra sugar on round (Add +20 to the Max HP Points");
        System.out.println("3. 14 Gold - Blue Fox (Add +10 to dexterity... As they say...");
        System.out.println("4. I will pass.");

        boolean innkeeperStore = true;
        while (innkeeperStore) {
            int userChoice = sc.nextInt();
            switch (userChoice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("innkeeper John: Too bad my friend");

                    break;
                default:
                    System.out.println("Innkeeper John: I do not have any other liquor, my friend");
            }
        }

    }
    private void innkeeperConversation(){


    }
}
