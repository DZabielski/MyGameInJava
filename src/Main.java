import hero.HeroStats;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean hasMerchartDoneSomething = false, tavern = false, mageTower = false;
        boolean isInTown = true;

        while (isInTown) {
            printHud();
            printDownTownLocation();

            int userChoise = sc.nextInt();
            switch (userChoise) {
                case 1:
                    System.out.println("go out");
                    break;
                case 2:
                    tavern = true;
                    while (tavern) {
                        printHud();
                        System.out.println("John the innkeeper: What can I offer to you, my friend.");
                        System.out.println("1. Show me your goods");
                        System.out.println("2. Rent a room");
                        System.out.println("3. Speak");
                        System.out.println("4. Quit");

                        userChoise = sc.nextInt();
                        switch (userChoise) {
                            case 1:
                                printHud();
                                tavernStore();
                                hasMerchartDoneSomething = true;
                                break;
                            case 2:
                                printHud();
                                rentARoom();
                                hasMerchartDoneSomething = true;
                                break;
                            case 3:
                                printHud();
                                innkeeperConversation();
                                hasMerchartDoneSomething = true;
                                break;
                            case 4:
                                if (hasMerchartDoneSomething) {
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
                    break;
                case 3:
                    boolean blacksmith = true;
                    while (blacksmith) {
                        printHud();
                        System.out.println("Davion the blacksmith: Make it quick, I've got thinks to do.");
                        System.out.println("1. Store");
                        System.out.println("2. Upgrade weapon");
                        System.out.println("3. Upgrate Armor");
                        System.out.println("4. Quit");

                        userChoise = sc.nextInt();
                        switch (userChoise) {
                            case 1:
                                printHud();
                                blacksmithStore();
                                hasMerchartDoneSomething = true;
                                break;
                            case 2:
                                printHud();
                                upgrateWeapon();
                                hasMerchartDoneSomething = true;
                                break;
                            case 3:
                                printHud();
                                upgrateArmor();
                                hasMerchartDoneSomething = true;
                                break;
                            case 4:
                                if (hasMerchartDoneSomething) {
                                    System.out.println("Is that all? Good, leave now.");
                                } else {
                                    System.out.println("Are you joking? Coming here with empty hands? Get lost!");
                                }
                                blacksmith = false;
                                hasMerchartDoneSomething = false;
                                break;
                            default:
                                System.out.println("Blacksmith do not offer any more actions");
                        }
                    }


                    break;
                case 4:
                    if (HeroStats.hasKeyToHome) {
                        System.out.println("Welcome to nobility district");
                    } else {
                        System.out.println("You don't have permission to enter Sir");
                    }
                    break;
                case 5:
                    System.out.println("slums");
                    break;
                case 6:
                    if (HeroStats.hasKeyToHome) {
                        System.out.println("Home");
                    } else {
                        System.out.println("I do not know this way");
                    }
                    break;
                case 7:
                    if (HeroStats.hasAMap) {
                        mageTower = true;
                        while (mageTower) {
                            printHud();
                            System.out.println("Kalazar the sky watcher: Ooo! I Knew you come. here.. here, have a sit.");
                            System.out.println("1. I want to see more (learn new spells");
                            System.out.println("2. Do you have some magic stuff for sell?");
                            System.out.println("3. Speak");
                            System.out.println("4. Quit");

                            userChoise = sc.nextInt();
                            switch (userChoise) {
                                case 1:
                                    printHud();
                                    mageTowerSpellsStore();
                                    hasMerchartDoneSomething = true;
                                    break;
                                case 2:
                                    printHud();
                                    mageStore();
                                    hasMerchartDoneSomething = true;
                                    break;
                                case 3:
                                    printHud();
                                    MageConversation();
                                    hasMerchartDoneSomething = true;
                                    break;
                                case 4:
                                    if (hasMerchartDoneSomething) {
                                        System.out.println("Thank you! Thank you so much!.");
                                    } else {
                                        System.out.println("Ahhh... Useless Kid");
                                    }
                                    mageTower = false;
                                    break;
                                default:
                                    System.out.println("Innkeeper do not offer any more actions");
                            }
                        }
                        break;

                    } else {
                        System.out.println("I do not know this way");
                    }
                    break;
                case 0:
                    System.out.println("leave");
                    isInTown = false;
                    break;
                default:
                    System.out.println("I do not know this way");

            }

        }

    }

    private static void MageConversation() {
    }

    private static void mageTowerSpellsStore() {
    }

    private static void mageStore() {
    }

    private static void tavernStore() {
        System.out.println("Placeholder for tavern Store");
    }

    private static void rentARoom() {
        System.out.println("Placeholder for renting a room");
    }

    private static void innkeeperConversation() {
        System.out.println("tavern conversation");
    }

    private static void upgrateArmor() {
        System.out.println("Placeholder for armor upgrade");
    }

    private static void upgrateWeapon() {
        System.out.println("Placeholder for weapon upgrade");
    }

    private static void blacksmithStore() {
        System.out.println("Placeholder for blacksmith Store");
    }


    private static void printDownTownLocation() {

        System.out.println("Welcome to Downtown!");
        System.out.println("1. Out of town");
        System.out.println("2. Tavern");
        System.out.println("3. Blacksmith workshop");
        System.out.println("4. nobility district");
        System.out.println("5. Slums");
        if (HeroStats.hasKeyToHome)
            System.out.println("6. Home");
        if (HeroStats.hasAMap) {
            System.out.println("7. Mage Tower");
        }
        System.out.println("0. leave this place");
        System.out.print("Where to? > ");

    }

    private static void printHud() {
        System.out.println("----------------------------");
        System.out.format(" HP: %d | MP: %d | Gold: %d %n", HeroStats.playerHP, HeroStats.playerMANA, HeroStats.gold);
        System.out.println("----------------------------");
    }
}


