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
    private int value = 3;
    private int resDe = 0;

    public De() {
        this.resDe = lancerDe();
    }

    /**
     * Effectue un seul lancé de dé
     * @return le résultat du lancé
     */
    public int lancerDe() {
        return random.nextInt(value);
    }

    /**
     * Récupère les valeurs de chaque lancé selon le nombre de lancé passé en paramètre
     * @param nbLancer
     * @return somme la somme de tous les lancés
     */
    public int lancerMultiples(int nbLancer){
        int somme = 0;
        while (nbLancer != 0) {
            //somme
            somme = somme + this.lancerDe()+1;
            nbLancer--;
        }
        return somme;
    }

    /**
     *
     * @return resDe le resultat du dé
     */
    public int getResDe(){
        return this.resDe;
    }
}
