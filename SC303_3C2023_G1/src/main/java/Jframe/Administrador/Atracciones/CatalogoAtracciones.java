/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Jframe.Administrador.Atracciones;

import Catalogos.Atracciones.Atracciones;
import Catalogos.Categorias.Categorias;
import Catalogos.Personal.Empleado;
import Jframe.Administrador.Catalogos;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author manri
 */
public class CatalogoAtracciones extends javax.swing.JFrame {
    ArrayList<Atracciones> listaAtracciones = new ArrayList<>(); 
    /**
     * Creates new form Atraccioness
     */
    public CatalogoAtracciones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        actualizarCategorias = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        nombreAtraccionTexto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        empleadoTexto = new javax.swing.JTextField();
        agregarAtraccionBoton = new javax.swing.JButton();
        categoriasComboBox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        empleadosDisponibles = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        volverACatalogo = new javax.swing.JButton();
        labelTelefono6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        editarAtraccion = new javax.swing.JButton();
        inactivarAtracciones = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        actualizarCategorias.setText("Actualizar Categorias");
        actualizarCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarCategoriasActionPerformed(evt);
            }
        });
        getContentPane().add(actualizarCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 377, -1, -1));

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 511, 84, -1));

        nombreAtraccionTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreAtraccionTextoActionPerformed(evt);
            }
        });
        getContentPane().add(nombreAtraccionTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 255, 278, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel3.setText("Nombre Atraccion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 231, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel4.setText("Empleado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 424, -1, -1));

        empleadoTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadoTextoActionPerformed(evt);
            }
        });
        getContentPane().add(empleadoTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 460, 278, -1));

        agregarAtraccionBoton.setText("Agregar Atraccion");
        agregarAtraccionBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarAtraccionBotonActionPerformed(evt);
            }
        });
        getContentPane().add(agregarAtraccionBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 511, -1, -1));

        categoriasComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriasComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(categoriasComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 377, 292, -1));

        empleadosDisponibles.setEditable(false);
        empleadosDisponibles.setColumns(20);
        empleadosDisponibles.setRows(5);
        jScrollPane2.setViewportView(empleadosDisponibles);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 68, -1, 145));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel5.setText("Categorias");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 339, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel1.setText("Empleados Disponibles");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 30, -1, -1));

        volverACatalogo.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        volverACatalogo.setText("Volver a Catalogo");
        volverACatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverACatalogoActionPerformed(evt);
            }
        });
        getContentPane().add(volverACatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 528, -1, -1));

        labelTelefono6.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        labelTelefono6.setText("->");
        getContentPane().add(labelTelefono6, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 375, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setText("Editar Atraccion");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 223, -1, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel6.setText("Inactivar Atraccion");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 312, -1, -1));

        editarAtraccion.setText("Editar");
        editarAtraccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarAtraccionActionPerformed(evt);
            }
        });
        getContentPane().add(editarAtraccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 263, 84, -1));

        inactivarAtracciones.setText("Inactivar");
        inactivarAtracciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inactivarAtraccionesActionPerformed(evt);
            }
        });
        getContentPane().add(inactivarAtracciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 348, 84, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel7.setText("Catalogo Atracciones");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarCategoriasActionPerformed
        DefaultComboBoxModel<String> comboBoxModel = (DefaultComboBoxModel<String>) categoriasComboBox.getModel();
        Categorias c = new Categorias();
        ArrayList<Categorias> categoria = c.getCategoria();
        for (Categorias categorias : categoria) {
            comboBoxModel.addElement(categorias.getNombreCategorias());
        }
    }//GEN-LAST:event_actualizarCategoriasActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        nombreAtraccionTexto.setText(null);
        empleadoTexto.setText(null);
    }//GEN-LAST:event_limpiarActionPerformed

    private void nombreAtraccionTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreAtraccionTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreAtraccionTextoActionPerformed

    private void empleadoTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadoTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empleadoTextoActionPerformed

    private void agregarAtraccionBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarAtraccionBotonActionPerformed
        try{
        BufferedWriter archivo = new BufferedWriter(new FileWriter("src/main/java/BaseDeDatos/Atracciones.txt", true));   
        String nombreAtraccion = nombreAtraccionTexto.getText();
        String empleadoAtraccion = empleadoTexto.getText();
        boolean estadoCategorias = true;
        
        if ((nombreAtraccion.equals(""))||(empleadoAtraccion.equals(""))) {
        //Si nos faltó escribir algún dato, lanzamos un error, esto cae en el catch
        throw new Exception("Algunos de los campos requeridos no fueron completados");
    }else{
        Atracciones atracciones = new Atracciones();
        atracciones.setNombreAtraccion(nombreAtraccion);
        atracciones.setEmpleadoACargo(empleadoAtraccion);
        listaAtracciones.add(atracciones); 
        
        archivo.write("Nombre: "+atracciones.getNombreAtraccion()+"    Empleado a Cargo: "+atracciones.getEmpleadoACargo()+"   Categoria Asignada: ");
        archivo.newLine();
        archivo.close();

        
    }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error al agregar los datos: " + e.getMessage(), "Error!",
                    JOptionPane.INFORMATION_MESSAGE);
    }


    }//GEN-LAST:event_agregarAtraccionBotonActionPerformed

    private void categoriasComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriasComboBoxActionPerformed

    }//GEN-LAST:event_categoriasComboBoxActionPerformed

    private void volverACatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverACatalogoActionPerformed
        Catalogos catalogos = new Catalogos();
        catalogos.setVisible(true);
        catalogos.pack();
        catalogos.setLocationRelativeTo(null); 
        this.dispose();
    }//GEN-LAST:event_volverACatalogoActionPerformed

    private void editarAtraccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarAtraccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarAtraccionActionPerformed

    private void inactivarAtraccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inactivarAtraccionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inactivarAtraccionesActionPerformed

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
            java.util.logging.Logger.getLogger(CatalogoAtracciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatalogoAtracciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatalogoAtracciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatalogoAtracciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatalogoAtracciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarCategorias;
    private javax.swing.JButton agregarAtraccionBoton;
    private javax.swing.JComboBox<String> categoriasComboBox;
    private javax.swing.JButton editarAtraccion;
    private javax.swing.JTextField empleadoTexto;
    private javax.swing.JTextArea empleadosDisponibles;
    private javax.swing.JButton inactivarAtracciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelTelefono6;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField nombreAtraccionTexto;
    private javax.swing.JButton volverACatalogo;
    // End of variables declaration//GEN-END:variables
}
