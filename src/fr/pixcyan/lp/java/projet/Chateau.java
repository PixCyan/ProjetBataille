package fr.pixcyan.lp.java.projet;

import java.util.LinkedList;

/**
 * La classe Chateau gère les fonctions des châteaux
 * @author PixCyan
 */
public class Chateau {
    private Menu menu = new Menu();
    private LinkedList<Guerrier> listeGuerriers;
    private LinkedList<Guerrier> listeDattente;
    private int ressources = 3;
    private Couleurs couleur;

    public Chateau(Couleurs couleur) {
        this.couleur = couleur;
        this.listeGuerriers = new LinkedList<>();
        this.listeDattente = new LinkedList<>();
    }

    public void sortirGuerrier(){
        int ressources = this.getRessources();
        while(ressources != 0 && !this.listeDattente.isEmpty()) {
            Guerrier guerrier = listeDattente.getFirst();
            if(guerrier.getCout() <= ressources){
                System.out.println("Ressources = " + ressources +". Guerrier = " + guerrier.getCout() + " " + guerrier.getType());
                this.listeGuerriers.add(guerrier);
                this.listeDattente.remove(guerrier);
                this.ressources = this.ressources - guerrier.getCout();
                ressources = this.getRessources();
                System.out.println("Ajouter à la liste principal.");
            } else {
                System.out.println("Ressources = " + ressources +". Cout guerrier = " + guerrier.getCout());
                System.out.println("Reste dans la liste d'attente.");
                ressources = 0;
            }
        }
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
        this.listeDattente.add(nain);
    }

    /**
     * Ajoute un nouveau guerrier chef nain au chateau si les ressources sont suffisantes
     */
    public void creerChefNain(){
        ChefNain nain = new ChefNain();
        this.listeDattente.add(nain);
    }

    /**
     * Ajoute un nouveau guerrier elfe au chateau si les ressources sont suffisantes
     */
    public void creerUnElfe(){
        Elfe elfe = new Elfe();
        this.listeDattente.add(elfe);
    }

    /**
     * Ajoute un nouveau guerrier chef elfe au chateau si les ressources sont suffisantes
     */
    public void creerChefElfe(){
        ChefElfe elfe = new ChefElfe();
        this.listeDattente.add(elfe);
    }

    /**
     * Cette méthode sert à vider les listes
     */
    public void nettoyerLaListe() {
        this.listeGuerriers.clear();
        this.listeDattente.clear();
    }

    /**
     *Affiche le nombre de guerriers de l'armée
     */
    public void afficherArmee() {
        int nbGuerriers = 0;
        if (!this.listeGuerriers.isEmpty()) {
            for(Guerrier guerrier:this.listeGuerriers) {
                nbGuerriers++;
            }
            System.out.println("Chateau " + this.getCouleur() + " : " + nbGuerriers + " guerrier(s) dans votre armée (Au combat)!");
        } else {
            System.out.println("Chateau " + this.getCouleur() + " : " + "Aucun soldat dans votre armée !");
        }
    }

    //-------------- Setters / Getters --------------//

    public Couleurs getCouleur() {
        return couleur;
    }

    public void setRessources(int ressources) {
        this.ressources = ressources;
    }

    public int getRessources() {
        return ressources;
    }

    public LinkedList<Guerrier> getListeDattente() {
        return listeDattente;
    }

    public LinkedList<Guerrier> getListeGuerriers() {
        return listeGuerriers;
    }

    public void setListeGuerriers(LinkedList<Guerrier> listeGuerriers) {
        this.listeGuerriers = listeGuerriers;
    }

    public void setCouleur(Couleurs couleur) {
        this.couleur = couleur;
    }

    public void setListeDattente(LinkedList<Guerrier> listeDattente) {
        this.listeDattente = listeDattente;
    }
}
