# Generala — Trabajo Final Introducción a la Programación

**Alumno:** Facundo Nahuel Soster — ACN1AV 2023  
**Materia:** Introducción a la Programación  
**Institución:** Da Vinci — Primera Escuela de Arte Multimedial

---

## Descripción del proyecto

Este repositorio contiene una implementación del juego **Generala**, desarrollada como trabajo final para la materia *Introducción a la Programación*.

El proyecto cumple con los requisitos de la consigna:

- Sin Programación Orientada a Objetos
- Sin ArrayList, sin ChatAt, sin librerías externas
- Uso exclusivo de estructuras básicas vistas en clase
- Uso de `JOptionPane` (Swing)
- Uso de arrays, condicionales, conectivos lógicos y estructuras de repetición
- Uso de `switch` para evaluar combinaciones
- Integración de imágenes simples para representar los dados

El juego permite lanzar cinco dados, elegir cuáles volver a tirar y obtener combinaciones como escalera, full, póker o generala.

---

## Funcionalidades implementadas

- Lanzamiento aleatorio de cinco dados.
- Representación de los dados mediante un array.
- Hasta tres intentos por turno.
- Selección de dados a relanzar.
- Evaluación de combinaciones mediante `switch`.
- Uso de condicionales y conectivos lógicos.
- Integración de imágenes de dados.
- Interfaz mediante `JOptionPane`.

---

## Estructura del proyecto

```text
GENERALA/
├── src/            → Código fuente Java (.java)
├── bin/            → Archivos compilados (.class)
├── images/         → Imágenes de los dados utilizadas por el programa
├── docs/           → Diagramas, pseudocódigo y documentación del proyecto
├── lib/            → Dependencias (si las hubiera)
├── .vscode/        → Configuración del entorno (opcional)
├── .gitignore      → Reglas de ignorado
├── README.md       → Descripción del proyecto
└── Examen Final.pdf → Enunciado de la consigna
```

---

## Requisitos para ejecutar

- Java JDK 11 o superior
- `javac` y `java` configurados en la variable de entorno `PATH`

---

## Compilación y ejecución por consola

### Compilar

```bash
javac -d bin -sourcepath src src/Generala.java
```

Si hay más archivos `.java` en `src`, puede compilarse todo el directorio:

```bash
javac -d bin $(find src -name "*.java")
```

### Ejecutar

```bash
java -cp bin Generala
```

> Nota: ejecutar desde la raíz del proyecto para que las rutas de imágenes funcionen correctamente.

---

## Uso en Visual Studio Code

- Abrir la carpeta del proyecto en VS Code.
- Tener instalada la extensión de Java.
- Ejecutar desde la vista **JAVA PROJECTS** o desde la terminal integrada con los comandos anteriores.

---

## Criterios de evaluación cumplidos

- Uso de dos estructuras de repetición
- Uso de array para los cinco dados
- Uso de selector múltiple
- Uso de condicionales y conectivos lógicos
- Tres intentos por turno
- Imágenes integradas
- Sin POO, sin ArrayList, sin librerías externas
- Presentación clara y alineada al diagrama

---

## Autor

Trabajo final realizado por **Facundo Nahuel Soster** para la materia *Introducción a la Programación* — Escuela Da Vinci.

---

## Licencia

Proyecto entregado y creado con fines educativos. 