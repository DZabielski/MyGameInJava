package locations_places_npc;
import upgrades.WeaponUpgrade;
import upgrades.ArmorUpgrate;
import hero.Player;

import java.util.Scanner;

public class Blacksmith {

    public void smith(Player player) {
        Scanner sc = new Scanner(System.in);


        boolean blacksmith = true;
        while (blacksmith) {
            player.printHud();

            System.out.println("Will the blacksmith: Make it quick, I've got thinks to do.");
            System.out.println("1. Store");
            System.out.println("2. Upgrade weapon");
            System.out.println("3. Upgrate Armor");
            System.out.println("4. Quit");

            int userChoice = sc.nextInt();

            switch (userChoice) {
                case 1:
                    player.printHud();
                    //blacksmithStore();
                    player.setHasMerchartDoneSomething(true);
                    break;
                case 2:
                    player.printHud();
                    WeaponUpgrade WU = new WeaponUpgrade();
                    WU.Weapon(player);
                    player.setHasMerchartDoneSomething(true);
                    break;
                case 3:
                    player.printHud();
                    ArmorUpgrate AU = new ArmorUpgrate();
                    AU.Armor(player);
                    player.setHasMerchartDoneSomething(true);
                    break;
                case 4:
                    if (player.HasMerchartDoneSomething()) {
                        System.out.println("Is that all? Good, leave now.");
                    } else {
                        System.out.println("Are you joking? Coming here with empty hands? Get lost!");
                    }
                    blacksmith = false;
                    player.setHasMerchartDoneSomething(false);
                    break;
                default:
                    System.out.println("Blacksmith do not offer any more actions");
            }
        }

    }

}
