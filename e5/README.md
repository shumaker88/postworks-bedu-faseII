# Java Beans y la inversión de Control(IoC) en Spring Boot

### OBJETIVO

Extender el programa de línea de comandos para utilizar el IoC de Spring Boot

En esta sesión aprendimos qué es la Inversión de Control y cómo usar los
JavaBeans junto con la Inyección de Dependencias en Spring Boot.

### Aprendizajes adquiridos

- Cómo utilizar el Spring Initializr para crear un proyecto - Cómo configurar un
  proyecto de Gradle
- Cómo crear una aplicación de líneas de comandos en Spring Boot
- Cómo utilizar la Inyección de Dependencias en Spring Boot Indicaciones
  generales

En esta sesión el objetivo fue extender este programa para que la línea de
comandos para que:

- Valide que el número de teléfono solo contenga caracteres válidos: números,
  guion medio y espacio en blanco. Valide que el número de teléfono contenga 10
  dígitos.
- Si se tiene un número válido, elimine todos los caracteres que no sean
  numéricos.
- De al número de teléfono un formato de (##)-####-#### antes de imprimirlo en
  la consola.
- Dicha implementación debe estar contenida en dos clases “servicio” que deben
  ser inyectada en la clase principal.
