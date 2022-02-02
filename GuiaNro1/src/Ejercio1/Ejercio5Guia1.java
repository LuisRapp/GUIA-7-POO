/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla
 el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
 Math.sqrt().
 */
package Ejercio1;

import java.util.Scanner;

/**
 *
 * @author Rapp
 */
public class Ejercio5Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // Creamos el Scanner, se crea una vez y sirve para los datos que se ingresan
        System.out.println("Ingrese un número");
        int num1 = leer.nextInt(); // Leer un entero
        int result1 = (int) Math.sqrt(num1);
        int result2 = num1 * 2;
        int result3 = num1 * 3;
        System.out.println("El resultado es: " + result1);
        System.out.println("El resultado es: " + result2);
        System.out.println("El resultado es: " + result3);
    }

}
