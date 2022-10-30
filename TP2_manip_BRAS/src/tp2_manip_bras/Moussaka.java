/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_manip_bras;

/**
 *
 * @author juliettebras
 */
public class Moussaka {
   int nbCalories;
   public Moussaka(int Kcal){ //Constructeur qui initialise nbCalories
       nbCalories=Kcal;
    //Moussaka assiette666 = assiette1 ; => Cette phrase est fausse car on ne peut pas obtenir les calories, il manque le .nbCalories
    //Moussaka assiette667 = new Tartiflette(); => faux= il faudrait que Moussaka soit à la place de Tartiflette et il manque .nbCalories  
    // Non, une référence objet qui annonce référencer un type d’objet ne peut pas référencer un autre qui n’a aucun rapport.
  
    Moussaka TabMoussaka [] = new Moussaka [10]; //Création d'un tableau de 10 références de Moussaka
    
   for (int i=0; i<TabMoussaka.length; i++){
       TabMoussaka[i]=new Moussaka(i*200); //création d'un nouvel objet de type Moussaka pour chacune des références
   }
   }
}
