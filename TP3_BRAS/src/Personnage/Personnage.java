package Personnage;

import Armes.Arme;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juliettebras
 */
public class Personnage {
    private String nom;
    private int NiveauDeVie;
    ArrayList<Arme> inventaire = new ArrayList<Arme>();
    Arme ArmeEnMain=null;
    public static int nbPersonnage=0;

public void gestion (Arme arme){// Méthode pour ajouter des armes si le personnages a moins de 5 armes
    if (inventaire.size()<5){
        inventaire.add(arme);
    }
}   

public void equiper (Arme arme){
    boolean result =inventaire.contains(arme);
    if (result ==true){
        System.out.println("Votre arme est : "+ arme);
        ArmeEnMain=arme;
    }else{
        System.out.println("Cette arme n'existe pas");
        ArmeEnMain=null;
    }
}

    public Arme getArmeEnMain() {
        return ArmeEnMain;
    }


    
    public Personnage(String nom, int NiveauDeVie) {
        if (NiveauDeVie<0){
            NiveauDeVie=1;    
        }
        if (NiveauDeVie<100){
            NiveauDeVie=NiveauDeVie;
                    
        }else{
            NiveauDeVie=100;
        }
        
        this.nom = nom;
        this.NiveauDeVie = NiveauDeVie;
        nbPersonnage ++;
    }

    public int getNiveauDeVie() {
        return NiveauDeVie;
    }

    public String getNom() {
        return nom;
    }

    public void setNiveauDeVie(int NiveauDeVie) {
        this.NiveauDeVie = NiveauDeVie;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", NiveauDeVie=" + NiveauDeVie + "Arme en main=" + ArmeEnMain+'}';
    }
   
    
    
}
