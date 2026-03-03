package ejemplos.encapsulacion;

/**
 * PROBLEMA: Clase SIN encapsulación
 * 
 * ¿Cuál es el problema?
 * - Los atributos son públicos
 * - Cualquiera puede modificarlos sin control
 * - Se pueden asignar valores inválidos
 */
public class PersonaSinEncapsulacion {
    // PROBLEMA: Atributos públicos (acceso sin control)
    public String nombre;
    public int edad;
    public double salario;
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Salario: " + salario);
    }
}

/**
 * NOTA: Ejecuta DemoEncapsulacion.java para ver por qué esto es un problema
 */
