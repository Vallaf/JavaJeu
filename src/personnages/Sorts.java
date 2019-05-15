package personnages;

public class Sorts {
    public String nameSort;
    public int forceSort;

    public Sorts (String nameSort, int forceSort) {
        this.nameSort = nameSort;
        this.forceSort = forceSort;
    }

    public String toString() {
        return "Nom sort : " + " " + nameSort + "\n" + "Force sort : " + " " + forceSort;
    }

    public String getNameSort() {
        return nameSort;
    }

    public int getForceSort() {
        return forceSort;
    }

    public void setNameSort(String nameSort) { this.nameSort = nameSort; }

    public void setForceSort(int forceSort) {
        this.forceSort = forceSort;
    }
}