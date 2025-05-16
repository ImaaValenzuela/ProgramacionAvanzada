# Programación Avanzada

Este repositorio fue desarrollado en IntelliJ IDEA utilizando Maven como sistema de construcción. A continuación, voy a describir los pasos necesarios para importar y ejecutar este proyecto en **Eclipse**.

## Requisitos previos

- [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) (versión 8 o superior)
- [Eclipse IDE](https://www.eclipse.org/downloads/)
- [Apache Maven](https://maven.apache.org/download.cgi) (si no lo tienes integrado en Eclipse)
- Plugin de Maven para Eclipse (normalmente ya viene incluido en Eclipse IDE for Java Developers)

## Importar el proyecto en Eclipse

1. Abrir Eclipse.
2. Ir a `File` > `Import...`.
3. Seleccionar `Existing Maven Projects` en la categoría `Maven` y clickear en `Next`.
4. En el campo **Root Directory**, selecciona la carpeta raíz del proyecto (donde está el archivo `pom.xml`).
5. Eclipse te detecta automáticamente el proyecto. Hay que asegurarse de todas maneras de que esté seleccionado y clickear en `Finish`.

## Ejecutar el proyecto

1. Espera a que Eclipse termine de construir el proyecto e instale las dependencias de Maven.
2. Ir al archivo con el método `main` (`Main.java`).
3. Hacer click derecho sobre el archivo y seleccionar `Run As` > `Java Application`.

## Notas adicionales

- Si Eclipse no reconoce el proyecto correctamente, asegúrate de que esté configurado como un proyecto Maven: click derecho sobre el proyecto > `Configure` > `Convert to Maven Project`.
- Si faltan dependencias, podes forzar una actualización de Maven con click derecho sobre el proyecto > `Maven` > `Update Project`.
