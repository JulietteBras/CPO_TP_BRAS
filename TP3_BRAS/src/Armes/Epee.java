/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author juliettebras
 */
public class Epee extends Arme {
    private int indice;

    public Epee(int indice, String Nom, int Nombre) {
        super(Nom, Nombre);
        if(indice>0){
         indice=indice;
     }else{
         indice=0;
     if (indice>=100){
         indice=100;
     }
     }
        this.indice = indice;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        if(indice>0){
        this.indice = indice;
        }
    }

    @Override
    public String toString() {
        return "Epee{" + "indice=" + indice + '}';
    }
    
}
