/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author juliettebras
 */
public class Arme {
    private String nom;
    private int NiveauAttaque; //Private : Pour ne pas pouvoir modifier la valeur de attaque en dehors de la calsse Arme

public Arme (String Nom, int Nombre){
    nom=Nom;
    
    if (Nombre<0){
        NiveauAttaque=1;
    }else{
        NiveauAttaque=Nombre;
    if(Nombre>=100){
        NiveauAttaque=100;
    }
    }
            
}

    public int getNiveauAttaque() {
        return NiveauAttaque;
    }

    public String getNom() {
        return nom;
    }

    public void setNiveauAttaque(int NiveauAttaque) {
        if(NiveauAttaque>0){
         this.NiveauAttaque = NiveauAttaque;   
        }
        
    }



    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", NiveauAttaque=" + NiveauAttaque + '}';
    }
    
    
}
