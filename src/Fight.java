import enemies.EnemyType;

import java.util.Random;

public class Fight {


    public static void fightState(){





//
//        Enemy e = new Enemy(EnemyType.);
//        System.out.println(e);
//
//
//
//        System.out.println();


        
    }

    public static EnemyType generateRandomEnemy() {
        EnemyType[] values = EnemyType.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
    }

}
