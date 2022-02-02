/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercio1;

import java.util.Scanner;

/**
 *
 * @author Rapp
 */
public class Ejercio1Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Scanner leer = new Scanner(System.in); // Creamos el Scanner, se crea una vez y sirve para los datos que se ingresan
        System.out.println("Ingrese un número");
        int num1 = leer.nextInt(); // Leer un entero
        System.out.println("Ingrese otro número");
        int num2 = leer.nextInt(); // Leer un entero
        int result = num1 + num2;
        System.out.println("El resultado es: " + result);
        
    }
    
}
