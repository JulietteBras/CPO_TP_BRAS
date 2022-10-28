/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_bras;

/**
 *
 * @author juliettebras
 */
public class TP2_manip_BRAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
Tartiflette assiette1 = new Tartiflette(500) ;
Tartiflette assiette2 = new Tartiflette(600) ;
Tartiflette assiette3 = assiette2 ;
//Il y a 2 tartiflettes crées, et assiette 2 et 3 référencent la même tartiflette

System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

assiette2.nbCalories+=5;

System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

int temp;
temp=assiette1.nbCalories;
assiette1.nbCalories=assiette2.nbCalories;
assiette2.nbCalories=temp;

System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories);
System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
    }
    
}
