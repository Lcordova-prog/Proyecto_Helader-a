
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
// Método para determinar si la cola esta vacia o no. 
    boolean vacio() {
        return delante == null;
    }
 //Método para ingresar las personas en la cola
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
// Método para mostrar las personas de la cola
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
// Método para eliminar personas de la cola, pero en este caso sería atenderlos
    public String Atender() {
        if (!vacio()) {
            String aux = delante.nom;
            delante = delante.sig;
            return aux;
        }
        System.out.println("No hay más clientes");
        return " ";
    }

  // Método que muestra el primero en la cola
    public String Primero() {
        return delante.nom;
    }
}
