package Clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Johan León
 */
public class Nodo {

    private String valor;        // Variable en la cual se va a guardar el valor.
    private Nodo sgte;  // Variable para enlazar los nodos.

    public void Nodo() {
        this.valor = "";
        this.sgte = null;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }

    // Métodos get y set para los atributos.
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    Object getValor(int valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
