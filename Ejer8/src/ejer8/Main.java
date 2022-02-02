/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
package ejer8;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rapp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cadena cadena = new Cadena();
        System.out.println("Ingrese una frase para comenzar");
        String ingreso = leer.next();
        cadena.setLongitud(ingreso.length());
        cadena.setFrase(ingreso);
        boolean salir = false;
        int opcionMenu = 0;
        while (!salir) {
            System.out.println("---------Menu---------");
            System.out.println("|1-Mostrar las vocales            |");
            System.out.println("|2-Invertir Frase                 |");
            System.out.println("|3-Veces que se repite un caracter|");
            System.out.println("|4-Comparar frase                 |"); 
            System.out.println("|5-Unir Frase                     |");
            System.out.println("|6-Reemplazar las 'a'             |");
            System.out.println("|7-Buscar un caracter             |");
            System.out.println("|8-Salir                          |");
            opcionMenu = (leer.nextInt());

            switch (opcionMenu) {
                case 1:
                    cadena.mostrarVocales();
                    System.out.println(" ");
            
                    break;
                case 2:
                    cadena.invertirFrase();
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Ingrese un caracter para ver cuantas veces se repitio");
                    cadena.vecesRepetido(leer.next());
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("Ingrese una frase para comparar la longitud");
                    cadena.compararLongitud(leer.next());
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println("Ingrese un frase para unirla");
                    cadena.unirFrase(leer.next());
                    System.out.println(" ");
                    break;
                case 6:
                    System.out.println("Ingrese un caracter para remplazar las a ");
                    cadena.remplazarLetra(leer.next());
                    System.out.println(" ");
                    break;
                case 7:
                    System.out.println("Ingrese un caracter para buscarlo en la frase ");
                    cadena.contieneLetra(leer.next());
                    System.out.println(" ");
                    break;
                case 8:
                    salir = true;
                    break;

            }

        }

    }

}
