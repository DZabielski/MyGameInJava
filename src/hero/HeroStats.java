package hero;

public class HeroStats {


    //baseStats
    public static int playerMaxHP = 100, playerHP = 100, playerMANA = 20, strength = 10, dexterity = 10, gold = 0;

    //Weapon stats
    int playerDMG = 0, playerCriticalChance = 0, playerCriticalDMG = 0, playerWeaponMagicDmg = 0;
    String[] weaponDamagetype = {"Cut", "Piercing", "Blunt"};
    boolean bleedStatus = false, poisonStatus = false;

    //ArmorStats
    int playerArmorDefence = 0, playerArmorMagicDefence = 0;

    //AmuletStats
    int playerAmuletMagicDefence = 0, playerBleedStatusDefence = 0, playerPoisonStatusDefence = 0, playerMagicDMGboost = 0;


}

