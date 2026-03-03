package ejemplos.constructores;

/**
 * DEMOSTRACIÓN: Uso de constructores
 * 
 * Ejecuta esta clase para ver cómo funcionan los constructores
 */
public class DemoConstructores {
    public static void main(String[] args) {
        System.out.println("=== DEMO 1: Constructor por defecto ===\n");
        
        // Java crea automáticamente un constructor vacío
        ProductoSinConstructor producto = new ProductoSinConstructor();
        System.out.println("Producto creado (valores por defecto)");
        producto.setNombre("Laptop");
        producto.setPrecio(15000.0);
        producto.setCantidad(5);
        System.out.println("Producto: " + producto.getNombre() + 
                         ", Precio: " + producto.getPrecio() + 
                         ", Cantidad: " + producto.getCantidad() + "\n");
        
        System.out.println("=== DEMO 2: Constructores vacío y con parámetros ===\n");
        
        // Usando constructor vacío
        Estudiante est1 = new Estudiante();
        est1.mostrarInfo();
        
        // Usando constructor con parámetros
        Estudiante est2 = new Estudiante("María", 20, "Ingeniería");
        est2.mostrarInfo();
        
        System.out.println("\n=== DEMO 3: Sobrecarga de constructores ===\n");
        
        // Las 4 formas de crear un Libro (sobrecarga)
        Libro libro1 = new Libro();
        libro1.mostrarInfo();
        
        Libro libro2 = new Libro("El Quijote", "Cervantes");
        libro2.mostrarInfo();
        
        Libro libro3 = new Libro("Cien años de soledad", "García Márquez", 471);
        libro3.mostrarInfo();
        
        Libro libro4 = new Libro("1984", "George Orwell", 328, 299.99);
        libro4.mostrarInfo();
        
        System.out.println("\n=== DEMO 4: Uso de this() ===\n");
        
        // Diferentes formas de crear un Vehículo
        Vehiculo v1 = new Vehiculo();
        v1.mostrarInfo();
        
        Vehiculo v2 = new Vehiculo("Toyota", "Corolla");
        v2.mostrarInfo();
        
        Vehiculo v3 = new Vehiculo("Honda", "Civic", 2022);
        v3.mostrarInfo();
        
        Vehiculo v4 = new Vehiculo("Ford", "Mustang", 2023, "Rojo");
        v4.mostrarInfo();
        
        System.out.println("\n=== DEMO 5: Constructor con validaciones ===\n");
        
        // Constructor válido
        PersonaValidada p1 = new PersonaValidada("Juan", 25);
        p1.mostrarInfo();
        
        // Intentando crear con datos inválidos
        try {
            PersonaValidada p2 = new PersonaValidada("", 30);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear persona: " + e.getMessage());
        }
        
        try {
            PersonaValidada p3 = new PersonaValidada("Pedro", -5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear persona: " + e.getMessage());
        }
        
        try {
            PersonaValidada p4 = new PersonaValidada("Ana", 200);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear persona: " + e.getMessage());
        }
    }
}
