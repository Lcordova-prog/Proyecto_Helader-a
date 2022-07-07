
package com.mycompany.nicecream;

class nodo{
    String nom;
    nodo siguiente;
    
    nodo(String da){
        this.nom = da;
    }
}
public class Cola {
    nodo frente, atras = null;
    int Numpersonas;

   
boolean vacio(){
    return frente == null;
}

    public void insertar(String personas){
        nodo nuevo = new nodo(personas);
        if (vacio()) {
            frente = nuevo;
            atras = frente;
        }else{
            atras.siguiente = nuevo;
            atras = nuevo;
        }
    }
    
    public String mostrar(){
        String elementos = "";
        if (!vacio()) {
            nodo aux = frente;
            while(aux != null){
                elementos += ""+aux.nom;
                aux = aux.siguiente;
            }
            return elementos;
        }
        return "Cola vacia";
    }
   
    
    
}
