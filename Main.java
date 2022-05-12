package pl.chwilaprogramowaniadladebila;

import static pl.chwilaprogramowaniadladebila.Menu.*;
import static pl.chwilaprogramowaniadladebila.Upgrade.UpgradeHero;

public class Main {

    public static boolean game = true;

    public static void main(String[] args) throws InterruptedException {
        while(game){
            StartingMenu();
            Welcome();
            Story();
            UpgradeHero();
            ChooseMenu();
        }
    }

}
