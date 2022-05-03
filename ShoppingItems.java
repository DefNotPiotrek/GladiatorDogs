package pl.chwilaprogramowaniadladebila;

import java.util.Scanner;

public class ShoppingItems {

    public static int damageItems = 0;
    public static int staminaItems = 0;
    public static int hpItems = 0;
    public static boolean purchase = true;
    public static Scanner scanner = new Scanner(System.in);
    public static String confirm = scanner.nextLine();

    public static void DamageItems(){
        while (purchase) {
            if (damageItems == 0) {
                System.out.println("Chcesz zakupić mały mutagen za 500 złotych monet i zdobyć 10 punktów siły? tak/nie");
                if (confirm == "tak"){
                    DogHero.damage += 20;
                    damageItems += 1;
                }
            }
            Confirm();
        }
    }

    public static void StaminaItems(){
        while (purchase) {
            if (staminaItems == 0) {
                System.out.println("Chcesz zakupić mały mutagen za 500 złotych monet i zdobyć 10 punktów staminy? tak/nie");
                if (confirm == "tak"){
                    DogHero.stamina += 20;
                    staminaItems += 1;
                }
            }
            Confirm();
        }
    }

    public static void HpItems(){
        while (purchase) {
            if (hpItems == 0) {
                System.out.println("Chcesz zakupić mały mutagen za 500 złotych monet i zdobyć 100 punktów zdrowia? tak/nie");
                if (confirm == "tak"){
                    DogHero.hp += 20;
                    hpItems += 1;
                }
            }
            Confirm();
        }
    }

    public static void Confirm(){
        scanner.nextLine();
        confirm = scanner.nextLine();
        switch (confirm) {
            case "tak": break;
            case "nie":
                purchase = false;
            default:
                System.out.println("Nie podano żadnej, albo podano błędną wartość.");
                break;
        }
    }

}
