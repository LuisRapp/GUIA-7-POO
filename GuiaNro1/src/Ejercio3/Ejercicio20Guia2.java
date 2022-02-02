/*
 Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y 
 los muestre por pantalla en orden descendente.
 */
package Ejercio3;

/**
 *
 * @author Rapp
 */
public class Ejercicio20Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     rellenar ();
    }

    public static void rellenar() {
        int[] num = new int[100];
        for (int i = 0; i < num.length; i++) {
            num[i] = i;
        }
        for (int i = num.length  -1; i > 0; i--) {
            System.out.println(num[i] + " ");
        }
        

    }

}
