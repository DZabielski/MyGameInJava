package locations_places_npc;

import java.util.Scanner;

public class CitySlums {

    public void lowerCity() {
        Scanner sc = new Scanner(System.in);
        int userChoice;

        boolean inTheSlums = true;
        while (inTheSlums) {
            System.out.println("You have enter the slums sector");
            System.out.println("While you walk through the alley, you feel that someone is watching you");
            System.out.println("1. Speak to people in the alley");
            System.out.println("2. Go to the bar");
            userChoice = sc.nextInt();
            sc.nextLine();

            switch (userChoice) {
                case 1:
                    boolean speakToThePeopleInTheAlley = true;
                    while (speakToThePeopleInTheAlley) {
                        System.out.println("You see:");
                        System.out.println("1. Drunk guy");
                        System.out.println("2. Scantily dressed woman");
                        System.out.println("3. Suspicious man in the hood");
                        System.out.println("4. Speak to no one");
                        userChoice = sc.nextInt();
                        sc.nextLine();
                        switch (userChoice) {
                            case 1:
                                System.out.println("Hero - Hello sir");
                                System.out.println("Drunk guy - Yhhh eooheemmmmm ehmmmmmmmmm");
                                System.out.println("Hero - Why am i even tried to do that?");
                                speakToThePeopleInTheAlley = false;
                                break;
                            case 2:
                                System.out.println("Scantily dressed woman - Hello silly!");
                                System.out.println("Hero - He-have a nice day miss (You walk away stressed out).");
                                speakToThePeopleInTheAlley = false;
                                break;
                            case 3:
                                System.out.println("As you headed for the man, he dissolved into the mist");
                                System.out.println("The Only thing you've see, was a golden shiny ring on his left hand.");
                                System.out.println("Shine so bright even in this dark alley");
                                speakToThePeopleInTheAlley = false;
                                break;
                            case 4:
                                speakToThePeopleInTheAlley = false;
                                break;
                        }
                    }
                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:

            }

        }
    }

}
