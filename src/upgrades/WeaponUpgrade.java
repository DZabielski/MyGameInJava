package upgrades;

import hero.Player;

public class WeaponUpgrade {

    public void Weapon(Player player) {

        if (player.getGold() >= player.getWeaponUpgradeCost()) {
            System.out.println("Your weapon damage has been upgraded by 5!");
            player.setGold(player.getGold() - player.getWeaponUpgradeCost());
            player.setWeaponUpgradeCost(player.getWeaponUpgradeCost() + 5);
        } else {
            System.out.println("Blacksmith: I don't work for free, get lost kid!");
        }

    }

}
