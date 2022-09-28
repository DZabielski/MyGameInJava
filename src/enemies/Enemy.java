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
}
