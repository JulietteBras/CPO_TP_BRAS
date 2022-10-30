/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_bras;

/**
 *
 * @author juliettebras
 */
public class TP2_Bieres_BRAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",
7.0 ,"Dubuisson"); //Création objet BouteilleBiere avec constructeur
System.out.println(uneBiere);

 //BouteilleBiere uneBiere = new BouteilleBiere(); //Création objet BouteilleBiere
 
 //uneBiere.nom = "Cuvée des trolls"; 
 //uneBiere.degreAlcool = 7.0 ;
 //uneBiere.brasserie ="Dubuisson";
 //uneBiere.ouverte= false;
 //uneBiere.lireEtiquette();
BouteilleBiere secondeBiere= new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");

        
 //BouteilleBiere secondeBiere = new BouteilleBiere();
 //secondeBiere.nom="Leffe";
 //secondeBiere.degreAlcool=6.6;
 //secondeBiere.brasserie="Abbaye de Leffe";
 //uneBiere.lireEtiquette();
BouteilleBiere troisiemeBiere= new BouteilleBiere("Heineken", 5.6,"Abbaye de Heineken");

BouteilleBiere quatriemeBiere= new BouteilleBiere("Corona",7.3,"Abbaye du Corona");
  
uneBiere.Decapsuler(); //Création objet une bière
System.out.println(uneBiere);

        
 }
 
}
