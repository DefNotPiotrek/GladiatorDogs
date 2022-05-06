package pl.chwilaprogramowaniadladebila;

import static pl.chwilaprogramowaniadladebila.Menu.Agree;
import static pl.chwilaprogramowaniadladebila.Menu.Description;

public class BossFight  {

    public static void BossFighting() throws InterruptedException {

        Bosses boss = null;
        if (DogHero.bossNumber == 1) {
            boss = new Bosses("Reksio", 3, 230, 800, 130);
        }
        else if (DogHero.bossNumber == 2) {
            boss = new Bosses("Skubi", 5, 260, 1000, 150);
        }
        else if (DogHero.bossNumber == 3) {
            boss = new Bosses("Misiu", 8, 300, 1300, 120);
        }
        else if (DogHero.bossNumber == 4) {
            boss = new Bosses("Pikuś", 10, 360, 1600, 100);
        }
        else if (DogHero.bossNumber == 5) {
            boss = new Bosses("Piorun", 13, 500, 1000, 200);
        }
        else if (DogHero.bossNumber == 6) {
            boss = new Bosses("Kaja", 16, 300, 3500, 250);
        }
        else if (DogHero.bossNumber == 7) {
            boss = new Bosses("Szarik", 19, 400, 2500, 200);
        }
        DogEnemy.enemyName = boss.name;
        DogEnemy.enemylvl = boss.lvl;
        DogEnemy.enemyDamage = boss.damage;
        DogEnemy.enemyHp = boss.hp;
        DogEnemy.enemyStamina = boss.stamina;
        Description();
        Agree();
    }
}
