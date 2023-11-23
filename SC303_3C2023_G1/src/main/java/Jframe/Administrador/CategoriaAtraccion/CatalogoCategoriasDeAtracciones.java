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

/**
 *
 * @author manri
 */
public class CatalogoCategoriasDeAtracciones extends javax.swing.JFrame {
    ArrayList<Categorias> listaCategorias = new ArrayList<>();
    /**
     * Creates new form CategoriaAtraccionn
     */
    public CatalogoCategoriasDeAtracciones() {
        initComponents();
        cargarDesdeArchivo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel1.setText("Nombre de la Categoria");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setText("Caracteristicas de la Categoria");

        caracteristicasCategoria.setColumns(5);
        caracteristicasCategoria.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N

        agregarCategoriaBoton.setText("Agregar Categoria");
        agregarCategoriaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCategoriaBotonActionPerformed(evt);
            }
        });

        volverACatalogo.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        volverACatalogo.setText("Volver a Catalogo");
        volverACatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverACatalogoActionPerformed(evt);
            }
        });

        editarCategoria.setText("Editar");
        editarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarCategoriaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel4.setText("Editar e Inactivar Categoria");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel5.setText("Catalogo Categorias");

        limpiarCategoria.setText("Limpiar");
        limpiarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(nombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(agregarCategoriaBoton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(limpiarCategoria))
                                .addComponent(caracteristicasCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(128, 128, 128))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(volverACatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(editarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(volverACatalogo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel5)))
                .addGap(103, 103, 103)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(nombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23)
                        .addComponent(caracteristicasCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(2, 2, 2)
                .addComponent(editarCategoria)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarCategoriaBoton)
                    .addComponent(limpiarCategoria))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    String[] partes = line.split("\\s+");
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
        return String.format("%s %s %s", categorias.getNombreCategorias(), categorias.getCaracteristicasCategorias(), categorias.isEstadoCategorias());
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
    private javax.swing.JButton limpiarCategoria;
    private javax.swing.JTextField nombreCategoria;
    private javax.swing.JButton volverACatalogo;
    // End of variables declaration//GEN-END:variables
}