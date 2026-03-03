package ejemplos.constructores;

/**
 * EJEMPLO: Constructor con validaciones
 * 
 * Los constructores también deben validar para evitar objetos en estado inválido
 */
public class PersonaValidada {
    private String nombre;
    private int edad;
    
    /**
     * Constructor vacío
     */
    public PersonaValidada() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }
    
    /**
     * Constructor con validaciones
     * @param nombre nombre de la persona (no puede estar vacío)
     * @param edad edad de la persona (debe ser positiva)
     */
    public PersonaValidada(String nombre, int edad) {
        // VALIDACIÓN 1: El nombre no puede ser nulo o vacío
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        
        // VALIDACIÓN 2: La edad debe ser positiva
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        
        // VALIDACIÓN 3: La edad debe ser realista
        if (edad > 150) {
            throw new IllegalArgumentException("La edad no es realista");
        }
        
        // Si todo está bien, asignamos los valores
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    // Setters con validación
    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        if (edad > 150) {
            throw new IllegalArgumentException("La edad no es realista");
        }
        this.edad = edad;
    }
    
    public void mostrarInfo() {
        System.out.println("Persona: " + nombre + ", Edad: " + edad);
    }
}
