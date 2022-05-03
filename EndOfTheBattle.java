package pl.chwilaprogramowaniadladebila;

public class EndOfTheBattle {

    static int earnMoney = 1000 * DogHero.lvl;
    static int moneyLost = (int) (earnMoney * 0.5);
    static int xpGain = (int) (750 * DogHero.lvl * 1.5);
    static int xpGainAfterLose = (int) (xpGain * 0.5);
    public static void Win(){
        if (Fight.enemyActualHp <= 0) {
            System.out.println("Wygrałeś z " + DogEnemy.enemyName + "\nZyskałeś" + xpGain + "xp i " + earnMoney + " złotych monet!");
            DogHero.gold += earnMoney;
            DogHero.xp += xpGain;
            DogHero.LvlUp();
            Upgrade.UpgradeHero();
            Fight.yourTurn = false;
            Fight.enemyTurn = false;
            Fight.fight = false;
        }
    }

    public static void Lose(){
        if (Fight.actualHp <= 0) {
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
}
