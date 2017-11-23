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
public class Xogador extends Seleccion {
    int dorsal;
    String demarcacion;

    public Xogador() {
    }

    public Xogador(int dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    public void xogarPartido(){
        
    }
    public void entrenar(){
        
    }
    @Override
    public void viaxar(){
        System.out.println("viaxan os xogadores...");
    }
    @Override
    public String toString() {
        return "Xogador{" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion +super.toString()+ '}';
    }

    
}
