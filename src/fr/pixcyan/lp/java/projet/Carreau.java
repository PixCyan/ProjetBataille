package fr.pixcyan.lp.java.projet;

import java.util.LinkedList;

/**
 * Created by raffennn on 21/09/15.
 */
public class Carreau {
    private LinkedList<Guerrier> listeRouge;
    private LinkedList<Guerrier> listeBleu;
    private int numeroDeLaCase;

    public Carreau(int numeroDeLaCase) {
        this.listeBleu = new LinkedList<>();
        this.listeRouge = new LinkedList<>();
        this.numeroDeLaCase = numeroDeLaCase;
    }


    //-------------- Setters / Getters --------------//


    public int getNumeroDeLaCase() {
        return numeroDeLaCase;
    }

    public LinkedList<Guerrier> getListeRouge() {
        return listeRouge;
    }

    public LinkedList<Guerrier> getListeBleu() {
        return listeBleu;
    }

    public void setListeRouge(LinkedList<Guerrier> listeRouge) {
        this.listeRouge = listeRouge;
    }

    public void setListeBleu(LinkedList<Guerrier> listeBleu) {
        this.listeBleu = listeBleu;
    }

    public void setNumeroDeLaCase(int numeroDeLaCase) {
        this.numeroDeLaCase = numeroDeLaCase;
    }
}
