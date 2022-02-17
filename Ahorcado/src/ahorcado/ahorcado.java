package ahorcado;

import java.lang.reflect.Array;
import java.util.Locale;
import java.util.Scanner;

public class ahorcado {

    private String palabra_buscar[];
    private int letras_encontradas;
    private int jugadas_maximas;

    public ahorcado() {
    }

    public ahorcado(String[] palabra_buscar, int jugadas_maximas) {
        this.palabra_buscar = palabra_buscar;
        this.jugadas_maximas = jugadas_maximas;
    }
    private static Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    public void crearjuego() {
        System.out.println("Ingrese una palabra");
        String palabra = leer.next();
        palabra_buscar = palabra.split("");
        letras_encontradas = 0;
    }

    public void mostrarlongitud() {

        System.out.printf("La longitud de la palabra es igual a: %d", Array.getLength(this.palabra_buscar));

    }

    public void buscar(String letra) {

        int contrepetido = 0;
        String vectorResultado[]= new String [palabra_buscar.length-1];
        for (int i = 0; i < palabra_buscar.length; i++) {
            if (palabra_buscar[i].equals(letra)) {
                contrepetido++;
                vectorResultado[i]=palabra_buscar[i];
            }

        }
        encontradas (letra,contrepetido);

    }
    
    public boolean encontradas(String letra, int contrepetido ){
        System.out.println(" ");
        System.out.println("La letra ingresada se repite: " + contrepetido + " veces");
        System.out.println(" "(palabra_buscar.length()-contrepetido));
    }
    
    

//     jugadas_maximas=10;
//        System.out.printf("Le quedan %d",jugadas_maximas);
}
