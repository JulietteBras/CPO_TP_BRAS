/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_bras;

/**
 *
 * @author juliettebras
 */
public class BouteilleBiere {
 String nom;
 double degreAlcool;
 String brasserie;
 boolean ouverte;
 
 @Override
public String toString() { //Afficher l'état de la bière
String chaine_a_retourner;
chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
if (ouverte == true ) chaine_a_retourner += "oui" ; else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
}
 
 public void lireEtiquette() { //Méthode lire étiquette (donne les caractéristiques de la bière)
System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;
}
public void Decapsuler() { //Méthode décapsuler
    if (ouverte==false){
        ouverte=true;
       } else {
            System.out.println("erreur : biere déjà ouverte");
            ouverte=false;
                
                }
                
    
} 
public BouteilleBiere(String unNom, double unDegre, String
uneBrasserie) { //Constructeur BouteilleBiere
   nom = unNom;
   degreAlcool = unDegre;
   brasserie = uneBrasserie;
   ouverte = false;
   }

}

