# Proyecto Java - Guía de Estudio POO (Primer Parcial)

## 📚 Descripción
Este proyecto contiene ejemplos prácticos, demostraciones interactivas y ejercicios para estudiar los conceptos fundamentales de Programación Orientada a Objetos (POO) evaluados en el primer parcial.

**💡 Este proyecto usa Maven** - Si no estás familiarizado con Maven, consulta el archivo [MAVEN.md](MAVEN.md) para una guía completa de comandos y uso.

## 🎯 Temas Cubiertos
- ✅ Clases y objetos (definición y creación)
- ✅ Atributos y métodos (estado vs comportamiento)
- ✅ Encapsulación (`private`, getters, setters)
- ✅ Modificadores de acceso (`public`, `private`)
- ✅ Constructores (vacíos, con parámetros, sobrecarga)
- ✅ Palabra reservada `this`
- ✅ Validaciones y estado del objeto

## 📁 Estructura del Proyecto

Este proyecto usa **Maven** como herramienta de construcción.

```
guia-estudio-1er-parcial-poo/
├── pom.xml                            # Configuración de Maven
└── src/
    └── main/
        └── java/
            ├── Main.java              # Clase principal que ejecuta todas las demos
            ├── ejemplos/
            │   ├── basicos/           # Conceptos fundamentales
            │   │   ├── Persona.java
            │   │   ├── Animal.java
            │   │   └── DemoBasica.java
            │   │
            │   ├── encapsulacion/     # Encapsulación y validaciones
            │   │   ├── PersonaSinEncapsulacion.java
            │   │   ├── PersonaConEncapsulacion.java
            │   │   ├── CuentaBancaria.java
            │   │   └── DemoEncapsulacion.java
            │   │
            │   └── constructores/     # Constructores y sobrecarga
            │       ├── ProductoSinConstructor.java
            │       ├── Estudiante.java
            │       ├── Libro.java
            │       ├── Vehiculo.java
            │       ├── PersonaValidada.java
            │       └── DemoConstructores.java
            │
            └── ejercicios/            # Ejercicios para practicar
                ├── Ejercicio1Rectangulo.java
                ├── Ejercicio2Circulo.java
                ├── Ejercicio3ProductoTienda.java
                ├── Ejercicio4EmpleadoEmpresa.java
                ├── Ejercicio5IdentificarErrores.java
                ├── PruebasEjercicios.java
                └── soluciones/
                    ├── CirculoSolucion.java
                    ├── ProductoTiendaSolucion.java
                    └── EmpleadoEmpresaSolucion.java
```

## 🚀 Cómo Ejecutar el Proyecto

### Requisitos Previos
- **Java 17** o superior instalado
- **Maven 3.6+** instalado

Verifica que estén instalados:
```bash
java -version
mvn -version
```

### Opción 1: Usar Maven (recomendado)

```bash
# Compilar el proyecto
mvn clean compile

# Ejecutar el programa principal
mvn exec:java

# Compilar y generar el JAR ejecutable
mvn clean package

# Ejecutar el JAR generado
java -jar target/guia-estudio-parcial-poo-1.0.0.jar
```

### Opción 2: Ejecutar demos individuales con Maven

```bash
# Demo básica
mvn exec:java -Dexec.mainClass="ejemplos.basicos.DemoBasica"

# Demo encapsulación
mvn exec:java -Dexec.mainClass="ejemplos.encapsulacion.DemoEncapsulacion"

# Demo constructores
mvn exec:java -Dexec.mainClass="ejemplos.constructores.DemoConstructores"

# Soluciones de ejercicios
mvn exec:java -Dexec.mainClass="ejercicios.soluciones.CirculoSolucion"
mvn exec:java -Dexec.mainClass="ejercicios.soluciones.ProductoTiendaSolucion"
mvn exec:java -Dexec.mainClass="ejercicios.soluciones.EmpleadoEmpresaSolucion"
```

### Opción 3: Usar un IDE (recomendado para desarrollo)
1. Abre el proyecto en **IntelliJ IDEA**, **Eclipse** o **VS Code**
2. El IDE detectará automáticamente que es un proyecto Maven
3. Ejecuta la clase `Main.java` directamente
4. O ejecuta cualquier clase `Demo*.java` individualmente

## 📖 Guía de Estudio Recomendada

### Paso 1: Lee la teoría (30 min)
- Lee el archivo `README.md` en la raíz del proyecto
- Familiarízate con los conceptos clave
- Revisa las 50 preguntas del banco

### Paso 2: Ejecuta y estudia los ejemplos (1 hora)
1. **Conceptos Básicos** (20 min)
   - Ejecuta `ejemplos.basicos.DemoBasica`
   - Estudia el código de `Persona.java` y `Animal.java`
   - Entiende la diferencia entre clase y objeto

2. **Encapsulación** (20 min)
   - Ejecuta `ejemplos.encapsulacion.DemoEncapsulacion`
   - Compara `PersonaSinEncapsulacion` vs `PersonaConEncapsulacion`
   - Estudia las validaciones en `CuentaBancaria.java`

3. **Constructores** (20 min)
   - Ejecuta `ejemplos.constructores.DemoConstructores`
   - Estudia la sobrecarga en `Libro.java`
   - Entiende el uso de `this()` en `Vehiculo.java`

### Paso 3: Practica con ejercicios (1-2 horas)
1. Completa `Ejercicio1Rectangulo.java`
2. Completa `Ejercicio2Circulo.java`
3. Completa `Ejercicio3ProductoTienda.java`
4. Completa `Ejercicio4EmpleadoEmpresa.java`
5. Identifica errores en `Ejercicio5IdentificarErrores.java`
6. Prueba tus soluciones en `PruebasEjercicios.java`

### Paso 4: Repaso final
- Responde las 50 preguntas del README sin mirar las respuestas
- Usa el checklist final
- Revisa los ejemplos de código que te causaron dificultad

## 💡 Conceptos Clave a Recordar

### Clase vs Objeto
```java
// Clase = plantilla/molde
class Persona {
    // ... atributos y métodos
}

// Objeto = instancia de la clase
Persona p = new Persona(); // crear objeto con 'new'
```

### Encapsulación
```java
class Persona {
    private String nombre; // Atributo privado
    
    // Getter (leer)
    public String getNombre() {
        return nombre;
    }
    
    // Setter (escribir con validación)
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }
}
```

### Constructores
```java
class Persona {
    private String nombre;
    private int edad;
    
    // Constructor vacío
    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }
    
    // Constructor con parámetros
    public Persona(String nombre, int edad) {
        this.nombre = nombre; // 'this' diferencia atributo de parámetro
        this.edad = edad;
    }
}
```

### Sobrecarga
```java
class Libro {
    // Mismo nombre, diferentes parámetros = SOBRECARGA
    public Libro() { }
    public Libro(String titulo) { }
    public Libro(String titulo, String autor) { }
}
```

## ⚠️ Errores Comunes a Evitar

1. ❌ Constructor con tipo de retorno
   ```java
   void Persona() { } // ¡NO es constructor!
   ```
   ✅ Correcto:
   ```java
   Persona() { } // Constructor (sin tipo de retorno)
   ```

2. ❌ Olvidar `this` cuando hay ambigüedad
   ```java
   public void setNombre(String nombre) {
       nombre = nombre; // ¡Asigna parámetro a sí mismo!
   }
   ```
   ✅ Correcto:
   ```java
   public void setNombre(String nombre) {
       this.nombre = nombre; // Asigna a atributo
   }
   ```

3. ❌ Atributos públicos sin validación
   ```java
   public int edad; // Cualquiera puede poner edad = -10
   ```
   ✅ Correcto:
   ```java
   private int edad; // Solo accesible mediante métodos
   ```

## 🎓 Tips para el Examen

1. **Lee bien las preguntas**: Distingue entre "declarar" y "crear" un objeto
2. **Valida siempre**: En constructores y setters, valida los datos
3. **Usa 'this' correctamente**: Para diferenciar atributos de parámetros
4. **Recuerda la sintaxis**: Los constructores NO tienen tipo de retorno
5. **Encapsula**: Atributos `private`, métodos getters/setters `public`

## 📞 Recursos Adicionales

- **README principal**: Contiene 50 preguntas con respuestas explicadas
- **Código comentado**: Cada clase tiene explicaciones detalladas
- **Ejercicios con soluciones**: El Ejercicio 1 incluye la solución comentada

## ✅ Checklist de Preparación

Antes del examen, asegúrate de poder:
- [ ] Explicar qué es una clase y qué es un objeto
- [ ] Crear objetos usando `new`
- [ ] Distinguir atributos (datos) de métodos (acciones)
- [ ] Explicar para qué sirve la encapsulación
- [ ] Usar `private` para atributos y `public` para getters/setters
- [ ] Escribir un constructor correctamente (sin tipo de retorno)
- [ ] Usar `this` para diferenciar atributos de parámetros
- [ ] Identificar sobrecarga de constructores/métodos
- [ ] Validar datos en constructores y setters
- [ ] Explicar qué es el estado y comportamiento de un objeto

---

## 🏆 ¡Buena Suerte!

Si sigues esta guía y practicas con los ejemplos y ejercicios, estarás bien preparado para el examen. Recuerda que la práctica hace al maestro. ¡Mucho éxito! 🎓

**Última actualización**: Marzo 2026
**Versión Java**: 17
