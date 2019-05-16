package personnages;

public abstract class Personnage {
    private String name;
    private int niveauVie;
    private int forceAttaque;


    public Personnage() {

    }

    public Personnage(String name,int niveauVie,int forceAttaque) {
        this.name = name;
        this.niveauVie = niveauVie;
        this.forceAttaque = forceAttaque;
    }

    public String toString() {
        return ("Nom personnage : " + name + "\n" + "Niveau de vie : " + niveauVie + "\n" + "Force d'attaque : " + forceAttaque);
    }

    //Getters

    public String getName() {
        return name;
    }

    public int getNiveauVie() {
        return niveauVie;
    }

    public int getForceAttaque() {
        return forceAttaque;
    }

    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setNiveauVie(int niveauVie) {
        this.niveauVie = niveauVie;
    }

    public void setForceAttaque(int forceAttaque) {
        this.forceAttaque = forceAttaque;
    }
}


