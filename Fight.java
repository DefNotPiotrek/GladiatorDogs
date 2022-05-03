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
//        fight = true;
//        actualHp = DogHero.hp;
//        actualStamina = DogHero.stamina;
//        enemyActualHp = DogEnemy.enemyHp;
//        enemyActualStamina = DogEnemy.enemyStamina;

        while(fight) {
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
        System.out.println("\n" + DogHero.name + "\t\t\t\t\t   " + DogEnemy.enemyName + "\n" +
                "Punkty życia: " + actualHp + "\t   Punkty życia: " + enemyActualHp +
                "\nStamina: " + actualStamina + "  \t\t   Stamina: " + enemyActualStamina + "\n");
    }
}
