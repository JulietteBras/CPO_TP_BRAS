package tp2_convertisseurobjet_bras;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juliettebras
 */
public class Convertisseur { //Classe Convertisseur
    int nbConversions; //permet de compter le nombre de conversions qui seront effectuées par le convertisseur

    
    public Convertisseur () { //Constructeur Convertisseur avec initialisation de nbConversions
        nbConversions = 0;
        
}
    public double CelciusVersKelvin(double CVK){ //Methode conversion Celcius vers Kelvin
        CVK = CVK + 273.15;
        nbConversions += 1;
        return CVK;
    }
   
    public double KelvinVersCelscius (double KVC){ //Méthode conversion Celcius vers Kelvin
        KVC = KVC - 273.15;
        nbConversions += 1;
        return KVC;
    }
   
    public double FarenheitVersCelcius (double FVC){ //Méthode conversion Farenheit vers Celcius
        FVC = (FVC - 32)*(5/9);
        nbConversions += 1;
        return FVC;
    }
   
    public double CelciusVersFarenheit (double CVF){ //Méthode conversion Celcius vers Farenheit
        CVF = CVF*(9/5)+32;
        nbConversions += 1;
        return CVF;
        }
    public double FarenheitVersKelvin (double FVK){ //Méthode conversion Farenheit vers Kelvin
        FVK=(FVK-32)*(5/9)+273.15;
        nbConversions += 1;
        return FVK;
        }
    public double KelvinVersFarenheit (double KVF){ //Methode conversion Kelvin vers Farenheit
        KVF=(KVF-273.15)*(9/5)+32;
        nbConversions += 1;
        return KVF;
        }
    @Override
public String toString () { //Méthode toString retourne le nombre de conversions effectuées
  return "nb de conversions "+ nbConversions;
}
public int choisir()  { 
  System.out.println("1. Celcius vers Kelvin \n"+ "2. Kelvin vers Celcius\n"+"3. Farenheit vers Celcius \n"+ "4. Celcius vers Farenheit \n"+ "5. Farenheit vers Kelvin \n"+ "6. Kelvin vers Farenheit \n");
    
    Scanner sc = new Scanner(System.in); //Demander à l'utilisateur son choix de conversion
    int choix=sc.nextInt();
    return choix;
  }
}
