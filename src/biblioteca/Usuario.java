package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombre;
    private int idUnico;
    private String rol;  
    private int librosPrestados; 
    private static List<Usuario> usuariosRegistrados = new ArrayList<>();  
    private static int contador = 0;  

    public Usuario(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
        this.librosPrestados = 0;
        this.idUnico = ++contador; 
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

    public static List<Usuario> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }

    public static void registrarUsuario(String nombre, String rol) {
        Usuario nuevoUsuario = new Usuario(nombre, rol);
        usuariosRegistrados.add(nuevoUsuario);
    }

    public boolean puedeRealizarPrestamo() {
        int maxLibrosPermitidos = 0;

        if (rol.equalsIgnoreCase("Estudiante")) {
            maxLibrosPermitidos = 3;
        } else if (rol.equalsIgnoreCase("Profesor")) {
            maxLibrosPermitidos = 5;
        } else if (rol.equalsIgnoreCase("Invitado")) {
            maxLibrosPermitidos = 1;
        }

        return librosPrestados < maxLibrosPermitidos;
    }

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
