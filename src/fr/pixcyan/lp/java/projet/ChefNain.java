package fr.pixcyan.lp.java.projet;

/**
 * La classe ChefNain gère les unités de type Chef Nain
 * @author PixCyan
 */
public class ChefNain extends Nain {

    public ChefNain() {
        this.setType("Chef Nain");
        this.setArmure(this.getArmure() * 2);
        this.setCout(this.getCout() * 3);
    }
}
