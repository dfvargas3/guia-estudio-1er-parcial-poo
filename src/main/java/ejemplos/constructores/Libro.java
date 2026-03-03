package ejemplos.constructores;

/**
 * EJEMPLO: Sobrecarga de Constructores
 * 
 * Sobrecarga = varios constructores con diferentes parámetros
 * 
 * Demuestra:
 * - Múltiples formas de crear el mismo objeto
 * - Uso de this() para llamar a otro constructor
 */
public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private double precio;
    
    // CONSTRUCTOR 1: Vacío
    public Libro() {
        this.titulo = "Sin título";
        this.autor = "Sin autor";
        this.numeroPaginas = 0;
        this.precio = 0.0;
    }
    
    // CONSTRUCTOR 2: Solo título y autor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = 0;
        this.precio = 0.0;
    }
    
    // CONSTRUCTOR 3: Título, autor y páginas
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.precio = 0.0;
    }
    
    // CONSTRUCTOR 4: Todos los parámetros
    public Libro(String titulo, String autor, int numeroPaginas, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.precio = precio;
    }
    
    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " de " + autor + 
                         ", Páginas: " + numeroPaginas + ", Precio: $" + precio);
    }
}
