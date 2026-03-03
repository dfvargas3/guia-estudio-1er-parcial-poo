package ejercicios.soluciones;

/**
 * SOLUCIÓN EJERCICIO 3: ProductoTienda
 * 
 * Usa esta solución para verificar tu respuesta después de intentar el ejercicio
 */
public class ProductoTiendaSolucion {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;
    
    // Constructor completo
    public ProductoTiendaSolucion(String codigo, String nombre, double precio, int stock) {
        // Validaciones
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El código no puede estar vacío");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser positivo");
        }
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo");
        }
        
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    // Getters
    public String getCodigo() {
        return codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public int getStock() {
        return stock;
    }
    
    // Setters con validación
    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El código no puede estar vacío");
        }
        this.codigo = codigo;
    }
    
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }
    
    public void setPrecio(double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser positivo");
        }
        this.precio = precio;
    }
    
    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo");
        }
        this.stock = stock;
    }
    
    // Métodos de negocio
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            throw new IllegalArgumentException("El porcentaje debe estar entre 0 y 100");
        }
        precio = precio * (1 - porcentaje / 100);
        System.out.println("Descuento aplicado. Nuevo precio: $" + precio);
    }
    
    public void vender(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser positiva");
        }
        if (cantidad > stock) {
            throw new IllegalArgumentException("Stock insuficiente. Disponible: " + stock);
        }
        stock -= cantidad;
        System.out.println("Venta realizada. Stock restante: " + stock);
    }
    
    public void reabastecer(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser positiva");
        }
        stock += cantidad;
        System.out.println("Reabastecimiento realizado. Nuevo stock: " + stock);
    }
    
    public void mostrarInfo() {
        System.out.println("Producto: " + codigo + " - " + nombre);
        System.out.println("Precio: $" + precio + ", Stock: " + stock);
    }
    
    // Método para probar
    public static void main(String[] args) {
        System.out.println("=== SOLUCIÓN EJERCICIO 3: ProductoTienda ===\n");
        
        ProductoTiendaSolucion producto = new ProductoTiendaSolucion("A001", "Laptop", 15000.0, 10);
        producto.mostrarInfo();
        
        System.out.println("\n--- Aplicando descuento del 10% ---");
        producto.aplicarDescuento(10);
        producto.mostrarInfo();
        
        System.out.println("\n--- Vendiendo 3 unidades ---");
        producto.vender(3);
        producto.mostrarInfo();
        
        System.out.println("\n--- Reabasteciendo 5 unidades ---");
        producto.reabastecer(5);
        producto.mostrarInfo();
        
        System.out.println("\n--- Intentando vender más de lo disponible ---");
        try {
            producto.vender(20);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("\n--- Intentando aplicar descuento inválido ---");
        try {
            producto.aplicarDescuento(150);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
