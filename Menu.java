package pl.chwilaprogramowaniadladebila;

import java.util.Scanner;

import static java.lang.System.in;
import static pl.chwilaprogramowaniadladebila.DogEnemy.*;
import static pl.chwilaprogramowaniadladebila.Main.game;

public class Menu {
    static Scanner scanner = new Scanner(in);
    static boolean wannaplay = true;
    static boolean wasGiven = true;
    static boolean story = true;
    static boolean wannaFight = true;
    static int choice;
    public static void StartingMenu(){
        while (wannaplay) {
            System.out.println("Witaj w Gladiator Dogs! \n----------------------------------- \nCzy chcesz rozpocząć swoją przygodę? (tak/nie)");
            String Start = scanner.nextLine();
            switch (Start) {
                case "tak" -> wannaplay = false;
                case "nie" -> {
                    wannaplay = false;
                    System.out.println("\nGame Over!");
                }
                default -> System.out.println("\nMusisz napisać 'tak' albo 'nie'!\n");
            }
        }
    }


    public static void Welcome(){
        while (wasGiven) {
                System.out.println("Podaj imię twojego wojownika:");
                DogHero.name = scanner.nextLine();
                if (!DogHero.name.isEmpty()) {
                    wasGiven = false;
                } else {
                    System.out.println("Nie podano imienia!\n");
                }
        }
    }
    public static void Story(){
        while (story) {
            System.out.println("\nWabisz się " + DogHero.name + " \nGdy miałeś dwa miesiące, zostałeś uprowadzony podczas spaceru" +
                    " ze swojej rodziny i twojego właściciela i przyjaciela Tonnego.\n" +
                    "Po podaniu ci mutagenu, zdobyłeś niezwykłe mocy, które musisz wykorzystać, aby tu przeżyć.\n" +
                    "Pokonaj szefa porywaczy psów, aby móc wrócić do swojej rodziny.\nPamiętaj, że śmierć w walce z potężnymi przeciwnikami oznacza Perma Death!\n\n 'Kliknij jakiś przycisk!'");
            scanner.nextLine();
            System.out.println("Aby rozpocząć swoją historię musisz mądrze (lub nie) rozdać swoje umiejętności!\n\n 'Kliknij jakiś przycisk!'");
            scanner.nextLine();
            story = false;
        }
    }

    public static void ChooseMenu() throws InterruptedException {

            System.out.println("\nGdzie chcesz się udać?\n1. Walka na Arenie" + "\n2. Staw czoło bosowi" + "\n3. Sklep\n4. Statystyki\nMasz " + DogHero.gold + " złotych monet");
            choice = scanner.nextInt();
            System.out.println("*Trwa spacer*");
            Thread.sleep(1500);
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    DrawStats();
                    Description();
                    Agree();
                }
                case 2 -> {
                    BossFight.BossFighting();
                }
                case 3 -> {
                    Shop.Shopping();
                    Shop.shopping = true;
                }
                case 4 -> DogHero.Stats();
                default -> System.out.println("Nie podano żadnej, albo podano błędną wartość.");
            }
    }

    public static void Agree() throws InterruptedException {
        drawName = true;
        while(wannaFight) {
            System.out.println("\nChcesz zawalczyć z " + enemyName + "? tak/nie");
            String choose = scanner.nextLine();
            switch (choose) {
                case "tak" -> {
                    wannaFight = false;
                    Fight.fight = true;
                    Fight.FightAgainstEnemy();
                }
                case "nie" -> {
                    wannaFight = false;
                }
                default -> System.out.println("Nie podano żadnej, albo podano błędną wartość.");

            }
        }
        wannaFight = true;
    }

    public static void Description(){
        System.out.println("\n" + DogHero.name + "\nlvl: " + DogHero.lvl + "\nSiła: " + DogHero.damage +
                "\nStamina: " + DogHero.stamina + "\nPunkty życia: " + DogHero.hp + "\n");
        System.out.println(enemyName + "\nlvl: " + enemylvl + "\nSiła: " + enemyDamage + "\nStamina: " + enemyStamina + "\nPunkty życia: " + enemyHp);
    }
}
