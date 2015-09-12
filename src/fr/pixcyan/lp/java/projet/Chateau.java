package fr.pixcyan.lp.java.projet;

import java.util.LinkedList;

/**
 * La classe Chateau gère les fonctions des châteaux
 * @author PixCyan
 */
public class Chateau {
    private LinkedList<Guerrier> listeGuerriers;
    private int ressources = 3;
    private Menu menu = new Menu();

    public Chateau() {
        this.listeGuerriers = new LinkedList<>();
    }

    /**
     * Renvoie au menu de création d'unité avec les ressources actuelles disponibles
     */
    public void creerGuerriers() {
        menu.entrainement(this);
    }

    /**
     * Ajoute un nouveau guerrier nain au chateau si les ressources sont suffisantes
     */
    public void creerUnNain(){
        Nain nain = new Nain();
        if (nain.getCout() < this.ressources || nain.getCout() == this.ressources) {
           this.listeGuerriers.add(nain);
            this.ressources = this.ressources - nain.getCout();
        } else {
            System.out.println("Il n'y a pas assez de ressources au château pour créer cette unité !");
        }
    }

    /**
     * Ajoute un nouveau guerrier chef nain au chateau si les ressources sont suffisantes
     */
    public void creerChefNain(){
        ChefNain nain = new ChefNain();
        if (nain.getCout() < this.ressources || nain.getCout() == this.ressources) {
            this.listeGuerriers.add(nain);
            this.ressources = this.ressources - nain.getCout();
        } else {
            System.out.println("Il n'y a pas assez de ressources au château pour créer cette unité !");
        }
    }

    /**
     * Ajoute un nouveau guerrier elfe au chateau si les ressources sont suffisantes
     */
    public void creerUnElfe(){
        Elfe elfe = new Elfe();
        if (elfe.getCout() < this.ressources || elfe.getCout() == this.ressources) {
            this.listeGuerriers.add(elfe);
            this.ressources = this.ressources - elfe.getCout();
        } else {
            System.out.println("Il n'y a pas assez de ressources au château pour créer cette unité !");
        }
    }

    /**
     * Ajoute un nouveau guerrier chef elfe au chateau si les ressources sont suffisantes
     */
    public void creerChefElfe(){
        ChefElfe elfe = new ChefElfe();
        if (elfe.getCout() < this.ressources || elfe.getCout() == this.ressources) {
            this.listeGuerriers.add(elfe);
            this.ressources = this.ressources - elfe.getCout();
        } else {
            System.out.println("Il n'y a pas assez de ressources au château pour créer cette unité !");
        }
    }

    public void nettoyerLaListe() {
        this.listeGuerriers.clear();
    }

    //-------------- Setters / Getters --------------//
    public void setRessources(int ressources) {
        this.ressources = ressources;
    }

    public int getRessources() {
        return ressources;
    }

    public LinkedList<Guerrier> getListeGuerriers() {
        return listeGuerriers;
    }

    public void setListeGuerriers(LinkedList<Guerrier> listeGuerriers) {
        this.listeGuerriers = listeGuerriers;
    }
}
