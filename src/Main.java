import hero.HeroStats;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isInTown = true;
        //quests
        boolean hasADiary = false, hasAMap = false, hasListenedAStory = false, hasInvitation = false, hasKeyToHome = false;


        while (isInTown) {
            printHud();

            System.out.println("Welcome to Downtown!");
            System.out.println("1. Out of town");
            System.out.println("2. Tavern");
            System.out.println("3. Blacksmith workshop");
            System.out.println("4. nobility district");
            System.out.println("5. Slums");
            if (hasKeyToHome)
                System.out.println("6. Home");
            if (hasAMap) {
                System.out.println("7. Mage Tower");
            }
            System.out.println("0. leave this place");
            System.out.print("Where to? > ");

            int userChoise = sc.nextInt();
            switch (userChoise) {
                case 1:
                    System.out.println("go out");
                    break;
                case 2:
                    System.out.println("Tavern");
                    break;
                case 3:
                    System.out.println("Blacksmith");
                    break;
                case 4:
                    if (hasInvitation) {
                        System.out.println("Welcome to nobility district");
                    } else {
                        System.out.println("You don't have permission to enter Sir");
                    }
                    break;
                case 5:
                    System.out.println("slums");
                    break;
                case 6:
                    if (hasKeyToHome) {
                        System.out.println("Home");
                    } else {
                        System.out.println("I do not know this way");
                    }
                    break;
                case 7:
                    if (hasAMap) {
                        System.out.println("Mage tower");
                    }else {
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

    private static void printHud() {
        System.out.println("----------------------------");
        System.out.format(" HP: %d | MP: %d | Gold: %d %n", HeroStats.playerHP, HeroStats.playerMANA, HeroStats.gold);
        System.out.println("----------------------------");
    }
}

