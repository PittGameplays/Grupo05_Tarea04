package Vista;

import Acceso.Salvador;
import Control.Arreglo_Usuarios;
import Modelo.Usuarios;
import javax.swing.JOptionPane;

public class JFrame_Admin extends javax.swing.JFrame {

    Arreglo_Usuarios arreglo;
    Usuarios temp;

    public JFrame_Admin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void setArreglo(Arreglo_Usuarios dato) {
        arreglo = dato;
    }

    public void setTexts() {
        if (temp != null) {
            txt_apellido.setText(temp.getApellido());
            txt_nombre.setText(temp.getNombre());
            txt_consumoAgua.setText(temp.getConsumo_agua() + "");
            txt_consumoGas.setText(temp.getConsumo_gas() + "");
            txt_consumoLuz.setText(temp.getConsumo_luz() + "");
        } else {
            txt_apellido.setText("");
            txt_nombre.setText("");
            txt_consumoAgua.setText("");
            txt_consumoGas.setText("");
            txt_consumoLuz.setText("");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst_usuarios = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_consumoAgua = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_consumoLuz = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_consumoGas = new javax.swing.JTextField();
        btn_modificar = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        tbl_usuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        lst_usuarios.setBackground(new java.awt.Color(153, 204, 255));
        lst_usuarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lst_usuarios.setForeground(new java.awt.Color(255, 255, 255));
        lst_usuarios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lst_usuarios.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lst_usuariosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lst_usuarios);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Apellido del Usuario:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre del Usuario:");

        txt_apellido.setEditable(false);
        txt_apellido.setBackground(new java.awt.Color(153, 204, 255));
        txt_apellido.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txt_apellido.setForeground(new java.awt.Color(255, 255, 255));

        txt_nombre.setEditable(false);
        txt_nombre.setBackground(new java.awt.Color(153, 204, 255));
        txt_nombre.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Consumo de Agua del Usuario:");

        txt_consumoAgua.setBackground(new java.awt.Color(153, 204, 255));
        txt_consumoAgua.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txt_consumoAgua.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Consumo de Luz del Usuario:");

        txt_consumoLuz.setBackground(new java.awt.Color(153, 204, 255));
        txt_consumoLuz.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txt_consumoLuz.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Consumo de gas Natural:");

        txt_consumoGas.setBackground(new java.awt.Color(153, 204, 255));
        txt_consumoGas.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txt_consumoGas.setForeground(new java.awt.Color(255, 255, 255));

        btn_modificar.setBackground(new java.awt.Color(153, 204, 255));
        btn_modificar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(0, 0, 0));
        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_cerrar.setBackground(new java.awt.Color(153, 204, 255));
        btn_cerrar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_cerrar.setForeground(new java.awt.Color(0, 0, 0));
        btn_cerrar.setText("Cerrar Sesion");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_consumoAgua)
                    .addComponent(txt_nombre)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(txt_consumoLuz)
                            .addComponent(txt_consumoGas)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_apellido))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_consumoAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_consumoLuz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_consumoGas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_modificar)
                            .addComponent(btn_cerrar)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Modificar Consumo", jPanel2);

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));

        tbl_usuarios.setBackground(new java.awt.Color(153, 204, 255));
        tbl_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scroll.setViewportView(tbl_usuarios);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jTabbedPane1.addTab("Tabla de Usuarios", jPanel3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 500, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        if (temp != null) {
            try {
                double agua = Double.parseDouble(txt_consumoAgua.getText());
                double luz = Double.parseDouble(txt_consumoLuz.getText());
                double gas = Double.parseDouble(txt_consumoGas.getText());
                
                arreglo.getUsuario(arreglo.buscar_2(temp.getDni())).setConsumo_agua(agua);
                arreglo.getUsuario(arreglo.buscar_2(temp.getDni())).setConsumo_gas(gas);
                arreglo.getUsuario(arreglo.buscar_2(temp.getDni())).setConsumo_luz(luz);
                JOptionPane.showMessageDialog(null, "Modificacion Exitosa");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Rellene con valores numericos");
            }

        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        int xd = JOptionPane.showConfirmDialog(null, "¿Seguro que desea cerrar su sesion?",
                "Confirmacion", JOptionPane.YES_NO_OPTION);

        if (xd == JOptionPane.YES_OPTION) {
            JFrame_Principal jf = new JFrame_Principal();
            jf.setArreglo(arreglo);
            jf.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void lst_usuariosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lst_usuariosValueChanged
        int index = lst_usuarios.getSelectedIndex();
        if (index != -1) {
            temp = arreglo.buscar_1(Integer.parseInt(lst_usuarios.getSelectedValue()));
            btn_modificar.setEnabled(true);
        } else {
            temp = null;
            btn_modificar.setEnabled(false);
        }
        setTexts();
    }//GEN-LAST:event_lst_usuariosValueChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        arreglo.listar(lst_usuarios);
        arreglo.listar(tbl_usuarios);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        arreglo.listar(lst_usuarios);
        arreglo.listar(tbl_usuarios);
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Salvador.set_arreglo(arreglo);
        Salvador.guardar();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> lst_usuarios;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tbl_usuarios;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_consumoAgua;
    private javax.swing.JTextField txt_consumoGas;
    private javax.swing.JTextField txt_consumoLuz;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
