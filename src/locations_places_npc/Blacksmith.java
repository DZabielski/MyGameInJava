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
            System.out.println("3. Upgrade Armor");
            System.out.println("4. Quit");

            int userChoice = sc.nextInt();

            switch (userChoice) {
                case 1:
                    player.printHud();
                    blacksmithStore();
                    player.setHasMerchartDoneSomething(true);
                    break;
                case 2:
                    player.printHud();
                    System.out.println("upgrading weapons are not cheep mate. Have enough gold? (" + player.getWeaponUpgradeCost() + ")");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    boolean upgradeWeapon = true;
                    while (upgradeWeapon) {
                        userChoice = sc.nextInt();
                        sc.nextLine();
                        switch (userChoice) {
                            case 1:
                                WeaponUpgrade WU = new WeaponUpgrade();
                                WU.Weapon(player);
                                player.setHasMerchartDoneSomething(true);
                                upgradeWeapon = false;
                                break;
                            case 2:
                                System.out.println("SO STOP WAISTING MY TIME!");
                                upgradeWeapon = false;
                                break;
                            default:
                                System.out.println("What? YES or NO?");
                                break;
                        }
                    }
                    break;
                case 3:
                    player.printHud();
                    System.out.println("upgrading armor are not cheep mate. Have enough gold? (" + player.getArmorUpgradeCost() + ")");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    boolean armorWeapon = true;
                    while (armorWeapon) {
                        userChoice = sc.nextInt();
                        sc.nextLine();
                        switch (userChoice) {
                            case 1:
                                ArmorUpgrate AU = new ArmorUpgrate();
                                AU.Armor(player);
                                player.setHasMerchartDoneSomething(true);
                                armorWeapon = false;
                                break;
                            case 2:
                                System.out.println("SO STOP WAISTING MY TIME!");
                                armorWeapon = false;
                                break;
                            default:
                                System.out.println("What? YES or NO?");
                                break;
                        }
                    }

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

    private void blacksmithStore() {
        System.out.println("B store");

    }

}
