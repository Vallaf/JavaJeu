package main;

import personnages.Guerrier;
import personnages.Magicien;
import personnages.Armes;
import personnages.Sorts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Guerrier tableauGuerrier[] = new Guerrier[5];
        Magicien tableauMagicien[] = new Magicien[5];

        int indexGuerrier = 0;
        int indexMagicien = 0;


        String choix = "";

        Scanner sc = new Scanner(System.in);

        while (!choix.equalsIgnoreCase("QUITTER")) {
            System.out.println("Créer un nouveau perso (CREER) ?");
            System.out.println("Créer un nouveau perso (AFFICHER) ?");
            System.out.println("Créer un nouveau perso (QUITTER) ?");

            choix = sc.nextLine();


            if (choix.equalsIgnoreCase("CREER")) {

                System.out.println("Guerrier ou magicien ? :");
                String str = sc.nextLine();


                if (str.equalsIgnoreCase("Guerrier")) {
                    Guerrier guerrier = new Guerrier();

                    System.out.println("Choisissez un nom ? :");
                    String name = sc.nextLine();
                    guerrier.setName(name);

                    System.out.println("Niveau de vie entre 5 et 10 ? :");
                    int niveauVie = sc.nextInt();
                    guerrier.setNiveauVie(niveauVie);

                    System.out.println("Force d'attaque entre 5 et 10 ? :");
                    int forceAttaque = sc.nextInt();
                    guerrier.setForceAttaque(forceAttaque);
                    sc.nextLine();

                    System.out.println("Choix de l'arme ? :");
                    String nameArme = sc.nextLine();

                    System.out.println("Puissance de l'arme entre 5 et 10 ? :");
                    int puissanceArme = sc.nextInt();

                    Armes armeGuerrier = new Armes(nameArme, puissanceArme);
                    guerrier.setArmeGuerrier(armeGuerrier);
                    sc.nextLine();

                    System.out.println("Type Bouclier ? :");
                    String bouclier = sc.nextLine();
                    guerrier.setBouclier(bouclier);

                    System.out.println("Les caractéristiques de votre guerrier sont :" + "\n" + guerrier);

                    tableauGuerrier[indexGuerrier] = guerrier;
                    indexGuerrier++;

                } else {
                    Magicien magicien = new Magicien();

                    System.out.println("Choisissez un nom ? :");
                    String name = sc.nextLine();
                    magicien.setName(name);

                    System.out.println("Niveau de vie entre 3 et 6 ? :");
                    int niveauVie = sc.nextInt();
                    magicien.setNiveauVie(niveauVie);

                    System.out.println("Force d'attaque entre 8 et 15 ? :");
                    int forceAttaque = sc.nextInt();
                    magicien.setForceAttaque(forceAttaque);
                    sc.nextLine();

                    System.out.println("Choix du sort ? :");
                    String nameSort = sc.nextLine();

                    System.out.println("Force du sort entre 5 et 10 ? :");
                    int forceSort = sc.nextInt();
                    sc.nextLine();

                    Sorts sortMagicien = new Sorts(nameSort, forceSort);
                    magicien.setSort(sortMagicien);

                    System.out.println("Philtre ? :");
                    String philtre = sc.nextLine();
                    magicien.setPhiltre(philtre);

                    System.out.println("Les caractéristiques de votre magicien sont :" + "\n" + magicien);

                    tableauMagicien[indexMagicien] = magicien;
                    indexMagicien++;

                }
            }
            if (choix.equalsIgnoreCase("AFFICHER")) {
                for (int i = 0; i < tableauGuerrier.length; i++) {
                    if (tableauGuerrier[i] != null) {
                        System.out.println("GUERRIER : " + "\n" + tableauGuerrier[i]);
                    }

                }

                for (int j = 0; j < tableauMagicien.length; j++) {
                    if (tableauMagicien[j] != null) {
                        System.out.println("MAGICIEN : " + "\n" + tableauMagicien[j]);
                    }
                }
            }

        }
    }


}

