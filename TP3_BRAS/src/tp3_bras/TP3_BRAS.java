/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_bras;

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
     for(int i=0 ; i<=taille; i++){
         System.out.println("Votre arme est : "+ Tab.get(i));
     }
     
     
    }
    
}
