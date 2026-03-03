package ejemplos.constructores;

/**
 * EJEMPLO: Constructor por defecto
 * 
 * Si NO defines ningún constructor, Java crea uno automáticamente (vacío)
 */
public class ProductoSinConstructor {
    private String nombre;
    private double precio;
    private int cantidad;
    
    // NOTA: No hay constructores definidos
    // Java creará automáticamente: public ProductoSinConstructor() { }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
