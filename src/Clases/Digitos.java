/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Johan León
 */
public class Digitos {
    
    private NodoCir cabeza;
    private NodoCir cola;
    private int tam;

    public void ListaEnlazada() {
        cabeza = null;  //puntero a tierra
        tam = 0;
    }

    public NodoCir getCola() {
        return cola;
    }

    public void setCola(NodoCir cola) {
        this.cola = cola;
    }

    public NodoCir getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoCir cabeza) {
        this.cabeza = cabeza;
    }

    public boolean esVacia() {
        return cabeza == null;  // if(cabeza == null)
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
     public void digitos() {
        for (int i = 0; i < 10; i++) {
            agregarAlFinal(i);
        }
    }
     
     public void agregarAlFinal(int valor) {
        NodoCir nuevo = new NodoCir();
        nuevo.setValor(valor);
        boolean flag = true;
        int contador = 0;

        if (esVacia()) {
            cabeza = nuevo;
            nuevo.setSgte(cabeza);
            nuevo.setAnt(cabeza);

        } else {
            NodoCir aux = cabeza;
            while (flag == true) {

                if (contador == this.getTam() - 1) {
                    flag = false;
                } else {
                    aux = aux.getSgte();
                    contador++;
                }

            }
            cola = nuevo;
            aux.setSgte(nuevo);
            nuevo.setAnt(aux);
            nuevo.setSgte(cabeza);

        }

        tam++;

    }
}
