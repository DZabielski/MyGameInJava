import hero.HeroStats;
import hero.Weapons;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean hasMerchartDoneSomething = false, tavern = false, mageTower = false, isInHome = false, travel = false, hasHeardOfMine = false, hasADiary = false, hasSeenThePast = false;
        boolean isInTown = true;

        while (isInTown) {
            printHud();
            printDownTownLocation();

            int userChoise = sc.nextInt();
            switch (userChoise) {
                case 1:
                    travel = true;
                    while (travel) {
                        printHud();
                        System.out.println("1. Go to the forest.");
                        if (hasHeardOfMine) {
                            System.out.println("2. Go to the Jimmy's mine");
                        }
                        if (hasADiary) {
                            System.out.println("3. Go to the underground ruins");
                        }
                        if (hasSeenThePast) {
                            System.out.println("4. Go to the old hut");
                        }
                        System.out.println("9. Go back to town.");
                        System.out.println("Where to?: >");
                        userChoise = sc.nextInt();
                        switch (userChoise) {
                            case 1:
                                forestLocation();
                                break;
                            case 2:
                                if (hasHeardOfMine) {
                                    oldMineLocation();
                                } else {
                                    System.out.println("I do not know this direction.");
                                }
                                break;
                            case 3:
                                if (hasADiary) {
                                    undergroundRuinsLocation();
                                } else {
                                    System.out.println("I do not know this direction.");
                                }
                                break;
                            case 4:
                                if (hasSeenThePast) {
                                    theOldHutLocation();
                                } else {
                                    System.out.println("I do not know this direction.");
                                }
                            case 9:
                                System.out.println("You are in town.");
                                travel = false;
                                break;
                            default:
                                System.out.println("I do not know this direction.");
                        }
                    }
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
                                if (HeroStats.gold >= 5) {
                                    HeroStats.gold = HeroStats.gold - 5;
                                    rest();
                                    hasMerchartDoneSomething = true;
                                } else {
                                    System.out.println("Innkeeper: Sorry, but you do not have enough gold");
                                }
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
                    isInHome = true;
                    while (isInHome)
                        if (HeroStats.hasKeyToHome) {
                            printHud();
                            System.out.println("Me: Home.. sweet home");
                            System.out.println("1. Rest in bed");
                            System.out.println("2. Change equipment");
                            System.out.println("3. Go out");
                            System.out.println("What are you going to do?: >");
                            userChoise = sc.nextInt();
                            switch (userChoise) {
                                case 1:
                                    rest();
                                    break;
                                case 2:
                                    inventory();
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
                    break;
                case 7:
                    if (HeroStats.hasAMap) {
                        mageTower = true;
                        while (mageTower) {
                            printHud();
                            System.out.println("Kalazar the sky watcher: Ooo! I Knew you come. Here.. here, have a sit.");
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

    private static void theOldHutLocation() {

    }

    private static void undergroundRuinsLocation() {
    }

    private static void oldMineLocation() {
    }

    private static void forestLocation() {
    }

    private static void inventory() {
    }

    private static void rest() {
        System.out.println("you fill rest. Your HP is back to the maximum capacity");
        HeroStats.playerHP = HeroStats.playerMaxHP;
    }

    private static void MageConversation() {
    }

    private static void mageTowerSpellsStore() {
    }

    private static void mageStore() {
    }

    private static void tavernStore() {
        printHud();
        System.out.println("That's all ive got now. Sir");
        System.out.println("1. 15 Gold - Black Bear (Add +10 to dmg for the next adventure");
        System.out.println("2. 20 Gold - Red Sugar with extra sugar on round (Add +20 to the Max HP Points");
        System.out.println("3. 14 Gold - Blue Fox (Add +10 to dexterity... As they say...");
        System.out.println("4. I will pass.");
        //int userChoise = sc.nextInt();
        //switch (userChoise){
        //}

    }

    private static void innkeeperConversation() {
        System.out.println("tavern conversation");
    }

    private static void upgrateArmor() {
        if (HeroStats.gold >= HeroStats.armorUpgradeCost) {
            System.out.println("Your armor has been upgraded!");
            HeroStats.gold = HeroStats.gold - HeroStats.armorUpgradeCost;
            HeroStats.armorUpgradeCost = HeroStats.armorUpgradeCost + 5;
        } else {
            System.out.println("Blacksmith: I don't work for free, get lost kid!");
        }
    }

    private static void upgrateWeapon() {
        if (HeroStats.gold >= HeroStats.weaponUpgradeCost) {
            System.out.println("Your weapon damage has been upgraded by 5!");
            Object currentWeapon = Weapons.weaponName;
            HeroStats.gold = HeroStats.gold - HeroStats.weaponUpgradeCost;
            HeroStats.weaponUpgradeCost = HeroStats.weaponUpgradeCost + 5;
        } else {
            System.out.println("Blacksmith: I don't work for free, get lost kid!");
        }
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


