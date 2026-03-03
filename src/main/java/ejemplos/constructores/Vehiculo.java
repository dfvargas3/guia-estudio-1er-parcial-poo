package ejemplos.constructores;

/**
 * EJEMPLO AVANZADO: Uso de this() para llamar a otro constructor
 * 
 * Esto evita repetir código y hace el código más mantenible
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private String color;
    
    // Constructor completo
    public Vehiculo(String marca, String modelo, int año, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
    }
    
    // Constructor que usa this() para llamar al constructor completo
    public Vehiculo(String marca, String modelo, int año) {
        this(marca, modelo, año, "Sin color"); // Llama al constructor de arriba
    }
    
    // Constructor que llama a otro constructor
    public Vehiculo(String marca, String modelo) {
        this(marca, modelo, 2024); // Llama al constructor de arriba
    }
    
    // Constructor mínimo
    public Vehiculo() {
        this("Sin marca", "Sin modelo"); // Llama al constructor de arriba
    }
    
    public void mostrarInfo() {
        System.out.println("Vehículo: " + marca + " " + modelo + 
                         " (" + año + "), Color: " + color);
    }
}
