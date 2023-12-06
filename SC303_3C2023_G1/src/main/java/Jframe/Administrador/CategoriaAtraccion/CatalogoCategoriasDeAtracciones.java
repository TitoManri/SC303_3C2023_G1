/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Jframe.Administrador.CategoriaAtraccion;

import Catalogos.Categorias.Categorias;
import Catalogos.Personal.Empleado;
import Jframe.Administrador.Catalogos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manri
 */
public class CatalogoCategoriasDeAtracciones extends javax.swing.JFrame {
    ArrayList<Categorias> listaCategorias = new ArrayList<>();
    DefaultTableModel modeloTabla;

    /**
     * 
     * Creates new form CategoriaAtraccionn
     */
    public CatalogoCategoriasDeAtracciones() {
        initComponents();
        cargarDesdeArchivo();
        modeloTabla = new DefaultTableModel();

        jTable1.setModel(modeloTabla);

        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Caracteristicas");

        llenarTabla();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        caracteristicasCategoria = new javax.swing.JTextField();
        agregarCategoriaBoton = new javax.swing.JButton();
        nombreCategoria = new javax.swing.JTextField();
        volverACatalogo = new javax.swing.JButton();
        editarCategoria = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        limpiarCategoria = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Caracteristicas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 72, 270, 282));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel1.setText("Nombre de la Categoria");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 128, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setText("Caracteristicas de la Categoria");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 193, -1, -1));

        caracteristicasCategoria.setColumns(5);
        caracteristicasCategoria.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        getContentPane().add(caracteristicasCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 234, 234, -1));

        agregarCategoriaBoton.setText("Agregar Categoria");
        agregarCategoriaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCategoriaBotonActionPerformed(evt);
            }
        });
        getContentPane().add(agregarCategoriaBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 435, -1, -1));
        getContentPane().add(nombreCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 164, 234, -1));

        volverACatalogo.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        volverACatalogo.setText("Volver a Catalogo");
        volverACatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverACatalogoActionPerformed(evt);
            }
        });
        getContentPane().add(volverACatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 512, 209, -1));

        editarCategoria.setText("Editar");
        editarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(editarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 435, 169, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel4.setText("Editar e Inactivar Categoria");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 394, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel5.setText("Catalogo Categorias");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 36, -1, -1));

        limpiarCategoria.setText("Limpiar");
        limpiarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(limpiarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 435, -1, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel6.setText("Lista Categorias");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void llenarTabla() {
    modeloTabla.setRowCount(0);

    for (Categorias categoria : listaCategorias) {
        Object[] fila = {categoria.getNombreCategorias(), categoria.getCaracteristicasCategorias()};
        modeloTabla.addRow(fila);
    }
}
    private void agregarCategoriaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCategoriaBotonActionPerformed
    try {
        String nombreCategorias = nombreCategoria.getText();
        String caracteristicasCategorias = caracteristicasCategoria.getText();

        if (nombreCategorias.isEmpty() || caracteristicasCategorias.isEmpty()) {
            throw new Exception("Algunos de los campos requeridos no fueron completados");
        } else {
            Categorias existente = encontrarCategorias(nombreCategorias);
            if (existente != null) {
                JOptionPane.showMessageDialog(null, "La categoria ya existe!");
                
            } else {
                
                Categorias categoria = new Categorias();
                categoria.setNombreCategorias(nombreCategorias);
                categoria.setCaracteristicaCategorias(caracteristicasCategorias);
                categoria.setEstadoCategorias(true);
                listaCategorias.add(categoria);
                guardarEnArchivo();
                JOptionPane.showMessageDialog(null, "Categoria Agregada Correctamente");
                limpiar();
                llenarTabla();

            }
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al agregar los datos: " + e.getMessage(), "Error!", JOptionPane.INFORMATION_MESSAGE);
    }
        
    }//GEN-LAST:event_agregarCategoriaBotonActionPerformed

    private void volverACatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverACatalogoActionPerformed
        Catalogos catalogos = new Catalogos();
        catalogos.setVisible(true);
        catalogos.pack();
        catalogos.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_volverACatalogoActionPerformed

    private void editarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarCategoriaActionPerformed
        cargarDesdeArchivo();
        String nombreCategoria = JOptionPane.showInputDialog("Nombre Categoria");
        Categorias categorias = encontrarCategorias(nombreCategoria);

    if (categorias != null) {
        mostrarCategoriaEspecifico(categorias);

        editarNombreCategorias(categorias);
        editarCaracteristicasCategorias(categorias);
        editarEstadoCategorias(categorias);
        
        guardarEnArchivo();

    } else {
        JOptionPane.showMessageDialog(null, "Categoria no encontrada.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_editarCategoriaActionPerformed
    
    private void editarNombreCategorias(Categorias categorias) {
        String nuevoNombreCategorias = JOptionPane.showInputDialog("Ingrese el nuevo nombre de la categoria (o presione OK si no quiere cambiarlo)");
        if (!nuevoNombreCategorias.isEmpty()) {
            categorias.setNombreCategorias(nuevoNombreCategorias);
        }
    }
    
    private void editarCaracteristicasCategorias(Categorias categorias) {
        String nuevoCaracteristicasCategorias = JOptionPane.showInputDialog("Ingrese la nueva caracteristica de la categoria (o presione OK si no quiere cambiarlo)");
        if (!nuevoCaracteristicasCategorias.isEmpty()) {
            categorias.setCaracteristicaCategorias(nuevoCaracteristicasCategorias);
        }
    }
    
    private void editarEstadoCategorias(Categorias categorias) {
        int opcion = JOptionPane.showConfirmDialog(null, "Quiere cambiar el estado de la categoria?", "Edit Employee Status", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            categorias.setEstadoCategorias(!categorias.isEstadoCategorias());
        }
    }

    
    private void limpiarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarCategoriaActionPerformed
        nombreCategoria.setText(null);
        caracteristicasCategoria.setText(null);
    }//GEN-LAST:event_limpiarCategoriaActionPerformed
    
    
    
    private void cargarDesdeArchivo() {
        listaCategorias.clear();
        try (BufferedReader archivo = new BufferedReader(new FileReader("src/main/java/BaseDeDatos/Categorias.txt"))) {
            String line;
            while ((line = archivo.readLine()) != null) {
                Categorias categorias = partesCategorias(line);
                if (categorias != null) {
                    listaCategorias.add(categorias);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void limpiar(){
        nombreCategoria.setText(null);
        caracteristicasCategoria.setText(null);
    }
    
    private Categorias partesCategorias(String line) {
    String[] partes = line.split(",");
    if (partes.length >= 3) {
        Categorias categorias= new Categorias();
        categorias.setNombreCategorias(partes[0]);
        categorias.setCaracteristicaCategorias(partes[1]);
        categorias.setEstadoCategorias(Boolean.parseBoolean(partes[2]));
        return categorias;
    } else {
        return null;
    }
    
}
    private void guardarEnArchivo() {
            try (BufferedWriter archivo = new BufferedWriter(new FileWriter("src/main/java/BaseDeDatos/Categorias.txt"))) {
                for (Categorias categorias : listaCategorias) {
                    archivo.write(formatoCategorias(categorias));
                    archivo.newLine();
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al guardar en el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    
    private void mostrarCategoriaEspecifico(Categorias categorias) {
    JOptionPane.showMessageDialog(
            null,
            "Nombre Categoria: " + categorias.getNombreCategorias() + "\n" +
            "Caracteristicas Categorias: " + categorias.getCaracteristicasCategorias()+ "\n" +
            "Estado: " + (categorias.isEstadoCategorias() ? "Activo" : "Inactivo"),
            "Detalles de la Categoria",
            JOptionPane.INFORMATION_MESSAGE
        );
    
    }
    

    private Categorias encontrarCategorias(String nombreCategorias) {
        for (Categorias categorias : listaCategorias) {
            if (categorias.getNombreCategorias().trim().equalsIgnoreCase(nombreCategorias.trim())) {
                return categorias;
            }
        }
        System.out.println("Categoría no encontrada.");
        return null;
    }
    
    private String formatoCategorias(Categorias categorias) {
        return categorias.getNombreCategorias()+","+categorias.getCaracteristicasCategorias()+","+ categorias.isEstadoCategorias();

    }
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
            java.util.logging.Logger.getLogger(CatalogoCategoriasDeAtracciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatalogoCategoriasDeAtracciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatalogoCategoriasDeAtracciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatalogoCategoriasDeAtracciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CatalogoCategoriasDeAtracciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarCategoriaBoton;
    private javax.swing.JTextField caracteristicasCategoria;
    private javax.swing.JButton editarCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton limpiarCategoria;
    private javax.swing.JTextField nombreCategoria;
    private javax.swing.JButton volverACatalogo;
    // End of variables declaration//GEN-END:variables
}
