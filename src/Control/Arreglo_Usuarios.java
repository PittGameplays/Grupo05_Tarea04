package Control;

import Modelo.Usuarios;
import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Usuarios {
    int mmgvo;
    private Usuarios[] arreglo = new Usuarios[100];
    private int i = 0;
    boolean starting = true;

    public void setStarting(boolean starting) {
        this.starting = starting;
    }

    public boolean isStarting() {
        return starting;
    }

    public void agregar(Usuarios dato) {
        if (i <= 100) {
            if (buscar(dato.getDni())) {
                JOptionPane.showMessageDialog(null, "El usuario ya existe");
            } else {
                arreglo[i] = dato;
                i++;
                if (!starting) {
                    JOptionPane.showMessageDialog(null, "Registro Exitoso");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cantidad de usuarios excedida, proceso fallido");
        }

    }

    public int getI() {
        return i;
    }

    public Usuarios getUsuario(int index) {
        return arreglo[index];
    }

    public void listar(JTable table) {
        Object[] cabecera = {"DNI", "Apellidos", "Nombres", "Estrato Social", "Cons. Agua",
            "Cons. Luz", "Cons. Gas"};

        DefaultTableModel modtable = new DefaultTableModel(cabecera, 0);
        
        table.setModel(modtable);

        for (int j = 0; j < i; j++) {
            if (!arreglo[j].isAdmin()) {
                modtable.addRow(arreglo[j].getInfo());
            }

        }
    }

    public void listar(JList list) {
        DefaultListModel modlist = new DefaultListModel();
        list.setModel(modlist);

        for (int j = 0; j < i; j++) {
            if (!arreglo[j].isAdmin()) {
                modlist.addElement(arreglo[j].getDni() + "");
            }
        }
    }

    public boolean validar(int dni, String contraseña) {
        if (buscar(dni, contraseña) != null) {
            JOptionPane.showMessageDialog(null, "Bienvenido " + buscar(dni, contraseña).getNombre() + " "
                    + buscar(dni, contraseña).getApellido());
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales Invalidas");
        }

        return buscar(dni, contraseña) != null;
    }

    public Usuarios buscar(int dni, String contraseña) {
        for (int j = 0; j < i; j++) {
            if (arreglo[j].getDni() == dni && arreglo[j].getContraseña().equals(contraseña)) {
                return getUsuario(j);
            }
        }
        return null;
    }

    public boolean buscar(int dni) {
        for (int j = 0; j < i; j++) {
            if (arreglo[j].getDni() == dni) {
                return true;
            }
        }
        return false;
    }
    
    public Usuarios buscar_1(int dni) {
        for (int j = 0; j < i; j++) {
            if (arreglo[j].getDni() == dni) {
                return arreglo[j];
            }
        }
        return null;
    }
    
    public int buscar_2(int dni) {
        for (int j = 0; j < i; j++) {
            if (arreglo[j].getDni() == dni) {
                return j;
            }
        }
        return -1;
    }

    public void quicksort() {
        quicksort2(0, i - 1);
    }

    public void quicksort2(int izq, int der) {
        int izquierda = izq, derecha = der;
        if (izq >= der) {
            return;
        }

        if (izq != der) {
            int pivote = izq;
            Usuarios aux;
            while (izq != der) {
                while (arreglo[der].getDni() >= arreglo[pivote].getDni() && izq < der) {
                    der--;
                }
                while (arreglo[izq].getDni() < arreglo[pivote].getDni() && izq < der) {
                    izq++;
                }

                if (der != izq) {
                    aux = arreglo[der];
                    arreglo[der] = arreglo[izq];
                    arreglo[izq] = aux;
                }
            }

            if (izq == der) {
                quicksort2(izquierda, izq - 1);
                quicksort2(izq + 1, derecha);
            }
        }

    }

}
