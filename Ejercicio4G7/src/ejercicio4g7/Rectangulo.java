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

/**
 *
 * @author Rapp
 */
public class Rectangulo {
    private double base;
    private double altura; 

    
    //// Constructor Parametrizado
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
     //// Constructor
    public Rectangulo() {
       
    }
    ///// Get and set

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    /// metodos 
    
    ///Superficie
    
    public void superficieRectangulo() {
 
        //double superfice = (base *altura);
        System.out.println("La superficie del rectángulo es de: "+ (base*altura)); 
    }
    
    //Perimetro
     public void perimetroRectangulo() {
        System.out.println("El perimetro del rectángulo es de: "+((this.base+this.altura)*2)); 
    }
     //dibujo 
     public  void dibujarRectangulo () {
         //sup
            for (int i = 0; i < base; i++) {
                System.out.print("*");
            }
            System.out.println();
            //centro
            for (int i= 0; i< altura-2; i++){
                System.out.print("*");
                for( int j =0; j<altura -2;j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            
            
            
            //inf
            for (int i = 0; i < base; i++) {
                System.out.print("*");
            }
           System.out.println(" "); 
        
    }
     
     
     
     
     
}

