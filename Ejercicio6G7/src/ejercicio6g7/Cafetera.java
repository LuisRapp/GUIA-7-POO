/*
 Programa Nespresso. Desarrolle una clase Cafetera con los atributos
 capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
 cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
 menos, los siguientes métodos: 
 • Constructor predeterminado o vacío x
 • Constructor con la capacidad máxima y la cantidad actual x
 • Métodos getters y setters. x
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

/**
 *
 * @author Rapp
 */
public class Cafetera {

    private double capacidadMaxima = 1000;
    private double capacidadActual;

    //Constructor
    public Cafetera() {

    }

    //Constructor Parametrizado
    public Cafetera(double capacidadMaxima, double capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    //Get and Set
    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    // llenarCafetera()
    public void llenarCafetera() {
        this.capacidadActual = this.capacidadMaxima;
        System.out.println("Cafetera llenada con exito");
    }

    // vaciarCafetera()

    public void vaciarCafetera() {
        capacidadActual = 0;
        System.out.println("Cafetera vaciada con exito");
    }

    // agregarCafe()

    public void agregarCafe(double cafe) {
        if (cafe + this.capacidadActual > this.capacidadMaxima) {

            System.out.printf("La cafetera se lleno por completo y sobro %f \n", (cafe + this.capacidadActual) - this.capacidadMaxima);
            this.capacidadActual = this.capacidadMaxima;
        } else {
            this.capacidadActual += cafe;
            System.out.printf("Se agrego el cafe y hay %f \n", this.capacidadActual);
        }

    }

    //servir taza
    public void servirTaza(double servir) {
        if (servir > this.capacidadActual) {
            servir = this.capacidadActual;
            System.out.printf("Taza servida con %f \n", servir);
            this.capacidadActual = 0;
        } else {
            this.capacidadActual -= servir;    //this.cantidadActual=this.cantidadActual-servir;
            System.out.printf("Taza llena por completo con %f \n", servir);
        }

    }

}
