# Conexión a base de datos con Spring Data

### OBJETIVO

Almacenar la información de la agenda en una base de datos relacional MySQL.
Recuperar las personas contenidas en la agenda desde la base de datos para
mostrarlas en pantalla. Que la información ingresada no desaparezca al momento
de reiniciar la aplicación.

En esta sesión aprendimos a usar Spring Data JPA como mecanismo para realizar el
trabajo en una base de datos relacional. Spring Data JPA hace uso de Hibernate
como motor de persistencia y este realiza las conversiones entre objetos Java a
tablas de la base de datos para que no tengamos que preocuparnos por escribir ni
una sola línea de SQL.

Además aprendimos dos diferentes formas de inicializar la información en la base
de datos, la primera usando la interface CommandLineRunner y la segunda usando
archivos SQL.

### Aprendizajes adquiridos

- Cómo integrar Spring Data JPA en un proyecto Spring Boot. - La forma de
  configurar la conexión a la base de datos.
- Qué es una entidad, un repositorio, y cómo integrarlos en la aplicación.

En esta ocasión el objetivo es extender este programa eliminando el Set en donde
almacenamos la información de la agenda, y reemplazarlo por una base de datos
relacional en MySQL. De esta forma, aunque reiniciemos la aplicación la
información seguirá estando disponible.
