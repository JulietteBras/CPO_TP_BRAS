/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_bras;

/**
 *
 * @author juliettebras
 */
public class Voiture {
  
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire;
    
    
    public Voiture (String Modele1, String Marque1, int PuissanceCV1){ //constructeur de la classe Voiture
        Modele=Modele1;
        Marque=Marque1;
        PuissanceCV=PuissanceCV1;
        Proprietaire = null;
   
     }   
        @Override
public String toString () { //Méthode toString()
return ("Modèle: "+Modele +" Marque: "+Marque +" Puissance CV: "+PuissanceCV);
}   
    
}
