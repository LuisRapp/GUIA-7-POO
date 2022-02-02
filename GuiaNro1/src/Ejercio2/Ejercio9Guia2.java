/*
 Realizar un programa que solo permita introducir solo frases o palabras de 8 de 
 largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir 
 un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
 imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 ================================================================================
 length() Retorna la longitud de la cadena
 */
package Ejercio2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rapp
 */
public class Ejercio9Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese una frase de 8 caracteres");
        String frase = leer.next();
        int var1 = frase.length();
        // int length = S1.length();       
        if (var1 == 8) {
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto!");
        }
    }

}
