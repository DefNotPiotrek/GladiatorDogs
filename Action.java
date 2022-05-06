package pl.chwilaprogramowaniadladebila;
import java.util.Random;

public class Action {
    static Random random = new Random();
    static int pawAttackDmg = (int) (0.30 * DogHero.damage);
    static int standartpawAttackDmg = (int) (0.20 * DogHero.damage + 1);
    static int biteDmg = (int) (0.30 * DogHero.damage);
    static int standartBiteDmg = (int) (0.60 * DogHero.damage + 1);
    static int enemyPawAttackDmg = (int) (0.30 * DogEnemy.enemyDamage);
    static int enemyStandartpawAttackDmg = (int) (0.20 * DogEnemy.enemyDamage + 1);
    static int enemyBiteDmg = (int) (0.30 * DogEnemy.enemyDamage);
    static int enemyStandartBiteDmg = (int) (0.60 * DogEnemy.enemyDamage + 1);
    static public void PawAttack() throws InterruptedException {
        if (Fight.actualStamina >= 30) {
            int szanse = random.nextInt(100)+1;
            if (szanse <= 75) {
                int damage = random.nextInt(pawAttackDmg) + standartpawAttackDmg;
                Fight.enemyActualHp -= damage;
                System.out.println("*Trafienie*\n*Zadałeś " + damage + " obrażeń*\n");
            } else System.out.println("*Pudło*\n");
            Fight.actualStamina -= 30;
            Thread.sleep(1000);
            Fight.yourTurn = false;
        }
        else {
            System.out.println("\n*Nie możesz zaatakować!*");
            Thread.sleep(1000);
        }
    }

    static public void Bite() throws InterruptedException {
        if (Fight.actualStamina >= 50) {
            int szanse = random.nextInt(100)+1;
            if (szanse <= 50) {
                int damage = random.nextInt(biteDmg) + standartBiteDmg;
                Fight.enemyActualHp -= damage;
                System.out.println("*Trafienie*\n*Zadałeś " + damage + " obrażeń*\n");
            } else System.out.println("*Pudło*\n");
            Fight.actualStamina -= 50;
            Thread.sleep(1000);
            Fight.yourTurn = false;
        }
        else System.out.println("*Nie możesz zaatakować!*\n");
    }

    static public void LickingWounds() throws InterruptedException {
        if (Fight.actualStamina >= 60) {
            Fight.actualStamina -= 60;
            int heal = random.nextInt(30) + 31;
            Fight.actualHp += heal;
            if (Fight.actualHp >= DogHero.hp) {
                int reduce = Fight.actualHp - DogHero.hp;
                Fight.actualHp -= reduce;
            }
            System.out.println("*Wyleczono " + heal + " hp!*\n");
            Thread.sleep(1000);
            Fight.yourTurn = false;
        }
        else System.out.println("*Nie możesz się zregenerować!*\n");
    }

    static public void Sleep() throws InterruptedException {
        int regen = random.nextInt(20)+31;
        Fight.actualStamina += regen;
        if (Fight.actualStamina >= DogHero.stamina) {
            int reduce = Fight.actualStamina - DogHero.stamina;
            Fight.actualStamina -= reduce;
        }
        System.out.println("*Odzyskałeś " + regen + " Pkt Staminy*\n");
        Thread.sleep(1000);
        Fight.yourTurn = false;
    }

    static public void EnemyPawAttack() throws InterruptedException {
        if (Fight.enemyActualStamina >= 30) {
            int szanse = random.nextInt(100)+1;
            if (szanse <= 75) {
                int damage = random.nextInt(enemyPawAttackDmg) + enemyStandartpawAttackDmg;
                Fight.actualHp -= damage;
                System.out.println("*Trafienie*");
                System.out.println("*" + DogEnemy.enemyName + " uderzył cię łapą i zadał " + damage + " obrażeń*\n");
            }
            else System.out.println("*Pudło*\n");
            Fight.enemyActualStamina -= 30;
            Thread.sleep(1000);
        }
    }

    static public void EnemyBite() throws InterruptedException {
        if (Fight.enemyActualStamina >= 50) {
            int szanse = random.nextInt(100)+1;
            if (szanse <= 50) {
                int damage = random.nextInt(enemyBiteDmg) + enemyStandartBiteDmg;
                Fight.actualHp -= damage;
                System.out.println("*Trafienie*");
                System.out.println("*" + DogEnemy.enemyName + " cię ugryzł i zadał " + damage + " obrażeń*\n");
            }
            else System.out.println("*Pudło*\n");
            Fight.enemyActualStamina -= 50;
            Thread.sleep(1000);
        }
    }

    static public void EnemyLickingWounds() throws InterruptedException {
        if (Fight.enemyActualStamina >= 60) {
            Fight.enemyActualStamina -= 60;
            int heal = random.nextInt(30) + 31;
            Fight.enemyActualHp += heal;
            if (Fight.enemyActualStamina >= DogEnemy.enemyStamina) {
                int reduce = Fight.enemyActualHp - DogEnemy.enemyHp;
                Fight.enemyActualHp -= reduce;
            }
            System.out.println(DogEnemy.enemyName + " wylizał rany i wyleczył " + heal + " hp\n");
            Thread.sleep(1000);
        }
    }

    static public void EnemySleep() throws InterruptedException {
        int regen = random.nextInt(20)+31;
        Fight.enemyActualStamina += regen;
        if (Fight.enemyActualStamina >= DogEnemy.enemyStamina) {
            int reduce = Fight.enemyActualStamina - DogEnemy.enemyStamina;
            Fight.enemyActualStamina -= reduce;
        }
        System.out.println("*" + DogEnemy.enemyName + " usnął i odzyskał " + regen + " Pkt Staminy*\n");
        Thread.sleep(1000);
    }
}
