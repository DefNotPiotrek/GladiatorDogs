package pl.chwilaprogramowaniadladebila;

public class EndOfTheBattle {

    static int earnMoney = 1000 * DogHero.lvl;
    static int moneyLost = (int) (earnMoney * 0.5);
    static int xpGain = (int) (750 * DogHero.lvl * 1.5);
    static int xpGainAfterLose = (int) (xpGain * 0.5);
    public static void Win(){
        if ( Fight.enemyActualHp <= 0 && BossFight.bossfight){
            Bosses.Win();
            System.out.println("Gratulacje!!! Pokonałeś Bossa " + DogEnemy.enemyName + "\nZyskałeś " + xpGain + " xp i " + earnMoney + " złotych monet!");
            Reward();
        }
        else if (Fight.enemyActualHp <= 0) {
            System.out.println("Gratulacje! Wygrałeś z " + DogEnemy.enemyName + "\nZyskałeś " + xpGain + " xp i " + earnMoney + " złotych monet!");
            Reward();
          }
    }

    public static void Lose(){
        if (Fight.actualHp <= 0 && BossFight.bossfight){
            System.out.println("*Zginałęś a twoje szczątki służą jako pokarm dla innych wojowników....*");
            Main.game = false;
            Fight.yourTurn = false;
            Fight.enemyTurn = false;
            Fight.fight = false;
        }
        else if (Fight.actualHp <= 0) {
            DogHero.LvlUp();
            System.out.println("Przegrałeś z " + DogEnemy.enemyName + "\nZyskałeś " + xpGainAfterLose + " xp i straciłeś " + moneyLost + " złotych monet!");
            DogHero.gold -= moneyLost;
            DogHero.xp += 500;
            Upgrade.UpgradeHero();
            Fight.yourTurn = false;
            Fight.enemyTurn = false;
            Fight.fight = false;
        }
    }

    public static void Reward(){
        DogHero.gold += earnMoney;
        DogHero.xp += xpGain;
        DogHero.LvlUp();
        Upgrade.UpgradeHero();
        Fight.yourTurn = false;
        Fight.enemyTurn = false;
        Fight.fight = false;
    }
}
