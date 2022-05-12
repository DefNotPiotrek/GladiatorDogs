package pl.chwilaprogramowaniadladebila;

import java.util.Scanner;

import static pl.chwilaprogramowaniadladebila.Action.*;

public class Fight {

    static int actualHp = DogHero.hp;
    static int enemyActualHp = DogEnemy.enemyHp;
    static int actualStamina = DogHero.stamina;
    static int enemyActualStamina = DogEnemy.enemyStamina;
    static boolean yourTurn = true;
    static boolean enemyTurn = true;
    static boolean fight = true;

    public static void FightAgainstEnemy() throws InterruptedException {

        while(fight) {
            Regen();
            Stats();
            while (yourTurn) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("1.Atak łapą (Stamina 30)   2.Ukryzienie (Stamina 50)   3.Wylizanie ran (Stamina 60)   4.Sen");
                int action = scanner.nextInt();
                System.out.println(" ");
                switch (action) {
                    case 1 -> PawAttack();
                    case 2 -> Bite();
                    case 3 -> LickingWounds();
                    case 4 -> Sleep();
                    default -> System.out.println("Nie podano żadnej, albo podano błędną wartość.");
                }
            }
            enemyTurn = true;
            EndOfTheBattle.Win();
            while (enemyTurn) {
                EnemyAI.ChooseAction();
            }
            EndOfTheBattle.Lose();
        }
    }

    public static void Stats(){
        System.out.println("\n" + DogHero.name + "\nPunkty życia: " + actualHp + "\nStamina: " + actualStamina+
                            "\n\n" + DogEnemy.enemyName + "\nPunkty życia: " + enemyActualHp + "\nStamina: " + enemyActualStamina + "\n");
    }

    static void Regen(){
        int healing = (int) (DogHero.hp * 0.03);
        actualHp += healing;
        if (Fight.actualHp >= DogHero.hp) {
            int reduce = Fight.actualHp - DogHero.hp;
            Fight.actualHp -= reduce;
        }
        int staminaRegen = (int) (DogHero.stamina * 0.03);
        actualStamina += staminaRegen;
        if (Fight.actualStamina >= DogHero.stamina) {
            int reduce = Fight.actualStamina - DogHero.stamina;
            Fight.actualStamina -= reduce;
        }
        System.out.println("*Wyregenowałeś " + healing + " hp i " + staminaRegen + " staminy*");
        healing = (int) (DogEnemy.enemyHp * 0.03);
        enemyActualHp += healing;
        if (Fight.enemyActualStamina >= DogEnemy.enemyStamina) {
            int reduce = Fight.enemyActualHp - DogEnemy.enemyHp;
            Fight.enemyActualHp -= reduce;
        }
        staminaRegen = (int) (DogEnemy.enemyStamina * 0.03);
        enemyActualStamina += staminaRegen;
        if (Fight.enemyActualStamina >= DogEnemy.enemyStamina) {
            int reduce = Fight.enemyActualStamina - DogEnemy.enemyStamina;
            Fight.enemyActualStamina -= reduce;
        }
        System.out.println("*Przeciwnik wyregenował " + healing + " hp i " + staminaRegen + " staminy*");
    }
}
