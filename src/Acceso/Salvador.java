package Acceso;

import Control.Arreglo_Usuarios;
import Modelo.Usuarios;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Salvador {
    static Arreglo_Usuarios arreglo;
    static String ruta_archivo = "datos.txt";
    static Usuarios temp;
    
    
    public static void set_arreglo(Arreglo_Usuarios dato){
        arreglo = dato;
    }
    
    public static void cargar(){
        try {
            FileReader fr = new FileReader(ruta_archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;

            while ((linea = br.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(linea, "%");
                Object[] datos = new Object[6];
                int i = 0;
                while (tokenizer.hasMoreTokens()) {
                    datos[i] = tokenizer.nextToken();
                    i++;
                }
                temp = new Usuarios(Integer.parseInt(datos[0] + ""), datos[1] + "", datos[2] + "", datos[3] + "",
                        Integer.parseInt(datos[4] + ""), Boolean.parseBoolean(datos[5] + ""));
                arreglo.agregar(temp);
            }
            
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se encontro el archivo: \"datos.txt\"");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        }
    }
    
    
    
    public static void guardar() {
        try {
            FileWriter fw = new FileWriter(ruta_archivo);
            PrintWriter pw = new PrintWriter(fw);

            for (int j = 0; j < arreglo.getI(); j++) {
                pw.print(arreglo.getUsuario(j).getSalvado()+ "\n");
            }
            pw.close();
            fw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
