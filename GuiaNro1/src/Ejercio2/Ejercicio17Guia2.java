 /*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, 
 si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 * * * * 
 *     *
 *     *
 * * * *

 */
package Ejercio2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rapp
 */
public class Ejercicio17Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        if (num >= 0 && num <= 99) {
            //sup
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
            System.out.println();
            //centro
            for (int i= 0; i< num-2; i++){
                System.out.print("*");
                for( int j =0; j<num-2;j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            
            
            
            //inf
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }

            
            
        }

    }

}
