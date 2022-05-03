package pl.chwilaprogramowaniadladebila;

import java.util.Random;

public class EnemyAI {
    static Random random = new Random();
    public static int safeHp = (int) (0.70 * DogEnemy.enemyHp);
    public static int unsafeHp = (int) (0.35 * DogEnemy.enemyHp);
    public static void ChooseAction() throws InterruptedException {
        if (Fight.enemyActualHp >= safeHp && Fight.enemyActualStamina >= 50){
            int choose = random.nextInt(2)+1;
            switch (choose){
                case 1 -> Action.EnemyPawAttack();
                case 2 -> Action.EnemyBite();
            }
        }
        else if (Fight.enemyActualHp >= safeHp && Fight.enemyActualStamina >= 30){
            Action.EnemyPawAttack();
        }
        else if (Fight.enemyActualHp < safeHp && Fight.enemyActualHp > unsafeHp && Fight.enemyActualStamina >= 60){
            int choose = random.nextInt(3)+1;
            switch (choose){
                case 1 -> Action.EnemyPawAttack();
                case 2 -> Action.EnemyBite();
                case 3 -> Action.EnemyLickingWounds();
            }
        }
        else if (Fight.enemyActualHp < unsafeHp && Fight.enemyActualStamina >= 60){
            int choose = random.nextInt(4)+1;
            switch (choose){
                case 1 -> Action.EnemyPawAttack();
                case 2 -> Action.EnemyBite();
                case 3, 4 -> Action.EnemyLickingWounds();
            }
        }
        else if ((Fight.enemyActualHp < unsafeHp || Fight.enemyActualHp < safeHp && Fight.enemyActualHp > unsafeHp) && Fight.enemyActualStamina >= 50 && Fight.enemyActualStamina < 60){
            int choose = random.nextInt(3)+1;
            switch (choose){
                case 1 -> Action.EnemyPawAttack();
                case 2 -> Action.EnemyBite();
                case 3 -> Action.EnemySleep();
            }
        }
        else if (Fight.enemyActualStamina >= 30 && Fight.enemyActualStamina < 50){
            int choose = random.nextInt(2)+1;
            switch (choose){
                case 1 -> Action.EnemyPawAttack();
                case 2 -> Action.EnemySleep();
            }
        }
        else if (Fight.enemyActualStamina < 30){
            Action.EnemySleep();
        }
        Thread.sleep(1000);
        Fight.enemyTurn = false;
        Fight.yourTurn = true;
    }
}
