package ejercicios;

/**
 * EJERCICIO 5: Identificar errores
 * 
 * OBJETIVO: Reconocer errores comunes en POO
 * 
 * INSTRUCCIONES:
 * Lee cada clase a continuación y encuentra los errores.
 * Los errores incluyen: sintaxis incorrecta, falta de encapsulación,
 * constructores mal escritos, etc.
 * 
 * Intenta corregirlos como práctica.
 */
public class Ejercicio5IdentificarErrores {
    
    // ERROR 1: ¿Qué está mal aquí?
    /*
    class Persona {
        private String nombre;
        
        void Persona(String nombre) {  // <-- ¿Es esto un constructor?
            this.nombre = nombre;
        }
    }
    */
    // RESPUESTA: Tiene tipo de retorno 'void', no es constructor, es un método.
    // Los constructores NO tienen tipo de retorno.
    
    // ERROR 2: ¿Qué está mal aquí?
    /*
    class Cuenta {
        public double saldo;  // <-- ¿Es buena idea que sea public?
    }
    */
    // RESPUESTA: El saldo debería ser private para protegerlo (encapsulación).
    // Cualquiera puede modificarlo directamente sin validación.
    
    // ERROR 3: ¿Qué está mal aquí?
    /*
    class Producto {
        private double precio;
        
        public void setPrecio(double precio) {
            precio = precio;  // <-- ¿Falta algo?
        }
    }
    */
    // RESPUESTA: Falta 'this.' para diferenciar el atributo del parámetro.
    // Debería ser: this.precio = precio;
    
    // ERROR 4: ¿Qué está mal aquí?
    /*
    class Animal {
        private String nombre;
        
        public Animal(String nombre) {
            this.nombre = nombre;
        }
        
        // ¿Puedo crear un animal sin nombre?
    }
    */
    // RESPUESTA: No hay constructor vacío. Si defines un constructor con parámetros,
    // Java NO crea el constructor vacío automáticamente.
    // Si quieres crear: new Animal(); debes definir: public Animal() { }
    
    // ERROR 5: ¿Qué está mal aquí?
    /*
    class Estudiante {
        private int edad;
        
        public void setEdad(int edad) {
            this.edad = edad;  // <-- ¿Falta validación?
        }
    }
    */
    // RESPUESTA: No valida que la edad sea positiva. Se puede asignar edad negativa.
    // Debería validar: if (edad < 0) { throw... }
}
