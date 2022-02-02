/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio 
 de tipo real. A continuación, se deben crear los siguientes métodos:
 a) Método constructor que inicialice el radio pasado como parámetro. x
 b) Métodos get y set para el atributo radio de la clase Circunferencia. x
 c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
 del objeto.
 d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
 e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package ejercicio2G7;

/**
 *
 * @author Rapp
 */
public class Circunferencia {

    private double radio;

    //Constructor
    public Circunferencia() {

    }

    //Get and Set
    public double getCircunferencia() {
        return radio;
    }

    public void setCircunferencia(double radio) {
        this.radio = radio;
    }

    // crearCircunferencia()
    public void crearCircunferencia(double radio) {

        this.radio = radio;

    }

    // Método area()
    public void MétodoArea() {
        System.out.println("El valor del area es de: " + Math.PI*Math.pow(radio, 2));
    }
// Métodoperimetro

    public void MétodoPerimetro() {
        System.out.println("El valor de la circunferencia es de: " + (2 * Math.PI * radio));
    }

}
