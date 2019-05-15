package personnages;

public class Magicien {
    public String name;
    public int niveauVie; // Niveau de vie (3-6)
    public int forceAttaque; //Force d’attaque (8-15)
    public Sorts sort;
    public String philtre;

    public Magicien() {

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
    public String toString() {
        return "Nom Magicien : " + name + "\n" + "Niveau de vie : " + niveauVie + "\n" + "Force d'attaque : " + forceAttaque + "\n" + sort + "\n" + "Type Philtre : " + philtre + "\n";
    }
    //Getters
    public String getName() {
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

    public Sorts getSort() {
        return sort;
    }

    public void setSort(Sorts sort) {
        this.sort = sort;
    }

    public String getPhiltre() {
        return philtre;
    }

    public void setPhiltre(String philtre) {
        this.philtre = philtre;
    }


}
