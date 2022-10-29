/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_bras;

/**
 *
 * @author juliettebras
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoiture;
    Voiture[] liste_voitures;
    
    public Personne (String nom1, String prenom1) {
    prenom=prenom1;
    nom=nom1;
    liste_voitures = new Voiture [3];
    nbVoiture=0;
    

} 
 @Override
public String toString () {
return (" Nom: "+nom +" Prenom: "+prenom);   
}
 public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
 if (nbVoiture < 3 & voiture_a_ajouter.Proprietaire  == null){
     for(int k = 0; k < 3; k ++){ 
         if(liste_voitures[k] == null){
                    liste_voitures[k] = voiture_a_ajouter;
                    nbVoiture ++;
                    voiture_a_ajouter.Proprietaire = this;
                    return true;
        }
    } 
 } 
 return false;
 } 
 }
