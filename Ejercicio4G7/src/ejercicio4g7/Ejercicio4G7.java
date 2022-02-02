/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo
 privado base y un atributo privado altura. La clase incluirá un método para crear el
 rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
 método para calcular la superficie del rectángulo y un método para calcular el
 perímetro del rectángulo. Por último, tendremos un método que dibujará el
 rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
 los métodos getters, setters y constructores correspondientes.
 Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ejercicio4g7;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rapp
 */
public class Ejercicio4G7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Rectangulo rectangulo = new Rectangulo();
        System.out.println("Ingrese la base");
        double base = scan.nextDouble();
        rectangulo.setBase(base);
        System.out.println("Ingrese la altura");
        double altura = scan.nextDouble();
        rectangulo.setAltura(altura);
        double base3 = rectangulo.getBase();
        double altura3 = rectangulo.getAltura();

        if (base3 == altura3) {
            System.out.println("Error! Ingrese base y alturas distintas");
            System.out.println("Ingrese la base");
            base = scan.nextDouble();
            rectangulo.setBase(base);
            System.out.println("Ingrese la altura");
            altura = scan.nextDouble();
            rectangulo.setAltura(altura);
        }

        rectangulo.superficieRectangulo();
        rectangulo.perimetroRectangulo();
        rectangulo.dibujarRectangulo();

    }

}
