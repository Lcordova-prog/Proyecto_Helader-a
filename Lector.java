
package com.mycompany.nicecream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Lector {
    Cola2 a = new Cola2();
     public String leerArchivo(String Nombre) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pc1\\Desktop\\Proyetos_Java\\NiceCream\\src\\main\\java\\com\\mycompany\\nicecream\\Participantes.in"));
 
        String fila;
        fila = br.readLine();
        String d = fila;
        while ((fila = br.readLine()) != null) {
             d+= " - " +fila;
        }
        return d;

    }

    public void escribirArchivo(String nombre) throws IOException {
        FileWriter archi = new FileWriter(nombre, true);
        try (PrintWriter pw = new PrintWriter(archi)) {
            pw.println(nombre);
               pw.close(); //Cerrar el archivo.
        }

    }
}
