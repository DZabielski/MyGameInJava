package upgrades;
import hero.Player;
public class ArmorUpgrate {

    public void Armor(Player player) {


        if (player.getGold() >= player.getArmorUpgradeCost()) {
            System.out.println("Your armor has been upgraded!");
            player.setGold(player.getGold() - player.getArmorUpgradeCost());
            player.setArmorUpgradeCost(player.getArmorUpgradeCost() + 5);
        } else {
            System.out.println("Blacksmith: I don't work for free, get lost kid!");
        }
    }

}
