package Personnage;

import Armes.Arme;
import Armes.Baton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juliettebras
 */
public class Magicien extends Personnage {
    private boolean confirme;
    public static int nbMagicien=0;

    public Magicien(boolean confirme, String nom, int NiveauDeVie) {
        super(nom, NiveauDeVie);
        this.confirme = confirme;
        nbMagicien++;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }
    
    //Choix des armes preferees du magicien
    
    Arme arme;
    int nbArme;
    public int NBArmepref(){
        for (int i=0; i<inventaire.size(); i++){
            arme=inventaire.get(i);
            if (arme instanceof Baton){
                nbArme+=1;
            }
        }
        System.out.println("Le nombre d'arme preferee est :"+ nbArme);
        return nbArme;
    }
    
}
