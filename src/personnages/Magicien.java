package personnages;

public class Magicien extends Personnage {

    private Sorts sort;
    private String philtre;

   /* public Magicien() {

    }

    public Magicien(String name) {
        this.name = name;
    }

    public Magicien(String name, int niveauVie, int forceAttaque, Sorts sort, String philtre) {
        this.name = name;
        this.niveauVie = niveauVie;
        this.forceAttaque = forceAttaque;
        this.sort = sort;
        this.philtre = philtre;

    }
    */

    public String toString() {
        return "MAGICIEN :" + "\n" + super.toString() + "\n" + sort + "\n";
    }
    //Getters
   /* public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNiveauVie() {
        return niveauVie;
    }

    public void setNiveauVie(int niveauVie) {
        this.niveauVie = niveauVie;
    }

    public int getForceAttaque() {
        return forceAttaque;
    }

    // Setters

    public void setForceAttaque(int forceAttaque) {
        this.forceAttaque = forceAttaque;
    }
*/
    public Sorts getSort() {
        return sort;
    }

    public void setSort(Sorts sort) {
        this.sort = sort;
    }

   /* public String getPhiltre() {
        return philtre;
    }

    public void setPhiltre(String philtre) {
        this.philtre = philtre;
    }
*/

}
