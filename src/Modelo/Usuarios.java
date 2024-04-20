package Modelo;

public class Usuarios {

    private int dni;
    private String contraseña;
    private String apellido;
    private String nombre;
    private boolean admin;

    public Usuarios(int dni, String contraseña, String apellido, String nombre, boolean admin) {
        this.dni = dni;
        this.contraseña = contraseña;
        this.apellido = apellido;
        this.nombre = nombre;
        this.admin = admin;
    }

    public int getDni() {
        return dni;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public boolean isAdmin() {
        return admin;
    }

}
