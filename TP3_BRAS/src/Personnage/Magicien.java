package Personnage;

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

    public Magicien(boolean confirme, String nom, int NiveauDeVie) {
        super(nom, NiveauDeVie);
        this.confirme = confirme;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }
    
    
    
    
}
