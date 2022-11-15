/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_bras;

import Personnage.Personnage;
import Personnage.Magicien;
import Personnage.Guerrier;
import Armes.Arme;
import Armes.Epee;
import Armes.Baton;
import java.util.ArrayList;
import Armes.*;

/**
 *
 * @author juliettebras
 */
public class TP3_BRAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        
     //ARMES
     Epee Exc = new Epee(5,"Excalibur",7)  ;
     Epee Dur = new Epee(7,"Durandal",4);
     Baton Ch = new Baton("Chêne",4,5);
     Baton Cha = new Baton("Charme",5,6);
     
     
     ArrayList<Arme> Tab= new ArrayList<Arme>(); // Création tableau Dynamique avec Epee et Baton
     Tab.add(Exc);
     Tab.add(Dur);
     Tab.add(Ch);
     Tab.add(Cha);
     
     int taille = Tab.size(); // On prend dans le tableau les valeurs 
     for(int i=0 ; i<taille; i++){
         System.out.println("Votre arme est : "+ Tab.get(i));
     }
     
     //PERSONNAGES
     Magicien Gand = new Magicien(true,"Gandall",65);
     Magicien Gar = new Magicien(false,"Garcimor",44);
     Guerrier Co = new Guerrier(false,"Conan",78);
     Guerrier Lann  =new Guerrier(true,"Lannister",45);
     
     ArrayList<Personnage> Tab2 = new ArrayList<Personnage>(); //Creation tableau dynamique avec magicien  et guerrier
     Tab2.add(Gand);
     Tab2.add(Gar);
     Tab2.add(Co);
     Tab2.add(Lann);
     
     int taille2 = Tab2.size(); // On prend dans le tableau les valeurs 
     for(int i=0 ; i<taille2; i++){
         System.out.println("Votre personnage est : "+ Tab2.get(i));
     }
    }
    
}
