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
    private int cout = super.getCout() * 2;
    private int armure = 1;

    /**
     * Change les PV du guerrier en fonction des dégats reçus et de son armure
     *
     * @param nbDegat dégats portés par un ennemi et reçu par le guerrier
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
        return super.getForce() * this.degat;
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
