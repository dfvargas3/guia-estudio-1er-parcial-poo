package ejercicios.soluciones;

/**
 * SOLUCIÓN EJERCICIO 4: EmpleadoEmpresa
 * 
 * Usa esta solución para verificar tu respuesta después de intentar el ejercicio
 */
public class EmpleadoEmpresaSolucion {
    private String nombre;
    private String apellido;
    private String departamento;
    private double salarioMensual;
    
    // Constructor 1: Vacío
    public EmpleadoEmpresaSolucion() {
        this.nombre = "Sin nombre";
        this.apellido = "Sin apellido";
        this.departamento = "General";
        this.salarioMensual = 5000.0;
    }
    
    // Constructor 2: Con nombre y apellido (usa this() para llamar al constructor 4)
    public EmpleadoEmpresaSolucion(String nombre, String apellido) {
        this(nombre, apellido, "General", 5000.0);
    }
    
    // Constructor 3: Con nombre, apellido y departamento (usa this() para llamar al constructor 4)
    public EmpleadoEmpresaSolucion(String nombre, String apellido, String departamento) {
        this(nombre, apellido, departamento, 5000.0);
    }
    
    // Constructor 4: Con todos los parámetros (validación)
    public EmpleadoEmpresaSolucion(String nombre, String apellido, String departamento, double salarioMensual) {
        if (salarioMensual <= 0) {
            throw new IllegalArgumentException("El salario debe ser positivo");
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.departamento = departamento;
        this.salarioMensual = salarioMensual;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    
    public double getSalarioMensual() {
        return salarioMensual;
    }
    
    // Métodos de negocio
    public double calcularSalarioAnual() {
        return salarioMensual * 12;
    }
    
    public void darAumento(double porcentaje) {
        if (porcentaje < 0) {
            throw new IllegalArgumentException("El porcentaje no puede ser negativo");
        }
        salarioMensual = salarioMensual * (1 + porcentaje / 100);
        System.out.println("Aumento aplicado. Nuevo salario mensual: $" + salarioMensual);
    }
    
    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + " " + apellido);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario Mensual: $" + salarioMensual);
        System.out.println("Salario Anual: $" + calcularSalarioAnual());
    }
    
    // Método para probar
    public static void main(String[] args) {
        System.out.println("=== SOLUCIÓN EJERCICIO 4: EmpleadoEmpresa ===\n");
        
        System.out.println("--- Empleado 1: Constructor vacío ---");
        EmpleadoEmpresaSolucion emp1 = new EmpleadoEmpresaSolucion();
        emp1.mostrarInfo();
        
        System.out.println("\n--- Empleado 2: Con nombre y apellido ---");
        EmpleadoEmpresaSolucion emp2 = new EmpleadoEmpresaSolucion("Juan", "Pérez");
        emp2.mostrarInfo();
        
        System.out.println("\n--- Empleado 3: Con nombre, apellido y departamento ---");
        EmpleadoEmpresaSolucion emp3 = new EmpleadoEmpresaSolucion("María", "González", "IT");
        emp3.mostrarInfo();
        
        System.out.println("\n--- Empleado 4: Con todos los datos ---");
        EmpleadoEmpresaSolucion emp4 = new EmpleadoEmpresaSolucion("Carlos", "Rodríguez", "Ventas", 8000.0);
        emp4.mostrarInfo();
        
        System.out.println("\n--- Dando aumento del 15% al empleado 4 ---");
        emp4.darAumento(15);
        emp4.mostrarInfo();
        
        System.out.println("\n--- Intentando crear empleado con salario inválido ---");
        try {
            EmpleadoEmpresaSolucion emp5 = new EmpleadoEmpresaSolucion("Ana", "López", "HR", -1000.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
