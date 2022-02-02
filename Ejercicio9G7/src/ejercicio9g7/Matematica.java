package ejercicio9g7;
        /*
 Realizar una clase llamada Matemática que tenga como atributos dos números reales
 con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
 un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
 usará el Math.random para generar los dos números y se guardaran en el objeto con
 su respectivos set. Deberá además implementar los siguientes métodos:
 • Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
 valor
 • Método calcularPotencia() para calcular la potencia del mayor valor de la clase
 elevado al menor número. Previamente se deben redondear ambos valores.
 • Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
 Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */

/**
 *
 * @author Rapp
 */

public class Matematica {

    private double num1;
    private double num2;

    ////
    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //////////
    public Matematica() {

    }
    ////////////

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    //• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor

    public double devolverMayor() {
        System.out.printf("El numero mayor es %.2f\n",Math.max(num1, num2));
        return Math.max(num1, num2);
    }

// Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.
    public void calcularPotencia() {
   
     System.out.printf("la potencia de %.2f elevado a %.2f  es  %.2f \n" , Math.max(num1, num2), Math.min(num1, num2) , Math.pow(Math.round(Math.max(num1, num2)), Math.round(Math.min(num1, num2))));
    }
// • Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    //Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

    public void calculaRaiz() {
        System.out.printf("La raiz cuadrada de %.2f es %.2f \n" ,Math.min(num1, num2), Math.sqrt(Math.abs(Math.min(num1, num2))));

    }

}
