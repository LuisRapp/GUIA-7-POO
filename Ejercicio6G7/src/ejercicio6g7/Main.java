/*
 Programa Nespresso. Desarrolle una clase Cafetera con los atributos
 capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
 cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
 menos, los siguientes métodos: 
 • Constructor predeterminado o vacío
 • Constructor con la capacidad máxima y la cantidad actual
 • Métodos getters y setters.
 • Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
 máxima. 
 • Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
 tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
 cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
 método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
 cuanto quedó la taza.
 • Método vaciarCafetera(): pone la cantidad de café actual en cero. 
 • Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
 recibe y se añade a la cafetera la cantidad de café indicada.

 */
package Ejercicio6G7;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cafetera cafetera = new Cafetera();
        int opcionMenu;
        int opcionSubMenu;
        do {
            //System.out.println(cafetera.getCapacidadActual());
            System.out.println("----------------------");
            System.out.println("1.LLenar cafetera ");
            System.out.println("2.Vaciar cafetera");
            System.out.println("3.Cargar cafetera");
            System.out.println("4.Servir Taza");
            System.out.println("5.Salir");

            System.out.println("----------------------");
            opcionMenu = leer.nextInt();
            switch (opcionMenu) {
                case 1:
                    cafetera.llenarCafetera();
                    System.out.println(cafetera.getCapacidadActual());
                    break;
                case 2:
                    cafetera.vaciarCafetera();
                    System.out.println(cafetera.getCapacidadActual());
                    break;
                case 3:
                    System.out.println("Ingrese cuanto cafe desea agregar a la cafetera");
                    cafetera.agregarCafe(leer.nextInt());
                    // System.out.println(cafetera.getCapacidadActual());
//                System.out.println(""+cafetera.getcapacidadActual);  
                    break;
                case 4:
                    do {
                        System.out.println("-----SUB MENU-----");
                        System.out.println("1-Taza de 150cc");
                        System.out.println("2-Taza de 250cc");
                        System.out.println("3-Taza de 300cc");
                        opcionSubMenu = leer.nextInt();
                        switch (opcionSubMenu) {
                            case 1:
                                cafetera.servirTaza(150);
                                break;
                            case 2:
                                cafetera.servirTaza(250);
                                break;
                            case 3:
                                cafetera.servirTaza(300);
                                break;
                            default:
                                System.out.println("Ingrese opcion correcta!");
                        }
                    } while (opcionSubMenu < 1 || opcionSubMenu > 3);
                    break;
                case 5:
                    System.out.println("SALIENDO");
                    break;
                default: 
                    System.out.println("Error, ingrese una opcion valida");

            }
        } while (opcionMenu != 5);

    }

}
