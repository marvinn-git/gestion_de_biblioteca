package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    // Atributos
    private String nombre;
    private int idUnico;
    private String rol;  // Estudiante, Profesor, Invitado
    private int librosPrestados;  // Número de libros actualmente prestados
    private static List<Usuario> usuariosRegistrados = new ArrayList<>();  // Lista de usuarios registrados
    private static int contador = 0;  // Contador estático para asignar ID único a los usuarios

    // Constructor
    public Usuario(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
        this.librosPrestados = 0;
        this.idUnico = ++contador;  // Asignar ID único automáticamente
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdUnico() {
        return idUnico;
    }

    public void setIdUnico(int idUnico) {
        this.idUnico = idUnico;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(int librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    // Método estático para obtener la lista de usuarios registrados
    public static List<Usuario> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }

    // Método estático para registrar un nuevo usuario
    public static void registrarUsuario(String nombre, String rol) {
        Usuario nuevoUsuario = new Usuario(nombre, rol);
        usuariosRegistrados.add(nuevoUsuario);
    }

    // Método para verificar si un usuario puede realizar un préstamo
    public boolean puedeRealizarPrestamo() {
        int maxLibrosPermitidos = 0;

        // Determinar el límite de libros según el rol del usuario
        if (rol.equalsIgnoreCase("Estudiante")) {
            maxLibrosPermitidos = 3;
        } else if (rol.equalsIgnoreCase("Profesor")) {
            maxLibrosPermitidos = 5;
        } else if (rol.equalsIgnoreCase("Invitado")) {
            maxLibrosPermitidos = 1;
        }

        // Verificar si el usuario ha alcanzado el límite
        return librosPrestados < maxLibrosPermitidos;
    }

    // Método para listar todos los usuarios
    public static void listarUsuarios() {
        if (usuariosRegistrados.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
        } else {
            for (Usuario usuario : usuariosRegistrados) {
                System.out.println("ID: " + usuario.idUnico + ", Nombre: " + usuario.nombre + ", Rol: " + usuario.rol);
            }
        }
    }
}
