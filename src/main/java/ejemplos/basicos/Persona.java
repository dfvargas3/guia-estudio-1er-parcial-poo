package ejemplos.basicos;

/**
 * EJEMPLO 1: Clase y Objeto Básico
 * 
 * Esta clase demuestra:
 * - ¿Qué es una clase? (plantilla/molde)
 * - ¿Qué son los atributos? (estado/datos)
 * - ¿Qué son los métodos? (comportamiento/acciones)
 */
public class Persona {
    // ATRIBUTOS (Estado del objeto)
    // Estos son datos/propiedades que tiene cada persona
    String nombre;
    int edad;
    String nacionalidad;
    
    // MÉTODOS (Comportamiento del objeto)
    // Estas son acciones que puede realizar una persona
    
    /**
     * Método que representa la acción de correr
     */
    public void correr() {
        System.out.println(nombre + " está corriendo.");
    }
    
    /**
     * Método que representa la acción de comer
     */
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }
    
    /**
     * Método que muestra información de la persona
     */
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Nacionalidad: " + nacionalidad);
    }
    
    /**
     * Método con un parámetro
     */
    public void saludar(String mensaje) {
        System.out.println(nombre + " dice: " + mensaje);
    }
}
