package locations_places_npc;

import hero.Player;

import java.util.Scanner;

public class OldTower {

    public void mageTower(Player player) {
        Scanner sc = new Scanner(System.in);

        if (player.isHasAMap()) {
            boolean mageTower = true;
            while (mageTower) {
                player.printHud();
                System.out.println("Kalazar the sky watcher: Ooo! I Knew you come. Here.. here, have a sit.");
                System.out.println("1. I want to see more (learn new spells");
                System.out.println("2. Do you have some magic stuff for sell?");
                System.out.println("3. Speak");
                System.out.println("4. Quit");

                int userChoice = sc.nextInt();
                switch (userChoice) {
                    case 1:
                        player.printHud();
                        mageTowerSpellsStore();
                        player.setHasMerchartDoneSomething(true);
                        break;
                    case 2:
                        player.printHud();
                        mageStore();
                        player.setHasMerchartDoneSomething(true);
                        break;
                    case 3:
                        player.printHud();
                        MageConversation();
                        player.setHasMerchartDoneSomething(true);
                        break;
                    case 4:
                        if (player.HasMerchartDoneSomething()) {
                            System.out.println("Thank you! Thank you so much!.");
                        } else {
                            System.out.println("Ahhh... Useless Kid");
                        }
                        mageTower = false;
                        break;
                    default:
                        System.out.println("Innkeeper do not offer any more actions");
                }
            }
        } else {
            System.out.println("I do not know this way");
        }

    }
    private void mageTowerSpellsStore(){}

    private void mageStore(){};

    private void MageConversation(){};

}
