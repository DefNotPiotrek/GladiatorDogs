package pl.chwilaprogramowaniadladebila;

import java.util.Scanner;

public class ShoppingItems {

    static int damageItems = 0;
    static int staminaItems = 0;
    static int hpItems = 0;
    static boolean purchase = true;
    static Scanner scanner = new Scanner(System.in);
    static boolean confirmPurchase = true;
    static boolean buy = false;
    static int gold = DogHero.gold;

    public static void DamageItems(){

        while (purchase) {
            System.out.println(" ");
            confirmPurchase = true;
            if (damageItems == 0) {
                System.out.println("Chcesz zakupić malutki mutagen za 500 złotych monet i zdobyć 15 punktów siły? tak/nie");
                Confirm();
                while (buy){
                    if (gold >= 500) {
                        DogHero.damage += 15;
                        damageItems += 1;
                        buy = false;
                        DogHero.gold -= 500;
                    }
                    else {
                        NotEnought();
                    }
                }
            }
            else if (damageItems == 1) {
                System.out.println("Chcesz zakupić mały mutagen za 2500 złotych monet i zdobyć 30 punktów siły? tak/nie");
                Confirm();
                while (buy){
                    if (gold >= 2500) {
                        DogHero.damage += 30;
                        damageItems += 1;
                        buy = false;
                        DogHero.gold -= 2500;
                    }
                    else {
                        NotEnought();
                    }
                }
            }
            else if (damageItems == 2) {
                System.out.println("Chcesz zakupić średni mutagen za 7500 złotych monet i zdobyć 45 punktów siły? tak/nie");
                Confirm();
                while (buy){
                    if (gold >= 7500) {
                        DogHero.damage += 45;
                        damageItems += 1;
                        buy = false;
                        DogHero.gold -= 7500;
                    }
                    else {
                        NotEnought();
                    }
                }
            }
            else if (damageItems == 3) {
                System.out.println("Chcesz zakupić duży mutagen za 15000 złotych monet i zdobyć 60 punktów siły? tak/nie");
                Confirm();
                while (buy){
                    if (gold >= 15000) {
                        DogHero.damage += 60;
                        damageItems += 1;
                        buy = false;
                        DogHero.gold -= 15000;
                    }
                    else {
                        NotEnought();
                    }
                }
            }
            else if (damageItems == 4) {
                System.out.println("Chcesz zakupić olbrzymi mutagen za 30000 złotych monet i zdobyć 75 punktów siły? tak/nie");
                Confirm();
                while (buy){
                    if (gold >= 30000) {
                        DogHero.damage += 75;
                        damageItems += 1;
                        buy = false;
                        DogHero.gold -= 30000;
                    }
                    else {
                        NotEnought();
                    }
                }
            }
        }
    }

    public static void StaminaItems(){
        while (purchase) {
            if (staminaItems == 0) {
                System.out.println("Chcesz zakupić malutki mutagen za 500 złotych monet i zdobyć 10 punktów staminy? tak/nie");
                Confirm();
                while (buy){
                    if (gold >= 500) {
                        DogHero.stamina += 10;
                        staminaItems += 1;
                        buy = false;
                        DogHero.gold -= 500;
                    }
                    else {
                        NotEnought();
                    }
                }
            }
            else if (staminaItems == 1) {
                System.out.println("Chcesz zakupić mały mutagen za 2500 złotych monet i zdobyć 20 punktów staminy? tak/nie");
                Confirm();
                while (buy){
                    if (gold >= 2500) {
                        DogHero.stamina += 20;
                        staminaItems += 1;
                        buy = false;
                        DogHero.gold -= 2500;
                    }
                    else {
                        NotEnought();
                    }
                }
            }
            else if (staminaItems == 2) {
                System.out.println("Chcesz zakupić średni mutagen za 7500 złotych monet i zdobyć 30 punktów staminy? tak/nie");
                Confirm();
                while (buy){
                    if (gold >= 7500) {
                        DogHero.stamina += 30;
                        staminaItems += 1;
                        buy = false;
                        DogHero.gold -= 7500;
                    }
                    else {
                        NotEnought();
                    }
                }
            }
            else if (staminaItems == 3) {
                System.out.println("Chcesz zakupić duży mutagen za 15000 złotych monet i zdobyć 40 punktów staminy? tak/nie");
                Confirm();
                while (buy){
                    if (gold >= 15000) {
                        DogHero.stamina += 40;
                        staminaItems += 1;
                        buy = false;
                        DogHero.gold -= 15000;
                    }
                    else {
                        NotEnought();
                    }
                }
            }
            else if (staminaItems == 4) {
                System.out.println("Chcesz zakupić olbrzymi mutagen za 30000 złotych monet i zdobyć 50 punktów staminy? tak/nie");
                Confirm();
                while (buy){
                    if (gold >= 30000) {
                        DogHero.stamina += 50;
                        staminaItems += 1;
                        buy = false;
                        DogHero.gold -= 30000;
                    }
                    else {
                        NotEnought();
                    }
                }
            }
        }
    }

    public static void HpItems(){
        while (purchase) {
            if (hpItems == 0) {
                System.out.println("Chcesz zakupić malutki mutagen za 500 złotych monet i zdobyć 100 punktów zdrowia? tak/nie");
                Confirm();
                while (buy){
                    if (gold >= 500) {
                        DogHero.hp += 100;
                        hpItems += 1;
                        buy = false;
                        DogHero.gold -= 500;
                    }
                    else {
                        NotEnought();
                    }
                }
            }
            else if (hpItems == 1) {
                System.out.println("Chcesz zakupić mały mutagen za 2500 złotych monet i zdobyć 150 punktów zdrowia? tak/nie");
                Confirm();
                while (buy){
                    if (gold >= 2500) {
                        DogHero.hp += 150;
                        hpItems += 1;
                        buy = false;
                        DogHero.gold -= 2500;
                    }
                    else {
                        NotEnought();
                    }
                }
            }
            else if (hpItems == 2) {
                System.out.println("Chcesz zakupić średni mutagen za 7500 złotych monet i zdobyć 200 punktów zdrowia? tak/nie");
                Confirm();
                while (buy){
                    if (gold >= 7500) {
                        DogHero.hp += 200;
                        hpItems += 1;
                        buy = false;
                        DogHero.gold -= 7500;
                    }
                    else {
                        NotEnought();
                    }
                }
            }
            else if (hpItems == 3) {
                System.out.println("Chcesz zakupić duży mutagen za 15000 złotych monet i zdobyć 300 punktów zdrowia? tak/nie");
                Confirm();
                while (buy){
                    if (gold >= 15000) {
                        DogHero.hp += 300;
                        hpItems += 1;
                        buy = false;
                        DogHero.gold -= 15000;
                    }
                    else {
                        NotEnought();
                    }
                }
            }
            else if (hpItems == 4) {
                System.out.println("Chcesz zakupić olbrzymi mutagen za 30000 złotych monet i zdobyć 400 punktów zdrowia? tak/nie");
                Confirm();
                while (buy){
                    if (gold >= 30000) {
                        DogHero.hp += 400;
                        hpItems += 1;
                        buy = false;
                        DogHero.gold -= 30000;
                    }
                    else {
                        NotEnought();
                    }
                }
            }
        }
    }

    public static void Confirm(){
        while(confirmPurchase) {
            String confirm = scanner.nextLine();
            switch (confirm) {
                case "tak" -> {
                    confirmPurchase = false;
                    buy = true;
                }
                case "nie" -> {
                    confirmPurchase = false;
                    purchase = false;
                }
                default -> System.out.println("Nie podano żadnej, albo podano błędną wartość.");
            }
        }
    }
    public static void NotEnought(){
        System.out.println("\n*Nie masz dość złotych monet!*\n");
        buy = false;
        purchase = false;
    }

}
