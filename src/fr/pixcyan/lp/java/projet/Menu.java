package fr.pixcyan.lp.java.projet;

import java.util.Scanner;

/**
 * La classe Menu gère l'ensemble des menus contenant les différentes options auquelles ont accès les utilisateurs
 * @author PixCyan
 */


//TODO Le menu est incomplet !
public class Menu {
    private Partie partie;

    public void MenuPrincipal(Partie partie) {
        this.partie = partie;
        Scanner scanner = new Scanner(System.in);
        int entree = 0;
        do {
            System.out.println("               |-|--|-|               ");
            System.out.println("|-|-|-|-|      |  ==  |      |-|-|-|-|");
            System.out.println("|       |______| Menu |______|       |");
            System.out.println("|       |                    |       |");
            System.out.println("|                                    |");
            System.out.println("|        1) Nouvelle partie          |");
            System.out.println("|        2) Quitter                  |");
            System.out.println("|                                    |");
            System.out.println("~~~~~~~~~~~~~~~~|====|~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~|====|~~~~~~~~~~~~~~~~");
            entree = scanner.nextInt();
            switch (entree) {
                case 1:
                    this.MenuChateau();
                    //partie.lancerPartie();
                    break;
                default:
                    break;
            }
        } while (entree != 2);
    }

    public void MenuChateau() {
        Scanner scanner = new Scanner(System.in);
        int entree = 0;
        do {
            System.out.println("               |-|--|-|                                        |-|--|-|               ");
            System.out.println("|-|-|-|-|      |  ==  |      |-|-|-|-|          |-|-|-|-|      |  ==  |      |-|-|-|-|");
            System.out.println("|       |______| Menu |______|       |          |       |______| Menu |______|       |");
            System.out.println("|       |     Château Bleu   |       |          |       |    Château Rouge   |       |");
            System.out.println("|                                    |          |                                    |");
            System.out.println("|       1) Entrainer des unités      |          |       2) Entrainer des unités      |");
            System.out.println("|                                    |          |                                    |");
            System.out.println("|                                    |          |                                    |");
            System.out.println("~~~~~~~~~~~~~~~~|====|~~~~~~~~~~~~~~~~          ~~~~~~~~~~~~~~~~|====|~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~|====|~~~~~~~~~~~~~~~~          ~~~~~~~~~~~~~~~~|====|~~~~~~~~~~~~~~~~");
            System.out.println("                                                                                      ");
            System.out.println("                             3) Lancer la partie                                      ");
            System.out.println("                             4) Retour au menu Principal                              ");
            entree = scanner.nextInt();
            switch (entree) {
                case 1:
                    partie.getChateauBleu().creerGuerriers();
                    break;
                case 2:
                    partie.getChateauRouge().creerGuerriers();
                    break;
                case 3:
                    partie.lancerPartie();
                    break;
                default:
                    break;

            }
        } while (entree != 3 && entree !=4);
    }

    public void MenuChateauEnJeu() {
        Scanner scanner = new Scanner(System.in);
        int entree = 0;
        do {
            System.out.println("               |-|--|-|                                        |-|--|-|               ");
            System.out.println("|-|-|-|-|      |  ==  |      |-|-|-|-|          |-|-|-|-|      |  ==  |      |-|-|-|-|");
            System.out.println("|       |______| Menu |______|       |          |       |______| Menu |______|       |");
            System.out.println("|       |     Château Bleu   |       |          |       |    Château Rouge   |       |");
            System.out.println("|                                    |          |                                    |");
            System.out.println("|       1) Entrainer des unités      |          |       2) Entrainer des unités      |");
            System.out.println("|                                    |          |                                    |");
            System.out.println("|                                    |          |                                    |");
            System.out.println("~~~~~~~~~~~~~~~~|====|~~~~~~~~~~~~~~~~          ~~~~~~~~~~~~~~~~|====|~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~|====|~~~~~~~~~~~~~~~~          ~~~~~~~~~~~~~~~~|====|~~~~~~~~~~~~~~~~");
            System.out.println("                                                                                      ");
            System.out.println("                                   3) Lancer le tour suivant                          ");
            System.out.println("                                   4) Quitter la partie                               ");
            entree = scanner.nextInt();
            switch (entree) {
                case 1:
                    partie.getChateauBleu().creerGuerriers();
                    break;
                case 2:
                    partie.getChateauRouge().creerGuerriers();
                    break;
                case 3:
                    partie.nouveauTour();
                    break;
                default:
                    break;
            }
        } while (entree != 4 && entree !=3);
    }

    public void entrainement(Chateau chateau) {
        Scanner scanner = new Scanner(System.in);
        int entree = 0;
        do {
            System.out.println("               |-|--|-|               ");
            System.out.println("|-|-|-|-|      |  ==  |      |-|-|-|-|");
            System.out.println("|       |______| Menu |______|       |");
            System.out.println("|       |                    |       |");
            System.out.println("|      Ressources acteuelles : " + chateau.getRessources() + "     |");
            System.out.println("|                               Cout |");
            System.out.println("|       1) Créer un nain          1  |");
            System.out.println("|       2) Créer un elfe          2  |");
            System.out.println("|       3) Créer un chef nain     3  |");
            System.out.println("|       4) Créer un chef elfe     4  |");
            System.out.println("|                                    |");
            System.out.println("~~~~~~~~~~~~~~~~|====|~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~|====|~~~~~~~~~~~~~~~~");
            System.out.println("                                      ");
            System.out.println("        5) Retour au menu des chateaux");
            entree = scanner.nextInt();
            switch (entree) {
                case 1:
                    chateau.creerUnNain();
                    break;
                case 2:
                    chateau.creerUnElfe();
                    break;
                case 3:
                    chateau.creerChefNain();
                    break;
                case 4:
                    chateau.creerChefElfe();
                default:
                    break;
            }
        } while (entree != 5);
    }
}
