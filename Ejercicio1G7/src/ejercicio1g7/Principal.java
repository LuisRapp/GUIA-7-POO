/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
 Autor, Número de páginas, y un constructor con todos los atributos pasados por
 parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
 datos al usuario y luego informar mediante otro método el número de ISBN, el título,
 el autor del libro y el numero de páginas
 */
package ejercicio1G7;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rapp
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        libro libro1 = new libro();
        System.out.println("Ingrese el ISBN");
        String isbn = scan.next();

        System.out.println("Ingrese el titulo");
        String titulo = scan.next();

        System.out.println("Ingrese el Autor");
        String autor = scan.next();

        System.out.println("Ingrese el número de paginas");
        int numPag = scan.nextInt();

        libro1.llenarlibro(isbn, titulo, autor, numPag);

        libro1.mostrarLibro();
    }

}
