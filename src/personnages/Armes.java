package personnages;

public class Armes{

    public String nameArme;
    public int puissanceArme;

    public Armes (String nameArme, int puissanceArme) {
        this.nameArme = nameArme;
        this.puissanceArme = puissanceArme;
    }

    public String toString() {
        return "Nom arme : " + nameArme + "\n" + "Puissance arme : " + " " + puissanceArme;
    }
    public String getNameArme() {
        return nameArme;
    }

    public int getPuissanceArme () {
        return puissanceArme;
    }

    public void setNameArme(String nameArme) {
        this.nameArme = nameArme;
    }

    public void setPuissanceArme(int puissanceArme) {
        this.puissanceArme = puissanceArme;
    }
}
