package main;

import personnages.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    /* private static Personnage tableauPersonnage[] = new Personnage[5];

       private static Guerrier tableauGuerrier[] = new Guerrier[5];
       private static Magicien tableauMagicien[] = new Magicien[5];

       private static int indexGuerrier = 0;
       private static int indexMagicien = 0;
     */


    public static ArrayList<Personnage> persoList = new ArrayList();

    private static int indexPersonnage = -1;
    private static String choix = "";
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        while (!choix.equalsIgnoreCase("QUITTER")) {
//
            menu();
            choix = sc.nextLine();
            if (choix.equalsIgnoreCase("CREER")) {
                createPerso();
            } else if (choix.equalsIgnoreCase("AFFICHER")) {
                displayListePerso();
            } else if (choix.equalsIgnoreCase("SUPPRIMER")) {
                deletePerso();
            } else if (choix.equalsIgnoreCase("MODIFIER")) {
                modifyPerso();

            }
        }
    }

    public static void displayListePerso() {

        int p = 0;
        for (Personnage perso : persoList) {
            p++;
            System.out.println(p + "|" + perso);

        }
        /*if (choix.equalsIgnoreCase("AFFICHER")) {
            for (int p = 0; p < tableauPersonnage.length; p++) {
                if (tableauPersonnage[p] != null) {
                    System.out.println(tableauPersonnage[p]);
                }
            }

        }

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
        */

    }


    public static void menu() {
        System.out.println("Créer un nouveau perso (CREER) ?");
        System.out.println("Afficher liste personnages (AFFICHER) ?");
        System.out.println("Supprimer un personnage de la liste (SUPPRIMER) ?");
        System.out.println("Modifer des infos d'un personnage (MODIFIER) ?");
        System.out.println("Exit (QUITTER) ?");
    }


    public static void createPerso() {


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

               /* System.out.println("Type Bouclier ? :");
                String bouclier = sc.nextLine();
                guerrier.setBouclier(bouclier);
                */

                /*tableauGuerrier[indexGuerrier] = guerrier;
                indexGuerrier++;*/

                /*tableauPersonnage[indexPersonnage] = guerrier;
                indexPersonnage++;*/


            persoList.add(guerrier);
            indexPersonnage++;


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

               /*System.out.println("Philtre ? :");
                String philtre = sc.nextLine();
                magicien.setPhiltre(philtre);*/

            persoList.add(magicien);
            indexPersonnage++;


            // tableauPersonnage[indexPersonnage] = magicien;
            // indexPersonnage++;

               /* tableauMagicien[indexMagicien] = magicien;
                indexMagicien++;*/

        }


    }


    public static void deletePerso() {

        displayListePerso();
        for (Personnage perso : persoList) {
            System.out.println("Quel numéro de l'index dans la liste de personnages voulez-vous supprimer ?");

            indexPersonnage = sc.nextInt();

            System.out.println(persoList.remove(indexPersonnage - 1));
            sc.nextLine();
        }
    }

    public static void modifyPerso() {
        displayListePerso();


        System.out.println("Quel personnage voulez-vous modifier ? (CHOISIR LE NUMERO DU PERSO A MODIFIER)");

        indexPersonnage = sc.nextInt();

        System.out.println(persoList.get(indexPersonnage - 1));
        sc.nextLine();

        modificationMenu(indexPersonnage);

    }


    public static void modificationMenu(int indexPersonnage) {

        System.out.println("1- MODIFIER LE NOM DU PERSONNAGE");
        System.out.println("2- MODIFIER LE NIVEAU DE VIE DU PERSONNAGE");
        System.out.println("3- MODIFIER LA FORCE D'ATTAQUE DU PERSONNAGE");
        System.out.println("ENTREZ LE NUMERO DE VOTRE CHOIX");

        int numeroModif = sc.nextInt();

        switch (numeroModif) {
            case 1:
                System.out.println("Le nom actuel du personnage est : " + persoList.get(indexPersonnage - 1).getName());
                System.out.println("Entrez le nouveau nom de votre personnage : ");
                sc.nextLine();
                persoList.get(indexPersonnage-1).setName(sc.nextLine());
                System.out.println("Nouveau nom " + persoList.get(indexPersonnage-1).getName());
                break;
            case 2:
                System.out.println("Le niveau de vie du personnage est : " + persoList.get(indexPersonnage-1).getNiveauVie());
                System.out.println("Entrez le nouveau niveau de vie de votre personnage : ");
                sc.nextLine();
                persoList.get(indexPersonnage-1).setNiveauVie(sc.nextInt());
                System.out.println("Nouveau niveau de vie " + persoList.get(indexPersonnage-1).getNiveauVie());
                break;
            case 3:
                System.out.println("La force d'attaque  actuelle du personnage est : " + persoList.get(indexPersonnage-1).getForceAttaque());
                System.out.println("Entrez la nouvelle force d'attaque de votre personnage : ");
                sc.nextLine();
                persoList.get(indexPersonnage-1).setForceAttaque(sc.nextInt());
                System.out.println("Nouvelle force d'attaque " + persoList.get(indexPersonnage-1).getForceAttaque());
                break;
        }
    }
}



