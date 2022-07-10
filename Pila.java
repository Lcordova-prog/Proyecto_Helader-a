
package com.mycompany.nicecream;
                  


class nodo1 {

    String sabor;
    String Complemento;
    nodo1 siguiente;

    public nodo1(String sabor) {
        this.sabor = sabor;
    }

    public nodo1(String sabor, String Complemento) {
        this.sabor = sabor;
        this.Complemento = Complemento;
    }

}

public class Pila {

    int porciones;
    nodo1 top;

    boolean vacia() {
        return top == null;
    }

    public void Apilar(String sabor) {
        nodo1 x = new nodo1(sabor);
        x.siguiente = top;
        top = x;

        porciones++;

    }

    public String Barquilla() {
        return top.siguiente.siguiente.siguiente.siguiente.sabor;
    }

    public String Barquilla2() {
        return top.siguiente.siguiente.siguiente.sabor;
    }

    public String Barquilla3() {
        return top.siguiente.siguiente.sabor;
    }

    public String Barquilla4() {
        return top.siguiente.sabor;
    }

    public String Barquilla5() {
        return top.sabor;
    }

    public int CantidadPor() {
        return porciones;
    }

    public String mostrar() {
        if (vacia()) {
            System.out.println("No hay más porciones");
            return null;
        } else {
            return top.sabor;
        }
    }

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
