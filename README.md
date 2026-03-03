# Guía de estudio — Parcial POO (Fundamentos)

## Temas principales evaluados
- Clases y objetos (qué son y cómo se crean).
- Atributos y métodos (estado vs comportamiento).
- Encapsulación (private + getters/setters) y modificadores de acceso.
- Constructores (`this`, constructor por defecto, sobrecarga).

## Conceptos clave que debes manejar (nivel 2º semestre)

**Clase vs objeto**
- **Clase:** plantilla/molde (define atributos y métodos).
- **Objeto:** instancia real creada a partir de una clase con `new`.

**Atributo vs método**
- **Atributo:** dato/propiedad (ej: `edad`, `nombre`).
- **Método:** acción/función (ej: `correr()`, `comer()`).

**Encapsulación**
- Consiste en **ocultar el estado** (atributos `private`) y permitir acceso **controlado** mediante métodos (getters/setters) y validaciones.

**Constructores**
- Se llaman **igual que la clase**, **no tienen tipo de retorno**, se ejecutan al crear el objeto, y se pueden **sobrecargar** (varias versiones con distintos parámetros).
- `this` se usa para referirse al **objeto actual** (por ejemplo, diferenciar atributo vs parámetro).
- Si no defines constructores, Java crea uno **por defecto** (vacío y sin parámetros).

---

## Banco de preguntas (50 preguntas)

**1.** ¿Qué pasa si intentas acceder directamente a un atributo `private` desde otra clase?  
**Respuesta:** No se puede; produce error de compilación.  
**Explicación:** `private` no es visible fuera de la clase; debes usar métodos públicos (getter/setter).

**2.** ¿Qué es un objeto en POO?  
**Respuesta:** Una instancia creada a partir de una clase.  
**Explicación:** Un objeto es un “ejemplar” concreto de la clase, con valores reales en sus atributos.

**3.** En una clase `Persona`, da dos ejemplos de atributos (estado).  
**Respuesta:** `nombre`, `edad`.  
**Explicación:** Los atributos representan datos del objeto; las acciones se modelan como métodos.

**4.** Escribe una línea de Java que cree un objeto `Persona` y lo asigne a la variable `p`.  
**Respuesta:** `Persona p = new Persona();`  
**Explicación:** Se declara una variable y se instancia con `new`.

**5.** ¿Qué es un atributo en una clase?  
**Respuesta:** Una característica o propiedad del objeto (un dato/estado).  
**Explicación:** Los atributos guardan información como edad, color o nombre.

**6.** Menciona una ventaja práctica de usar clases y objetos.  
**Respuesta:** Organiza el código y facilita reutilizarlo y mantenerlo.  
**Explicación:** Modelar con clases ayuda a ordenar responsabilidades.

**7.** ¿Qué significa encapsulación?  
**Respuesta:** Proteger/ocultar el estado del objeto y permitir acceso controlado mediante métodos.  
**Explicación:** Normalmente se logra con atributos `private` y getters/setters.

**8.** ¿Qué significa “instancia” en POO?  
**Respuesta:** Un objeto creado a partir de una clase.  
**Explicación:** “Instancia” suele usarse como sinónimo práctico de objeto.

**9.** ¿Qué método se usa normalmente para leer un atributo privado `nombre`?  
**Respuesta:** `getNombre()`.  
**Explicación:** El getter devuelve el valor del atributo de forma controlada.

**10.** ¿Qué método se usa normalmente para modificar un atributo privado `nombre`?  
**Respuesta:** `setNombre(String n)`.  
**Explicación:** El setter actualiza el atributo (idealmente validando).

**11.** ¿Qué es una clase en Java?  
**Respuesta:** Una plantilla/molde para crear objetos.  
**Explicación:** Define atributos (estado) y métodos (comportamiento).

**12.** ¿Qué implica que un atributo sea `public`?  
**Respuesta:** Cualquier clase puede acceder y modificarlo directamente.  
**Explicación:** Se pierde control del estado; por eso se prefiere encapsular.

**13.** ¿Cuál es la diferencia entre atributo y método?  
**Respuesta:** Atributo = dato/estado; método = acción/comportamiento.  
**Explicación:** Los atributos guardan información; los métodos representan acciones.

**14.** Da dos ejemplos de métodos (acciones) para una clase `Persona`.  
**Respuesta:** `correr()`, `comer()`.  
**Explicación:** Los métodos describen comportamientos del objeto.

**15.** ¿Qué es un constructor?  
**Respuesta:** Un método especial que se ejecuta al crear un objeto.  
**Explicación:** Se llama igual que la clase y no tiene tipo de retorno.

**16.** Escribe la sintaxis correcta de un constructor para la clase `Persona`.  
**Respuesta:** `public Persona() { }`  
**Explicación:** No retorna nada y se llama igual que la clase.

**17.** ¿Qué está mal en este código respecto al constructor?  
```java
class Persona {
  void Persona() {}
}
```  
**Respuesta:** No es constructor; es un método porque tiene tipo de retorno (`void`).  
**Explicación:** Un constructor no lleva tipo de retorno.

**18.** ¿Para qué sirve un constructor con parámetros?  
**Respuesta:** Para inicializar el objeto con valores desde el inicio.  
**Explicación:** Permite crear objetos “listos” con estado inicial.

**19.** ¿Qué se llama tener dos constructores con diferentes parámetros?  
**Respuesta:** Sobrecarga de constructores.  
**Explicación:** Sobrecarga = mismo nombre, distinta lista de parámetros.

**20.** ¿Qué hace `this` dentro de una clase?  
**Respuesta:** Se refiere al objeto actual.  
**Explicación:** Sirve para acceder a atributos/métodos del objeto actual.

**21.** Explica para qué sirve `this` en este constructor:  
```java
class Persona {
  private String nombre;
  Persona(String nombre){
    this.nombre = nombre;
  }
}
```  
**Respuesta:** Asigna el parámetro `nombre` al atributo `nombre` del objeto actual.  
**Explicación:** `this.nombre` es el atributo; `nombre` es el parámetro.

**22.** ¿Qué hace `this()` dentro de una clase?  
**Respuesta:** Llama a otro constructor de la misma clase.  
**Explicación:** Se usa para encadenar constructores y reutilizar inicialización.

**23.** Si no escribes ningún constructor en la clase, ¿qué hace Java?  
**Respuesta:** Crea un constructor vacío por defecto (sin parámetros).  
**Explicación:** Permite instanciar la clase sin definir constructores manualmente.

**24.** ¿Qué palabra reservada se usa para crear un objeto en Java?  
**Respuesta:** `new`.  
**Explicación:** `new` crea el objeto y reserva memoria.

**25.** Escribe la forma correcta de instanciar un objeto `Persona` en Java.  
**Respuesta:** `Persona p = new Persona();`  
**Explicación:** Se crea con `new` y se asigna a una referencia.

**26.** ¿Cuál es el principal riesgo de dejar atributos `public`?  
**Respuesta:** Se pierde control del estado (cualquiera puede poner valores inválidos).  
**Explicación:** La encapsulación protege invariantes y valida cambios.

**27.** Si quieres asegurar que `edad` nunca sea negativa, ¿dónde conviene validar?  
**Respuesta:** En el constructor y/o en el setter.  
**Explicación:** Se valida donde se asigna el valor para mantener el objeto válido.

**28.** Da un ejemplo concreto de encapsulación en Java.  
**Respuesta:** `private int edad;` + `getEdad()` y `setEdad(int edad)` con validación.  
**Explicación:** Se oculta el dato y se controla cómo se lee o modifica.

**29.** ¿Qué modificador de acceso permite que algo se use solo dentro de la misma clase?  
**Respuesta:** `private`.  
**Explicación:** Restringe el acceso únicamente a la clase donde se declara.

**30.** ¿Qué modificador permite acceso desde cualquier parte del proyecto?  
**Respuesta:** `public`.  
**Explicación:** Es el acceso más abierto.

**31.** ¿Qué ocurre si intentas asignar un `String` a un atributo `int`?  
**Respuesta:** Error de compilación (tipos incompatibles).  
**Explicación:** Java es de tipado estático: los tipos deben coincidir.

**32.** ¿Qué diferencia hay entre declarar y crear un objeto?  
**Respuesta:** Declarar define la variable; crear instancia el objeto con `new`.  
**Explicación:** Puedes tener la referencia declarada sin objeto creado aún.

**33.** ¿Qué imprime este programa?  
```java
class Persona {
  String nombre;
  Persona(String nombre){
    this.nombre = nombre;
  }
}
public class Main{
  public static void main(String[] args){
    Persona p = new Persona("Ana");
    System.out.println(p.nombre);
  }
}
```  
**Respuesta:** Imprime `Ana`.  
**Explicación:** El constructor asigna el atributo y luego se imprime.

**34.** ¿Por qué es recomendable que `edad` sea `private`?  
```java
class Persona {
  int edad;
}
```  
**Respuesta:** Para controlar el acceso y evitar valores inválidos (encapsulación).  
**Explicación:** Permite validar en setters/constructores y proteger el estado.

**35.** ¿Qué es sobrecarga (overloading) de métodos?  
**Respuesta:** Tener métodos con el mismo nombre y diferentes parámetros.  
**Explicación:** Cambia la lista de parámetros; no es lo mismo que cambiar solo el retorno.

**36.** ¿Se puede “sobrecargar” un método cambiando únicamente el tipo de retorno?  
**Respuesta:** No.  
**Explicación:** La sobrecarga se decide por nombre + parámetros, no por retorno.

**37.** ¿Qué sucede si defines un constructor con parámetros y NO defines el vacío?  
**Respuesta:** Ya no se crea el constructor vacío por defecto automáticamente.  
**Explicación:** Si lo necesitas, debes escribirlo explícitamente.

**38.** ¿Qué pasa si un setter no valida y permite valores inválidos?  
**Respuesta:** El objeto puede quedar en un estado incorrecto.  
**Explicación:** Se rompen invariantes y el sistema se vuelve inestable.

**39.** ¿Qué es un getter?  
**Respuesta:** Un método que devuelve el valor de un atributo (normalmente `private`).  
**Explicación:** Permite leer el estado de forma controlada.

**40.** ¿Qué es un setter?  
**Respuesta:** Un método que actualiza el valor de un atributo (normalmente `private`).  
**Explicación:** Debe ser el punto de entrada para validar antes de cambiar el estado.

**41.** En una clase `Cuenta`, ¿qué atributo tendría sentido encapsular sí o sí?  
**Respuesta:** `saldo`.  
**Explicación:** Debe protegerse para evitar cambios arbitrarios y validar operaciones.

**42.** ¿Qué imprime este código?  
```java
class A {
  int x = 10;
}
public class Main{
  public static void main(String[] args){
    A a = new A();
    System.out.println(a.x);
  }
}
```  
**Respuesta:** Imprime `10`.  
**Explicación:** `x` tiene valor inicial y se imprime desde el objeto.

**43.** ¿Qué hace un constructor vacío típico?  
**Respuesta:** Inicializa el objeto sin parámetros (a veces con valores por defecto).  
**Explicación:** Permite crear objetos sin exigir datos de entrada.

**44.** ¿Cuál es una buena práctica al nombrar clases en Java?  
**Respuesta:** Usar PascalCase (ej: `CuentaBancaria`).  
**Explicación:** Es el estándar de estilo más común.

**45.** ¿Cuál es una buena práctica al nombrar métodos en Java?  
**Respuesta:** Usar camelCase (ej: `calcularTotal()`).  
**Explicación:** Es el estándar de estilo más común.

**46.** ¿Qué es “estado” de un objeto?  
**Respuesta:** Los valores actuales de sus atributos.  
**Explicación:** Cambia cuando cambian los atributos.

**47.** ¿Qué es “comportamiento” de un objeto?  
**Respuesta:** Lo que puede hacer: sus métodos/acciones.  
**Explicación:** Los métodos definen operaciones sobre el estado.

**48.** ¿Qué se entiende por “invariante” (nivel básico) en encapsulación?  
**Respuesta:** Una regla que siempre debe cumplirse en el objeto (ej: edad ≥ 0).  
**Explicación:** Se protege con validaciones en constructor/setter.

**49.** Escribe un ejemplo de validación simple en un setter de `edad`.  
**Respuesta:**  
```java
public void setEdad(int edad){
  if(edad < 0) throw new IllegalArgumentException("Edad inválida");
  this.edad = edad;
}
```  
**Explicación:** Se evita que el objeto quede en un estado inválido.

**50.** ¿Qué diferencia hay entre un atributo local y un atributo de instancia?  
**Respuesta:** El local vive dentro del método; el de instancia pertenece al objeto.  
**Explicación:** El atributo de instancia se mantiene mientras el objeto exista.

---

## Checklist final de repaso (antes del parcial)
- [ ] Puedo explicar con mis palabras qué es **clase** y qué es **objeto**.
- [ ] Distingo rápido **atributos (datos)** vs **métodos (acciones)**.
- [ ] Entiendo por qué se usan **private + getters/setters** (encapsulación).
- [ ] Sé cuándo usar `public` y `private` en una clase sencilla.
- [ ] Sé qué es un **constructor**, cómo se escribe y por qué **no retorna**.
- [ ] Entiendo `this` (atributo vs parámetro) y para qué sirve.
- [ ] Reconozco la **sobrecarga** (constructores/métodos con distintos parámetros).
- [ ] Puedo explicar “estado” y “comportamiento” con ejemplos.
- [ ] Sé dónde poner validaciones para evitar estados inválidos (constructor/setter).
