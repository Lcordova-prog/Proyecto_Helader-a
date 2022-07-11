
package com.mycompany.nicecream;
                  

// Nodo de la pila
class nodo1 {

    String sabor;
    nodo1 siguiente;

    public nodo1(String sabor) {
        this.sabor = sabor;
    }

    

}
public class Pila {

    int porciones;
    nodo1 top;

    boolean vacia() {
        return top == null;
    }

    //Método para insertar los sabores y toppings de el helado
    public void Apilar(String sabor) {
        nodo1 x = new nodo1(sabor);
        x.siguiente = top;
        top = x;

        porciones++;

    }

    public String Barquilla() { // Método que muestra el siguiente del siguiente del siguiente del siguiente del top 
        return top.siguiente.siguiente.siguiente.siguiente.sabor;
    }

    public String Barquilla2() { // Método que muestra el siguiente del siguiente del siguiente del top
        return top.siguiente.siguiente.siguiente.sabor;
    }

    public String Barquilla3() { // Método que muestra el siguiente del siguente del top
        return top.siguiente.siguiente.sabor;
    }

    public String Barquilla4() { // Método que muestra el siguiente del top
        return top.siguiente.sabor;
    }

    public String Barquilla5() { // Método que muestra el top de la pila
        return top.sabor;
    }

    // Método que muestra la cantidad de porciones y toppings
    public int CantidadPor() {
        return porciones;
    }
//Método que muestra el top del contenido de la pila
    public String mostrar() {
        if (vacia()) {
            System.out.println("No hay más porciones");
            return null;
        } else {
            return top.sabor;
        }
    }

// Método para eliminar sabores y toppings 
    public nodo1 Borrar() {
        if (vacia()) {
            return top;
        } else {
            nodo1 aux = top;
            top = top.siguiente;
            aux.siguiente = null;
            porciones--;
            return aux;

        }

    }
// Método para mostrar toda la pila
    public String MostrarCuenta() {
        nodo1 a = top;
        String p = "";
        while (!vacia()) {
            p += "\t" + "\t" + top.sabor + "\n";
            top = top.siguiente;

        }
        top = a;

        return p;
    }

}
