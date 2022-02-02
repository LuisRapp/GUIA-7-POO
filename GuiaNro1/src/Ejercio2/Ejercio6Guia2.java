/*
 Implementar un programa que dado dos números enteros determine cuál es el
 mayor y lo muestre por pantalla
 New Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US)

 */
package Ejercio2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rapp
 */
public class Ejercio6Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US); // Creamos el Scanner, se crea una vez y sirve para los datos que se ingresan
        System.out.println("Ingrese un número");
        int num1 = leer.nextInt(); // Leer un entero
        System.out.println("Ingrese un número");
        int num2 = leer.nextInt(); // Leer un entero
        if (num1 > num2) {
            System.out.println("El número más grande es: " + num1);
        } else {
            System.out.println("El número más grande es: " + num2);
        }

    }

}
