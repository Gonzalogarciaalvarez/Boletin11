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
class Seleccion {
    int id;
    String nome;
    String apelido;
    int edade;

    public Seleccion() {
    }

    public Seleccion(int id, String nome, String apelido, int edade) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.edade = edade;
    }

    public String getApelido() {
        return apelido;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getEdade() {
        return edade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }
    public void concentrarse(){
        System.out.println("concentrase a selección");
    }
    public void viaxar(){
        System.out.println("viaxa a selección");
    }

    @Override
    public String toString() {
        return "Seleccion{" + "id=" + id + ", nome=" + nome + ", apelido=" + apelido + ", edade=" + edade + '}';
    }

}
