/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
 tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
 con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer 
 carácter tiene que ser X y el último tiene que ser una O. 
 Las secuencias leídas que respeten el formato se consideran correctas, la 
 secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda 
 secuencia distinta de FDE, que no respete el formato se considera incorrecta. 
 Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
 correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo 
 se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package Ejercio2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rapp
 */
public class Ejercicio16Guia2 {

//    private static Object chain;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int i = 0;
        int j = 0;
        String chain;
        do {
            System.out.println("Ingrese codigo");
            chain = leer.next();
            int lon = chain.length();
            if (lon > 5) {
                System.out.println("La cadena tiene mas de 5 caracteres");
            }
            if (chain.substring(0, 1).equalsIgnoreCase("X") && chain.substring(4, 5).equalsIgnoreCase("O")) {
                i++;
            } else if (!chain.equals("&&&&&")) {
                j++;
            }
        } while (!chain.equals("&&&&&"));
        System.out.println("La cantidad de cadenas correctas es de: "+i+" y La cantidad de cadenas incorrectas es de: "+j);
    }

}
