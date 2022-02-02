/*
 Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa 
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package Ejercio2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio15Guia2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int suma, num;
        suma = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("ingrese numero");
            num = leer.nextInt();
            if (num > 0) {
                suma = suma + num;
            } else if (num == 0) {
                break;
            }
        }
        System.out.println("La suma es " + suma);

    }

}