package Jframe.Cliente.Facturacion;

import java.util.ArrayList;
import Catalogos.Atracciones.Atracciones;
import Jframe.IniciodeSesionYRegistro.InicioDeSesion;
import Personas.Usuario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Facturacion extends javax.swing.JFrame {

    private static final int PRECIO_POR_TICKET = 1000;
    ArrayList<Atracciones> listaAtracciones = new ArrayList<>();
    ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    ArrayList<Facturas> listaFacturas = new ArrayList<>();
    DefaultTableModel modeloTabla;
    private int valorTotalGlobal = 0;

    public Facturacion() {
        initComponents();
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Atraccion");
        modeloTabla.addColumn("Tickets");
        modeloTabla.addColumn("Valor");
        jTable2.setModel(modeloTabla);
        cargarDesdeArchivo();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AtraccionesjLabel = new javax.swing.JLabel();
        VolverAInicioDeSesionjButton = new javax.swing.JButton();
        GenerarFacturajLabel = new javax.swing.JLabel();
        AtraccionjLabel = new javax.swing.JLabel();
        TicketsjLabel = new javax.swing.JLabel();
        AtraccionjTextField = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        irAPagar = new javax.swing.JButton();
        AtraccionesjLabel1 = new javax.swing.JLabel();
        AtraccionesjLabel2 = new javax.swing.JLabel();
        TicketsjTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Atraccion", "Tickets", "Valor"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, 320, 200));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Atraccion", "Empleado a Cargo", "Precio Tickets"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 370, 260));

        AtraccionesjLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AtraccionesjLabel.setText("Total");
        getContentPane().add(AtraccionesjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 290, -1, -1));

        VolverAInicioDeSesionjButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        VolverAInicioDeSesionjButton.setText("Volver a inicio");
        VolverAInicioDeSesionjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverAInicioDeSesionjButtonActionPerformed(evt);
            }
        });
        getContentPane().add(VolverAInicioDeSesionjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 380, -1, -1));

        GenerarFacturajLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        GenerarFacturajLabel.setText("Generar Factura");
        getContentPane().add(GenerarFacturajLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        AtraccionjLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AtraccionjLabel.setText("Ingrese la atraccion:");
        getContentPane().add(AtraccionjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        TicketsjLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TicketsjLabel.setText("Ingrese la cantidad de veces de uso:");
        getContentPane().add(TicketsjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        AtraccionjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtraccionjTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(AtraccionjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 184, -1));

        total.setEditable(false);
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, 210, -1));

        irAPagar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        irAPagar.setText("Agregar");
        irAPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irAPagarActionPerformed(evt);
            }
        });
        getContentPane().add(irAPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, -1, -1));

        AtraccionesjLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AtraccionesjLabel1.setText("Atracciones Disponibles:");
        getContentPane().add(AtraccionesjLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        AtraccionesjLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AtraccionesjLabel2.setText("Factura");
        getContentPane().add(AtraccionesjLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, -1, -1));

        TicketsjTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TicketsjTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(TicketsjTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 200, 20));

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton1.setText("Ir a Pagar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 150, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton volver a catalogo
    private void VolverAInicioDeSesionjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverAInicioDeSesionjButtonActionPerformed
        InicioDeSesion sesion1 = new InicioDeSesion();
        sesion1.setVisible(true);
        sesion1.pack();
        sesion1.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_VolverAInicioDeSesionjButtonActionPerformed

    private void AtraccionjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtraccionjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AtraccionjTextFieldActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void irAPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irAPagarActionPerformed
   try {
        String atraccionIngresada = AtraccionjTextField.getText().trim();

        Atracciones atraccionEncontrada = buscarAtraccionPorNombre(atraccionIngresada);

        if (atraccionEncontrada == null) {
            throw new Exception("No se encontró la atracción ingresada.");
        }

        String ticketsFactura = TicketsjTextField1.getText();
        if (ticketsFactura.equals("")) {
            throw new Exception("Ingrese una cantidad válida de veces de uso (número entero positivo).");
        }

        int numTickets = Integer.parseInt(ticketsFactura);
        int valorTotalAtraccion = numTickets * 1000; 

        Facturas factura = new Facturas();
        factura.setNombreAtraccion(atraccionEncontrada.getNombreAtraccion());
        factura.setPrecioEnTicketes(String.valueOf(valorTotalAtraccion));
        factura.setUsosAtraccion(ticketsFactura);
        listaFacturas.add(factura);
        valorTotalGlobal += valorTotalAtraccion;

        Object[] fila = {atraccionEncontrada.getNombreAtraccion(), ticketsFactura, String.valueOf(valorTotalAtraccion)};
        modeloTabla.addRow(fila);

        mostrarValorTotalGlobal();
        actualizarTablaFactura();

        JOptionPane.showMessageDialog(null, "Factura Registrada con éxito");
        guardarEnArchivo();
        
        
        
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al agregar los datos: " + e.getMessage(), "Error!", JOptionPane.INFORMATION_MESSAGE);
    }
    
    }//GEN-LAST:event_irAPagarActionPerformed
    
    
    
        
        
    private Atracciones buscarAtraccionPorNombre(String nombre) {
     for (Atracciones atraccion : listaAtracciones) {
         if (atraccion.getNombreAtraccion().equalsIgnoreCase(nombre)) {
             return atraccion;
         }
     }
     return null;
}
    private void actualizarTablaFactura() {
        int rowCount = modeloTabla.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            modeloTabla.removeRow(i);
    }

    for (Facturas factura : listaFacturas) {
        String valorTotalFormateado = String.format("₡%,d", Integer.parseInt(factura.getPrecioEnTicketes()));

        Object[] fila = {factura.getNombreAtraccion(), factura.getUsosAtraccion(), valorTotalFormateado};
        modeloTabla.addRow(fila);
    }
}
    private void TicketsjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TicketsjTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TicketsjTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Confirmacion confirmacion = new Confirmacion(String.valueOf(valorTotalGlobal));
        confirmacion.setVisible(true);
        confirmacion.pack();
        confirmacion.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void guardarEnArchivo() {
        try (BufferedWriter archivo = new BufferedWriter(new FileWriter("src/main/java/BaseDeDatos/Facturaciones.txt"))) {
            for (Facturas factura : listaFacturas) {
                archivo.write(formatoFacturas(factura));
                archivo.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
        private String formatoFacturas(Facturas factura) {
            return factura.getNombreAtraccion() + "," +
               factura.getPrecioEnTicketes() + "," +
               factura.getUsosAtraccion() + "," +
               (Integer.parseInt(factura.getPrecioEnTicketes()) * Integer.parseInt(factura.getUsosAtraccion()) * PRECIO_POR_TICKET) + "," +
               factura.getEntrada() + "," +
               factura.getFechaYHoraFormateada();
    }
    
    private void mostrarValorTotalGlobal() {

        total.setText("Valor Total Global: ₡" + valorTotalGlobal);
    }
    
    private void cargarDesdeArchivo() {
        listaAtracciones.clear();
        listaUsuarios.clear();

        DefaultTableModel modeloTablaAtracciones = (DefaultTableModel) jTable1.getModel();
        modeloTablaAtracciones.setRowCount(0);

        // try y catch de atracciones para mostrar
        try (BufferedReader archivo = new BufferedReader(new FileReader("src/main/java/BaseDeDatos/Atracciones.txt"))) {
            String line;
            while ((line = archivo.readLine()) != null) {
                Atracciones atraccion = partesAtracciones(line);
                if (atraccion != null) {
                    listaAtracciones.add(atraccion);
                    Object[] fila = {atraccion.getNombreAtraccion(), atraccion.getEmpleadoACargo(), atraccion.getPrecioEnTicketes()};
                    modeloTablaAtracciones.addRow(fila);
                }
            }

            actualizarTablaFactura();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facturacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AtraccionesjLabel;
    private javax.swing.JLabel AtraccionesjLabel1;
    private javax.swing.JLabel AtraccionesjLabel2;
    private javax.swing.JLabel AtraccionjLabel;
    private javax.swing.JTextField AtraccionjTextField;
    private javax.swing.JLabel GenerarFacturajLabel;
    private javax.swing.JLabel TicketsjLabel;
    private javax.swing.JTextField TicketsjTextField1;
    private javax.swing.JButton VolverAInicioDeSesionjButton;
    private javax.swing.JButton irAPagar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
