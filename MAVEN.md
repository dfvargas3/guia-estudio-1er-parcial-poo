# 📦 Guía de Maven para el Proyecto

## ¿Qué es Maven?

Maven es una herramienta de gestión y construcción de proyectos Java que:
- ✅ Gestiona las dependencias automáticamente
- ✅ Compila el código de manera estandarizada
- ✅ Ejecuta pruebas y genera reportes
- ✅ Empaqueta la aplicación (JAR, WAR, etc.)

## Estructura del Proyecto Maven

```
guia-estudio-1er-parcial-poo/
├── pom.xml              # Archivo de configuración de Maven
├── src/
│   └── main/
│       └── java/        # Código fuente Java
│           └── ...
└── target/              # Directorio generado (archivos compilados)
```

## Comandos Maven Esenciales

### 🔨 Compilar el Proyecto

```bash
mvn compile
```

Compila todos los archivos `.java` y los coloca en `target/classes/`

### 🧹 Limpiar el Proyecto

```bash
mvn clean
```

Elimina el directorio `target/` con todos los archivos compilados

### 🧹➕🔨 Limpiar y Compilar

```bash
mvn clean compile
```

Limpia archivos antiguos y compila de nuevo (recomendado)

### ▶️ Ejecutar el Programa Principal

```bash
mvn exec:java
```

Ejecuta la clase `Main` configurada en el `pom.xml`

### ▶️ Ejecutar Otra Clase Específica

```bash
mvn exec:java -Dexec.mainClass="paquete.Clase"
```

Ejemplos:
```bash
mvn exec:java -Dexec.mainClass="ejemplos.basicos.DemoBasica"
mvn exec:java -Dexec.mainClass="ejemplos.encapsulacion.DemoEncapsulacion"
mvn exec:java -Dexec.mainClass="ejemplos.constructores.DemoConstructores"
```

### 📦 Empaquetar como JAR

```bash
mvn package
```

Crea un archivo JAR en `target/guia-estudio-parcial-poo-1.0.0.jar`

### 📦➕▶️ Empaquetar y Ejecutar el JAR

```bash
# Crear el JAR
mvn clean package

# Ejecutar el JAR
java -jar target/guia-estudio-parcial-poo-1.0.0.jar
```

### 🔄 Comando Todo-en-Uno

```bash
mvn clean compile exec:java
```

Limpia, compila y ejecuta en un solo comando

## Archivo pom.xml Explicado

```xml
<properties>
    <!-- Versión de Java -->
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
</properties>

<build>
    <plugins>
        <!-- Plugin para compilar -->
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.11.0</version>
        </plugin>

        <!-- Plugin para ejecutar -->
        <plugin>
            <groupId>org.codehaus.mojo</groupId>
            <artifactId>exec-maven-plugin</artifactId>
            <configuration>
                <mainClass>Main</mainClass> <!-- Clase principal -->
            </configuration>
        </plugin>
    </plugins>
</build>
```

## Ciclo de Vida de Maven

Maven tiene fases predefinidas que se ejecutan en orden:

1. **validate** - Valida que el proyecto esté correcto
2. **compile** - Compila el código fuente
3. **test** - Ejecuta pruebas unitarias
4. **package** - Empaqueta el código compilado (JAR)
5. **verify** - Verifica que el paquete sea válido
6. **install** - Instala el paquete en el repositorio local
7. **deploy** - Copia el paquete a un repositorio remoto

Cuando ejecutas una fase, Maven ejecuta todas las anteriores automáticamente.

## Tips y Mejores Prácticas

### ⚡ Compilación Rápida

Si solo cambiaste un archivo, Maven solo recompilará lo necesario:
```bash
mvn compile
```

### 🚀 Ejecución Rápida

Para desarrollo, usa:
```bash
mvn compile exec:java
```

### 📊 Ver Dependencias

```bash
mvn dependency:tree
```

### 🔍 Ver Información del Proyecto

```bash
mvn help:effective-pom
```

### 🧪 Agregar Pruebas (futuro)

Si agregas pruebas en `src/test/java/`, ejecútalas con:
```bash
mvn test
```

## Integración con IDEs

### IntelliJ IDEA
1. Abre el proyecto (IntelliJ detecta automáticamente el `pom.xml`)
2. El IDE descargará dependencias automáticamente
3. Usa el panel "Maven" a la derecha para ejecutar comandos

### Eclipse
1. Import → Maven → Existing Maven Projects
2. Selecciona la carpeta del proyecto
3. Eclipse configurará todo automáticamente

### VS Code
1. Instala la extensión "Java Extension Pack"
2. Abre la carpeta del proyecto
3. VS Code detectará Maven automáticamente

## Solución de Problemas

### ❌ "mvn: command not found"

Maven no está instalado. Instálalo:

**macOS (Homebrew):**
```bash
brew install maven
```

**Linux (Ubuntu/Debian):**
```bash
sudo apt-get install maven
```

**Windows:**
- Descarga desde https://maven.apache.org/download.cgi
- Extrae y agrega `bin/` al PATH

### ❌ Error de versión de Java

Asegúrate de tener Java 17+ instalado:
```bash
java -version
```

Si tienes una versión antigua, actualiza Java o cambia la versión en `pom.xml`:
```xml
<maven.compiler.source>11</maven.compiler.source>
<maven.compiler.target>11</maven.compiler.target>
```

### ❌ El proyecto no compila después de cambios

Limpia y recompila:
```bash
mvn clean compile
```

### ❌ Los cambios no se reflejan al ejecutar

Maven puede estar usando versiones en caché:
```bash
mvn clean compile exec:java
```

## Recursos Adicionales

- **Documentación oficial de Maven**: https://maven.apache.org/guides/
- **Maven en 5 minutos**: https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
- **Referencia del POM**: https://maven.apache.org/pom.html

## Comandos de Resumen Rápido

```bash
# Compilar
mvn compile

# Ejecutar
mvn exec:java

# Limpiar y ejecutar
mvn clean compile exec:java

# Crear JAR
mvn package

# Ejecutar JAR
java -jar target/guia-estudio-parcial-poo-1.0.0.jar

# Ejecutar demo específica
mvn exec:java -Dexec.mainClass="ejemplos.basicos.DemoBasica"
```

---

¡Con Maven, gestionar tu proyecto Java es más fácil y profesional! 🚀
