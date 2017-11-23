/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

/**
 *
 * @author ggarciaalvarez
 */
public class Boletin11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Seleccion obx = new Seleccion(26,"Gonzalo","Garcia",22);
        Adestrador obx1 = new Adestrador();
        Xogador obx2 = new Xogador();
        Masaxista obx3 = new Masaxista();
        obx.concentrarse();
        obx1.concentrarse();
        obx2.concentrarse();
        obx3.concentrarse();
        obx.viaxar();
        obx1.viaxar();
        obx2.viaxar();
        obx3.viaxar();
        //Si podes chamar a un metodo da superclase cun obxeto da subclase,
        //o comprobamos con concentrarse
        //No podemos chamar a un metodo da subclase cun obxeto da superclase, se intento
        //chamar a darMasaxe con obx, dame error
        
    }
    
}
