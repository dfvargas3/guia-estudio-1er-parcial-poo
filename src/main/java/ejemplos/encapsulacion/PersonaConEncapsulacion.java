package ejemplos.encapsulacion;

/**
 * SOLUCIÓN: Clase CON encapsulación
 * 
 * Ventajas:
 * - Los atributos son privados (no se pueden acceder directamente)
 * - Se usan getters (para leer) y setters (para modificar)
 * - Se pueden validar los valores antes de asignarlos
 * - Se protege el estado del objeto
 */
public class PersonaConEncapsulacion {
    // SOLUCIÓN: Atributos privados (solo accesibles dentro de esta clase)
    private String nombre;
    private int edad;
    private double salario;
    
    // GETTERS: Métodos para LEER los atributos privados
    
    /**
     * Getter para nombre
     * @return el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Getter para edad
     * @return la edad de la persona
     */
    public int getEdad() {
        return edad;
    }
    
    /**
     * Getter para salario
     * @return el salario de la persona
     */
    public double getSalario() {
        return salario;
    }
    
    // SETTERS: Métodos para MODIFICAR los atributos privados (con validación)
    
    /**
     * Setter para nombre con validación
     * @param nombre el nuevo nombre (no puede ser vacío)
     */
    public void setNombre(String nombre) {
        // VALIDACIÓN: El nombre no puede ser nulo o vacío
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("ERROR: El nombre no puede estar vacío");
            return;
        }
        this.nombre = nombre;
    }
    
    /**
     * Setter para edad con validación
     * @param edad la nueva edad (debe ser positiva y menor a 150)
     */
    public void setEdad(int edad) {
        // VALIDACIÓN: La edad debe ser positiva y realista
        if (edad < 0) {
            System.out.println("ERROR: La edad no puede ser negativa");
            return;
        }
        if (edad > 150) {
            System.out.println("ERROR: La edad no es realista");
            return;
        }
        this.edad = edad;
    }
    
    /**
     * Setter para salario con validación
     * @param salario el nuevo salario (no puede ser negativo)
     */
    public void setSalario(double salario) {
        // VALIDACIÓN: El salario no puede ser negativo
        if (salario < 0) {
            System.out.println("ERROR: El salario no puede ser negativo");
            return;
        }
        this.salario = salario;
    }
    
    /**
     * Método para mostrar información
     */
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Salario: " + salario);
    }
}
