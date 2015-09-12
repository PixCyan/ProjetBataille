/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pixcyan.lp.java.projet;

import java.util.LinkedList;
import java.util.Map;

/**
 * @author raffennn
 */
public class LaBatailleDeFaerun {

    public static void main(String[] args) {
        Partie partie = new Partie();
        Menu menu = new Menu();
        menu.MenuPrincipal(partie);
    }

    public static void unitesDesChateaux(Menu menu) {
        menu.MenuRouge();
        menu.MenuBleu();
    }

}
