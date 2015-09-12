package fr.pixcyan.lp.java.projet;

import java.util.Scanner;

/**
 * Created by raffennn on 11/09/15.
 */


//TODO
public class Menu {
    private Partie partie;
    public void MenuPrincipal(Partie partie) {
        this.partie = partie;
        Scanner scanner = new Scanner(System.in);
        int entree = 0;
        do {
            System.out.println("---------------- Menu ----------------");
            System.out.println("|                                    |");
            System.out.println("|        1) Lancer la partie         |");
            System.out.println("|        2) Quitter                  |");
            System.out.println("|                                    |");
            System.out.println("--------------------------------------");
            entree = scanner.nextInt();
            switch (entree){
                case 1 : {
                    this.MenuRouge();
                    //partie.lancerPartie();
                    break;
                }
                default: {
                    break ;
                }
            }
        } while (entree != 2);
    }

    public void MenuBleu() {
        Scanner scanner = new Scanner(System.in);
        int entree = 0;
        do {
            System.out.println("               |-|--|-|               ");
            System.out.println("|-|-|-|-|      |  ==  |      |-|-|-|-|");
            System.out.println("|       |______| Menu |______|       |");
            System.out.println("|       |     Château Bleu   |       |");
            System.out.println("|                                    |");
            System.out.println("|       1) Entrainer des unités      |");
            System.out.println("|       2) Passer le tour            |");
            System.out.println("|                                    |");
            System.out.println("~~~~~~~~~~~~~~~~|====|~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~|====|~~~~~~~~~~~~~~~~");
            entree = scanner.nextInt();
            switch (entree) {
                case 1: {
                    partie.getChateauBleu().creerGuerriers();
                    break;
                }
                default: {
                    break;
                }
            }
        } while (entree != 2);
    }

    public void MenuRouge() {
        Scanner scanner = new Scanner(System.in);
        int entree = 0;
        do {
            System.out.println("               |-|--|-|               ");
            System.out.println("|-|-|-|-|      |  ==  |      |-|-|-|-|");
            System.out.println("|       |______| Menu |______|       |");
            System.out.println("|       |    Château Rouge   |       |");
            System.out.println("|                                    |");
            System.out.println("|       1) Entrainer des unités      |");
            System.out.println("|       2) Passer le tour            |");
            System.out.println("|                                    |");
            System.out.println("~~~~~~~~~~~~~~~~|====|~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~|====|~~~~~~~~~~~~~~~~");
            entree = scanner.nextInt();
            switch (entree) {
                case 1: {
                    this.entrainement();
                    //partie.getChateauRouge().creerGuerriers();
                    break;
                }
                default: {
                    break;
                }
            }
        } while (entree != 2);
    }

    public void entrainement() {
        Scanner scanner = new Scanner(System.in);
        int entree = 0;
        do {
            System.out.println("               |-|--|-|               ");
            System.out.println("|-|-|-|-|      |  ==  |      |-|-|-|-|");
            System.out.println("|       |______| Menu |______|       |");
            System.out.println("|       |                    |       |");
            System.out.println("|      Ressources acteuelles : " + partie.getChateauBleu().getRessources() + "     |");
            System.out.println("|                               Cout |");
            System.out.println("|       1) Créer un nain          1  |");
            System.out.println("|       2) Créer un elfe          2  |");
            System.out.println("|       2) Créer un chef nain     3  |");
            System.out.println("|       2) Créer un chef elfe     4  |");
            System.out.println("|                                    |");
            System.out.println("~~~~~~~~~~~~~~~~|====|~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~|====|~~~~~~~~~~~~~~~~");
            entree = scanner.nextInt();
            switch (entree) {
                case 1: {
                    partie.getChateauRouge().creerGuerriers();
                    break;
                }
                default: {
                    break;
                }
            }
        } while (entree != 2);
    }
}
