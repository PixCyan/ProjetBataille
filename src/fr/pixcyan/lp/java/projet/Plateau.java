package fr.pixcyan.lp.java.projet;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Permet de créer un plateau avec un nombre de carreau défini
 * Created by raffennn on 21/09/15.
 */
public class Plateau {
    private static final int NB_CARREAUX = 5;
    private LinkedList<Guerrier> listeTemp;
    private Carreau[] carreaux;
    private int nbCarreaux = 0;

    public Plateau() {
        this.listeTemp = new LinkedList<>();
        this.carreaux = new Carreau[NB_CARREAUX];
        this.ajouterCarreauMultiples(NB_CARREAUX);
    }

    /**
     * Place un guerrier sur le carreau de départ selon la couleur du chateau dont il fait parti
     * @param guerrier
     * @param couleur
     */
    public void placerGuerrier(Guerrier guerrier, Couleurs couleur) {
        if(couleur == Couleurs.Bleu) {
            this.carreaux[0].ajouterGuerrier(guerrier, couleur);
        } else {
            this.carreaux[4].ajouterGuerrier(guerrier, couleur);
        }
    }

    /**
     * Ajoute un nouveau carreau au plateau
     */
    public void ajouterUnCarreau(int nbCarreau) {
        Carreau carreau = new Carreau(nbCarreau);
        carreaux[carreau.getNumeroDeLaCase()] = carreau;
        this.nbCarreaux++;
    }

    /**
     * Ajout de carreaux multiples
     */
    public void ajouterCarreauMultiples(int nbCases) {
        for(int i = 0; i < nbCases; i++) {
            this.ajouterUnCarreau(i);
        }
    }

    //TODO : déplacement
    /**
     * Fait se déplacer les guerriers sur le plateau
     */
    public void avancerLesUnites() {
        this.listeTemp.clear();
        //déplacer les unités Rouge en parcourant le plateau depuis la case de départ ennemi :
        for(int i = 0; i < 5; i++) {
            //si la case contient des guerriers rouge
            if(!this.carreaux[i].getListeRouge().isEmpty()) {
                //récupération de la liste des guerriers :
                this.listeTemp.addAll(this.carreaux[i].getListeRouge());
                //ajout des guerriers dans la case i-1
                this.carreaux[i-1].getListeRouge().addAll(this.listeTemp);
                //efface la liste rouge du carreau actuel et la liste temporaire
                this.carreaux[i].getListeRouge().clear();
                this.listeTemp.clear();
            }
        }
        //déplacer les unités Bleu en parcourant le plateau depuis la case de départ ennemi :
        for(int i = 4; i >= 0; i--) {
            //si la case contient des guerriers rouge
            if(!this.carreaux[i].getListeBleu().isEmpty()) {
                //récupération de la liste des guerriers :
                this.listeTemp.addAll(this.carreaux[i].getListeBleu());
                //ajout des guerriers dans la case i+1
                this.carreaux[i+1].getListeBleu().addAll(this.listeTemp);
                //efface la liste rouge du carreau actuel et la liste temporaire
                this.carreaux[i].getListeBleu().clear();
                this.listeTemp.clear();
            }
        }
    }

    /**
     * Affiche les informations sur les carreaux (numéro de chaque carreau) que le plateau contient
     */
    public void afficheCarreauxDuPlateau() {
        for(Carreau carreau:this.carreaux) {
            System.out.println("Numéro de case : " + carreau.getNumeroDeLaCase());
        }
    }

    //-------------- Setters / Getters --------------//


    public Carreau[] getCarreaux() {
        return carreaux;
    }

    public int getNbCarreaux() {
        return nbCarreaux;
    }

    public void setCarreaux(Carreau[] carreaux) {
        this.carreaux = carreaux;
    }

    public void setNbCarreaux(int nbCarreaux) {
        this.nbCarreaux = nbCarreaux;
    }
}
