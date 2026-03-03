package ejemplos.basicos;

/**
 * DEMOSTRACIÓN: Creando objetos y usando atributos/métodos
 * 
 * Responde a las preguntas:
 * - ¿Cómo se crea un objeto?
 * - ¿Cómo se accede a atributos y métodos?
 */
public class DemoBasica {
    public static void main(String[] args) {
        System.out.println("=== DEMO 1: Creando objetos ===\n");
        
        // Declarar y crear un objeto Persona
        // Persona p; <- Solo declara la variable (no crea el objeto)
        // new Persona(); <- Crea el objeto en memoria
        Persona p = new Persona(); // <- Declaración + Creación
        
        // Asignar valores a los atributos
        p.nombre = "Ana";
        p.edad = 25;
        p.nacionalidad = "Mexicana";
        
        // Llamar a métodos
        p.mostrarInfo();
        p.correr();
        p.comer();
        p.saludar("¡Hola a todos!");
        
        System.out.println("\n=== DEMO 2: Varios objetos de la misma clase ===\n");
        
        // Podemos crear múltiples objetos de la misma clase
        Persona p2 = new Persona();
        p2.nombre = "Carlos";
        p2.edad = 30;
        p2.nacionalidad = "Colombiana";
        
        p2.mostrarInfo();
        p2.saludar("¿Cómo están?");
        
        System.out.println("\n=== DEMO 3: Objetos de otra clase ===\n");
        
        Animal perro = new Animal();
        perro.especie = "Perro";
        perro.sonido = "Guau guau";
        perro.numeroPatas = 4;
        
        perro.hacerSonido();
        perro.moverse();
        
        Animal gallina = new Animal();
        gallina.especie = "Gallina";
        gallina.sonido = "Co co co";
        gallina.numeroPatas = 2;
        
        gallina.hacerSonido();
        gallina.moverse();
    }
}
