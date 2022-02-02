/*
 Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice 
 que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero 
 cambiada de signo. Es decir, A es anti simétrica si A = -AT
 . La matriz traspuesta de 
 una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o 
 viceversa)
 */
package Ejercio3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rapp
 */
public class Ejercio24Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese las filas");
        int f = leer.nextInt();
        System.out.println("Ingrese las columnas");
        int c = leer.nextInt();
        int[][] M = new int[f][c];
        cargar(M, f, c);
        comprobar(M, f, c);
        mostrar(M, f, c);

    }

    /////////////////////////////Cargar/////////////////////////////////////////
    public static void cargar(int[][] M, int f, int c) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                System.out.println("ingrese valor en la posicion [" + i + "][" + j + "]");
                M[i][j] = leer.nextInt();
            }

        }
    }

    /////////////////////////////Comprobar////////////////////////////////////////
    public static void comprobar(int[][] M, int f, int c) {
        boolean log = false;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if (M[i][j] == -M[j][i]) {
                    log = true;

                }
            }
        }
        if (log) {
            System.out.println("La matriz es antiSimetrica");
        } else {
            System.out.println("La matriz no es antisimetrica");
        }
    }

    /////////////////////////////mostrar////////////////////////////////////////
    public static void mostrar(int[][] M, int f, int c) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(M[i][j] + " ");

            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(M[j][i] + " ");

            }
            System.out.println("");
        }
    }

}
