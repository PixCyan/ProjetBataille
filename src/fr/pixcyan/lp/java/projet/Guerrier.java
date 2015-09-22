/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pixcyan.lp.java.projet;

import javax.sound.midi.Soundbank;

/**
 * @author raffennn
 */
public abstract class Guerrier {
    //constantes
    private static final int VAL_FORCE = 10;
    private static final int VAL_COUT = 1;
    private static final int VAL_ARMURE = 1;
    private static final int VAL_DEGAT =1;
    private static final int VAL_PV = 100;

    //attributs
    private String type = "Guerrier";
    private int force = VAL_FORCE;
    private int cout = VAL_COUT;
    private int armure = VAL_ARMURE;
    private int degat = VAL_DEGAT;
    private int pv = VAL_PV;


    /**
     * Définit la valeur du coup porté par un guerrier
     *
     * @param guerrier le guerrier à frapper
     */
    public void frapper(Guerrier guerrier) {
        int somme = De.lancerMultiples(this.getForce());
        //Affiche les dégats avant la réduction de ceux-ci par les armures pour vérifier
        //que cette dernière est bien prises en compte pour une unité naine
        System.out.println("Degat : " + somme);
        //effectue le changement de PV sur l'unité qui reçoit le coups
        guerrier.degatsReçus(somme);
    }

    /**
     * Change les PV du guerrier en fonction des dégats reçus et de son armure
     *
     * @param nbDegat dégats portés par un ennemi et reçu par le guerrier
     */
    public void degatsReçus(int nbDegat) {
        this.setPv(this.getPv() - nbDegat/this.getArmure());
    }

    /**
     * Défini si le guerrier est mort
     *
     * @return true si les PV du guerrier sont à 0 ou en dessous
     */
    public boolean estMort() {
        boolean mort = false;
        //si le guerrier a 0 point de vie ou est passé en dessous de 0 lors du dernier coups porté il est considéré comme mort
        if (this.getPv() == 0 || this.getPv() < 0) {
            mort = true;
        }
        return mort;
    }

    /**
     * Affiche les informations d'un guerrier
     */
    public void afficheInfosGuerriers() {
        System.out.println("Type : " + this.getType());
        System.out.println("PV : " + this.getPv());
        System.out.println("Armure : " + this.getArmure());
        System.out.println("Force : " + this.getForce() + " (Force multiplié par dégat : " + this.getDegat() + ").");
        System.out.println("Cout unité : " + this.getCout());
    }

    //-------------- Setters / Getters --------------//


    public int getArmure() {
        return armure;
    }

    public int getDegat() {
        return degat;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @return the force
     */
    public int getForce() {
        return force;
    }

    /**
     * @return th cout
     */
    public int getCout() {
        return cout;
    }

    /**
     * @return the pv
     */
    public int getPv() {
        return pv;
    }

    /**
     * @param pv the pv to set
     */
    public void setPv(int pv) {
        this.pv = pv;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }

    public void setDegat(int degat) {
        this.degat = degat;
    }

    public void setArmure(int armure) {
        this.armure = armure;
    }
}
