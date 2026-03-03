package ejercicios;

/**
 * EJERCICIO 3: Crear clase ProductoTienda
 * 
 * OBJETIVO: Practicar encapsulación completa con validaciones realistas
 * 
 * INSTRUCCIONES:
 * 1. Crea una clase ProductoTienda con los siguientes atributos privados:
 *    - codigo (String)
 *    - nombre (String)
 *    - precio (double)
 *    - stock (int)
 * 
 * 2. Crea getters para todos los atributos
 * 
 * 3. Crea setters con las siguientes validaciones:
 *    - codigo: no puede ser nulo o vacío
 *    - nombre: no puede ser nulo o vacío
 *    - precio: debe ser mayor a 0
 *    - stock: debe ser mayor o igual a 0
 * 
 * 4. Crea un constructor con todos los parámetros (con validaciones)
 * 
 * 5. Crea los siguientes métodos:
 *    - aplicarDescuento(double porcentaje): reduce el precio según el porcentaje
 *      validar que el porcentaje esté entre 0 y 100
 *    - vender(int cantidad): reduce el stock según la cantidad vendida
 *      validar que haya suficiente stock
 *    - reabastecer(int cantidad): aumenta el stock
 *      validar que la cantidad sea positiva
 *    - mostrarInfo(): imprime toda la información del producto
 * 
 * TIPS:
 * - Para aplicar descuento: precio = precio * (1 - porcentaje/100)
 * - Usa mensajes de error claros
 */
public class Ejercicio3ProductoTienda {
    // TODO: Escribe tu código aquí
}
