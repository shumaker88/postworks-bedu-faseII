# Integración de Thymeleaf con Spring Boot

### OBJETIVO

- Colocar un formulario que permita crear nuevas entradas en la agenda de
  nuestro proyecto.
- Almacenar la información en la memoria de la aplicación.
- Mostrar en la pantalla la lista de personas registradas en la agenda (puede
  ser en la parte inferior de la pantalla del formulario).
- Validar que todos los datos obligatorios se hayan introducido.
- Mostrar un mensaje de error en caso de que algún dato introducido tenga un
  formato incorrecto.

En esta sesión aprendimos a usar Thymeleaf como un motor de plantillas que nos
permite generar páginas HTML del lado del servidor, para mostrar al cliente una
vista dinámica con información generada en el servidor.

Además aprendimos la forma de validar y recibir la información proporcionada por
el usuario a través de un formulario, y la forma de mostrar esta información en
la página.

### Aprendizajes adquiridos

- Cómo integrar Thymeleaf en un proyecto Spring Boot.
- Realizar validaciones de los datos de entrada.
- Mostrar mensajes de error.

En ésta ocasión reemplazamos el API con una página web que contenga las
siguientes funcionalidades.

- Muestre la lista de personas registradas en la agenda, ordenadas de forma
  alfabética.
- Muestre los teléfonos usando un formato de ##-####-####.
- Contenga un formulario con validaciones y que permita agregar nuevos registros
  a la agenda.
- Los distintos elementos de la aplicación se conectarán a través de clases
  “servicio” y controladores de Spring MVC.
