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
public class NodoCir {

    private int valor;        // Variable en la cual se va a guardar el valor.
    private NodoCir sgte;  // Variable para enlazar los nodos.
    private NodoCir ant;

    public void Nodo() {
        this.valor = 0;
        this.sgte = null;
    }

    public NodoCir getAnt() {
        return ant;
    }

    public void setAnt(NodoCir ant) {
        this.ant = ant;
    }
    

    public NodoCir getSgte() {
        return sgte;
    }

    public void setSgte(NodoCir sgte) {
        this.sgte = sgte;
    }

    // Métodos get y set para los atributos.
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    Object getValor(int valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
