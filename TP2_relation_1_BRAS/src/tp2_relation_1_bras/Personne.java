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
    
    public Personne (String nom1, String prenom1) { //constructeur de la classe Personne
    prenom=prenom1;
    nom=nom1;
    liste_voitures = new Voiture [3];
    nbVoiture=0;
    

} 
 @Override
public String toString () {
return (" Nom: "+nom +" Prenom: "+prenom);   
}
 public boolean ajouter_voiture( Voiture voiture_a_ajouter) { //méthode ajouter une voiture
 if (nbVoiture < 3 & voiture_a_ajouter.Proprietaire  == null){ //On vérifie que le propriétaire a moins de 3 voitures et que la voiture n'a pas déjà un propriétaire
     for(int k = 0; k < 3; k ++){ 
         if(liste_voitures[k] == null){ //On vérifie que l'ajout est possible
                    liste_voitures[k] = voiture_a_ajouter;
                    nbVoiture ++;
                    voiture_a_ajouter.Proprietaire = this;
                    return true; //On renvoie true si on arrive à ajouter une voiture
        }
    } 
 } 
 return false; //Si la voiture à ajouter possède déjà un propriétaire ou si le propriétaire a déjà 3 voitures on renvoie false
 } 
 }
