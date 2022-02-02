/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en
 grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package Ejercio1;

import java.util.Scanner;

/**
 *
 * @author Rapp
 */
public class Ejercio4Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // Creamos el Scanner, se crea una vez y sirve para los datos que se ingresan
        System.out.println("Ingrese una cantidad de grados centigrados");
        int gradosC = leer.nextInt(); // Leer un entero
        int result = (gradosC * 9 / 5) + 32;
        System.out.println("El resultado es: " + result);
    }

}
