package Personnage;

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
        return "Personnage{" + "nom=" + nom + ", NiveauDeVie=" + NiveauDeVie + '}';
    }
   
    
    
}
