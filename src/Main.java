import hero.Player;

import java.util.Scanner;


public class Main {
    static Player player = new Player();
    static Scanner sc = new Scanner(System.in);
    static int userChoice;
    static boolean hasMerchartDoneSomething = false, tavern = false, mageTower = false, isInHome = false, travel = false, innkeeperStore = false, whileOldHutLocation = false,
            theLastConfrontation = false, inTheForest = false;
    static boolean isInTown = true;

    public static void main(String[] args) {

        //create a hero
        player.creatingAHero();


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
                        if (player.isHasHeardOfMine()) {
                            System.out.println("2. Go to the Jimmy's mine");
                        }
                        if (player.isHasADiary()) {
                            System.out.println("3. Go to the underground ruins");
                        }
                        if (player.isHasSeenThePast()) {
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
                                if (player.isHasHeardOfMine()) {
                                    oldMineLocation();
                                } else {
                                    System.out.println("I do not know this direction.");
                                }
                                break;
                            case 3:
                                if (player.isHasADiary()) {
                                    undergroundRuinsLocation();
                                } else {
                                    System.out.println("I do not know this direction.");
                                }
                                break;
                            case 4:
                                if (player.isHasSeenThePast()) {
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

                        userChoice = sc.nextInt();
                        switch (userChoice) {
                            case 1:
                                printHud();
                                tavernStore();
                                hasMerchartDoneSomething = true;
                                break;
                            case 2:
                                printHud();
                                if (player.getGold() >= 5) {
                                    player.setGold(player.getGold() - 5);
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
                                upgradeWeapon();
                                hasMerchartDoneSomething = true;
                                break;
                            case 3:
                                printHud();
                                upgradeArmor(player);
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
                    if (player.isHasInvitation()) {
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
                        if (player.isHasKeyToHome()) {
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
                    if (player.isHasAMap()) {
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
        whileOldHutLocation = true;
        while (whileOldHutLocation) {
            System.out.println("In this ruins you hear the sound of burning wood. There is definitely someone inside");
            System.out.println("1. Search this old Hut");
            System.out.println("2. Leave this place");

            userChoice = sc.nextInt();
            switch (userChoice) {

                case 1:
                    System.out.println("There is a man you meet in the slums. You are be able to see his face now. He is a few years older than you. Sit in silence. He is looking at you, and slowly move his hand to grab the axe.");
                    System.out.println("");
                    System.out.println("1. Throw knife at him");
                    System.out.println("2. Runaway");

                    System.out.println("What are you going to do?");

                    theLastConfrontation = true;
                    while (theLastConfrontation) {
                        userChoice = sc.nextInt();
                        switch (userChoice) {
                            case 1:
                                System.out.println("You throw the knife at him. this sharp edge cut through the chest, and gets right to the heart.");
                                System.out.println("Your opponent look in your eyes. His seems to be happy... smiling. He drop on his knees. With his shaking hand he pulls out a piece of paper from behind his jacket");
                                System.out.println("You stretched out your hand, but he drop on the ground and drop the letter to the snow.");
                                System.out.println("On this piece of paper it is written: \"Sorry i could not be with you brother. Im sorry but that's all\"");
                                theLastConfrontation = false;
                                theEnd();
                                break;
                            case 2:
                                System.out.println("");
                                theLastConfrontation = false;
                                theEnd();
                                break;
                            default:
                                System.out.println("There is no other choice.");
                        }
                    }
                    break;
                case 2:
                    break;
                default:

            }

        }

    }

    private static void theEnd() {
        System.out.println("You end the game. Congratulation!");
        System.out.println("Game develop by Dawid Zabielski");
        isInTown = false;
    }

    private static void undergroundRuinsLocation() {
    }

    private static void oldMineLocation() {
    }

    private static void forestLocation() {
        inTheForest = true;
        while (inTheForest) {
            System.out.println("Are you sure, you want to enter the forest?");
            System.out.println("1. Yes, lets hunt");
            System.out.println("2. No, i Go back to town");

            userChoice = sc.nextInt();
            switch (userChoice) {

                case 1:
                    Fight.fightState();
                    break;

                case 2:

                    break;

                default:
                    System.out.println("There is no other choice");

            }
        }

    }

    private static void inventory() {
    }

    private static void rest() {

        System.out.println("you fill rest. Your HP is back to the maximum capacity");
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
        innkeeperStore = true;
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

    private static void innkeeperConversation() {
        System.out.println("tavern conversation");
    }

    private static Player upgradeArmor(Player player) {
        if (player.getGold() >= player.getArmorUpgradeCost()) {
            System.out.println("Your armor has been upgraded!");
            player.setGold(player.getGold() - player.getArmorUpgradeCost());
            player.setArmorUpgradeCost(player.getArmorUpgradeCost() + 5);
        } else {
            System.out.println("Blacksmith: I don't work for free, get lost kid!");
        }
        return player;
    }

    private static void upgradeWeapon() {
        if (player.getGold() >= player.getWeaponUpgradeCost()) {
            System.out.println("Your weapon damage has been upgraded by 5!");
            player.setGold(player.getGold() - player.getWeaponUpgradeCost());
            player.setWeaponUpgradeCost(player.getWeaponUpgradeCost() + 5);
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
        if (player.isHasKeyToHome())
            System.out.println("6. Home");
        if (player.isHasAMap()) {
            System.out.println("7. Mage Tower");
        }
        System.out.println("0. leave this place");
        System.out.print("Where to? > ");
    }

    private static void printHud() {
        System.out.println("----------------------------");
        System.out.format(" HP: %d | MP: %d | Gold: %d %n", player.getPlayerHP(), player.getPlayerMANA(), player.getGold());
        System.out.println("----------------------------");
    }
}


