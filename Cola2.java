
package com.mycompany.nicecream;
public class Cola2 {

    Nodo delante, atras;

    class Nodo {

        String nom;
        Nodo sig;

        public Nodo(String nom) {
            this.nom = nom;

        }

    }

    boolean vacio() {
        return delante == null;
    }

    public void Insertar(String nom) {

        Nodo w = new Nodo(nom);
        if (vacio()) {
            delante = w;
            atras = delante;
        } else {
            atras.sig = w;
            atras = w;
        }

    }

    public String mostrar() {
        String Ver = "";
        if (!vacio()) {
            Nodo aux = delante;
            while (aux != null) {
                Ver += aux.nom + "<--";
                aux = aux.sig;
            }
            return Ver;
        }
        return "No hay clientes";
    }

    public String Atender() {
        if (!vacio()) {
            String aux = delante.nom;
            delante = delante.sig;
            return aux;
        }
        System.out.println("No hay más clientes");
        return " ";
    }

    public String Primero() {
        return delante.nom;
    }
}
