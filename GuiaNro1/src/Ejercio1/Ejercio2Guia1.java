/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
 por pantalla.
 */
package Ejercio1;

import java.util.Scanner;

/**
 *
 * @author Rapp
 */
public class Ejercio2Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in); // Creamos el Scanner, se crea una vez y sirve para los datos que se ingresan
        System.out.println("Ingrese su nombre");
        String cadena = leer.nextLine();
        System.out.println("El nombre de usuario es: " + cadena);

    }

}
