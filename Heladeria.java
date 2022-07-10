
package com.mycompany.nicecream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class Heladeria {

    static String registroParticipantes;

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
          SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        LocalTime hora =  LocalTime.now();
        
        Date fechaActual = new Date();
        Lector a = new Lector();
        Cola2 co = new Cola2();
        Pila pi = new Pila();
        //Porciones de helados
        int chocolate = 0;
        int Mantecado = 0;
        int Fresa = 0;
        int Mora = 0;
        int limite = 0;
        int limite2 = 0;
        int Kiwi = 0;
        int Parchita = 0;
       //Toppings
       int sichocolate = 0;
       int sifresa =0;
       int sicaramelo = 0;
       int arequipe = 0;
       int nutella = 0;
       int cereales = 0;
       int galleta = 0;
        int Sabor = 2;
        int capa = 0;
        int po = 0;
        int pe = 0;

        do {
            System.out.println("         <HELADERIA NICECREAM> \n"
                    + "<HACE HELADOS DE VERDAD EN POCOS MINUTOOOS> ");
            System.out.println("\t"  +"--------------------");
            System.out.println("\t"  +"| 1. Abrir Tienda   |\n"
                    + "\t"  +"| 2. Ver            |\n"
                    + "\t"  +"| 3. Atender        |\n"
                    + "\t"  +"| 4.Elegir porciones|\n"
                    + "\t"  +"| 5. Ver Cuenta     |\n"
                    + "\t"  +"| 6. Elegir toppings|\n"
                    + "\t"  +"| 7. Facturar       |"
                    );
            System.out.println("\t"  +"--------------------");
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
                    
                      try(
                       
            FileWriter fw = new FileWriter("C:\\Users\\Pc1\\Desktop\\Proyetos_Java\\NiceCream\\src\\main\\java\\com\\mycompany\\nicecream\\Ventas.txt", true);
            FileReader fr = new FileReader("C:\\Users\\Pc1\\Desktop\\Proyetos_Java\\NiceCream\\src\\main\\java\\com\\mycompany\\nicecream\\Ventas.txt")
                ){
                             fw.write("\r\n"+sdf.format(fechaActual)+" "+hora+"\r"+"\n");
                          if (pi.porciones == 1) {
                           
                               fw.write("\n Cliente:  "+co.Primero()+" Compro una barquilla con: "+pi.Barquilla5()+" Con un valor: "+Sabor+"$"+"\r"+"\n");
                          }
           
                          if (pi.porciones == 2) {
                           
             fw.write("\r "+"\n Cliente:  "+co.Primero()+" Compro una barquilla con: "+pi.Barquilla5()+"-"+pi.Barquilla4()+" Con un valor: "+Sabor+"$"+"\r"+"\n");
                          }
                          if (pi.porciones == 3) {
                          
             fw.write(" Cliente:  "+co.Primero()+" Compro una barquilla con : "+pi.Barquilla5()+"-"+pi.Barquilla4()+"-"+pi.Barquilla3()+" Con un valor: "+Sabor+"$"+"\r"+"\n");
                          }
                               if (pi.porciones == 4) {
                                
             fw.write("\r"+"\n Cliente:  "+co.Primero()+" Compro una barquilla con : "+pi.Barquilla5()+"-"+pi.Barquilla4()+"-"+pi.Barquilla3()+"-"+pi.Barquilla2()+" Con un valor: "+Sabor+"$"+"\r"+"\n");
                          }
                                if (pi.porciones == 5) {
                                 
             fw.write("\r"+"\n Cliente:  "+co.Primero()+" Compro una barquilla con : "+pi.Barquilla5()+"-"+pi.Barquilla4()+"-"+pi.Barquilla3()+"-"+pi.Barquilla2()+"-"+pi.Barquilla()+" Con un valor: "+Sabor+"$"+"\r"+"\n");
                          }
                          
            fw.flush();
            int valor = fr.read();
            while(valor !=-1){
               
                valor = fr.read();
            }
        }catch(IOException e){
            System.out.println("ERROR E/S: "+e);
        }
                    co.Atender();
                    limite = 0;
                    limite2 = 0;
                    Sabor = 2;
                    pi.porciones = 0;
                   pi.Borrar();
                   pi.Borrar();
                   pi.Borrar();
                   pi.Borrar();
                   pi.Borrar();
                   
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
                              if (limite < 3 || po == 7 || po == 8 || po == 0) {
                                         switch (po) {
                            case 1:
                                pi.Apilar("Chocolate");
                                Sabor++; 
                                limite++;
                                chocolate++;
                                break;
                            case 2:
                                pi.Apilar("Fresa");
                                Fresa++;
                                  limite++;
                                Sabor++;
                                break;
                            case 3:
                                pi.Apilar("Mantecado");
                                Sabor++;
                                  limite++;
                                Mantecado++;
                                break;
                            case 4:
                                pi.Apilar("Mora");
                                Sabor++;
                                  limite++;
                                Mora++;
                                break;
                            case 5:
                                pi.Apilar("Kiwi");
                                Sabor++;
                                  limite++;
                                Kiwi++;
                                break;
                            case 6:
                                pi.Apilar("Parchita");
                                Sabor++;
                                  limite++;
                                Parchita++;
                                break;
                           
                            case 7:
                                System.out.println(pi.mostrar());
                                break;
                            case 8:
                                if (!pi.vacia()) {
                                  if (pi.Barquilla5().equals("Chocolate")) {
                                        chocolate--;
                                    }
                                    if (pi.Barquilla5().equals("Fresa")) {
                                        Fresa--;
                                    }
                                     if (pi.Barquilla5().equals("Mantecado")) {
                                        Mantecado--;
                                    }
                                      if (pi.Barquilla5().equals("Mora")) {
                                        Mora--;
                                    }
                                       if (pi.Barquilla5().equals("Kiwi")) {
                                        Kiwi--;
                                    }
                                        if (pi.Barquilla5().equals("Parchita")) {
                                        Parchita--;
                                    }
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
                    break;
                case 5:
                    if (!co.vacio()) {
                        System.out.println("\t"+"   FACTURA DE CUENTA");
                        System.out.println("\t"+  "    ________________");
                        System.out.println("\t"+ "    |Cliente: " + co.Primero()+"|");
                        System.out.println("\t"+"   |La cuenta es: " + Sabor + "$"+"|");
                        System.out.println("\t"+"  Su helado contiene: \n"+pi.MostrarCuenta()
                        +"                 V");
                        System.out.println("");
                    } else {
                        System.out.println("No hay clientes");
                    }

                    break;

                case 6:
                    do {
                        if (!co.vacio()) {
                                 System.out.println("1.  Sirope de chocolate \n"
                                + "2. Sirope de fresa \n"
                                + "3. Sirope de caramelo \n"
                                + "4. Arequipe\n"
                                + "5. Nutella\n"
                                + "6. Cereales\n"
                                + "7. Galletas\n"
                                + "8. Borrar\n"
                                + "9. Ver cantidad\n"
                                + "10. Ver pila\n"
                                + "0. Salir");
                        pe = leer.nextInt();
                        if (limite2 < 2 || pe == 9 || pe == 8 || pe == 10) {
                                  switch (pe) {
                            case 1:
                                pi.Apilar("Sirope de chocolate");
                                Sabor++;
                                sichocolate++;
                                limite2++;
                                break;
                            case 2:
                                pi.Apilar("Sirope de fresa");
                                Sabor++;
                                sifresa++;
                                limite2++;
                                break;
                            case 3:
                                pi.Apilar("Sirope de caramelo");
                                Sabor++;
                                sicaramelo++;
                                limite2++;
                                break;
                            case 4:
                                pi.Apilar("Arequipe");
                                Sabor++;
                                arequipe++;
                                limite2++;
                                break;
                            case 5:
                                pi.Apilar("Nutella");
                                Sabor++;
                                  limite2++;
                                  nutella++;
                                break;
                            case 6:
                                pi.Apilar("Cereales");
                                Sabor++;
                                limite2++;
                                cereales++;
                                break;
                            case 7:
                                pi.Apilar("Galletas");
                                galleta++;
                                Sabor++;
                                limite2++;
                                break;
                         
                            case 8:
                                if (!pi.vacia()) {
                                     if (pi.Barquilla5().equals("Sirope de chocolate")) {
                                        sichocolate--;
                                    }
                                     if (pi.Barquilla5().equals("Sirope de fresa")) {
                                        sifresa--;
                                    }
                                     if (pi.Barquilla5().equals("Sirope de caramelo")) {
                                        sicaramelo--;
                                    }
                                       if (pi.Barquilla5().equals("Arequipe")) {
                                        arequipe--;
                                    }
                                      if (pi.Barquilla5().equals("Nutella")) {
                                        nutella--;
                                    }
                                       if (pi.Barquilla5().equals("Cereales")) {
                                        cereales--;
                                    }
                                       if (pi.Barquilla5().equals("Galletas")) {
                                        galleta--;
                                    }
                                    pi.Borrar();
                                    limite2--;
                                    Sabor--;
                                 
                                } else {
                                    System.out.println("No hay porciones");
                                }

                                break;
                            case 9:
                                System.out.println("La cantidad es: " + pi.CantidadPor() +"topping");

                                break;

                            case 10:
                                System.out.println(pi.mostrar());
                                break;
                        }
                  
                        }else{
                            System.out.println("No puede seleccionas más topping, "+" Maximo 2 topping");
                            
                        }
                        }else{
                            System.out.println("No hay clientes");
                        }
                   
                    } while (pe != 0);
                    break;

                case 7: 
                    if (!co.vacio()) {
                        
                         try (
                            FileWriter fw = new FileWriter("C:\\Users\\Pc1\\Desktop\\Proyetos_Java\\NiceCream\\src\\main\\java\\com\\mycompany\\nicecream\\descuentos_inventario.txt", true);
                            FileReader fr = new FileReader("C:\\Users\\Pc1\\Desktop\\Proyetos_Java\\NiceCream\\src\\main\\java\\com\\mycompany\\nicecream\\descuentos_inventario.txt")) {
                         
                                   /*   for (int i = 0; i < espacios.length; i++) {
                                       espacios[i] = leer.nextInt();
                                          if (i == 0) {
                                              espacios[i] = numeromenor;
                                          }else if(espacios[i] < numeromenor){
                                             
                                          }
                                      }
                             */     
                                    fw.write("\r\n"+sdf.format(fechaActual)+" "+hora+"\r"+"\n");
                                   for (int i = 0; i < 5; i++) {
                                       if (i == 0) {
                                             fw.write("\r\n"+"Porciones de helados más vendidas: "+"\r\n"+ "Chocolate: "+chocolate+ "Uds" + "\r\n" + "Fresa:" + Fresa + "Uds" + "\r\n" + "Mantecado: " + Mantecado + "Uds" + "\r\n"+ " Mora: "+ Mora+ " Uds "+"\r\n"+" Kiwi: "+Kiwi+ "Uds" + "\r\n" +"Parchita: " +Parchita+ "Uds" +"\r\n");
                                             fw.write("\r\n"+"Toppings más vendidos: "+"\r\n"+"Sirope de chocolate: "+sichocolate+"Uds"+"\r\n"+" Sirope de fresa: "+sifresa+"Uds"+"\r\n"+" Sirope de caramelo: "+sicaramelo+"Uds"+"\r\n"+" Arequipe: "+arequipe+"Uds"+"\r\n"+" Nutella: "+nutella+"Uds"+"\r\n"+" Cereales: "+cereales+"Uds"+"\r\n"+" Galletas: "+galleta+"Uds"+"\r\n");
                                        } 
                            } 
                                   
                       
                        fw.flush();
                        int valor = fr.read();
                        while (valor != -1) {

                            valor = fr.read();
                        }
                    } catch (IOException e) {
                        System.out.println("ERROR E/S: " + e);
                    }
                    
                    }else{
                        System.out.println("No hay ventas para facturar");
                    }
                     break;  
                    
                case 8:
                      System.out.println(pi.mostrar());
                    break;
            }

        } while (capa != 9);

    }

}
