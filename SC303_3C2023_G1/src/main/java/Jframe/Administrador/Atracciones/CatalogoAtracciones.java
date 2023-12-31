/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Jframe.Administrador.Atracciones;

import Catalogos.Atracciones.Atracciones;
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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author manri
 */
public class CatalogoAtracciones extends javax.swing.JFrame {
    ArrayList<Categorias> categoriasAtraccion = new ArrayList<>(); 
    ArrayList<Empleado> empleados = new ArrayList<>();
    ArrayList<Atracciones> listaAtracciones = new ArrayList<>();
    private DefaultTableModel empleadosTableModel;
    private DefaultTableModel categoriasTableModel;
  
    /**
     * Creates new form Atraccioness
     */
    public CatalogoAtracciones() {
        initComponents();
        inicializarTablas();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        categoriasTabla = new javax.swing.JTable();
        limpiar = new javax.swing.JButton();
        nombreAtraccionTexto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        categoriasTexto = new javax.swing.JTextField();
        agregarAtraccionBoton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        volverACatalogo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        editarAtraccion = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        empleadoTexto = new javax.swing.JTextField();
        precioEnTicketesTexto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        empleadosTabla = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        categoriasTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(categoriasTabla);
        if (categoriasTabla.getColumnModel().getColumnCount() > 0) {
            categoriasTabla.getColumnModel().getColumn(0).setResizable(false);
            categoriasTabla.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 220, -1));

        limpiar.setBackground(new java.awt.Color(255, 255, 255));
        limpiar.setFont(limpiar.getFont().deriveFont(limpiar.getFont().getSize()+5f));
        limpiar.setForeground(new java.awt.Color(0, 0, 0));
        limpiar.setText("Limpiar");
        limpiar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 140, 30));

        nombreAtraccionTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreAtraccionTextoActionPerformed(evt);
            }
        });
        getContentPane().add(nombreAtraccionTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 190, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre Atraccion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Empleado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        categoriasTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriasTextoActionPerformed(evt);
            }
        });
        getContentPane().add(categoriasTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 180, 20));

        agregarAtraccionBoton.setBackground(new java.awt.Color(255, 255, 255));
        agregarAtraccionBoton.setFont(agregarAtraccionBoton.getFont().deriveFont(agregarAtraccionBoton.getFont().getSize()+5f));
        agregarAtraccionBoton.setForeground(new java.awt.Color(0, 0, 0));
        agregarAtraccionBoton.setText("Agregar Atraccion");
        agregarAtraccionBoton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        agregarAtraccionBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarAtraccionBotonActionPerformed(evt);
            }
        });
        getContentPane().add(agregarAtraccionBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 190, 30));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Categoria");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, 20));

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getSize()+9f));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Categorias");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, -1, -1));

        volverACatalogo.setBackground(new java.awt.Color(255, 255, 255));
        volverACatalogo.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        volverACatalogo.setForeground(new java.awt.Color(0, 0, 0));
        volverACatalogo.setText("Volver a Catalogo");
        volverACatalogo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        volverACatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverACatalogoActionPerformed(evt);
            }
        });
        getContentPane().add(volverACatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 190, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Editar e Inactivar Atraccion ->");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        editarAtraccion.setBackground(new java.awt.Color(255, 255, 255));
        editarAtraccion.setFont(editarAtraccion.getFont().deriveFont(editarAtraccion.getFont().getSize()+5f));
        editarAtraccion.setForeground(new java.awt.Color(0, 0, 0));
        editarAtraccion.setText("Editar");
        editarAtraccion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        editarAtraccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarAtraccionActionPerformed(evt);
            }
        });
        getContentPane().add(editarAtraccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 140, 30));

        jLabel7.setFont(jLabel7.getFont().deriveFont(jLabel7.getFont().getStyle() | java.awt.Font.BOLD, jLabel7.getFont().getSize()+19));
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Catalogo Atracciones");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jLabel8.setFont(jLabel8.getFont().deriveFont(jLabel8.getFont().getSize()+9f));
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Empleados Disponibles");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, 20));

        empleadoTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadoTextoActionPerformed(evt);
            }
        });
        getContentPane().add(empleadoTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 180, -1));

        precioEnTicketesTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioEnTicketesTextoActionPerformed(evt);
            }
        });
        getContentPane().add(precioEnTicketesTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 190, -1));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Precio en ticketes ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        empleadosTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(empleadosTabla);
        if (empleadosTabla.getColumnModel().getColumnCount() > 0) {
            empleadosTabla.getColumnModel().getColumn(0).setResizable(false);
            empleadosTabla.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 220, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blanco.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void inicializarTablas() {
        empleadosTableModel = new DefaultTableModel();
        empleadosTableModel.addColumn("Nombre");
        empleadosTableModel.addColumn("Estado");

        empleadosTabla.setModel(empleadosTableModel);        


        categoriasTableModel = new DefaultTableModel();
        categoriasTableModel.addColumn("Nombre");
        categoriasTableModel.addColumn("Descripción");
        
        categoriasTabla.setModel(categoriasTableModel);
        cargarDatosEnTablas();
    }
    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        nombreAtraccionTexto.setText(null);
        categoriasTexto.setText(null);
    }//GEN-LAST:event_limpiarActionPerformed

    private void nombreAtraccionTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreAtraccionTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreAtraccionTextoActionPerformed

    private void categoriasTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriasTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriasTextoActionPerformed

    private void agregarAtraccionBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarAtraccionBotonActionPerformed
     try {
        String nombreAtraccion = nombreAtraccionTexto.getText();
        String empleadoAtraccion = empleadoTexto.getText();
        String categoriaAtraccion = categoriasTexto.getText();
        String precioEnTicketes = precioEnTicketesTexto.getText();

        boolean empleadoExiste = false;
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(empleadoAtraccion)) {
                empleadoExiste = true;
                break;
            }
        }

        boolean categoriaExiste = false;
        for (Categorias categoria : categoriasAtraccion) {
            if (categoria.getNombreCategorias().equalsIgnoreCase(categoriaAtraccion)) {
                categoriaExiste = true;
                break;
            }
        }

        if (nombreAtraccion.isEmpty() || empleadoAtraccion.isEmpty() || categoriaAtraccion.isEmpty() || precioEnTicketes.isEmpty()) {
            throw new Exception("Algunos de los campos requeridos no fueron completados");
        } else if (!empleadoExiste) {
            throw new Exception("El empleado ingresado no existe");
        } else if (!categoriaExiste) {
            throw new Exception("La categoría ingresada no existe");
        } else {
            
            boolean atraccionExistente = false;
            for (Atracciones atraccion : listaAtracciones) {
                if (atraccion.getNombreAtraccion().equalsIgnoreCase(nombreAtraccion)) {
                    atraccionExistente = true;
                    break;
                }
            }

            if (atraccionExistente) {
                JOptionPane.showMessageDialog(null, "La atracción ya existe. No se puede duplicar.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            Atracciones atracciones = new Atracciones();
            atracciones.setNombreAtraccion(nombreAtraccion);
            atracciones.setCategoria(categoriaAtraccion);
            atracciones.setPrecioEnTicketes(precioEnTicketes);
            atracciones.setEmpleadoACargo(empleadoAtraccion);
            atracciones.setEstado(true); // Establece el estado, ajusta según sea necesario
            listaAtracciones.add(atracciones); 
            guardarEnArchivo();
            JOptionPane.showMessageDialog(null, "Atraccion Agregada Correctamente");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al agregar los datos: " + e.getMessage(), "Error!", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_agregarAtraccionBotonActionPerformed

    private void volverACatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverACatalogoActionPerformed
        Catalogos catalogos = new Catalogos();
        catalogos.setVisible(true);
        catalogos.pack();
        catalogos.setLocationRelativeTo(null); 
        this.dispose();
    }//GEN-LAST:event_volverACatalogoActionPerformed

    private void editarAtraccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarAtraccionActionPerformed
        try {
        String nombreAtraccionEditar = JOptionPane.showInputDialog("Ingrese el nombre de la atracción a editar:");
        if (nombreAtraccionEditar != null) {
            boolean atraccionEncontrada = false;
            for (Atracciones atraccion : listaAtracciones) {
                if (atraccion.getNombreAtraccion().equalsIgnoreCase(nombreAtraccionEditar)) {
                    String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre de la atracción:");
                    String nuevaCategoria = JOptionPane.showInputDialog("Ingrese la nueva categoría:");
                    String nuevoEmpleado = JOptionPane.showInputDialog("Ingrese el nuevo empleado a cargo:");
                    String nuevoPrecio = JOptionPane.showInputDialog("Ingrese el nuevo precio en tiquetes:");

                    if (nuevoNombre != null && !nuevoNombre.isEmpty()) {
                        atraccion.setNombreAtraccion(nuevoNombre);
                    }
                    if (nuevaCategoria != null && !nuevaCategoria.isEmpty()) {
                        atraccion.setCategoria(nuevaCategoria);
                    }
                    if (nuevoEmpleado != null && !nuevoEmpleado.isEmpty()) {
                        atraccion.setEmpleadoACargo(nuevoEmpleado);
                    }
                    if (nuevoPrecio != null && !nuevoPrecio.isEmpty()) {
                        atraccion.setPrecioEnTicketes(nuevoPrecio);
                    }

                    guardarEnArchivo();
                    JOptionPane.showMessageDialog(null, "Atracción editada correctamente");
                    atraccionEncontrada = true;
                    break;
                }
            }
            if (!atraccionEncontrada) {
                JOptionPane.showMessageDialog(null, "No se encontró una atracción con ese nombre");
            }
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al editar la atracción: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_editarAtraccionActionPerformed

    private void empleadoTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadoTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empleadoTextoActionPerformed

    private void precioEnTicketesTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioEnTicketesTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioEnTicketesTextoActionPerformed
    private void guardarEnArchivo() {
        try (BufferedWriter archivo = new BufferedWriter(new FileWriter("src/main/java/BaseDeDatos/Atracciones.txt"))) {
            for (Atracciones atracciones : listaAtracciones) {
                archivo.write(formatoAtracciones(atracciones));
                archivo.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar en el archivo: " + e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    private void cargarDesdeArchivo() {
        empleados.clear();
        categoriasAtraccion.clear();
        listaAtracciones.clear();
       
        try (BufferedReader archivo = new BufferedReader(new FileReader("src/main/java/BaseDeDatos/Empleados.txt"))) {
            String line;
            while ((line = archivo.readLine()) != null) {
                Empleado empleado = partesEmpleado(line);
                if (empleado != null) {
                   empleados.add(empleado);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        try (BufferedReader archivo = new BufferedReader(new FileReader("src/main/java/BaseDeDatos/Categorias.txt"))) {
            String line;
            while ((line = archivo.readLine()) != null) {
                Categorias categorias = partesCategorias(line);
                if (categorias != null) {
                   categoriasAtraccion.add(categorias);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        try (BufferedReader archivo = new BufferedReader(new FileReader("src/main/java/BaseDeDatos/Atracciones.txt"))) {
            String line;
            while ((line = archivo.readLine()) != null) {
                Atracciones atracciones = partesAtracciones(line);
                if (atracciones != null) {
                   listaAtracciones.add(atracciones);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        cargarDatosEnTablas();
    }
    
    private void cargarDatosEnTablas() {

        empleadosTableModel.setRowCount(0);
        categoriasTableModel.setRowCount(0);

        for (Empleado empleado : empleados) {
            Object[] rowData = {empleado.getNombre(), (empleado.isEstado() ? "Activo" : "Inactivo")};
            empleadosTableModel.addRow(rowData);
        }

        for (Categorias categoria : categoriasAtraccion) {
            Object[] rowData = {categoria.getNombreCategorias(), categoria.getCaracteristicasCategorias()};
            categoriasTableModel.addRow(rowData);
        }
    }
    private Atracciones partesAtracciones(String line) {
        String[] partes = line.split(",");
        if (partes.length >= 5) {
            Atracciones atracciones= new Atracciones();
            atracciones.setNombreAtraccion(partes[0]);
            atracciones.setCategoria(partes[1]);
            atracciones.setEmpleadoACargo(partes[2]);
            atracciones.setPrecioEnTicketes(partes[3]);
            atracciones.setEstado(Boolean.parseBoolean(partes[4]));
            return atracciones;
        } else {
            return null;
        }
    
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
    
    private Empleado partesEmpleado(String line) {
        String[] partes = line.split(",");
        if (partes.length >= 7) {
            Empleado empleado = new Empleado();
            empleado.setNombre(partes[0]);
            empleado.setApellidos(partes[1]);
            empleado.setCuidad(partes[2]);
            empleado.setDirrecion(partes[3]);
            empleado.setTelefono(partes[4]);
            empleado.setEmail(partes[5]);
            empleado.setEstado(Boolean.parseBoolean(partes[6]));
            return empleado;
        } else {
            return null;
        }
    }
    
    
    private String formatoAtracciones(Atracciones atracciones) {
        return atracciones.getNombreAtraccion() + "," + atracciones.getCategoria() + "," + atracciones.getEmpleadoACargo() + "," + atracciones.getPrecioEnTicketes() + "," + atracciones.isEstado();
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
    private javax.swing.JButton agregarAtraccionBoton;
    private javax.swing.JTable categoriasTabla;
    private javax.swing.JTextField categoriasTexto;
    private javax.swing.JButton editarAtraccion;
    private javax.swing.JTextField empleadoTexto;
    private javax.swing.JTable empleadosTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField nombreAtraccionTexto;
    private javax.swing.JTextField precioEnTicketesTexto;
    private javax.swing.JButton volverACatalogo;
    // End of variables declaration//GEN-END:variables
}
