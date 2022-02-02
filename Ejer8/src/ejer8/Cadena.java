/*
 Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
 String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
 una frase que puede ser una palabra o varias palabras separadas por un espacio en
 blanco y a través de los métodos set, se guardará la frase y la longitud de manera
 automática según la longitud de la frase ingresada. Deberá además implementar los
 siguientes métodos:
 • Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
 frase ingresada.
 • Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
 Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
 • Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
 y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
 Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
 • Método compararLongitud(String frase), deberá comparar la longitud de la frase
 que compone la clase con otra nueva frase ingresada por el usuario.
 • Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
 con una nueva frase ingresada por el usuario y mostrar la frase resultante.
 • Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
 encuentren en la frase, por algún otro carácter seleccionado por el usuario y
 mostrar la frase resultante.
 • Método contiene(String letra), deberá comprobar si la frase contiene una letra que
 ingresa el usuario y devuelve verdadero si la contiene y falso si no
 */
package ejer8;

/**
 *
 * @author Rapp
 */
public class Cadena {

    private String frase;
    private int longitud;
///////////

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    /////
    public Cadena() {

    }
//////////

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
////
    public void mostrarVocales() {
        int contVocales = 0;
        for (int i = 0; i < longitud; i++) {
            if (this.frase.toLowerCase().substring(i, i + 1).equals("a")
                    || this.frase.toLowerCase().substring(i, i + 1).equals("e")
                    || this.frase.toLowerCase().substring(i, i + 1).equals("i")
                    || this.frase.toLowerCase().substring(i, i + 1).equals("o")
                    || this.frase.toLowerCase().substring(i, i + 1).equals("u")) {
                contVocales++;
            }

        }
        System.out.println("La cantidad de vocales encontradas es de: " + contVocales);

    }

    //////////////////
    public void invertirFrase() {
        for (int i = longitud - 1; i >= 0; i--) {
            System.out.print(frase.charAt(i));
         //  StringBuilder.reverse
        }

    }

    ///////////////////////
    public void vecesRepetido(String letra) {
        int contrepetido = 0;
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, i + 1).equals(letra)) {
                contrepetido++;

            }

        }
        System.out.println("La letra ingresada se repite: " + contrepetido + " veces");
    }
////////////////////////////////////

    public void compararLongitud(String frase) {
        //crear varaible .lenght
        if (this.frase.length() > frase.length()) {
            System.out.println("La frase ingresada es menor que la frase original");
        } else if (this.frase.length() < frase.length()) {
            System.out.println("La frase ingresada es mayor que la frase original");
        } else {
            System.out.println("Las frases son iguales");
        }
    }
/////////////////////////////////////////

    public void unirFrase(String frase) {
        //.concat()

        System.out.println("Las frases unidas: " + this.frase + " " + frase);
    }

    /////////////////////////////////
    public void remplazarLetra(String letra) {
        this.frase = this.frase.replace("a", letra);
        System.out.println("La frase con el caracter remplazado es: " + this.frase);

    }
///////////////////////////////

    public boolean contieneLetra(String letra) {
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, i + 1).equals(letra)) {
                System.out.println("La frase contiene la letra");
                return true;
//contains() 
            }

        }
        return false;
    }
 
   
}

