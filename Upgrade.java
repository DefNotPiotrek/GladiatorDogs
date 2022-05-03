package pl.chwilaprogramowaniadladebila;

import java.util.Scanner;

public class Upgrade {

    static int upgradePoints = 3;
    static int damagePoints = 10;
    static int staminaPoints = 10;
    static int hpPoints = 10;
    static int damageGrow = 0;
    static int staminaGrow = 0;
    static int hpGrow = 0;
    static boolean choose = true;
    static Scanner scanner = new Scanner(System.in);

        static public void UpgradeHero(){
            while (upgradePoints > 0) {
                choose = true;
                System.out.println("\nMasz " + upgradePoints + " punktów do rozdania! \n(Przydziel je klikając odpowiedni numer!)");
                System.out.println("1. Siła: " + damagePoints + "\n2. Stamina: " + staminaPoints + "\n3. Punkty życia: " + hpPoints);
                int choice = scanner.nextInt();
                while (choose) {
                    switch (choice) {
                        case 1 -> {
                            DogHero.damage += 15 + damageGrow;
                            damagePoints++;
                            damageGrow += 5;
                            upgradePoints--;
                            choose = false;
                        }
                        case 2 -> {
                            DogHero.stamina += 10 + staminaGrow;
                            staminaPoints++;
                            staminaGrow += 5;
                            upgradePoints--;
                            choose = false;
                        }
                        case 3 -> {
                            DogHero.hp += 100 + hpGrow;
                            hpPoints++;
                            hpGrow += 25;
                            upgradePoints--;
                            choose = false;
                        }
                        default -> {
                            System.out.println("\nNie podano żadnej, albo podano błędną wartość.");
                            choose = false;
                        }

                    }
                }
            }
        }
}
