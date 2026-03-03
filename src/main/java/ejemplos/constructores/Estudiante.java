package ejemplos.constructores;

/**
 * EJEMPLO: Constructor vacío explícito + Constructor con parámetros
 * 
 * Demuestra:
 * - ¿Qué es un constructor?
 * - ¿Cómo se escribe?
 * - ¿Para qué sirve?
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;
    
    // CONSTRUCTOR VACÍO (sin parámetros)
    // Se usa cuando queremos crear un objeto sin datos iniciales
    public Estudiante() {
        System.out.println("Constructor vacío llamado");
        // Opcionalmente podemos dar valores por defecto
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.carrera = "Sin carrera";
    }
    
    // CONSTRUCTOR CON PARÁMETROS
    // Se usa para crear objetos con datos iniciales
    /**
     * Constructor que inicializa todos los atributos
     * @param nombre nombre del estudiante
     * @param edad edad del estudiante
     * @param carrera carrera del estudiante
     */
    public Estudiante(String nombre, int edad, String carrera) {
        System.out.println("Constructor con parámetros llamado");
        // 'this' diferencia el atributo del parámetro
        this.nombre = nombre;  // this.nombre es el atributo, nombre es el parámetro
        this.edad = edad;
        this.carrera = carrera;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String getCarrera() {
        return carrera;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + ", Edad: " + edad + ", Carrera: " + carrera);
    }
}
