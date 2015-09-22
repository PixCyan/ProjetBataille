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

    public Elfe() {
        this.setType("Elfe");
        this.setCout(this.getCout() * 2);
        this.setDegat(this.getDegat()*2);
        this.setForce(this.getForce() * this.getDegat()); //double les dégats portés
    }

}
