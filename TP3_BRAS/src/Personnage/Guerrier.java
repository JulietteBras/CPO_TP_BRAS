package Personnage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juliettebras
 */
public class Guerrier extends Personnage {
    private boolean cheval;
    public static int nbGuerrier=0;

    public Guerrier(boolean cheval, String nom, int NiveauDeVie) {
        super(nom, NiveauDeVie);
        this.cheval = cheval;
        nbGuerrier ++;
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
    
    
    
}
