package ejemplos.encapsulacion;

/**
 * DEMOSTRACIÓN: Diferencia entre con y sin encapsulación
 * 
 * Ejecuta esta clase para ver las diferencias
 */
public class DemoEncapsulacion {
    public static void main(String[] args) {
        System.out.println("=== PROBLEMA: Sin Encapsulación ===\n");
        
        PersonaSinEncapsulacion persona1 = new PersonaSinEncapsulacion();
        persona1.nombre = "Juan";
        persona1.edad = 25;
        persona1.salario = 5000.0;
        persona1.mostrarInfo();
        
        // PROBLEMA: Podemos asignar valores inválidos sin control
        persona1.edad = -10; // ¿Edad negativa? ¡No tiene sentido!
        persona1.salario = -1000; // ¿Salario negativo? ¡Imposible!
        System.out.println("\nDespués de asignar valores inválidos:");
        persona1.mostrarInfo();
        System.out.println("^ ¡Esto es un problema! El objeto está en un estado inválido.\n");
        
        System.out.println("=== SOLUCIÓN: Con Encapsulación ===\n");
        
        PersonaConEncapsulacion persona2 = new PersonaConEncapsulacion();
        persona2.setNombre("María");
        persona2.setEdad(30);
        persona2.setSalario(6000.0);
        persona2.mostrarInfo();
        
        // SOLUCIÓN: Los setters validan y rechazan valores inválidos
        System.out.println("\nIntentando asignar valores inválidos:");
        persona2.setEdad(-10); // El setter detecta el error
        persona2.setSalario(-1000); // El setter detecta el error
        
        System.out.println("\nDatos después de intentar asignar inválidos:");
        persona2.mostrarInfo();
        System.out.println("^ ¡El objeto mantiene su estado válido!\n");
        
        System.out.println("=== EJEMPLO: Cuenta Bancaria ===\n");
        
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setNumeroCuenta("123456789");
        cuenta.setTitular("Ana López");
        
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo inicial: " + cuenta.getSaldo());
        
        cuenta.depositar(1000);
        cuenta.retirar(300);
        cuenta.retirar(1000); // Intento de retirar más de lo que hay
        
        System.out.println("\nSaldo final: " + cuenta.getSaldo());
        
        // IMPORTANTE: No podemos hacer cuenta.saldo = 1000000;
        // porque saldo es private. Esto protege el dinero.
    }
}
