
package com.mycompany.nicecream;


public class Cola {
   nodo frente, atras;
    class Participantes {

        String nombre;
        String apellido;

        Participantes(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
        }

    }
     class nodo {

        Participantes Clientes;
       
        nodo siguiente;
        
        nodo(Participantes jugadores) {
            this.Clientes = jugadores;
            this.siguiente = null;
        }

    }
    

    public Cola(String dato) {
       
        String[] players = dato.split("\t");
        String[] apo;
        for (String juga : players) {
            apo = juga.split(" ");
            IntroducirParticipantes(new nodo(new Participantes(apo[0], apo[1])));
          

        }

    }

    private void IntroducirParticipantes(nodo nodo1) {
        if (this.frente == null) {
            this.frente = nodo1;
            

        } else {
            nodo aux = frente;
            while (aux.siguiente != frente) {
                aux = aux.siguiente;

            }
            aux.siguiente = nodo1;
          

        }

    }
   
    
    
}
