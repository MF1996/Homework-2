package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner lire = new Scanner(System.in);
        System.out.print("Bienvenue dans listAmis" +
                "il est obligatoire de crée un compte avant de commencer ");
        System.out.print("\nUser Name :");
        String userNam = lire.nextLine();

        System.out.print("\nDate de naissance:");
        String dateNais = lire.nextLine();

        System.out.print("\nnationalite:");
        String nation = lire.nextLine();
        System.out.print("\naddresse:");
        String addr = lire.nextLine();
        Personne p = new Personne(userNam, dateNais, nation, addr);

        System.out.print("User" + userNam
                + "\nnationalite :" + nation
                + "\naddresse :" + addr);
        System.out.print("\n=========");
        boolean reponse = true;
        while (reponse) {
            System.out.print("\n1)Creation & implementation list");
            System.out.print("\n2)ajouter amis");
            System.out.print("\n3)supprime amis");
            System.out.print("\n4)afficher listeAmis");
            System.out.print("\n5)listeAmis algerien");
            System.out.print("\n6)listAmis etranger");
            System.out.println("\n7)quitté");
            switch (lire.nextInt()) {


                case 1:
                    p.CreeListemis();
                    break;
                case 2:
                    lire.nextLine();
                    System.out.print("\nnom:");
                    String nom = lire.nextLine();
                    System.out.print("\nnation:");
                    nation = lire.nextLine();
                    System.out.print("\naddresse:");
                    addr = lire.nextLine();
                    p.ajouterAmis(new Personne(nom, nation, addr));
                    break;
                case 3:
                    p.MasListeAmis();
                    System.out.print("\nID amis a supprimé:");
                    int choix = lire.nextInt();
                    p.suppAmis(choix);
                    break;
                case 4:
                    p.MasListeAmis();
                    break;
                case 5:
                    p.MesAmisAlg();
                    break;
                case 6:
                    p.MesAmisEtrang();
                    break;
                case 7:
                    reponse = false;
                    break;
                default:
                    System.err.print("\nErreur");
                    break;


            }


        }

    }
}
