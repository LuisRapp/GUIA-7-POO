/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.
 */
package Ejercio1;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Rapp
 */
public class Ejercio3Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in); // Creamos el Scanner, se crea una vez y sirve para los datos que se ingresan
            System.out.println("Ingrese una frase"); 
             String cadena = leer.nextLine(); 
        String mayuscula= toUpperCase(cadena);
        String miniscula= toLowerCase(cadena);
        System.out.println(mayuscula);
         System.out.println(miniscula);
    }
    
}
