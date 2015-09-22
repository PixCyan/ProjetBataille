/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pixcyan.lp.java.projet;

import java.util.Random;


/**
 * @author raffennn
 */
public class De {
    private static final Random random = new Random();
    private static final int value = 3;
    private int resDe = 0;

    public De() {
        this.resDe = lancerDe();
    }

    /**
     * Effectue un seul lancé de dé
     *
     * @return le résultat du lancé
     */
    public static int lancerDe() {
        return random.nextInt(value);
    }

    /**
     * Récupère les valeurs de chaque lancé selon le nombre de lancé passé en paramètre
     *
     * @param nbLancer le nombre de lancé de dé effectué par une unité
     * @return somme la somme de tous les lancés
     */
    public static int lancerMultiples(int nbLancer) {
        int somme = 0;
        while (nbLancer != 0) {
            //somme
            somme = somme + lancerDe() + 1;
            nbLancer--;
        }
        return somme;
    }

    /**
     * @return resDe le resultat du dé
     */
    public int getResDe() {
        return this.resDe;
    }
}
