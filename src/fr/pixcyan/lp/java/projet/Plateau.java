package fr.pixcyan.lp.java.projet;

import java.util.HashMap;

/**
 * Created by raffennn on 21/09/15.
 */
public class Plateau {
    //addAll pour copier une liste dans une autre sinon le clear effacera car pointe dessus

    //HashMap pour ranger les carreaux avec comme clé leur numéro
    private HashMap<Integer, Carreau> carreaux;
    private int nbCarreaux = 0;

    public Plateau() {
        this.carreaux = new HashMap<>();
    }

    /**
     * Ajoute un nouveau carreau au plateau
     */
    public void ajouterUnCarreau() {
        Carreau carreau = new Carreau(this.nbCarreaux++);
        carreaux.put(carreau.getNumeroDeLaCase(), carreau);
        this.nbCarreaux++;
    }

    /**
     * Ajout de carreaux multiples
     */
    public void ajouterCarreauMultiples(int nbCases) {
        for(int i = 0; i < nbCases; i++) {
            this.ajouterUnCarreau();
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
