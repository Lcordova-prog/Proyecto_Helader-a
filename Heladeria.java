
package com.mycompany.nicecream;

import java.io.IOException;
import java.util.Scanner;


public class Heladeria {
   static String registroParticipantes;

    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
      Lector a = new Lector();
      Cola cola = new Cola();
      int capa = 0;
    
      do{
          System.out.println("1. Abrir Tienda \n"
                  + "2. Ver Cola");
      capa = leer.nextInt();
        switch(capa){
          
          case 1: 
               cola.insertar(a.leerArchivo("C:\\Users\\Pc1\\Desktop\\Proyetos_Java\\NiceCream\\src\\main\\java\\com\\mycompany\\nicecream\\Participantes.in"));
              break;
              
          case 2: 
                System.out.println(cola.mostrar());
              break;
          
      }
      
      
      }while(capa != 3);
    
     
      
        
      
    
       
       
     
        
       
    }
    
}
