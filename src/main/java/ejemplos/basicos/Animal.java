package ejemplos.basicos;

/**
 * EJEMPLO 2: Otra clase básica
 * 
 * Demuestra cómo diferentes clases pueden tener distintos atributos y métodos
 */
public class Animal {
    // Atributos (Estado)
    String especie;
    String sonido;
    int numeroPatas;
    
    // Métodos (Comportamiento)
    
    public void hacerSonido() {
        System.out.println("El " + especie + " hace: " + sonido);
    }
    
    public void moverse() {
        System.out.println("El " + especie + " se mueve con sus " + numeroPatas + " patas.");
    }
}
