package enemies;

public class DrawEnemy {


    public static void forrestEnemy() {

        Enemy enemy = new Enemy();
        String chosenOpponent;

        String[] listOfForrestEnemy = {"Deer", "Bear", "Bandit", "Wolf"};

        chosenOpponent = listOfForrestEnemy[getRandomNumber(0, listOfForrestEnemy.length)];

        Enemy.createEnemy(chosenOpponent);


    }

    public static void oldMineEnemy() {

        String[] listOfOldMineEnemy = {"Goblin", "Slime", "Troll", "Golem"};

        switch (listOfOldMineEnemy[getRandomNumber(0, listOfOldMineEnemy.length)]) {
            case "Goblin":
                System.out.println("its a Goblin");
                break;
            case "Slime":
                System.out.println("its a Slime");
                break;
            case "Troll":
                System.out.println("its a Troll");
                break;
            case "Golem":
                System.out.println("its a Golem");
                break;
            default:
                System.out.println("poza listą");

        }
    }

    public static void oldRuinsEnemy() {

        String[] listOfOldRuinsEnemy = {"Skeleton", "Zombie", "Ghoul", "Demon"};

        switch (listOfOldRuinsEnemy[getRandomNumber(0, listOfOldRuinsEnemy.length)]) {
            case "Skeleton":
                System.out.println("its a Skeleton");
                break;
            case "Zombie":
                System.out.println("its a Zombie");
                break;
            case "Ghoul":
                System.out.println("its a Ghoul");
                break;
            case "Demon":
                System.out.println("its a Demon");
                break;
            default:
                System.out.println("poza listą");

        }
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);

    }
}

