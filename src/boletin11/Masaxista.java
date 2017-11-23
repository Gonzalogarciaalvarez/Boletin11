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
public class Masaxista extends Seleccion {
    String titulacion;
    int anosExperiencia;

    public Masaxista() {
    }

    public Masaxista(String titulacion, int anosExperiencia) {
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    public void darMasaxes(){
        
    }
    @Override
    public void viaxar(){
        System.out.println("viaxan os xogadores...");
    }
    @Override
    public String toString() {
        return "Masaxista{" + "titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia +super.toString()+ '}';
    }

}
