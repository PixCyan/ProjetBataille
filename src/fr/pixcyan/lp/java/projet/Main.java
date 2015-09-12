/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pixcyan.lp.java.projet;

/**
 * Classe Main
 * @author raffennn
 */
public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Partie partie = new Partie(menu);
        menu.MenuPrincipal(partie);
    }

    public static void unitesDesChateaux(Menu menu) {
        menu.MenuChateau();
    }

}
