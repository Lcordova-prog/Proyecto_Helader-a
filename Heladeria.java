
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
        int chocolate = 0;
        int Mantecado = 0;
        int Fresa = 0;
        int Mora = 0;
        int limite = 0;
        int Kiwi = 0;
        int Parchita = 0;
        int Sabor = 2;
        int capa = 0;
        int po = 0;
        int pe = 0;

        do {
            System.out.println("");
            System.out.println("1. Abrir Tienda \n"
                    + "2. Ver \n"
                    + "3. Atender \n"
                    + "4. Elegir porciones\n"
                    + "5. Ver Cuenta\n"
                    + "6. Elegir toppings\n"
                    + "7. Facturar");
            capa = leer.nextInt();
            switch (capa) {
             
                case 1: 
               try (
                            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Pc1\\Desktop\\Proyetos_Java\\NiceCream\\src\\main\\java\\com\\mycompany\\nicecream\\Ventas.txt", true));
                            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pc1\\Desktop\\Proyetos_Java\\NiceCream\\src\\main\\java\\com\\mycompany\\nicecream\\Participantes.in"));) {

                        bw.flush();
                        String linea;
                        while ((linea = br.readLine()) != null) {
                            co.Insertar(linea);

                        }
                    } catch (IOException e) {
                        System.out.println("ERROR E/S: " + e);
                    }

                    break;

                case 2:
                    System.out.println(co.mostrar());
                    break;

                case 3:
                    co.Atender();
                    limite = 0;
                    Sabor = 2;
                    break;
                  
                case 4: 
                    do {
                          if (!co.vacio()) {
                        
                        System.out.println("1. Chocolate \n"
                                + "2. Fresa \n"
                                + "3. Mantecado \n"
                                + "4. Mora\n"
                                + "5. Kiwi\n"
                                + "6. Parchita\n"
                                + "7. Ver\n"
                                + "8. Borrar\n"
                                + "0. Salir");
                        po = leer.nextInt();
                              if (limite < 3) {
                                         switch (po) {
                            case 1:
                                pi.Apilar("Chocolate", "");
                                Sabor++; 
                                limite++;
                                chocolate++;
                                break;
                            case 2:
                                pi.Apilar("Fresa", "");
                                Fresa++;
                                  limite++;
                                Sabor++;
                                break;
                            case 3:
                                pi.Apilar("Mantecado", "");
                                Sabor++;
                                  limite++;
                                Mantecado++;
                                break;
                            case 4:
                                pi.Apilar("Mora", " ");
                                Sabor++;
                                  limite++;
                                Mora++;
                                break;
                            case 5:
                                pi.Apilar("Kiwi", "");
                                Sabor++;
                                  limite++;
                                Kiwi++;
                                break;
                            case 6:
                                pi.Apilar("Parchita", "");
                                Sabor++;
                                  limite++;
                                Parchita++;
                                break;
                            case 7:
                                System.out.println(pi.mostrar());

                                break;
                            case 8:
                                if (!pi.vacia()) {
                                    pi.Borrar();
                                    limite--;
                                    Sabor--;
                                } else {
                                    System.out.println("No hay porciones");
                                }
                                break;
                            case 9:
                                System.out.println("La cantidad es: " + pi.CantidadPor());

                                break;

                        }
                    }else{
                                
                                  System.out.println("No puede solicitar más porciones");
                          }
                              }else{
                                System.out.println("No hay clientes");
                          }
                 
                    } while (po != 0);

                case 5:
                    if (!co.vacio()) {
                        System.out.println("Cliente: " + co.Primero());
                        System.out.println("La cuenta es: " + Sabor + "$");
                    } else {
                        System.out.println("No hay clientes");
                    }

                    break;

                case 6:
                    do {
                        System.out.println("1.  Sirope de chocolate \n"
                                + "2. Sirope de fresa \n"
                                + "3. Sirope de caramelo \n"
                                + "4. Arequipe\n"
                                + "5. Nutella\n"
                                + "6. Cereales\n"
                                + "7. Galletas\n"
                                + "8. Ver\n"
                                + "9. Borrar\n"
                                + "10. Ver cantidad\n"
                                + "0. Salir");
                        pe = leer.nextInt();
                        switch (pe) {
                            case 1:
                                pi.Apilar("", "Sirope de chocolate.");
                                Sabor++;
                                break;
                            case 2:
                                pi.Apilar("", "Sirope de fresa");
                                Sabor++;
                                break;
                            case 3:
                                pi.Apilar("", "Sirope de caramelo");
                                Sabor++;
                                break;
                            case 4:
                                pi.Apilar("", "Arequipe");
                                Sabor++;
                                break;
                            case 5:
                                pi.Apilar("", "Nutella");
                                Sabor++;
                                break;
                            case 6:
                                pi.Apilar("", "Cereales");
                                Sabor++;
                                break;
                            case 7:
                                pi.Apilar("", "Galletas");
                                Sabor++;
                                break;
                            case 8:
                                System.out.println(pi.mostrar());
                                break;
                            case 9:
                                if (!pi.vacia()) {
                                    pi.Borrar();
                                    Sabor--;
                                } else {
                                    System.out.println("No hay porciones");
                                }

                                break;
                            case 10:
                                System.out.println("La cantidad es: " + pi.CantidadPor());

                                break;

                        }
                    } while (pe != 0);
                    break;

                case 7: 
                                  try (
                            FileWriter fw = new FileWriter("C:\\Users\\Pc1\\Desktop\\Proyetos_Java\\NiceCream\\src\\main\\java\\com\\mycompany\\nicecream\\descuentos_inventario.txt", true);
                            FileReader fr = new FileReader("C:\\Users\\Pc1\\Desktop\\Proyetos_Java\\NiceCream\\src\\main\\java\\com\\mycompany\\nicecream\\descuentos_inventario.txt")) {

                        fw.write("Porciones más vendidas: " + "\r\n" + "Chocolate:" + chocolate + "Uds" + "\r\n" + "Fresa: " + Fresa + "Uds" + "\r\n");
                        fw.flush();
                        int valor = fr.read();
                        while (valor != -1) {

                            valor = fr.read();
                        }
                    } catch (IOException e) {
                        System.out.println("ERROR E/S: " + e);
                    }
                    break;
            }

        } while (capa != 8);

    }

}
