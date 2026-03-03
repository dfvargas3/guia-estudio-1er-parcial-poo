package ejercicios.soluciones;

/**
 * SOLUCIÓN EJERCICIO 2: Circulo
 * 
 * Usa esta solución para verificar tu respuesta después de intentar el ejercicio
 */
public class CirculoSolucion {
    private double radio;
    
    // Constructor vacío
    public CirculoSolucion() {
        this.radio = 1.0;
    }
    
    // Constructor con parámetro
    public CirculoSolucion(double radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser positivo");
        }
        this.radio = radio;
    }
    
    // Getter
    public double getRadio() {
        return radio;
    }
    
    // Setter
    public void setRadio(double radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser positivo");
        }
        this.radio = radio;
    }
    
    // Métodos de cálculo
    public double calcularArea() {
        return Math.PI * radio * radio;
        // También se puede: Math.PI * Math.pow(radio, 2)
    }
    
    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }
    
    public double calcularDiametro() {
        return 2 * radio;
    }
    
    // Método para probar
    public static void main(String[] args) {
        System.out.println("=== SOLUCIÓN EJERCICIO 2: Circulo ===\n");
        
        // Prueba con constructor vacío
        CirculoSolucion c1 = new CirculoSolucion();
        System.out.println("Círculo 1 (radio por defecto):");
        System.out.println("Radio: " + c1.getRadio());
        System.out.println("Área: " + c1.calcularArea());
        System.out.println("Circunferencia: " + c1.calcularCircunferencia());
        System.out.println("Diámetro: " + c1.calcularDiametro());
        
        // Prueba con constructor con parámetros
        CirculoSolucion c2 = new CirculoSolucion(5.0);
        System.out.println("\nCírculo 2 (radio = 5):");
        System.out.println("Radio: " + c2.getRadio());
        System.out.println("Área: " + c2.calcularArea());
        System.out.println("Circunferencia: " + c2.calcularCircunferencia());
        System.out.println("Diámetro: " + c2.calcularDiametro());
        
        // Prueba cambiar radio
        c2.setRadio(10.0);
        System.out.println("\nDespués de cambiar radio a 10:");
        System.out.println("Área: " + c2.calcularArea());
        
        // Prueba validación
        System.out.println("\nProbando validación:");
        try {
            CirculoSolucion c3 = new CirculoSolucion(-5.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error detectado: " + e.getMessage());
        }
    }
}
