package personnages;

public class Guerrier {
    public String name;
    public int niveauVie; //Niveau de vie (5-10)
    public int forceAttaque; //Force d’attaque (5-10)
    public Armes armeGuerrier;
    public String bouclier;


    public Guerrier() {

    }

    public Guerrier(String name) {
        this.name = name;
    }

    public Guerrier(String name, int niveauVie, int forceAttaque, Armes armeGuerrier, String bouclier) {
        // constructeur methode
        this.name = name;
        this.niveauVie = niveauVie;
        this.forceAttaque = forceAttaque;
        this.armeGuerrier = armeGuerrier;
        this.bouclier = bouclier;
    }

    public String toString() {
        return "Nom guerrier : " + name + "\n" + "Niveau de vie : " + niveauVie + "\n" + "Force d'attaque : " + forceAttaque + "\n" + armeGuerrier + "\n" + "Type Bouclier : " + bouclier + "\n";
    }

    //Getters
    public String getName() {
        return name;
    }

    // Setters
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

    public void setForceAttaque(int forceAttaque) {
        this.forceAttaque = forceAttaque;
    }

    public String getBouclier() {
        return bouclier;
    }

    public void setBouclier(String bouclier) {
        this.bouclier = bouclier;
    }

    public Armes getArmeGuerrier() {
        return armeGuerrier;
    }

    public void setArmeGuerrier(Armes armeGuerrier) {
        this.armeGuerrier = armeGuerrier;
    }
}