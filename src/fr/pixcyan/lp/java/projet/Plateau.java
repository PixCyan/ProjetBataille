package fr.pixcyan.lp.java.projet;

import java.util.HashMap;

/**
 * Permet de créer un plateau avec un nombre de carreau défini
 * Created by raffennn on 21/09/15.
 */
public class Plateau {
    //addAll pour copier une liste dans une autre sinon le clear effacera car pointe dessus
    private static final int NB_CARREAUX = 5;
    //HashMap pour ranger les carreaux avec comme clé leur numéro
    private HashMap<Integer, Carreau> carreaux;
    private int nbCarreaux = 0;

    public Plateau() {
        this.carreaux = new HashMap<>();
        this.ajouterCarreauMultiples(NB_CARREAUX);
    }

    /**
     * Ajoute un nouveau carreau au plateau
     */
    public void ajouterUnCarreau(int nbCarreau) {
        Carreau carreau = new Carreau(nbCarreau);
        carreaux.put(carreau.getNumeroDeLaCase(), carreau);
        this.nbCarreaux++;
    }

    /**
     * Ajout de carreaux multiples
     */
    public void ajouterCarreauMultiples(int nbCases) {
        for(int i = 0; i < nbCases; i++) {
            this.ajouterUnCarreau(i);
        }
        //this.afficheCarreaux();
    }

    /**
     * Affiche les informations sur les carreaux (numéro de chaque carreau) que le plateau contient
     */
    public void afficheCarreauxDuPlateau() {
        for(Carreau carreau:this.carreaux.values()) {
            System.out.println("Numéro de case : " + carreau.getNumeroDeLaCase());
        }
    }

    //-------------- Setters / Getters --------------//

    public HashMap<Integer, Carreau> getCarreaux() {
        return carreaux;
    }

    public int getNbCarreaux() {
        return nbCarreaux;
    }

    public void setCarreaux(HashMap<Integer, Carreau> carreaux) {
        this.carreaux = carreaux;
    }

    public void setNbCarreaux(int nbCarreaux) {
        this.nbCarreaux = nbCarreaux;
    }
}
