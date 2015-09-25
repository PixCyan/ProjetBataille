package fr.pixcyan.lp.java.projet;

import java.util.LinkedList;

/**
 * La classe Partie gère le fonctionnement de la partie
 * @author PixCyan
 */
public class Partie {
    private LinkedList<Guerrier> listeGuerriersRouge;
    private LinkedList<Guerrier> listeGuerriersBleu;
    private Chateau chateauRouge;
    private Chateau chateauBleu;
    private Plateau plateau;
    private Menu menu;
    private static int tour = 0;

    public Partie(Menu menu) {
        this.chateauBleu = new Chateau(Couleurs.Bleu);
        this.chateauRouge = new Chateau(Couleurs.Rouge);
        this.listeGuerriersBleu = new LinkedList<>();
        this.listeGuerriersRouge = new LinkedList<>();
        this.menu = menu;
        this.plateau = new Plateau();
    }

    /**
     * Lance une nouvelle partie
     */
    public void lancerPartie() {
        if(this.chateauRouge.getListeDattente().isEmpty() && this.chateauBleu.getListeDattente().isEmpty()) {
            System.out.println("Vous n'avez pas entrainé des unités dans les deux chateaux !");
            this.menu.MenuChateau();
        } else {
            //sortir les unités si possibles :
            this.chateauBleu.sortirGuerrier();
            this.chateauRouge.sortirGuerrier();
            //Récupération des listes de guerriers qui sont sortis des chateaux :
            this.majListe();
            //lance le premier tour :
            System.out.println("Les premières unités ont été créées ou attendent d'avoir suffisammentr de ressources. \n Lancez le premier tour.");
            this.menu.jeu();
        }
    }

    /**
     * Permet de passer au tour de jeu suivant
     */
    public void nouveauTour() {
        tour++;
        System.out.println("------------------ Tour : " + tour + " ------------------");
        this.majListe();
        Couleurs couleur = this.gagnerDirect();
        if(couleur == Couleurs.Noir) {
            //Ajout des ressources au chateau :
            this.chateauBleu.setRessources(this.chateauBleu.getRessources() + 1);
            this.chateauRouge.setRessources(this.chateauRouge.getRessources() + 1);
            //Affichage du nombre de guerriers présent au combat :
            this.chateauBleu.afficherArmee();
            this.chateauRouge.afficherArmee();
            //Sortir des guerriers si possible :
            this.placerGuerriers();
            //Avancer les unités :
            this.plateau.avancerLesUnites();
            //Lancement bataille si rencontre :
            this.plateau.verifRencontreGuerrier(this.getChateauBleu(), this.getChateauRouge());
            couleur = this.plateau.gagner();
            if(couleur != Couleurs.Noir) {
                System.out.println("Le Chateau : " + couleur + " a gagné !");
            }
        } else {
            System.out.println("Le Chateau : " + couleur + " a gagné !");
        }
    }

    /**
     * Méthode de test entre deux guerriers
     * Fait se battre deux guerriers
     *
     * @param guerrrier1 le guerrier qui va se battre contre guerrier2
     * @param guerrier2 le guerrier qui va se battre contre guerrier1
     */
    public void seBattre(Guerrier guerrrier1, Guerrier guerrier2) {
        int tour = 0;
        while (!guerrrier1.estMort() && !guerrier2.estMort()) {
            System.out.println("------------------ Tour : " + tour + " ------------------");
            guerrier2.frapper(guerrrier1);
            System.out.println(guerrier2.getType() + " attaque : ");
            System.out.println("Elfe : " + guerrier2.getPv());
            System.out.println("Nain : " + guerrrier1.getPv() + "\n");

            guerrrier1.frapper(guerrier2);
            System.out.println(guerrrier1.getType() + " attaque : ");
            System.out.println("Elfe : " + guerrier2.getPv());
            System.out.println("Nain : " + guerrrier1.getPv() + "\n");
            tour++;
        }
        if (guerrrier1.estMort()) {
            System.out.println(guerrrier1.getType() + " est mort !");
        } else if (guerrier2.estMort()) {
            System.out.println(guerrier2.getType() + " est mort !");
        }
    }

    /**
     * Parcours les listes pour placer les guerriers sur leur carreau de départ
     */
    public void placerGuerriers() {
        for (Guerrier guerrier : listeGuerriersBleu) {
            this.plateau.placerGuerrier(this.listeGuerriersBleu.getFirst(), this.chateauBleu.getCouleur());
            this.listeGuerriersBleu.remove(this.listeGuerriersBleu.getFirst());
        }
        for(Guerrier guerrier : listeGuerriersRouge) {
            this.plateau.placerGuerrier(this.listeGuerriersRouge.getFirst(), this.chateauRouge.getCouleur());
            this.listeGuerriersRouge.remove(this.listeGuerriersRouge.getFirst());
        }
    }

    /**
     * Met à jour les listes des guerriers au combat
     */
    public void majListe() {
        this.listeGuerriersBleu.addAll(this.chateauBleu.getListeGuerriers()) ;
        this.listeGuerriersRouge.addAll(this.chateauRouge.getListeGuerriers());
    }

    /**
     * Remet les listes vides pour une nouvelle partie
     */
    public void nettoyerLesListes() {
        if(!this.listeGuerriersBleu.isEmpty() && !this.listeGuerriersRouge.isEmpty()) {
            this.listeGuerriersBleu.clear();
            this.listeGuerriersRouge.clear();
            this.chateauBleu.nettoyerLaListe();
            this.chateauRouge.nettoyerLaListe();
        }
    }

    /**
     *Un chateau gagne quand son ennemi n'a plus de guerrier en jeu ou en attente
     * @return couleur
     */
    public Couleurs gagnerDirect() {
        //Si les listes d'un des chateaux sont vides alors il n'a plus de guerrier au combat et en liste d'attente
        //le chateau ennemi est vainqueur
        Couleurs couleur = Couleurs.Noir;
        if (this.chateauBleu.getListeGuerriers().isEmpty() && this.chateauBleu.getListeDattente().isEmpty()) {
            couleur = this.chateauBleu.getCouleur();
        }
        if(this.chateauRouge.getListeGuerriers().isEmpty() && this.chateauRouge.getListeDattente().isEmpty()) {
            couleur = this.chateauRouge.getCouleur();
        }
        return couleur;
    }

    //-------------- Setters / Getters --------------//

    public Chateau getChateauRouge() {
        return chateauRouge;
    }

    public Chateau getChateauBleu() {
        return chateauBleu;
    }

    public void setChateauRouge(Chateau chateauRouge) {
        this.chateauRouge = chateauRouge;
    }

    public void setChateauBleu(Chateau chateauBleu) {
        this.chateauBleu = chateauBleu;
    }
}
