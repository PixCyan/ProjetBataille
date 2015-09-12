package fr.pixcyan.lp.java.projet;

/**
 * La classe ChefNain gère les unités de type Chef Nain
 * @author PixCyan
 */
public class ChefNain extends Nain {
    private String type = "Chef Nain";
    private int armure = 4;
    private int cout = super.getCout() * 3;
    private int degat = 1;

    /**
     * Change les PV du guerrier en fonction des dégats reçus et de son armure
     *
     * @param nbDegat dégats portés par un ennemi et reçu par le guerrier
     */
    @Override
    public void degatsReçus(int nbDegat) {
        super.degatsReçus(nbDegat / this.armure);
    }


    //-------------- Setters / Getters --------------//

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    @Override
    public int getForce() {
        return super.getForce() * this.degat;
    }

    /**
     * @return the armure
     */
    public int getArmure() {
        return armure;
    }

    /**
     * @param armure the armure to set
     */
    public void setArmure(int armure) {
        this.armure = armure;
    }

    /**
     * @return the cout
     */
    public int getCout() {
        return cout;
    }

    /**
     * @param cout the cout to set
     */
    public void setCout(int cout) {
        this.cout = cout;
    }


}
