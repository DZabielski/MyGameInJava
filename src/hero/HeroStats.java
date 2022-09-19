package hero;

public class HeroStats {


    //baseStats
    public static int playerMaxHP = 100, playerHP = 100, playerMANA = 20, strength = 10, dexterity = 10, gold = 0;

    //Weapon stats
    public int playerDMG = 0, playerCriticalChance = 0, playerCriticalDMG = 0, playerWeaponMagicDmg = 0;
    String[] weaponDamagetype = {"Cut", "Piercing", "Blunt"};
    public boolean bleedStatus = false, poisonStatus = false;

    //ArmorStats
    public int playerArmorDefence = 0, playerArmorMagicDefence = 0;

    //AmuletStats
    public int playerAmuletMagicDefence = 0, playerBleedStatusDefence = 0, playerPoisonStatusDefence = 0, playerMagicDMGboost = 0;

    //quest items
    public static boolean hasADiary = false;
    public static boolean hasAMap = false;
    public static boolean hasListenedAStory = false;
    public static boolean hasInvitation = false;
    public static boolean hasKeyToHome = false;


}

