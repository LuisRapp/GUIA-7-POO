/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
 solicite números al usuario hasta que la suma de los números introducidos supere 
 el límite inicial. 
 */
package Ejercio2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rapp
 */
public class Ejercio13Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int suma=0;
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese una cantidad de valores a sumar");
        int num = leer.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese un valor");
            int num2 = leer.nextInt();
            suma=suma+num2;
           
        }
          if (num<suma) {
            System.out.println("El resultado es: " +suma);
        } else {
            System.out.println("Error, ingrese nuevos valores");
            for (int i = 0; i < num; i++) {
            System.out.println("Ingrese un valor");
            int num2 = leer.nextInt();
            suma=suma+num2;
        }
             System.out.println("El resultado es: "+suma);
        }
     
    }

}
