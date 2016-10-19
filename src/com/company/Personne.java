package com.company;

/**
 * Created by HAMALI on 17/10/16.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Personne {

    private String nom;
    private String nation;
    private String dateNais;
    private String addr;
    static private int nbAmis;
    ArrayList<Personne> listAmis = new ArrayList<>();
    Scanner lire = new Scanner(System.in);

    public Personne(String nom, String nation, String addr) {
        this.nom = nom;
        this.nation = nation;
        this.addr = addr;
    }


    public String getNom() {
        return nom;
    }

    public String getNation() {
        return nation;
    }

    public String getDateNais() {
        return dateNais;
    }

    public String getAddr() {
        return addr;
    }

    public Personne(String nom, String dateNais, String nation, String addr) {
        this(nom, nation, addr);
        this.dateNais = dateNais;

    }

    public void CreeListemis() {
        System.out.print("nombre amis:");
        nbAmis = lire.nextInt();
        lire.nextLine();
        for (int count = 1; count <= nbAmis; count++) {

            System.out.print("nom:");
            nom = lire.nextLine();
            System.out.print("nation:");
            nation = lire.nextLine();
            System.out.print("addresse:");
            addr = lire.nextLine();
            listAmis.add(new Personne(nom, nation, addr));
        }
    }

    public void ajouterAmis(Personne p) {
        listAmis.add(p);
        nbAmis++;
    }

    public void MasListeAmis() {
        if (nbAmis != 0) {
            for (int count = 0; count <= (nbAmis - 1); count++) {

                System.out.print(listAmis.get(count).toString());
            }
        } else
            System.out.print("liste vide");
    }

    public void MesAmisAlg()

    {
        if (nbAmis != 0) {
            {
                for (int count = 0; count <= (nbAmis - 1); count++) {
                    if (listAmis.get(count).nation.contentEquals("alg")) {
                        System.out.print(listAmis.get(count).toString());
                    }
                }
            }

        } else
            System.out.print("liste vide");
    }

    @Override
    public String toString() {
        return
                "\nnom:'" + nom + '\'' +
                        ",\nnation:'" + nation + "\naddr:" + addr
                ;
    }

    public void MesAmisEtrang() {
        if (nbAmis != 0) {
            for (int count = 0; count <= (nbAmis - 1); count++) {
                if (!listAmis.get(count).nation.contentEquals("alg")) {
                    System.out.print(count + "" + listAmis.get(count).toString());
                }
            }
        } else
            System.out.print("liste vide");
    }

    public void suppAmis(int choix) {

        if (nbAmis != 0) {
            listAmis.remove((choix - 1));
            nbAmis--;
            MasListeAmis();
        } else
            System.out.print("Votre listAmis est vide");
    }
}
