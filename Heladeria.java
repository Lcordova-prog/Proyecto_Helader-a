
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
        LocalTime hora = LocalTime.now();

        Date fechaActual = new Date();
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
        int sifresa = 0;
        int sicaramelo = 0;
        int arequipe = 0;
        int nutella = 0;
        int cereales = 0;
        int galleta = 0;
        //Aqui termina
        int Sabor = 2;
        int capa = 0;
        int po = 0;
        int pe = 0;

        do {
            if (co.vacio()) {
                   System.out.println("         <HELADERIA NICE CREAM> \n"
                    + "<HACEMOS HELADOS DE VERDAD EN POCOS MINUTOS> ");
            System.out.println("\t" + "--------------------");
            System.out.println("\t" + "| 1. Abrir Tienda   |\n"
                    + "\t" + "| 2. Ver            |\n"
                    + "\t" + "| 3. Atender        |\n"
                    + "\t" + "| 4.Elegir porciones|\n"
                    + "\t" + "| 5. Ver Cuenta     |\n"
                    + "\t" + "| 6. Elegir toppings|\n"
                    + "\t" + "| 7 Eliminar Pila   |\n"
                    + "\t" + "| 8. Facturar       |\n"
                    + "\t" + "| 0. Salir          |");
            System.out.println("\t" + "--------------------");
            }else{
                 System.out.println("         <HELADERIA NICE CREAM> \n"
                    + "<HACEMOS HELADOS DE VERDAD EN POCOS MINUTOS> ");
            System.out.println("\t" + "--------------------");
            System.out.println("\t" + "| 1. Abrir Tienda   |\n"
                    + "\t" + "| 2. Ver            |\n"
                    + "\t" + "| 3. Atender        |\n"
                    + "\t" + "| 4.Elegir porciones|\n"
                    + "\t" + "| 5. Ver Cuenta     |\n"
                    + "\t" + "| 6. Elegir toppings|\n"
                    + "\t" + "| 7 Eliminar Pila   |\n"
                    + "\t" + "| 0. Salir          |");
            System.out.println("\t" + "--------------------");  
            }
         
            capa = leer.nextInt();
            switch (capa) {

                case 1: 
                    if (co.vacio()) {
                         try (
                       
                            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Pc1\\Desktop\\Proyetos_Java\\NiceCream\\src\\main\\java\\com\\mycompany\\nicecream\\Ventas.txt", true));
                            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pc1\\Desktop\\Proyetos_Java\\NiceCream\\src\\main\\java\\com\\mycompany\\nicecream\\Clientes.in"));) {

                        bw.flush();
                        String linea;
                        while ((linea = br.readLine()) != null) {
                            co.Insertar(linea);

                        }
                    } catch (IOException e) {
                        System.out.println("ERROR E/S: " + e);
                    }

                    }else{
                        System.out.println("Espere que se atiendan a todos");
                    }
              
                    break;

                case 2:
                    System.out.println(co.mostrar());
                    break;

                case 3:
                    
                      try (
                              
                            FileWriter fw = new FileWriter("C:\\Users\\Pc1\\Desktop\\Proyetos_Java\\NiceCream\\src\\main\\java\\com\\mycompany\\nicecream\\Ventas.txt", true);
                            FileReader fr = new FileReader("C:\\Users\\Pc1\\Desktop\\Proyetos_Java\\NiceCream\\src\\main\\java\\com\\mycompany\\nicecream\\Ventas.txt")) {
                          
                          if (!co.vacio()) {
                            fw.write("\r\n" + sdf.format(fechaActual) + " " + hora + "\r" + "\n");  
                          }
                          
                        
                          if (pi.porciones == 0 && !co.vacio()) {
                               fw.write("\n Cliente:  " + co.Primero() + " No realizo ninguna compra" + "\r" + "\n");
                          }
                          
                          
                        if (pi.porciones == 1) {

                            fw.write("\n Cliente:  " + co.Primero() + " Compro una barquilla con: " + pi.Barquilla5() + " Con un valor: " + Sabor + "$" + "\r" + "\n");
                        }

                        if (pi.porciones == 2) {

                            fw.write("\r " + "\n Cliente:  " + co.Primero() + " Compro una barquilla con: " + pi.Barquilla5() + "-" + pi.Barquilla4() + " Con un valor: " + Sabor + "$" + "\r" + "\n");
                        }
                        if (pi.porciones == 3) {

                            fw.write(" Cliente:  " + co.Primero() + " Compro una barquilla con : " + pi.Barquilla5() + "-" + pi.Barquilla4() + "-" + pi.Barquilla3() + " Con un valor: " + Sabor + "$" + "\r" + "\n");
                        }
                        if (pi.porciones == 4) {

                            fw.write("\r" + "\n Cliente:  " + co.Primero() + " Compro una barquilla con : " + pi.Barquilla5() + "-" + pi.Barquilla4() + "-" + pi.Barquilla3() + "-" + pi.Barquilla2() + " Con un valor: " + Sabor + "$" + "\r" + "\n");
                        }
                        if (pi.porciones == 5) {

                            fw.write("\r" + "\n Cliente:  " + co.Primero() + " Compro una barquilla con : " + pi.Barquilla5() + "-" + pi.Barquilla4() + "-" + pi.Barquilla3() + "-" + pi.Barquilla2() + "-" + pi.Barquilla() + " Con un valor: " + Sabor + "$" + "\r" + "\n");
                        }

                        fw.flush();
                        int valor = fr.read();
                        while (valor != -1) {

                            valor = fr.read();
                        }
                    } catch (IOException e) {
                        System.out.println("ERROR E/S: " + e);
                    }
                     
                    co.Atender();
                    limite = 0;
                    limite2 = 0;
                    Sabor = 2;
                  
                   pi.borraRapido();
                     pi.porciones = 0;
                    break;

                case 4:
                    do {
                        if (!co.vacio()) {

                            System.out.println("1. Chocolate \n"
                                    + "  ----------\n"
                                    + "2. Fresa \n"
                                    + "  ----------\n"
                                    + "3. Mantecado \n"
                                    + "  ----------\n"
                                    + "4. Mora\n"
                                    +  " ----------\n"
                                    + "5. Kiwi\n"
                                    + " ----------\n"
                                    + "6. Parchita\n"
                                    + " ----------\n"
                                    + "7. Ver\n"
                                    + " ----------\n"
                                    + "8. Ver cantidad\n"
                                    + " ----------\n"
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
                                        System.out.println("Top del helado: "+"<"+pi.mostrar()+">");
                                        break;
                                  
                                    case 8:
                                        System.out.println("La cantidad es: " + pi.CantidadPor());

                                        break;

                                }
                            } else {
                                System.out.println("No puede solicitar más porciones de helado");
                            }
                        } else {
                            System.out.println("No hay clientes");
                        }

                    } while (po != 0);
                    break;
                case 5:
                    if (!co.vacio()) {
                        System.out.println("\t" + "   FACTURA DE CUENTA");
                        System.out.println("\t" + "    ________________");
                        System.out.println("\t" + "|Cliente: " + co.Primero() + "|");
                        System.out.println("\t" + "   |La cuenta es: " + Sabor + "$" + "|");
                        System.out.println("\t" + "  Su helado contiene: \n" + pi.MostrarCuenta()
                                + "                 V");
                        System.out.println("");
                    } else {
                        System.out.println("No hay clientes");
                    }

                    break;

                case 6:
                    do {
                        if (!co.vacio()) {
                            System.out.println("|TIPOS DE TOPPINGS|\n"
                                    + "1.  Sirope de chocolate \n"
                                    + "   ----------\n"
                                    + "2. Sirope de fresa \n"
                                    + "   ----------\n"
                                    + "3. Sirope de caramelo \n"
                                    + "   ----------\n"
                                    + "4. Arequipe\n"
                                    + "   ----------\n"
                                    + "5. Nutella\n"
                                    + "   ----------\n"
                                    + "6. Cereales\n"
                                    + "   ----------\n"
                                    + "7. Galletas\n"
                                    + "   ----------\n"
                                    + "8. Ver cantidad\n"
                                    + "   ----------\n"
                                    + "9. Ver pila\n"
                                    + "   ----------\n"
                                    + "0. Salir");
                            pe = leer.nextInt();
                            if (limite2 < 2 || pe == 8 || pe == 9 || pe == 0) {
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
                                        System.out.println("La cantidad es: " + pi.CantidadPor() + "topping");

                                        break;

                                    case 9:
                                         System.out.println("Top del helado: "+"<"+pi.mostrar()+">");
                                        break;
                                }

                            } else {
                                System.out.println("No puede seleccionas más topping, " + " Maximo 2 topping");

                            }
                        } else {
                            System.out.println("No hay clientes");
                        }

                    } while (pe != 0);
                    break;
                case 7:
                                            if (!pi.vacia()) {
                                            if (pi.Barquilla5().equals("Sirope de chocolate")) {
                                                sichocolate--;
                                                 limite2--;
                                            }
                                            if (pi.Barquilla5().equals("Sirope de fresa")) {
                                                sifresa--;
                                                 limite2--;
                                            }
                                            if (pi.Barquilla5().equals("Sirope de caramelo")) {
                                                sicaramelo--;
                                                 limite2--;
                                            }
                                            if (pi.Barquilla5().equals("Arequipe")) {
                                                arequipe--;
                                                 limite2--;
                                            }
                                            if (pi.Barquilla5().equals("Nutella")) {
                                                nutella--;
                                                 limite2--;
                                            }
                                            if (pi.Barquilla5().equals("Cereales")) {
                                                cereales--;
                                                 limite2--;
                                            }
                                            if (pi.Barquilla5().equals("Galletas")) {
                                                galleta--;
                                                 limite2--;
                                            }
                                            //porciones
                                                if (pi.Barquilla5().equals("Chocolate")) {
                                                chocolate--;
                                                limite--;
                                            }
                                            if (pi.Barquilla5().equals("Fresa")) {
                                                Fresa--;
                                                 limite--;
                                            }
                                            if (pi.Barquilla5().equals("Mantecado")) {
                                                Mantecado--;
                                                 limite--;
                                            }
                                            if (pi.Barquilla5().equals("Mora")) {
                                                Mora--;
                                                 limite--;
                                            }
                                            if (pi.Barquilla5().equals("Kiwi")) {
                                                Kiwi--;
                                                 limite--;
                                            }
                                            if (pi.Barquilla5().equals("Parchita")) {
                                                Parchita--;
                                                 limite--;
                                            }
                                            pi.Borrar();
                                           
                                            Sabor--;

                                        } else {
                                            System.out.println("No hay porciones");
                                        }

                                      
                        break;
                case 8:
                    if (co.vacio()) {
                       
                             try (
                                FileWriter fw = new FileWriter("C:\\Users\\Pc1\\Desktop\\Proyetos_Java\\NiceCream\\src\\main\\java\\com\\mycompany\\nicecream\\descuentos_inventario.txt", true);
                                FileReader fr = new FileReader("C:\\Users\\Pc1\\Desktop\\Proyetos_Java\\NiceCream\\src\\main\\java\\com\\mycompany\\nicecream\\descuentos_inventario.txt")) {

                         
                            fw.write("\r\n" + sdf.format(fechaActual) + " " + hora + "\r" + "\n");
                     
                          if (chocolate > Fresa || chocolate > Mantecado || chocolate > Mora || chocolate > Kiwi || chocolate > Parchita) {
                                       fw.write("\r\n" + "Porciones de helados más vendidas: " + "\r\n" + "chocolate: " + chocolate + "Uds" + "\r\n");
                               
                                 }
                                      if (Fresa > chocolate || Fresa > Mora || Fresa > Mantecado || Fresa >  Kiwi || Fresa > Parchita) {
                                        fw.write("\r\n" + "Porciones de helados más vendidas: " + "\r\n" + "Fresa: " + Fresa + "Uds" + "\r\n");  
                             
                                 }
                                      if (Mantecado > chocolate || Mantecado >Fresa || Mantecado > Mora || Mantecado > Kiwi || Mantecado > Parchita) {
                                        fw.write("\r\n" + "Porciones de helados más vendidas: " + "\r\n" + "Mantecado: " + Mantecado + "Uds" + "\r\n");
                                                                                                
                                      
                                      }
                                      if (Mora > chocolate || Mora >Fresa  || Mora > Mantecado  || Mora > Kiwi || Mora > Parchita) {
                                        fw.write("\r\n" + "Porciones de helados más vendidas: " + "\r\n" + "Mora: " + Mora + "Uds" + "\r\n");
                                    
                                  
                                      }
                                      if (Kiwi > chocolate || Kiwi >Fresa  || Kiwi > Mantecado || Kiwi> Mora   || Kiwi > Parchita) {
                                        fw.write("\r\n" + "Porciones de helados más vendidas: " + "\r\n" + "Kiwi: " + Kiwi + "Uds" + "\r\n");                                                                                                                                         
                                
                                 }
                                      if (Parchita > chocolate || Parchita > Mantecado || Parchita > Mora || Parchita > Kiwi || Parchita > Fresa) {
                                        fw.write("\r\n" + "Porciones de helados más vendidas: " + "\r\n" + "Parchita: " + Parchita + "Uds" + "\r\n");
                                        
                                    
                                    }
                    
                                 
                                 
//                                 //Por menor
                                   if (chocolate < Fresa || chocolate < Mantecado || chocolate < Mora ||chocolate < Kiwi || chocolate < Parchita) {
                                       fw.write("\r\n" + "Porciones de helados menos vendida: " + "\r\n" + "chocolate: " + chocolate + "Uds" + "\r\n");
                                   }
//                                 //Aqui
                                    if (Fresa < chocolate || Fresa < Mora || Fresa < Mantecado || Fresa <  Kiwi || Fresa < Parchita) {
                                        fw.write("\r\n" + "Porciones de helados menos vendida: " + "\r\n" + "Fresa: " + Fresa + "Uds" + "\r\n");
                                         
                                      
                                        
                                       }
//                                        //Aqui
//                                 
                                      if (Mantecado < chocolate || Mantecado <Fresa || Mantecado < Mora || Mantecado < Kiwi || Mantecado < Parchita) {
                                        fw.write("\r\n" + "Porciones de helados menos vendida: " + "\r\n" + "Mantecado: " + Mantecado + "Uds" + "\r\n");
                                                                                                
                                      
                                      }
//                                        //Aqui
                                         if (Mora < chocolate || Mora <Fresa  || Mora < Mantecado  || Mora < Kiwi || Mora < Parchita) {
                                        fw.write("\r\n" + "Porciones de helados menos vendida: " + "\r\n" + "Mora: " + Mora + "Uds" + "\r\n");
                                    
                                  
                                      }
//                                     
//                                    
//                                       //Aqui
                                        if (Kiwi < chocolate || Kiwi < Fresa  || Kiwi < Mantecado || Kiwi < Mora   || Kiwi < Parchita) {
                                        fw.write("\r\n" + "Porciones de helados menos vendida: " + "\r\n" + "Kiwi: " + Kiwi + "Uds" + "\r\n");                                                                                                                                         
                                 
                                 }   
                                      
                                 
                                       //Toppings
                                         
                                       if (sichocolate  > sifresa || sichocolate > sicaramelo || sichocolate > arequipe ||sichocolate > nutella || sichocolate > cereales || sichocolate > galleta) {
                                       fw.write("\r\n" + "Toppings más vendido: " + "\r\n" + "sirope de chocolate: " + sichocolate + "Uds" + "\r\n");
                                 }
                                 //Aqui
                                    if (sifresa > sichocolate || sifresa > sicaramelo || sifresa > arequipe || sifresa >  nutella || sifresa > cereales || sifresa > galleta ) {
                                        fw.write("\r\n" + "Toppings más vendido: " + "\r\n" + "sirope de fresa: " + sifresa + "Uds" + "\r\n");
                                         
                                      
                                        
                                       }
                                        //Aqui
                                 
                                      if (sicaramelo > sichocolate || sicaramelo >sifresa || sicaramelo > arequipe || sicaramelo > nutella || sicaramelo > cereales || sicaramelo > galleta ) {
                                        fw.write("\r\n" + "Toppings más vendido: " + "\r\n" + "sirope de caramelo: " + sicaramelo + "Uds" + "\r\n");
                                                                                                
                                      
                                      }
                                        //Aqui
                                      if (arequipe > sichocolate || arequipe >sifresa || arequipe > sicaramelo || arequipe > nutella || arequipe > cereales || arequipe > galleta ) {
                                        fw.write("\r\n" + "Toppings más vendido: " + "\r\n" + "arequipe: " + arequipe + "Uds" + "\r\n");
                                                                                                
                                      
                                      }
                                     
                                    
                                       //Aqui
                                       if (nutella > sichocolate || nutella >sifresa || nutella > sicaramelo || nutella > arequipe || nutella > cereales || nutella > galleta ) {
                                        fw.write("\r\n" + "Toppings más vendido: " + "\r\n" + "nutella: " + nutella + "Uds" + "\r\n");
                                                                                                
                                      
                                      }
                                      
                                      //Aqui
                                       if (cereales > sichocolate || cereales >sifresa || cereales > sicaramelo || cereales > arequipe || cereales > nutella || cereales > galleta ) {
                                        fw.write("\r\n" + "Toppings más vendido: " + "\r\n" + "cereales: " + cereales + "Uds" + "\r\n");
                                                                                                
                                      
                                      }
                                 
                                 //Por menor
                                  if (sichocolate  < sifresa || sichocolate < sicaramelo || sichocolate < arequipe ||sichocolate < nutella || sichocolate < cereales || sichocolate < galleta) {
                                       fw.write("\r\n" + "Toppings menos vendido: " + "\r\n" + "sirope de chocolate: " + sichocolate + "Uds" + "\r\n");
                                 }
                                 //Aqui
                                    if (sifresa < sichocolate || sifresa < sicaramelo || sifresa < arequipe || sifresa <  nutella || sifresa < cereales || sifresa < galleta ) {
                                        fw.write("\r\n" + "Toppings menos vendido: " + "\r\n" + "sirope de fresa: " + sifresa + "Uds" + "\r\n");
                                         
                                      
                                        
                                       }
                                        //Aqui
                                 
                                      if (sicaramelo < sichocolate || sicaramelo < sifresa || sicaramelo < arequipe || sicaramelo < nutella || sicaramelo < cereales || sicaramelo < galleta ) {
                                        fw.write("\r\n" + "Toppings menos vendido: " + "\r\n" + "sirope de caramelo: " + sicaramelo + "Uds" + "\r\n");
                                                                                                
                                      
                                      }
                                        //Aqui
                                      if (arequipe < sichocolate || arequipe < sifresa || arequipe < sicaramelo || arequipe < nutella || arequipe < cereales || arequipe < galleta ) {
                                        fw.write("\r\n" + "Toppings menos vendido: " + "\r\n" + "arequipe: " + arequipe + "Uds" + "\r\n");
                                                                                                
                                      
                                      }
                                     
                                    
                                       //Aqui
                                       if (nutella < sichocolate || nutella <sifresa || nutella < sicaramelo || nutella < arequipe || nutella < cereales || nutella < galleta ) {
                                        fw.write("\r\n" + "Toppings menos vendido: " + "\r\n" + "nutella: " + nutella + "Uds" + "\r\n");
                                                                                                
                                      
                                      }
                                      
                                      //Aqui
                                       if (cereales < sichocolate || cereales <sifresa || cereales < sicaramelo || cereales < arequipe || cereales < nutella || cereales < galleta ) {
                                        fw.write("\r\n" + "Toppings menos vendido: " + "\r\n" + "cereales: " + cereales + "Uds" + "\r\n");
                                                                                                
                                      
                                      }
                                    
                            fw.append("\n");
                            
                            fw.flush();
                            int valor = fr.read();
                            while (valor != -1) {

                                valor = fr.read();
                            }
                        } catch (IOException e) {
                            System.out.println("ERROR E/S: " + e);
                        }

                   
                        }else{
                        System.out.println("Espere que se atiendan a todos para poder efectuar la transacción");
                    }

                      
                    break;

            }

        } while (capa != 0);

    }

}
