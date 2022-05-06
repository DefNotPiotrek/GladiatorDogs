package pl.chwilaprogramowaniadladebila;

import java.util.Scanner;

public class DogHero {

    public static int hp = 600;
    public static int damage = 200;
    public static int stamina = 100;
    public static int xp = 0;
    public static int xpNeed = 1000;
    public static int lvl = 1;
    public static int gold = 0;
    public static int bossNumber = 1;
    public static String name;
    static Scanner scanner = new Scanner(System.in);

    public static void LvlUp() {
        if (xp >= xpNeed){
            System.out.println("Wbiłeś lvl! \n*Zyskałeś 3 punkty do rozdania!*");
            Upgrade.upgradePoints += 3;
            xp -= xpNeed;
            xpNeed *= 3;
        }
    }

    public static void Stats() {
        System.out.println("\nMasz:\nlvl: " + lvl +"\nxp: " + xp + "\nPotrzebujesz do następnego lvl: " + xpNeed + "\nSiła: " + damage + "\nStamina: " + stamina + "\nPunkty życia " + hp + "\nZłote monety: " + gold);
        System.out.println("\n'Kliknij jakiś przycisk!'");
        scanner.nextLine();
    }
}
