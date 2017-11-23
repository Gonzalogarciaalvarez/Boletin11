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
public class Adestrador extends Seleccion {
    String idFederacion;

    public Adestrador() {

    }

    public String getIdFederacion() {
        return idFederacion;
    }
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public void viaxar(){
        System.out.println("viaxan os xogadores...");
    }
    public void dirixirPartido(){
        
    }
    public void dirixirAdestramento(){
        
    }

    @Override
    public String toString() {
        return "Adestrador{" + "idFederacion=" + idFederacion +super.toString()+ '}';
    }


}
