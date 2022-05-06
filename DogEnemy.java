package pl.chwilaprogramowaniadladebila;

import java.util.Random;

public class DogEnemy {
    static Random random = new Random();
    static String enemyName;
    static boolean drawName = true;
    static int enemyHp;
    static int enemyDamage;
    static int enemyStamina;
    static int name = 0;
    static int enemylvl = DogHero.lvl;
    static int minimumHp = (int) (DogHero.hp * 0.8)+1;
    static int maximumHp = (int) (DogHero.hp * 0.4);
    static int maximumStamina = (int) (DogHero.stamina * 0.2);
    static int minimumStamina = (int) (DogHero.stamina * 0.9)+1;
    static int maximumDamage = (int) (DogHero.damage * 0.2);
    static int minimumDamage = (int) (DogHero.damage * 0.9)+1;

    static void DrawName() {
        DrawNumberName();
        switch (name) {
            case 1 -> enemyName = "Luna";

            case 2 -> enemyName = "Sparky";

            case 3 -> enemyName = "Reks";

            case 4 -> enemyName = "Toffik";

            case 5 -> enemyName = "Max";

            case 6 -> enemyName = "Teddy";

            case 7 -> enemyName = "Rocky";

            case 8 -> enemyName = "Bella";

            case 9 -> enemyName = "Lola";
        }
    }
    static void DrawHp(){
        enemyHp = random.nextInt(maximumHp) + minimumHp;
    }

    static void DrawDamage(){
        enemyDamage = random.nextInt(maximumDamage) + minimumDamage;
    }

    static void DrawStamina(){
        enemyStamina = random.nextInt(maximumStamina) + minimumStamina;
    }

    static void DrawStats(){
        DrawName();
        DrawDamage();
        DrawStamina();
        DrawHp();
    }

    static void DrawNumberName(){
        name = random.nextInt(9) + 1;
    }

}
