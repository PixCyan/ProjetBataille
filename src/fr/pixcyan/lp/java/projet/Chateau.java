package fr.pixcyan.lp.java.projet;

import java.util.LinkedList;

/**
 * La classe Chateau gère les fonctions des châteaux
 * @author PixCyan
 */
public class Chateau {
    private LinkedList<Guerrier> listeGuerriers;
    private int ressources = 3;

    public Chateau() {
        this.listeGuerriers = new LinkedList<>();
    }

    public void creerGuerriers() {

    }


    //-------------- Setters / Getters --------------//
    public void setRessources(int ressources) {
        this.ressources = ressources;
    }

    public int getRessources() {
        return ressources;
    }
}
