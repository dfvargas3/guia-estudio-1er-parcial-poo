package ejercicios;

/**
 * EJERCICIO 1: Crear clase Rectangulo
 * 
 * OBJETIVO: Practicar creación de clases, atributos, métodos y encapsulación
 * 
 * INSTRUCCIONES:
 * 1. Crea una clase Rectangulo con los siguientes atributos privados:
 *    - ancho (double)
 *    - alto (double)
 * 
 * 2. Crea getters y setters para ambos atributos
 * 
 * 3. Los setters deben validar que los valores sean positivos (> 0)
 * 
 * 4. Crea los siguientes métodos:
 *    - calcularArea(): retorna el área (ancho * alto)
 *    - calcularPerimetro(): retorna el perímetro (2 * ancho + 2 * alto)
 *    - mostrarInfo(): imprime el ancho, alto, área y perímetro
 * 
 * 5. Crea un constructor vacío que inicialice ancho y alto en 1.0
 * 
 * 6. Crea un constructor con parámetros para ancho y alto (con validación)
 * 
 * TIPS:
 * - Usa 'private' para los atributos
 * - Usa 'public' para getters, setters y métodos
 * - No olvides validar en setters y constructor
 */
public class Ejercicio1Rectangulo {
    // TODO: Escribe tu código aquí
    
    // SOLUCIÓN (descomenta para verificar):
    /*
    private double ancho;
    private double alto;
    
    public Rectangulo() {
        this.ancho = 1.0;
        this.alto = 1.0;
    }
    
    public Rectangulo(double ancho, double alto) {
        if (ancho <= 0 || alto <= 0) {
            throw new IllegalArgumentException("Ancho y alto deben ser positivos");
        }
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public double getAncho() {
        return ancho;
    }
    
    public void setAncho(double ancho) {
        if (ancho <= 0) {
            throw new IllegalArgumentException("El ancho debe ser positivo");
        }
        this.ancho = ancho;
    }
    
    public double getAlto() {
        return alto;
    }
    
    public void setAlto(double alto) {
        if (alto <= 0) {
            throw new IllegalArgumentException("El alto debe ser positivo");
        }
        this.alto = alto;
    }
    
    public double calcularArea() {
        return ancho * alto;
    }
    
    public double calcularPerimetro() {
        return 2 * ancho + 2 * alto;
    }
    
    public void mostrarInfo() {
        System.out.println("Rectángulo: Ancho=" + ancho + ", Alto=" + alto + 
                         ", Área=" + calcularArea() + ", Perímetro=" + calcularPerimetro());
    }
    */
}
