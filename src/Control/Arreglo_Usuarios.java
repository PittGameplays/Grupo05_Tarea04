package Control;

import Modelo.Usuarios;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Usuarios {
    ArrayList<Usuarios> arreglo = new ArrayList<>();
    boolean starting;
    
    
    public void agregar(Usuarios dato){
        arreglo.add(dato);
        if(starting){
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
        }
        
    }
    
    public void listar(JTable table){
        Object[] cabecera = {"DNI", "Apellidos", "Nombres", "Estrato Social", "Consumo de Agua",
            "Consumo de Luz", "Consumo de Gas"};
            
        DefaultTableModel modtable = new DefaultTableModel(cabecera, 0);
        table.setModel(modtable);
        
        for (int i = 0; i < arreglo.size(); i++) {
            modtable.addRow(arreglo.get(i).getInfo());
        }
    }
    
    public void listar(JList list){
        DefaultListModel modlist = new DefaultListModel();
        list.setModel(modlist);
        
        for (int i = 0; i < arreglo.size(); i++) {
            modlist.addElement(arreglo.get(i).getDni());
        }
    }
    
    
}
