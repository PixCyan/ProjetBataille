package fr.pixcyan.lp.java.projet;

import java.util.LinkedList;

/**
 * Permet d'ajouter et gérer les carreaux d'un plateau
 * Created by raffennn on 21/09/15.
 */
public class Carreau {
    private LinkedList<Guerrier> listeRouge;
    private LinkedList<Guerrier> listeBleu;
    private int numeroDeLaCase;

    public Carreau(int nbCarreau) {
        this.listeBleu = new LinkedList<>();
        this.listeRouge = new LinkedList<>();
        this.numeroDeLaCase = nbCarreau;
    }

    /**
     * Associé un guerrier à son carreau de départ
     * @param guerrier
     * @param couleur
     */
    public void ajouterGuerrier(Guerrier guerrier, Couleurs couleur) {
        if (couleur == Couleurs.Rouge) {
            listeRouge.add(guerrier);
        } else {
            listeBleu.add(guerrier);
        }
    }


    //TODO : bataille sur un carreau
    /**
     * Fait se battre les guerriers des deux camps s'ils se rencontrent sur un même carreau
     */
    public void batailleArmée() {

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
