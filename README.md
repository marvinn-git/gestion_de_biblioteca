#Sistema de Biblioteca
Este proyecto es un sistema de gestión de una biblioteca desarrollado en Java. Permite gestionar usuarios, libros, préstamos y reservas mediante un menú interactivo. El sistema está diseñado para ser sencillo y eficiente, utilizando arrays para almacenar datos y asegurando validaciones adecuadas en la entrada del usuario.

Características Principales
Gestión de Usuarios:

Registrar usuarios con nombre, ID único y rol (estudiante, profesor, invitado).
Listar usuarios registrados.
Validar la capacidad de préstamo según el rol del usuario.
Gestión de Libros:

Registrar libros con título, autor, ID único, año de publicación y cantidad de copias disponibles.
Listar libros disponibles.
Gestionar reservas para libros no disponibles.
Gestión de Préstamos:

Realizar préstamos, verificando la disponibilidad del libro y la capacidad del usuario.
Marcar devoluciones de libros.
Gestión de Reservas:

Permitir que los usuarios reserven libros no disponibles.
Liberar reservas al devolver libros.
Interfaz Interactiva:

Menú intuitivo para navegar por las diferentes opciones del sistema.
Validaciones robustas para garantizar entradas correctas del usuario.
Estructura del Proyecto
El proyecto está dividido en las siguientes clases principales:

Clase Usuario

Atributos: nombre, ID, rol, libros prestados.
Gestiona la información y validaciones relacionadas con los usuarios.
Clase Libro

Atributos: título, autor, ID, año de publicación, copias disponibles, reservas.
Gestiona la información y operaciones relacionadas con los libros.
Clase Prestamo

Atributos: ID, libro asociado, usuario asociado, fecha de préstamo.
Representa un préstamo realizado.
Clase Biblioteca

Integra todas las funcionalidades del sistema.
Maneja el menú interactivo y las operaciones principales.
Tecnologías Utilizadas
Lenguaje: Java
Entrada/Salida: Clase Scanner para interactuar con el usuario.
Requisitos del Sistema
Java Development Kit (JDK) 8 o superior.
Entorno de desarrollo integrado (IDE) como Eclipse o IntelliJ IDEA.
Ejecución del Proyecto
Clona el repositorio o copia los archivos fuente en tu IDE.
Compila y ejecuta la clase principal Biblioteca.
Navega por el menú interactivo para realizar las operaciones disponibles.
Notas Importantes
Uso de Arrays: Todos los datos (usuarios, libros, préstamos, reservas) se almacenan en arrays de tamaño fijo.
Validaciones: El sistema verifica las entradas del usuario para evitar errores o inconsistencias.
Límites de Préstamo: El rol del usuario determina cuántos libros puede prestar simultáneamente:
Estudiantes: 3 libros.
Profesores: 5 libros.
Invitados: 1 libro.
Futuras Mejoras
Implementar persistencia de datos utilizando una base de datos o archivos.
Ampliar las funcionalidades de gestión, como editar y eliminar usuarios o libros.
Introducir una interfaz gráfica de usuario (GUI) para mejorar la experiencia.
Autores
[Tu Nombre] - Gestión de Usuarios
[Nombre del Colaborador 2] - Gestión de Libros
[Nombre del Colaborador 3] - Gestión de Préstamos
[Nombre del Colaborador 4] - Integración y Reservas
