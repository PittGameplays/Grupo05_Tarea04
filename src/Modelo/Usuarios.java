package Modelo;

public class Usuarios {
    private int dni;
    private String apellido;
    private String nombre;
    private String contraseña;
    private boolean admin;

    public Usuarios(int dni, String apellido, String nombre, String contraseña, boolean admin) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.contraseña = contraseña;
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
