package Modelo;

public class Usuarios {

    private int dni;
    private String contraseña;
    private String apellido;
    private String nombre;
    private int estrato;
    private double consumo_agua, consumo_luz, consumo_gas;
    private boolean admin;

    public Usuarios(int dni, String contraseña, String apellido, String nombre, int estrato, boolean admin) {
        this.dni = dni;
        this.contraseña = contraseña;
        this.apellido = apellido;
        this.nombre = nombre;
        this.estrato = estrato;
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
    
    public double getDescuento(){
        double a;
        switch (estrato) {
            case 5:
            case 6:
                a = .25;
                break;
            case 4:
            case 3:
                a = -.10;
                break;
            default:
                a = -.50;
                break;
        }
        return a;
    }
    
    public double getCosto_agua(){
        return consumo_agua * (1+getDescuento());
    }
    
    public double getCosto_luz(){
        return consumo_luz * (1+getDescuento());
    }
    
    public double getCosto_gas(){
        return consumo_gas * (1+getDescuento());
    }

}
