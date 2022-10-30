/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_bras;

import java.util.Scanner;

/**
 *
 * @author juliettebras
 */
public class TP2_convertisseurObjet_BRAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Convertisseur premier =new Convertisseur(); //Objet qui effectue deux types de conversion
    double result1= premier.CelciusVersKelvin(4);
    double result2= premier.FarenheitVersKelvin(4);
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(premier);
    
    Convertisseur deuxieme =new Convertisseur(); //Objet qui effectue deux types de conversion
    double result3= deuxieme.KelvinVersCelscius(9);
    double result4=deuxieme.KelvinVersFarenheit(9);
    System.out.println(result3);
    System.out.println(result4);
    System.out.println(deuxieme);
    
    //Menu pour l'utilisateur
    
    Convertisseur ConvertChoisie= new Convertisseur();
    
    System.out.println("Choisir une conversion :\n" +"1. Celcius vers Kelvin \n"+ "2. Kelvin vers Celcius\n"+"3. Farenheit vers Celcius \n"+ "4. Celcius vers Farenheit \n"+ "5. Farenheit vers Kelvin \n"+ "6. Kelvin vers Farenheit \n"+"Rentrez un nombre :");
    
    Scanner sc = new Scanner(System.in); //Demander à l'utilisateur la valeur pour sa conversion
    double nombre=sc.nextDouble();
    int choix= ConvertChoisie.choisir();
    
    if (choix==1){
        double nbfinal =ConvertChoisie.CelciusVersKelvin(nombre);
        System.out.println(nbfinal);
        
        }else if (choix==2) {
        double nbfinal =ConvertChoisie.KelvinVersCelscius(nombre);
        System.out.println(nbfinal);
        
        }else if (choix==3) {
        double nbfinal =ConvertChoisie.FarenheitVersCelcius(nombre);
        System.out.println(nbfinal);
        
        }else if (choix==4) {
        double nbfinal =ConvertChoisie.CelciusVersFarenheit(nombre);
        System.out.println(nbfinal);
        
        }else if (choix==5) {
        double nbfinal =ConvertChoisie.FarenheitVersKelvin(nombre);
        System.out.println(nbfinal);
        
        }else if (choix==6) {
        double nbfinal =ConvertChoisie.KelvinVersFarenheit(nombre);
        System.out.println(nbfinal);
    }
    
    
     
    }

    
}
