package locations_places_npc;
import hero.Player;


import java.util.Scanner;

import static enemies.DrawEnemy.chooseOpponent;


public class Adventure {
    Scanner sc = new Scanner(System.in);
    boolean whileOldHutLocation = false, theLastConfrontation = false, inTheForest = false;
    static boolean travel = false;
    public static String typeOfEnemy;

    public void travel(Player player) {
        travel = true;
        while (travel) {
            player.printHud();
            System.out.println("1. Go to the forest.");
            if (player.isHeKnowThePast()){
                System.out.println("2. Go to the Jimmy's mine");
            }
            if (player.isHasADiary()) {
                System.out.println("3. Go to the underground ruins");
            }
            if (player.isHeKnowThePast()) {
                System.out.println("4. Go to the old hut");
            }
            System.out.println("9. Go back to town.");
            System.out.println("Where to?: >");
            int userChoice = sc.nextInt();
            switch (userChoice) {
                case 1:
                    boolean toTheForrest = true;
                    while (toTheForrest) {
                        typeOfEnemy = "Forrest";
                        chooseOpponent();
                    }
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
                    if (player.isHeKnowThePast()) {
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
    }


    private void forestLocation () {
        inTheForest = true;
        while (inTheForest) {
            System.out.println("Are you sure, you want to enter the forest?");
            System.out.println("1. Yes, lets hunt");
            System.out.println("2. No, i Go back to town");

            int userChoice = sc.nextInt();
            switch (userChoice) {

                case 1:

                    break;

                case 2:

                    break;

                default:
                    System.out.println("There is no other choice");

            }
        }

    }
    private static void oldMineLocation() {
    }

    private static void undergroundRuinsLocation() {
    }


    private void theOldHutLocation() {
        whileOldHutLocation = true;
        while (whileOldHutLocation) {
            System.out.println("In this ruins you hear the sound of burning wood. There is definitely someone inside");
            System.out.println("1. Search this old Hut");
            System.out.println("2. Leave this place");

            int userChoice = sc.nextInt();
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
                               // theEnd();
                                break;
                            case 2:
                                System.out.println("");
                                theLastConfrontation = false;
                               // theEnd();
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
}