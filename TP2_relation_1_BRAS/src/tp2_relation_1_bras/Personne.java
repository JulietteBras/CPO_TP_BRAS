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
    
    public Personne (String nom1, String prenom1) {
    prenom=prenom1;
    nom=nom1;
    

} 
 @Override
public String toString () {
return ("Nom: "+nom +"Prenom: "+prenom);   
}
    }
