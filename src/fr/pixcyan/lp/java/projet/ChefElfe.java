package fr.pixcyan.lp.java.projet;

/**
 * La classe ChefElfe gère les unités de type Chef Elfe
 * @author PixCyan
 */
public class ChefElfe extends Elfe {

    public ChefElfe() {
        this.setType("Chef Elfe");
        this.setCout(this.getCout() * 2);
        this.setForce(this.getForce() * this.getDegat()); //double les dégats portés
    }
}
