package hero;

public class Player {
    //Player statistics
    private int playerMaxHP;
    private int playerHP;
    private int playerMaxMANA;
    private int playerMANA;
    private int strength;
    private int dexterity;
    private int gold;
    private int weaponUpgradeCost, armorUpgradeCost;

    //quest items
    private boolean hasADiary;
    private boolean hasAMap;
    private boolean hasListenedAStory;
    private boolean hasInvitation;
    private boolean hasKeyToHome;
    private boolean hasSeenThePast;
    private boolean hasHeardOfMine;
    private boolean hasMerchartDoneSomething;


    public boolean HasMerchartDoneSomething() {
        return hasMerchartDoneSomething;
    }

    public void setHasMerchartDoneSomething(boolean hasMerchartDoneSomething) {
        this.hasMerchartDoneSomething = hasMerchartDoneSomething;
    }




    public int getPlayerMaxMANA() {
        return playerMaxMANA;
    }

    public void setPlayerMaxMANA(int playerMaxMANA) {
        this.playerMaxMANA = playerMaxMANA;
    }

    public  boolean isHeKnowThePast() {
        return this.hasSeenThePast;
    }

    public void setHeKnowThePast(boolean hasSeenThePast) {
        this.hasSeenThePast = hasSeenThePast;
    }

    public boolean isHasHeardOfMine() {
        return hasHeardOfMine;
    }

    public void setHasHeardOfMine(boolean hasHeardOfMine) {
        this.hasHeardOfMine = hasHeardOfMine;
    }

    public int getPlayerMaxHP() {
        return playerMaxHP;
    }

    public void setPlayerMaxHP(int playerMaxHP) {
        this.playerMaxHP = playerMaxHP;
    }

    public int getPlayerHP() {
        return playerHP;
    }

    public void setPlayerHP(int playerHP) {
        this.playerHP = playerHP;
    }

    public int getPlayerMANA() {
        return playerMANA;
    }

    public void setPlayerMANA(int playerMANA) {
        this.playerMANA = playerMANA;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getWeaponUpgradeCost() {
        return weaponUpgradeCost;
    }

    public void setWeaponUpgradeCost(int weaponUpgradeCost) {
        this.weaponUpgradeCost = weaponUpgradeCost;
    }

    public int getArmorUpgradeCost() {
        return armorUpgradeCost;
    }

    public void setArmorUpgradeCost(int armorUpgradeCost) {
        this.armorUpgradeCost = armorUpgradeCost;
    }

    public boolean isHasADiary() {
        return hasADiary;
    }

    public void setHasADiary(boolean hasADiary) {
        this.hasADiary = hasADiary;
    }

    public boolean isHasAMap() {
        return hasAMap;
    }

    public void setHasAMap(boolean hasAMap) {
        this.hasAMap = hasAMap;
    }

    public boolean HasListenedAStory() {
        return hasListenedAStory;
    }

    public void setHasListenedAStory(boolean hasListenedAStory) {
        this.hasListenedAStory = hasListenedAStory;
    }

    public boolean isHasInvitation() {
        return hasInvitation;
    }

    public void setHasInvitation(boolean hasInvitation) {
        this.hasInvitation = hasInvitation;
    }

    public boolean isHasKeyToHome() {
        return hasKeyToHome;
    }

    public void setHasKeyToHome(boolean hasKeyToHome) {
        this.hasKeyToHome = hasKeyToHome;
    }



    public void creatingAHero() {

        //Stats
        setPlayerMaxHP(100);
        setPlayerHP(getPlayerMaxHP());
        setPlayerMaxMANA(50);
        setPlayerMANA(getPlayerMaxMANA());
        setStrength(10);
        setDexterity(10);
        setGold(0);

        //Upgrades cost
        setArmorUpgradeCost(10);
        setWeaponUpgradeCost(10);

        //Quest items
        setHasKeyToHome(false);
        setHasADiary(false);
        setHasAMap(false);
        setHasInvitation(false);
        setHasListenedAStory(false);
        setHasHeardOfMine(false);
        setHeKnowThePast(false);
        setHasMerchartDoneSomething(false);

    }


    public void printHud() {
        System.out.println("----------------------------");
        System.out.format(" HP: %d | MP: %d | Gold: %d %n", this.getPlayerHP(), this.getPlayerMANA(), this.getGold());
        System.out.println("----------------------------");
    }

}

