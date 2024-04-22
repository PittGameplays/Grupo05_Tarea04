package Control;

import Modelo.Usuarios;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Usuarios {

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

    private void quicksort2(int izq, int der) {
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

    public void mergesort() {
        Usuarios[] temp = mergesort1(arreglo, true);
        
        for (int j = 0; j < temp.length; j++) {
            arreglo[j] = temp[j]; 
        }
        
    }

    private Usuarios[] mergesort1(Usuarios[] array, boolean start) {
        if (array.length == 1 || i == 0 || i == 1) {
            return array;
        }

        Usuarios[] arregloA;
        Usuarios[] arregloB;

        if (start) {
            arregloA = new Usuarios[i / 2];
            arregloB = new Usuarios[i - arregloA.length];
            
            for (int j = 0; j < arregloA.length; j++) {
                arregloA[j] = array[j];
            }
            
            for (int j = arregloA.length; j < i; j++) {
                arregloB[j - arregloA.length] = array[j];
            }
            
        } else {
            arregloA = new Usuarios[array.length / 2];
            if (array.length % 2 == 0) {
                arregloB = new Usuarios[array.length / 2];
            } else {
                arregloB = new Usuarios[array.length / 2 + 1];
            }
            
            for (int j = 0; j < array.length; j++) {
            if (j < array.length / 2) {
                arregloA[j] = array[j];
            } else {
                arregloB[j - (array.length / 2)] = array[j];
            }
        }
        }

        arregloA = mergesort1(arregloA, false);
        arregloB = mergesort1(arregloB, false);

        return mergesort2(arregloA, arregloB);
    }

    private Usuarios[] mergesort2(Usuarios[] array1, Usuarios[] array2) {
        int cont1 = 0, cont2 = 0, j = 0;
        Usuarios[] arregloFinal = new Usuarios[array1.length + array2.length];

        while (cont1 < array1.length && cont2 < array2.length) {
            if (array1[cont1].getDni() > array2[cont2].getDni()) {
                arregloFinal[j] = array2[cont2];
                j++;
                cont2++;
            } else {
                arregloFinal[j] = array1[cont1];
                j++;
                cont1++;
            }

        }

        while (cont1 < array1.length) {
            arregloFinal[j] = array1[cont1];
            j++;
            cont1++;
        }
        while (cont2 < array2.length) {
            arregloFinal[j] = array2[cont2];
            j++;
            cont2++;
        }

        return arregloFinal;
    }
}
