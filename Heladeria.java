
package com.mycompany.nicecream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Heladeria {
   static String registroParticipantes;

    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
      Lector a = new Lector();
      Cola2 co = new Cola2();
      Pila pi = new Pila();
      Cola c;
      int Sabor = 0;
      int capa = 0;
      int po =0;
    
      do{
          System.out.println("\n 1. Abrir Tienda \n"
                  + "2. Ver \n"
                  + "3. Atender \n "
                  + "4. Elegir porciones\n"
                  + "5. Ver Cuenta");
      capa = leer.nextInt();
        switch(capa){
          
          case 1: 
               try(
                       
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Pc1\\Desktop\\Proyetos_Java\\NiceCream\\src\\main\\java\\com\\mycompany\\nicecream\\Ventas.txt", true));
             BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pc1\\Desktop\\Proyetos_Java\\NiceCream\\src\\main\\java\\com\\mycompany\\nicecream\\Participantes.in"));
                ){
        
            bw.flush();
          String linea;
            while((linea = br.readLine()) != null){
               co.Insertar(linea+" ");
               
            }
        }catch(IOException e){
            System.out.println("ERROR E/S: "+e);
        }
        
             
              break;
              
          case 2: 
               System.out.println(co.mostrar());
              break;
          
          case 3:
                   co.Atender();
                   Sabor = 1;
              break;
              
          case 4:
              do{
                  System.out.println("1. Chocolate \n"
                          + "2. Fresa \n"
                          + "3. Ver \n"
                          + "4. Borrar\n");
                  po = leer.nextInt();
                  switch(po){
                      case 1:
                          pi.Apilar("Chocolate");
                          Sabor++;

                          break;
                             
                      case 2:
                           pi.Apilar("Fresa");
                          break; 
                      case 3:
                          System.out.println(pi.mostrar()); 
                          break;
                            case 4:
                                if (!pi.vacia()) {
                                      pi.Borrar();
                                }else{
                                    System.out.println("va");
                                }
                       
                          break;
                          
                  }
              }while(po !=6 );
             case 5:
                 if (!co.vacio()) {
                      System.out.println("Cliente: "+co.Primero());       
                      System.out.println("La cuenta es: "+Sabor);
                 }else{
                     System.out.println("No hay clientes");
                 }
                               
                                break;
                         
      }
      
      
      }while(capa != 6);
    
     
      
        
      
    
       
       
     
        
       
    }
    
}
