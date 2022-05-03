package pl.chwilaprogramowaniadladebila;

import java.util.Scanner;

public class Shop {

    public static boolean firstTime = true;
    public static boolean shopping = true;
    public static Scanner scanner = new Scanner(System.in);

    public static void Shopping() {
        while (shopping) {
            FirstTime();
            ChooseUpgrade();
        }
    }

    public static void FirstTime(){
        while (firstTime) {
            System.out.println("\nWitaj w sklepie, możesz tu zakupić za zdobyte złote monety mutageny, które wzmocnią twoją siłę, stamine, i zdrowie.");
            firstTime = false;
        }
    }

    public static void ChooseUpgrade(){
        System.out.println("\nWzmocnij:\n1.Siłę\n2.Staminę\n3.Punkty Życia\nPosiadasz: " + DogHero.gold + " złotych monet");
        int choose = scanner.nextInt();
        switch (choose){
            case 1 -> ShoppingItems.DamageItems();
            case 2 -> ShoppingItems.StaminaItems();
            case 3 -> ShoppingItems.HpItems();
            default -> System.out.println("Nie podano żadnej, albo podano błędną wartość.");
        }
    }
}
