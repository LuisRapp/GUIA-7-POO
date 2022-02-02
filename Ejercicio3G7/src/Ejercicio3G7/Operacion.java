/*
 Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main
 */
package Ejercicio3G7;

/**
 *
 * @author Rapp
 */
public class Operacion {
    private double num1;
    private double num2;
    
    //Constructor por parametro
    public Operacion( double num1,double num2){
        this.num1=num1;
        this.num2=num2;          
    }
    
    //Constructor vacio
    public Operacion () {
        
    }
    
    //Get and Set

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
    
    //crearOperacion()
    public void crearOperacion(double num1, double num2){
        this.num1=num1;
        this.num2=num2;
    }
    
    
    
    //metodo sumar
    public void Sumar(double num1, double num2){
        System.out.println("La suma de los números ingresados es: "+(num1+num2));
    }
    
    //metodo restar
    public void Restar(double num1, double num2){
        System.out.println("La resta de los números ingresados es: "+(num1-num2));
    }
    
    //metodo multiplicar
    public void Multiplicar(double num1, double num2){
        System.out.println("El producto de los números ingresados es: "+(num1*num2));
    }
    //metodo dividir
    public void Dividir(double num1, double num2){
        System.out.println("La division de los números ingresados es: "+(num1/num2));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
