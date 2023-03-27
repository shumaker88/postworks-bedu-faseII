# Patrón MVC con Spring Boot

### OBJETIVO

Reemplazar la aplicación de línea de comandos por un API Rest que reciba la
información de nombre y teléfono. Tener un almacenamiento temporal de la
información en la memoria. Desarrollar un Endpoint que regrese la información
almacenada en la agenda.

En esta sesión aprendimos MVC como estilo arquitectónico para nuestras
aplicaciones. Ahora lo usaremos para dejar atrás la línea de comandos y realizar
el desarrollo de un API Rest que nos ayude con el manejo de nuestra agenda
telefónica.

### Aprendizajes adquiridos

- Cómo utilizar el Spring Initializr para crear un proyecto
- Cómo configurar un proyecto de Gradle
- Cómo crear un controlador REST en Spring MVC.
- Cómo utilizar la Inyección de Dependencias en Spring Boot

En ésta ocasión el objetivo era eliminar el uso de la línea de comandos y
reemplazarlo por un API Rest que contenga las siguientes funcionalidades:

- Reciba la información del nombre y número de teléfono y aplique el mismo
  proceso de validación y limpieza del teléfono que desarrollamos en el módulo
  anterior.
- Almacene la información en memoria usando un Set de Java que ordene las
  entradas de forma alfabética por el nombre de la persona.
- Para lograr esto Persona deberá implementar la interface java.lang.Comparable
  Un servicio REST que al hacer una petición GET regrese la información de la
  agenda en formato JSON.
- La aplicación debe implementar el patrón MVC. Esto quiere decir que el modelo
  se encontrará en una capa, el acceso a datos en otra capa y la vista (los
  servicios Rest) en otra capa.
- La lógica de la aplicación debe estar contenida en una clase “servicio” que
  deberá recibir todas sus dependencias a través de inyección por constructor.
