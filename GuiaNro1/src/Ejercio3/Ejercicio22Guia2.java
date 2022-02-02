/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
 cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Ejercio3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rapp
 */
public class Ejercicio22Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingrese la dimension del vector");
        int j = leer.nextInt();
        int[] num = new int[j];
        cargar (num, j);
         digitos(num, j);
    }
 public static void cargar(int[] num, int n) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese valor en la posicion " + i);
            num[i] = leer.nextInt();
        }

    }

    public static void digitos(int[] num, int n) {
        int  con = 0, res , c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;

        for (int i = 0; i < n; i++) {
            res = num[i];
            while(res>=1){
            res=res/10;
            con++;
            }
            switch (con) {
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
                case 3:
                    c3++;
                    break;
                case 4:
                    c4++;
                    break;
                case 5:
                    c5++;
                    break;

            }
            con=0;
        }
        System.out.println("hay " + c1 + " numeros de un digito");
        System.out.println("hay " + c2 + " numeros de dos digito");
        System.out.println("hay " + c3 + " numeros de tres digito");
        System.out.println("hay " + c4 + " numeros de cuatro digito");
        System.out.println("hay " + c5 + " numeros de cinco digito");
    }

}



