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

    /**
     * Fait se battre les guerriers des deux camps s'ils se rencontrent sur un même carreau
     */
    public void batailleArmée(Chateau chBleu, Chateau chRouge) {
        if(!this.listeBleu.isEmpty() && !this.listeRouge.isEmpty()) {
            System.out.println("Guerrier(s) bleu sur ce carreau : " + this.listeBleu.size() +
                    ". \nGuerrier(s) rouge sur ce carreau : " + this.getListeRouge().size() +
                    ".\nLe combat est engagé ! \n");
            int compte = 0;
            int nbGuerriers = this.getListeBleu().size() + this.getListeRouge().size();
            while(compte != nbGuerriers) {
                if(!this.listeRouge.isEmpty() && !this.listeBleu.isEmpty()) {
                    //Tour des bleus :
                    System.out.println("---- Tour bleus ----");
                    for (int i = 0; i < this.listeBleu.size(); i++) {
                        Guerrier guerrier = this.listeRouge.getFirst();
                        this.afficherBataille(this.getListeBleu().get(i), guerrier);
                        //this.listeBleu.get(i).frapper(guerrier);
                        if (guerrier.estMort()) {
                            this.listeRouge.remove(guerrier);
                            chRouge.getListeGuerriers().remove(guerrier);
                        }
                        compte++;
                    }
                }
                if (!this.listeRouge.isEmpty() && !this.listeBleu.isEmpty()) {
                    //Tour des rouges :
                    System.out.println("---- Tour rouges ----");
                    for(int i = 0; i < this.listeRouge.size(); i++) {
                        Guerrier guerrier = this.listeBleu.getFirst();
                        this.afficherBataille(this.getListeRouge().get(i), guerrier);
                        //this.listeRouge.get(i).frapper(guerrier);
                        if(guerrier.estMort()) {
                            this.listeBleu.remove(guerrier);
                            chBleu.getListeGuerriers().remove(guerrier);
                        }
                        compte++;
                    }
                }
                compte = nbGuerriers;
            }
        }
    }


    public void afficherBataille(Guerrier guerrier1, Guerrier guerrier2) {
        guerrier1.frapper(guerrier2);
        System.out.println(guerrier1.getType() + " attaque " + guerrier2.getType());
        System.out.println(guerrier2.getType() + " PV : " + guerrier2.getPv());
        System.out.println(guerrier1.getType() + " PV : " + guerrier1.getPv() + "\n");
    }

    public void afficheGuerriersSurCarreau() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Carreau " + this.getNumeroDeLaCase() + " ");
        if(!this.listeBleu.isEmpty()) {
            for(Guerrier guerrier: listeBleu) {
                System.out.println("Liste bleue : " + guerrier.getType());
            }
        }
        if(!this.listeRouge.isEmpty()) {
            for(Guerrier guerrier : listeRouge) {
                System.out.println("Liste rouge : " + guerrier.getType());
            }
        }
        System.out.println("-----------------------------------------------------------\n");
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
