package fr.pixcyan.lp.java.projet;

/**
 * Created by raffennn on 11/09/15.
 */
public class ChefElfe extends Elfe{
    private String type = "Chef Elfe";
    private int degat = 4;
    private int cout = super.getCout()*2;
    private int armure = 1;

    public ChefElfe() {
        super();
    }

    /**
     * Définit la valeur du coup porté par un guerrier
     * @return
     */

    public void frapper(Guerrier guerrier) {
        super.frapper(guerrier);
    }

    /**
     * Change les PV du guerrier en fonction des dégats reçus et de son armure
     * @param nbDegat
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

    /**
     * @return the armure
     */
    public int getArmure() {
        return armure;
    }

    /**
     * @return the force
     */
    @Override
    public int getForce() {
        return super.getForce()*this.degat;
    }

    /**
     * @return the degat
     */
    public int getDegat() {
        return degat;
    }

    /**
     * @param degat the degat to set
     */
    public void setDegat(int degat) {
        this.degat = degat;
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

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @param armure the armure to set
     */
    public void setArmure(int armure) {
        this.armure = armure;
    }
}
