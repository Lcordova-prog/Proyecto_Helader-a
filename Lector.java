
package com.mycompany.nicecream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Lector {
     public String leerArchivo(String Nombre) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(Nombre));

        String fila;
        fila = br.readLine();
        String d = fila;
        while ((fila = br.readLine()) != null) {
            d += "\t" + fila;
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
