/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pixcyan.lp.java.projet;

/**
 * @author raffennn
 */
public abstract class Guerrier {
    private String type = "Guerrier";
    private int force = 10;
    private int pv = 100;
    private int cout = 1;

    /**
     * Définit la valeur du coup porté par un guerrier
     *
     * @param guerrier le guerrier à frapper
     */
    public void frapper(Guerrier guerrier) {
        De de = new De();
        int somme = de.lancerMultiples(this.getForce());
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
        this.setPv(this.getPv() - nbDegat);
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

    //-------------- Setters / Getters --------------//

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
     * @param force the force to set
     */
    public void setForce(int force) {
        this.force = force;
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

    /**
     * @param cout the cout to set
     */
    public void setCout(int cout) {
        this.cout = cout;
    }
}
