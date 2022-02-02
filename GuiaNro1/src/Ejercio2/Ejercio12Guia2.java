/*
 Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
 la nota se pedirá de nuevo hasta que la nota sea correcta. 
 */
package Ejercio2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rapp
 */
public class Ejercio12Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese su nota");
        int nota = leer.nextInt();
        if (nota == 0 || nota <= 10) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }

    }

}
