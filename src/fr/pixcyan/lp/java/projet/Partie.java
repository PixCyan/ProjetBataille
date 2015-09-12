package fr.pixcyan.lp.java.projet;

import java.util.LinkedList;

/**
 * Created by raffennn on 11/09/15.
 */
public class Partie {
    private LinkedList<Guerrier> listeGuerriersRouge = new LinkedList<>();
    private LinkedList<Guerrier> listeGuerriersBleu = new LinkedList<>();
    private Chateau chateauRouge = new Chateau();
    private Chateau chateauBleu = new Chateau();

    public void lancerPartie(Menu menu) {
        /**
        Nain nainTest = new Nain();
        Elfe elfeTest = new Elfe();
        ChefElfe chefElfeTest = new ChefElfe();
        ChefNain chefNainTest = new ChefNain();
        seBattre(chefNainTest, elfeTest);**/
    }

    /**
     * Fait se battre deux guerriers
     * @param guerrrier1
     * @param guerrier2
     */
    public void seBattre(Guerrier guerrrier1, Guerrier guerrier2){
        int tour = 0;
        while(!guerrrier1.estMort() && !guerrier2.estMort()) {
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
        if (guerrrier1.estMort()){
            System.out.println(guerrrier1.getType() +" est mort !");
        } else if (guerrier2.estMort()) {
            System.out.println(guerrier2.getType() + " est mort !");
        }
    }

    /**
     * Entraine un nouveau nain
     */
    public static void creerUnNain(){

    }

    /**
     * Enraine un nouvel elfe
     */
    public static void creerUnElfe(){

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
