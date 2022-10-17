import enemies.EnemyType;
import hero.Player;
import locations_places_npc.*;

import java.util.Scanner;

import static enemies.DrawEnemy.chooseOpponent;

public class ProgramRunner {
    Player player = new Player();
    public Scanner sc = new Scanner(System.in);
    int userChoice;

    public void run() {


        Player player = new Player();
        Scanner sc = new Scanner(System.in);


        boolean isInTown = true;

        //create a hero
        player.creatingAHero();

        chooseOpponent();

        while (isInTown) {
            player.printHud();
            printDownTownLocation();

            userChoice = sc.nextInt();
            switch (userChoice) {
                case 1:
                    Adventure hunt = new Adventure();
                    hunt.travel(player);
                    break;
                case 2:
                    Tavern letsDrink = new Tavern();
                    letsDrink.tavern(player);
                    break;
                case 3:
                    Blacksmith will = new Blacksmith();
                    will.smith(player);  //Will Will Smith smith? Yes, Will Smith will smith :D

                    break;
                case 4:
                    NobilityDistrict enterND = new NobilityDistrict();
                    enterND.nobility(player);
                    break;
                case 5:
                    CitySlums slums = new CitySlums();
                    slums.lowerCity();
                    break;
                case 6:
                    PlayerHome PH = new PlayerHome();
                    PH.sweetHome(player);
                    break;
                case 7:
                    OldTower OT = new OldTower();
                    OT.mageTower(player);
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


    public void function(EnemyType et) {
        System.out.println(et.env);
    }

    private void printDownTownLocation() {

        System.out.println("Welcome to Downtown!");
        System.out.println("1. Out of town");
        System.out.println("2. Tavern");
        System.out.println("3. Blacksmith workshop");
        System.out.println("4. nobility district");
        System.out.println("5. Slums");
        if (this.player.isHasKeyToHome())
            System.out.println("6. Home");
        if (player.isHasAMap()) {
            System.out.println("7. Mage Tower");
        }
        System.out.println("0. leave this place");
        System.out.print("Where to? > ");
    }

}


