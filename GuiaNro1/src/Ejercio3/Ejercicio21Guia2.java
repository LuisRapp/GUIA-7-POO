/*
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le 
 pida al usuario un numero a buscar en el vector. El programa mostrará donde se 
 encuentra el numero y si se encuentra repetido
 */
package Ejercio3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rapp
 */
public class Ejercicio21Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingrese la dimension del vector");
        int j = leer.nextInt();
        double[] num = new double[j];
        System.out.print("Ingrese el valor que desea encontrar");
        int b = leer.nextInt();
        rellenar(num, b, j);
    }

    public static void rellenar(double[] num, int b, int j) {
        int pos, c;
        c = 0;
        pos = 0;
        //rellena
        for (int i = 0; i < j; i++) {
            num[i] = Math.floor(Math.random() * 10);
        }
        //buscador, aumenta la variable c que funciona como contador y la variable pos es igual al indice donde esta el vector
        for (int i = 0; i < j; i++) {
            if (num[i] == b) {
                pos = i;
                c++;

            }
        }
        switch (c) {
            case 0:
                System.out.println("el valor " + b + " no se encontro en el vector");
                break;
            case 1:
                System.out.println("El valor " + b + " se econontro en el vector en la posicion " + pos);
                break;
            default:
                System.out.println("El valor " + b + " se encontro en la posicion " + pos + " y esta repetido");
                break;
        }
        for (int i = 0; i < j; i++) {
            System.out.print(num[i] + " ");
        }

    }

}
