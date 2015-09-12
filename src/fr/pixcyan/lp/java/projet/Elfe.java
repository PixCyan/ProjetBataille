/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pixcyan.lp.java.projet;

/**
 * @author raffennn
 */
public class Elfe extends Guerrier {
    private String type = "Elfe";
    private int degat = 2;
    private int cout = super.getCout()*2;
    private int armure = 1;

    public Elfe() {
        super();
    }

    /**
     * Définit la valeur du coup porté par un guerrier
     * @return
     */
    public void frapper(Guerrier guerrier) {
        super.frapper(guerrier);
    }

    /**
     * Change les PV du guerrier en fonction des dégats reçus et de son armure
     * @param nbDegat
     */
    @Override
    public void degatsReçus(int nbDegat) {
        super.degatsReçus(nbDegat / this.armure);
    }


    //-------------- Setters / Getters --------------//

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    @Override
    public int getForce() {
        return super.getForce()*this.degat;
    }

    /**
     * @return the degat
     */
    public int getDegat() {
        return degat;
    }

    /**
     * @param degat the degat to set
     */
    public void setDegat(int degat) {
        this.degat = degat;
    }

    /**
     * @return the cout
     */
    public int getCout() {
        return cout;
    }

    /**
     * @param cout the cout to set
     */
    public void setCout(int cout) {
        this.cout = cout;
    }

}
