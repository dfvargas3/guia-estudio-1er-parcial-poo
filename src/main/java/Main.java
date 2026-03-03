import ejemplos.basicos.DemoBasica;
import ejemplos.encapsulacion.DemoEncapsulacion;
import ejemplos.constructores.DemoConstructores;

/**
 * PROYECTO DE ESTUDIO - POO PRIMER PARCIAL
 * 
 * Esta es la clase principal que ejecuta todas las demostraciones
 * del proyecto de estudio.
 * 
 * CÓMO USAR ESTE PROYECTO:
 * 1. Lee el README.md primero (guía teórica)
 * 2. Ejecuta esta clase Main para ver todas las demos
 * 3. Estudia el código de cada paquete:
 *    - ejemplos.basicos: Conceptos fundamentales
 *    - ejemplos.encapsulacion: Private, getters, setters
 *    - ejemplos.constructores: Constructores y sobrecarga
 * 4. Completa los ejercicios en el paquete 'ejercicios'
 * 5. Practica las 50 preguntas del README
 * 
 * Para ejecutar solo una demo específica, comenta las demás
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("╔═══════════════════════════════════════════════════════╗");
        System.out.println("║   GUÍA DE ESTUDIO - PRIMER PARCIAL POO              ║");
        System.out.println("║   Fundamentos de Programación Orientada a Objetos   ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝\n");
        
        // Menú de opciones
        System.out.println("Este proyecto incluye:");
        System.out.println("1. Demos de conceptos básicos (Clases y Objetos)");
        System.out.println("2. Demos de encapsulación (Private, Getters, Setters)");
        System.out.println("3. Demos de constructores (Vacíos, Parámetros, Sobrecarga)");
        System.out.println("4. Ejercicios prácticos para resolver");
        System.out.println("\n=======================================================\n");
        
        // Ejecutar todas las demos
        ejecutarDemoBasica();
        System.out.println("\n=======================================================\n");
        
        ejecutarDemoEncapsulacion();
        System.out.println("\n=======================================================\n");
        
        ejecutarDemoConstructores();
        System.out.println("\n=======================================================\n");
        
        mostrarInstruccionesEjercicios();
    }
    
    /**
     * Ejecuta la demostración de conceptos básicos
     */
    private static void ejecutarDemoBasica() {
        System.out.println("┌─────────────────────────────────────────────────────┐");
        System.out.println("│  DEMO 1: CONCEPTOS BÁSICOS (Clases y Objetos)      │");
        System.out.println("└─────────────────────────────────────────────────────┘\n");
        
        // Ejecutar demo básica
        DemoBasica.main(null);
    }
    
    /**
     * Ejecuta la demostración de encapsulación
     */
    private static void ejecutarDemoEncapsulacion() {
        System.out.println("┌─────────────────────────────────────────────────────┐");
        System.out.println("│  DEMO 2: ENCAPSULACIÓN (Private, Getters, Setters) │");
        System.out.println("└─────────────────────────────────────────────────────┘\n");
        
        // Ejecutar demo encapsulación
        DemoEncapsulacion.main(null);
    }
    
    /**
     * Ejecuta la demostración de constructores
     */
    private static void ejecutarDemoConstructores() {
        System.out.println("┌─────────────────────────────────────────────────────┐");
        System.out.println("│  DEMO 3: CONSTRUCTORES (Vacíos, Parámetros, Sobrecarga) │");
        System.out.println("└─────────────────────────────────────────────────────┘\n");
        
        // Ejecutar demo constructores
        DemoConstructores.main(null);
    }
    
    /**
     * Muestra instrucciones sobre ejercicios
     */
    private static void mostrarInstruccionesEjercicios() {
        System.out.println("┌─────────────────────────────────────────────────────┐");
        System.out.println("│  EJERCICIOS PRÁCTICOS                               │");
        System.out.println("└─────────────────────────────────────────────────────┘\n");
        
        System.out.println("Ahora es tu turno de practicar!");
        System.out.println("\nVe al paquete 'ejercicios' y completa:");
        System.out.println("  • Ejercicio1Rectangulo.java - Clase con cálculos geométricos");
        System.out.println("  • Ejercicio2Circulo.java - Clase con encapsulación");
        System.out.println("  • Ejercicio3ProductoTienda.java - Clase con validaciones");
        System.out.println("  • Ejercicio4EmpleadoEmpresa.java - Sobrecarga de constructores");
        System.out.println("  • Ejercicio5IdentificarErrores.java - Encuentra errores comunes");
        System.out.println("\nPrueba tus ejercicios en: ejercicios/PruebasEjercicios.java");
        System.out.println("\n¡Mucho éxito en tu examen! 🎓");
    }
}
