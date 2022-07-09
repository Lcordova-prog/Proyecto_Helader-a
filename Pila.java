
package com.mycompany.nicecream;
                  
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class nodo1{
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
    
    boolean vacia(){
        return top == null;
    }
    
    public void Apilar(String sabor, String Complemento){
       nodo1 x = new nodo1(sabor,Complemento);
       x.siguiente = top;
       top = x;
       porciones ++;
        try(
                       
            FileWriter fw = new FileWriter("C:\\Users\\Pc1\\Desktop\\Proyetos_Java\\NiceCream\\src\\main\\java\\com\\mycompany\\nicecream\\Ventas.txt", true);
            FileReader fr = new FileReader("C:\\Users\\Pc1\\Desktop\\Proyetos_Java\\NiceCream\\src\\main\\java\\com\\mycompany\\nicecream\\Ventas.txt")
                ){
         
            fw.write("Barquillas vendidas: "+sabor+"$"+"\r\n"+"\r\n");
            fw.flush();
            int valor = fr.read();
            while(valor !=-1){
               
                valor = fr.read();
            }
        }catch(IOException e){
            System.out.println("ERROR E/S: "+e);
        }
        
    }
    
    public int CantidadPor(){
        return porciones;
    }
    
    public String mostrar(){
        if (vacia()) {
            System.out.println("No hay más porciones");
            return null;
        }else{
            return top.Complemento +"\n"+ top.sabor;
        }
    }
    public nodo1 Borrar(){
        if (vacia()) {
            return top;
        }else{
            nodo1 aux = top;
            top = top.siguiente;
            aux.siguiente = null;
            porciones--;
            return aux;
            
        }
        
    }
    
}
