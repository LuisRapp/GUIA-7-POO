/*
 Realizar un programa que pida dos números enteros positivos por teclado y 
 muestre por pantalla el siguiente menú:
 MENU
 1. Sumar
 2. Restar
 3. Multiplicar
 4. Dividir
 5. Salir
 Elija opción:
 El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
 pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
 opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir 
 del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
 ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
 carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package Ejercio2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rapp
 */
public class Ejercicio14Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese primer numero a operar");
        double num1 = leer.nextDouble();
        System.out.println("Ingrese segundo numero a operar");
        double num2 = leer.nextDouble();
        int opc;
        String salir;
        salir = "N";
         System.out.print("\033[H\033[2J");
            System.out.flush();
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("      MENU     ");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("La suma entre " + num1 + " y " + num2 + " es " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta entre " + num1 + " y " + num2 + " es " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El producto entre " + num1 + " y " + num2 + " es " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir por cero");
                    } else {
                        System.out.println("El cociente entre " + num1 + " y " + num2 + " es " + (num1 / num2));
                    }
                    break;
                case 5:
                    System.out.println("Seguro que desea salir (S/N)?");
                    salir = leer.next();
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
                    break;

            }

        } while (!salir.equals("S"));

    }

}
   
