package enemies;

public class Enemy {


    private String enemyName;
    private int enemyHP;
    private int enemyDMG;
    private int enemyGold;
    private boolean hasPoisonDMG;
    private boolean hasBleedDMG;


    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public int getEnemyHP() {
        return enemyHP;
    }

    public void setEnemyHP(int enemyHP) {
        this.enemyHP = enemyHP;
    }

    public int getEnemyDMG() {
        return enemyDMG;
    }

    public void setEnemyDMG(int enemyDMG) {
        this.enemyDMG = enemyDMG;
    }

    public int getEnemyGold() {
        return enemyGold;
    }

    public void setEnemyGold(int enemyGold) {
        this.enemyGold = enemyGold;
    }

    public boolean isHasPoisonDMG() {
        return hasPoisonDMG;
    }

    public void setHasPoisonDMG(boolean hasPoisonDMG) {
        this.hasPoisonDMG = hasPoisonDMG;
    }

    public boolean isHasBleedDMG() {
        return hasBleedDMG;
    }

    public void setHasBleedDMG(boolean hasBleedDMG) {
        this.hasBleedDMG = hasBleedDMG;
    }


    public void createEnemy(String chosenOpponent) {

        switch (chosenOpponent) {
            case Deer:
                setEnemyName("Deer");
                setEnemyHP(DrawEnemy.getRandomNumber(20, 30));
                setEnemyDMG(DrawEnemy.getRandomNumber(5, 15));
                setEnemyGold(DrawEnemy.getRandomNumber(2, 4));
                return;


            case "Bear":
                enemy.setEnemyName("Bear");
                enemy.setEnemyHP(getRandomNumber(40, 60));
                enemy.setEnemyDMG(getRandomNumber(10, 20));
                enemy.setEnemyGold(getRandomNumber(5, 8));
                break;

            case "Bandit":
                enemy.setEnemyName("Bandit");
                enemy.setEnemyHP(getRandomNumber(40, 60));
                enemy.setEnemyDMG(getRandomNumber(10, 20));
                enemy.setEnemyGold(getRandomNumber(5, 8));
                break;
                
            case Goblin:


            case "Wolf":
                enemy.setEnemyName("Wolf");
                enemy.setEnemyHP(getRandomNumber(40, 60));
                enemy.setEnemyDMG(getRandomNumber(10, 20));
                enemy.setEnemyGold(getRandomNumber(5, 8));
                break;

            default:
                System.out.println("poza listą");

        }

    }

}
