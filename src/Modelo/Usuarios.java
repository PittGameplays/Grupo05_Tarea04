package Modelo;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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

    public Usuarios(int dni, String contraseña, String apellido, String nombre, int estrato, double consumo_agua,
            double consumo_luz, double consumo_gas, boolean admin) {
        this.dni = dni;
        this.contraseña = contraseña;
        this.apellido = apellido;
        this.nombre = nombre;
        this.estrato = estrato;
        this.consumo_agua = consumo_agua;
        this.consumo_luz = consumo_luz;
        this.consumo_gas = consumo_gas;
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

    public double getConsumo_agua() {
        return consumo_agua;
    }

    public double getConsumo_luz() {
        return consumo_luz;
    }

    public double getConsumo_gas() {
        return consumo_gas;
    }

    public void setConsumo_agua(double consumo_agua) {
        this.consumo_agua = consumo_agua;
    }

    public void setConsumo_luz(double consumo_luz) {
        this.consumo_luz = consumo_luz;
    }

    public void setConsumo_gas(double consumo_gas) {
        this.consumo_gas = consumo_gas;
    }
    
    

    public double getDescuento() {
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

    public double getCosto_agua() {
        return (consumo_agua * 9256 * (1 + getDescuento())) * 1.01;
    }

    public double getCosto_luz() {
        return (consumo_luz * 6200 * (1 + getDescuento())) * 1.01;
    }

    public double getCosto_gas() {
        return (consumo_gas * 5234 *(1 + getDescuento())) * 1.01;
    }
    
    public double getCosto_total(){
        return getCosto_agua() + getCosto_gas() + getCosto_luz();
    }

    public Object[] getInfo() {
        String xd;
        switch (estrato) {
            case 6: xd = "Alta-Alta"; break;
            case 5: xd = "Alta"; break;    
            case 4: xd = "Media-Alta"; break;    
            case 3: xd = "Media"; break;
            case 2: xd = "Media-Baja"; break;
            default:
                xd = "Baja";
        }
        
        return new Object[]{dni, apellido, nombre, xd, consumo_agua, consumo_luz, consumo_gas};
    }
    
    public String getSalvado(){
        return dni + "%" + contraseña + "%" + apellido + "%" + nombre + "%" + estrato + "%" + consumo_agua + "%" + 
                consumo_luz + "%" + consumo_gas + "%" + admin;
    }
    
    public void Listar(JTable table){
        String[] cabecera = {"Cons. Agua", "Prec. Agua", "Cons. Luz", "Prec. Luz", "Cons. Gas", "Prec. Gas"};
        DefaultTableModel modtable = new DefaultTableModel(cabecera, 0);
        modtable.addRow(new Object[]{consumo_agua + "m3", "S/" + getCosto_agua(), consumo_luz + "kw", "S/" + getCosto_luz(), 
        consumo_gas + "m3", "S/" +getCosto_gas()});
        table.setModel(modtable);
        
    }
}
