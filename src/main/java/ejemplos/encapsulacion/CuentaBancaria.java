package ejemplos.encapsulacion;

/**
 * EJEMPLO: Cuenta Bancaria con encapsulación
 * 
 * Demuestra por qué la encapsulación es crítica en casos reales
 */
public class CuentaBancaria {
    // Atributos privados (protegidos)
    private String numeroCuenta;
    private String titular;
    private double saldo; // ¡MUY IMPORTANTE que esto sea privado!
    
    // Getters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    // Setters (algunos con validación)
    public void setNumeroCuenta(String numeroCuenta) {
        if (numeroCuenta != null && !numeroCuenta.isEmpty()) {
            this.numeroCuenta = numeroCuenta;
        }
    }
    
    public void setTitular(String titular) {
        if (titular != null && !titular.isEmpty()) {
            this.titular = titular;
        }
    }
    
    // IMPORTANTE: El saldo NO tiene setter público directo
    // Solo se puede modificar mediante métodos controlados
    
    /**
     * Método para depositar dinero
     * @param cantidad cantidad a depositar
     */
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("ERROR: La cantidad debe ser positiva");
        }
    }
    
    /**
     * Método para retirar dinero
     * @param cantidad cantidad a retirar
     */
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("ERROR: La cantidad debe ser positiva");
            return;
        }
        if (cantidad > saldo) {
            System.out.println("ERROR: Saldo insuficiente");
            return;
        }
        saldo -= cantidad;
        System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
    }
}
