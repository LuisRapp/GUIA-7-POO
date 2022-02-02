/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
 pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: 
 investigar la función equals() en Java.
 ===============================================================================
 equals(String str) Sirve para comparar si dos cadenas son iguales. 
 Devuelve true si son iguales y false si no
 */
package Ejercio2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rapp
 */
public class Ejercio8Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese eureka, para obtener el mensaje secreto");
        String n1 = leer.next();
        if (n1.equals("eureka")) {
            System.out.println("Felices fiestas!!!!");
        } else {
            System.out.println("Ingrese eureka");
        }

    }

}
