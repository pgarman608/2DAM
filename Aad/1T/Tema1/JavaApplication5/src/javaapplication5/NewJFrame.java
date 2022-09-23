/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.io.File;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class NewJFrame extends javax.swing.JFrame {
    private File myfile;
    private DefaultTableModel modelo;
    private Object[] datos;
    public NewJFrame() {
        initComponents();
        this.datos = new Object[4];
        this.modelo = (DefaultTableModel) this.tabla.getModel();
    }
    private void removeAllRows(){
        for( int i = modelo.getRowCount() - 1; i >= 0; i-- ){
            modelo.removeRow(i);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_directorio = new javax.swing.JLabel();
        jl_extension = new javax.swing.JLabel();
        btn_Extension = new javax.swing.JButton();
        btn_directorio = new javax.swing.JButton();
        jt_Directorio = new javax.swing.JTextField();
        jt_Extension = new javax.swing.JTextField();
        jl_fallo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Practica 01 | T1 Manejo de ficheros | Hecho por: Pablo García Manzano");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        jl_directorio.setForeground(new java.awt.Color(0, 0, 255));
        jl_directorio.setText("Indique Directorio");

        jl_extension.setForeground(new java.awt.Color(0, 0, 255));
        jl_extension.setText("Indique Extension");

        btn_Extension.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Lupa.png"))); // NOI18N
        btn_Extension.setMaximumSize(new java.awt.Dimension(64, 64));
        btn_Extension.setMinimumSize(new java.awt.Dimension(64, 64));
        btn_Extension.setPreferredSize(new java.awt.Dimension(32, 32));
        btn_Extension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExtensionActionPerformed(evt);
            }
        });

        btn_directorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Lupa.png"))); // NOI18N
        btn_directorio.setMaximumSize(new java.awt.Dimension(64, 64));
        btn_directorio.setMinimumSize(new java.awt.Dimension(64, 64));
        btn_directorio.setPreferredSize(new java.awt.Dimension(32, 32));
        btn_directorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_directorioActionPerformed(evt);
            }
        });

        jt_Directorio.setForeground(new java.awt.Color(0, 255, 0));

        jt_Extension.setForeground(new java.awt.Color(0, 255, 0));

        jl_fallo.setForeground(new java.awt.Color(255, 0, 0));
        jl_fallo.setText(" ");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Extension", "Tamaño", "F/D"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_directorio)
                        .addGap(18, 18, 18)
                        .addComponent(jt_Directorio, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_directorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_extension)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jl_fallo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jt_Extension, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Extension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_directorio)
                            .addComponent(jt_Directorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_directorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_extension)
                            .addComponent(jt_Extension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Extension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jl_fallo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_directorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_directorioActionPerformed
        removeAllRows();
        this.myfile = new File(this.jt_Directorio.getText());
        if (!this.myfile.exists()) {
            this.jt_Directorio.setText("");
            this.jl_fallo.setText("No existe la ruta");
        }else{
            this.jl_fallo.setText(" ");
            for (File file : this.myfile.listFiles()) {
                String ext = "";
                int pExt = file.getName().lastIndexOf(".");
                if (pExt > 0) {
                    ext = file.getName().substring(pExt);
                }
                this.datos[0] = file.getName();
                this.datos[1] = ext;
                this.datos[2] = file.length();
                this.datos[3] = this.esFoD(file);
                this.modelo.addRow(datos);
            }
        }
    }//GEN-LAST:event_btn_directorioActionPerformed

    private void btn_ExtensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExtensionActionPerformed
        this.removeAllRows();
        this.myfile = new File(this.jt_Directorio.getText());
        this.jl_fallo.setText(" ");
        String ext = this.jt_Extension.getText();
        String name = this.jt_Directorio.getName();
        for (File file : this.myfile.listFiles()) {
            if (file.getName().contains(ext) && !this.jt_Extension.getText().isEmpty()) {
                int pExt = file.getName().lastIndexOf(".");
                if (pExt > 0) {
                    ext = file.getName().substring(pExt);
                }
                this.datos[0] = file.getName();
                this.datos[1] = ext;
                this.datos[2] = file.length();
                this.datos[3] = this.esFoD(file);
                this.modelo.addRow(datos);
            }
        }
    }//GEN-LAST:event_btn_ExtensionActionPerformed
    
    private String esFoD(File file){
        String aux = "";
        if (file.isDirectory()) {
            this.datos[3] = "Es un Directorio";
        } else {
            if (file.isFile()) {
                this.datos[3] = "Es un Fichero";
            }
        }
        return aux;
    }
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Extension;
    private javax.swing.JButton btn_directorio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl_directorio;
    private javax.swing.JLabel jl_extension;
    private javax.swing.JLabel jl_fallo;
    private javax.swing.JTextField jt_Directorio;
    private javax.swing.JTextField jt_Extension;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
