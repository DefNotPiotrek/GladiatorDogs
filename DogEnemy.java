package pl.chwilaprogramowaniadladebila;

import java.util.Random;

public class DogEnemy {
    static Random random = new Random();
    static String enemyName = DrawName();
    static int enemyHp;
    static int enemyDamage;
    static int enemyStamina;
    static int minimumHp = (int) (DogHero.hp * 0.8)+1;
    static int minimumDamage = (int) (DogHero.damage * 0.9)+1;
    static int minimumStamina = (int) (DogHero.stamina * 0.9)+1;
    static int maximumHp = (int) (DogHero.hp * 0.4);
    static int maximumDamage = (int) (DogHero.damage * 0.2);
    static int maximumStamina = (int) (DogHero.stamina * 0.2);
    static String DrawName() {
        int name = random.nextInt(9) + 1;
        switch (name) {
            case 1 -> {
                return "Luna";
            }

            case 2 -> {
                return "Sparky";
            }

            case 3 -> {
                return "Reks";
            }

            case 4 -> {
                return "Toffik";
            }

            case 5 -> {
                return "Max";
            }

            case 6 -> {
                return "Teddy";
            }

            case 7 -> {
                return "Rocky";
            }

            case 8 -> {
                return "Bella";
            }

            case 9 -> {
                return "Lola";
            }
        }
        return null;
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

}
