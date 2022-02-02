/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
 Autor, Número de páginas, y un constructor con todos los atributos pasados por
 parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
 datos al usuario y luego informar mediante otro método el número de ISBN, el título,
 el autor del libro y el numero de páginas
 */
package ejercicio1G7;

/**
 *
 * @author Rapp
 */
public class libro {

    private String isbn; // atributo privado para el encapsulamiento

    private String titulo; // atributo privado para el encapsulamiento

    private String autor; // atributo privado para el encapsulamiento

    private double numPag; // atributo privado para el encapsulamiento

    //Constructor con parametros
    public libro(String isbn, String titulo, String autor, int numPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;

    }

    //Constructor vacio 
    public libro() {

    }

    //get and set
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    //Llenar
    public void llenarlibro(String isbn, String titulo, String autor,int numPag) {

        // Se usa el this para diferenciar variable de atributo, ya que tienen el mismo nombre
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;

    }

    //Mostrar perros mediante un metodo
    public void mostrarLibro() {

        System.out.println("El ISBN es: " + isbn);
        System.out.println("El titulo es: " + titulo);
        System.out.println("El autor es:" + autor);
        System.out.println("Tiene : " + numPag+ "paginas");

    }

}
