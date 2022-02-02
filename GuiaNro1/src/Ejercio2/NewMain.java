/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercio2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rapp
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String frase;
        int c,inc;
        c=0;
        inc=0;
        do {
            System.out.println("Ingrese codigo");
            frase=leer.next();
            if (frase.length()==5 && frase.substring(0,1).equals("O") && frase.substring(4,5).equals("X") ) {
                c++;
            }else if(!frase.equals("&&&&&")){
            inc++;
            }   
            
        } while (!frase.equals("&&&&&"));
        System.out.println("Las lecturas correctas fueron "+c+" y las incorrectas "+inc);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
