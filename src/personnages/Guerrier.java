package personnages;

public class Guerrier extends Personnage {

    private Armes armeGuerrier;
   private String bouclier;

    public Guerrier() {

    }


    public Guerrier(String name, int niveauVie, int forceAttaque, Armes armeGuerrier, String bouclier) {
        super(name,niveauVie,forceAttaque);
        this.armeGuerrier = armeGuerrier;
        this.bouclier = bouclier;
    }

    public Guerrier(Armes armeGuerrier) {
        this.armeGuerrier= armeGuerrier;
    }

    public String toString() {
        return "GUERRIER :" + "\n" + super.toString() + "\n" + armeGuerrier + "\n" ;
    }

    //Getters
    /*public String getName() {
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
*/
    /*public String getBouclier() {
        return bouclier;
    }

    public void setBouclier(String bouclier) {
        this.bouclier = bouclier;
    }
*/
    public Armes getArmeGuerrier() {
        return armeGuerrier;
    }

    public void setArmeGuerrier(Armes armeGuerrier) {
        this.armeGuerrier = armeGuerrier;
    }
}