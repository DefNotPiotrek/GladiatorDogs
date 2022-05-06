package pl.chwilaprogramowaniadladebila;

import static pl.chwilaprogramowaniadladebila.DogHero.bossNumber;
import static pl.chwilaprogramowaniadladebila.EndOfTheBattle.earnMoney;
import static pl.chwilaprogramowaniadladebila.EndOfTheBattle.xpGain;

public class Bosses {

    public String name;
    public int lvl;
    public int damage;
    public int hp;
    public int stamina;

    public Bosses(String name, int lvl, int damage, int hp, int stamina){
        this.name = name;
        this.lvl = lvl;
        this.damage = damage;
        this.hp = hp;
        this.stamina = stamina;
    }

    public static void Win() {
        if (bossNumber == 1) {
            xpGain = 5000;
            earnMoney = 5000;
        } else if (bossNumber == 2) {
            xpGain = 10000;
            earnMoney = 8000;
        } else if (bossNumber == 3) {
            xpGain = 15000;
            earnMoney = 8000;
        }
        else if (bossNumber == 4) {
            xpGain = 23000;
            earnMoney = 15000;
        }
        else if (bossNumber == 5) {
            xpGain = 30000;
            earnMoney = 20000;
        }
        else if (bossNumber == 6) {
            xpGain = 33000;
            earnMoney = 25000;
        }
        else if (bossNumber == 7) {
            xpGain = 40000;
            earnMoney = 30000;
        }
        EndOfTheBattle.Win();
    }

}

