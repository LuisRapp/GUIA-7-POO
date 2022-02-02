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
 Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número
 */
package ejercicio9g7;

//import java.util.Locale;
//import java.util.Scanner;

/**
 *
 * @author Rapp
 */
public class Ejercicio9G7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //   Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Matematica objeto = new Matematica();
        objeto.setNum1((double) Math.round(((Math.random() * -21)+10) * 100) / 100);
        System.out.println("" + objeto.getNum1());
        objeto.setNum2((double)Math.round(((Math.random() * -21)+10) * 100) / 100);
        System.out.println("" + objeto.getNum2());
        objeto.calculaRaiz();
       // System.out.println(" ");
        objeto.calcularPotencia();
        objeto.devolverMayor();
                
    }

}
