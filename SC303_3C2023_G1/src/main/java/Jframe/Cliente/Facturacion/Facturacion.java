package Jframe.Cliente.Facturacion;

import java.util.ArrayList;
import Catalogos.Atracciones.Atracciones;
import Jframe.IniciodeSesionYRegistro.InicioDeSesion;
import Jframe.IniciodeSesionYRegistro.RegistroUsuariosGraf;
import Personas.Usuario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Facturacion extends javax.swing.JFrame {

  
    ArrayList<Atracciones> listaAtracciones = new ArrayList<>();
    ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    ArrayList<Facturas> listaFacturas = new ArrayList<>();
    
    public Facturacion() {
        initComponents();
        cargarDesdeArchivo();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AtraccionesjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AtraccionesDisponiblesjTextArea = new javax.swing.JTextArea();
        VolverAInicioDeSesionjButton = new javax.swing.JButton();
        UsuariosjLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        UsuariosDisponiblesjTextArea = new javax.swing.JTextArea();
        NickNamejLabel = new javax.swing.JLabel();
        GenerarFacturajLabel = new javax.swing.JLabel();
        AtraccionjLabel = new javax.swing.JLabel();
        TicketsjLabel = new javax.swing.JLabel();
        NicknamejTextField = new javax.swing.JTextField();
        AtraccionjTextField = new javax.swing.JTextField();
        TicketsjTextField = new javax.swing.JTextField();
        GenerarFacturajButton = new javax.swing.JButton();
        VecesDeUsojTextField = new javax.swing.JTextField();
        VecesUsojLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AtraccionesjLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AtraccionesjLabel.setText("Atracciones Disponibles:");

        AtraccionesDisponiblesjTextArea.setColumns(20);
        AtraccionesDisponiblesjTextArea.setRows(5);
        jScrollPane1.setViewportView(AtraccionesDisponiblesjTextArea);

        VolverAInicioDeSesionjButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        VolverAInicioDeSesionjButton.setText("Volver a inicio");
        VolverAInicioDeSesionjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverAInicioDeSesionjButtonActionPerformed(evt);
            }
        });

        UsuariosjLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UsuariosjLabel.setText("Usuarios Disponibles: ");

        UsuariosDisponiblesjTextArea.setColumns(20);
        UsuariosDisponiblesjTextArea.setRows(5);
        jScrollPane2.setViewportView(UsuariosDisponiblesjTextArea);

        NickNamejLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NickNamejLabel.setText("Ingrese el nickname:");

        GenerarFacturajLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        GenerarFacturajLabel.setText("Generar Factura");

        AtraccionjLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AtraccionjLabel.setText("Ingrese la atraccion:");

        TicketsjLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TicketsjLabel.setText("Ingrese el valor de tickets:");

        NicknamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NicknamejTextFieldActionPerformed(evt);
            }
        });

        AtraccionjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtraccionjTextFieldActionPerformed(evt);
            }
        });

        TicketsjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TicketsjTextFieldActionPerformed(evt);
            }
        });

        GenerarFacturajButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        GenerarFacturajButton.setText("Generar factura");
        GenerarFacturajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarFacturajButtonActionPerformed(evt);
            }
        });

        VecesUsojLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        VecesUsojLabel.setText("Veces de uso:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VolverAInicioDeSesionjButton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GenerarFacturajButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UsuariosjLabel)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AtraccionesjLabel))
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NickNamejLabel)
                            .addComponent(GenerarFacturajLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AtraccionjLabel)
                            .addComponent(TicketsjLabel)
                            .addComponent(NicknamejTextField)
                            .addComponent(AtraccionjTextField)
                            .addComponent(TicketsjTextField))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(VecesUsojLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(VecesDeUsojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsuariosjLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AtraccionesjLabel)
                        .addComponent(GenerarFacturajLabel)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VolverAInicioDeSesionjButton)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NickNamejLabel)
                        .addGap(31, 31, 31)
                        .addComponent(NicknamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AtraccionjLabel)
                            .addComponent(VecesUsojLabel))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AtraccionjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VecesDeUsojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TicketsjLabel)
                        .addGap(18, 18, 18)
                        .addComponent(TicketsjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(GenerarFacturajButton)
                        .addContainerGap(59, Short.MAX_VALUE))))
        );

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

    private void NicknamejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NicknamejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NicknamejTextFieldActionPerformed

    private void AtraccionjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtraccionjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AtraccionjTextFieldActionPerformed

    private void TicketsjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TicketsjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TicketsjTextFieldActionPerformed

    private void GenerarFacturajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarFacturajButtonActionPerformed
        try{
            String nicknameFactura = NicknamejTextField.getText();
            String atraccionFactura = AtraccionjTextField.getText();
            String ticketsFactura = TicketsjTextField.getText();
            String usosFactura = VecesDeUsojTextField.getText();
            if((nicknameFactura.equals("")) || (atraccionFactura.equals("")) || (ticketsFactura.equals("")) || (usosFactura.equals(""))){
                throw new Exception ("Algun espacio no fue completado");
            } else {
                Facturas factura = new Facturas();
                factura.setNickname(nicknameFactura);
                factura.setNombreAtraccion(atraccionFactura);
                factura.setUsosAtraccion(usosFactura);
                factura.setPrecioEnTicketes(ticketsFactura);
                listaFacturas.add(factura);
                guardarEnArchivo();
                JOptionPane.showMessageDialog(null, "Factura Registrada con exito");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al agregar los datos: " + e.getMessage(), "Error!",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_GenerarFacturajButtonActionPerformed

    private void guardarEnArchivo(){
        try(BufferedWriter archivo = new BufferedWriter(new FileWriter("src/main/java/BaseDeDatos/Facturaciones.txt"))){
            for (Facturas factura : listaFacturas){
                archivo.write(formatoFacturas(factura));
                archivo.newLine();
            }
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private String formatoFacturas(Facturas factura){
        return "Usuario: " + factura.getNickname() + "\n" + "Precio de entrada: ₡" + factura.getEntrada() + "\n" + "Atraccion: " + factura.getNombreAtraccion() +
               "\n" + "Precio en Tickets: " + factura.getPrecioEnTicketes() + "\n" + "Veces de uso:  " + factura.getUsosAtraccion() + "\n" + "Total de tickets a pagar: " + 
                (Integer.parseInt(factura.getPrecioEnTicketes())*Integer.parseInt(factura.getUsosAtraccion())) 
                + "\n" + "Total a pagar (colones): ₡"+ factura.getEntrada() + "\n " + "Fecha y hora de facturacion: " +
                factura.getFechaYHoraFormateada() + "\n" + "------------------------------------------------";
    }
    
    private void cargarDesdeArchivo(){
        listaAtracciones.clear();
        listaUsuarios.clear();
        
        // try y catch de atracciones para mostrar
        try(BufferedReader archivo = new BufferedReader(new FileReader("src/main/java/BaseDeDatos/Atracciones.txt"))){
            String line;
            while((line = archivo.readLine()) != null){
                Atracciones atracciones = partesAtracciones(line);
                if(atracciones != null){
                    listaAtracciones.add(atracciones);
                }
            }
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, "Error al cargar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        // try y catch de usuarios para mostrar
        try(BufferedReader archivo = new BufferedReader(new FileReader("src/main/java/BaseDeDatos/Usuarios.txt"))) {
            String line;
            while ((line = archivo.readLine()) != null){
                Usuario usuario = partesUsuario(line);
                if(usuario != null){
                    listaUsuarios.add(usuario);
                }
            }
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, "Error al cargar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        // para llenar el text area de atracciones disponibles
        AtraccionesDisponiblesjTextArea.setText("");
        for (Atracciones atracciones : listaAtracciones){
            AtraccionesDisponiblesjTextArea.append("Nombre: " + atracciones.getNombreAtraccion() + "\n Categoria " + atracciones.getCategoria() + "\nPrecio en tickets: " + atracciones.getPrecioEnTicketes() + "\n"+ 
                    "-------------------------------------" + "\n");
        }
        
        // para llenar el text area de usuarios disponibles
        UsuariosDisponiblesjTextArea.setText("");
        for(Usuario usuario : listaUsuarios){
             UsuariosDisponiblesjTextArea.append("Nickname: " + usuario.getNickname() + "\n" + "------------------------------" + "\n");
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
        
        private Usuario partesUsuario(String line){
            String[] partes = line.split(",");
            if (partes.length >= 5){
                Usuario usuario = new Usuario();
                usuario.setNombre(partes[0]);
                usuario.setApellidos(partes[1]);
                usuario.setNickname(partes[2]);
                usuario.setPassword(partes[3]);
                usuario.setEstado(Boolean.parseBoolean(partes[4]));
                return usuario;
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
    private javax.swing.JTextArea AtraccionesDisponiblesjTextArea;
    private javax.swing.JLabel AtraccionesjLabel;
    private javax.swing.JLabel AtraccionjLabel;
    private javax.swing.JTextField AtraccionjTextField;
    private javax.swing.JButton GenerarFacturajButton;
    private javax.swing.JLabel GenerarFacturajLabel;
    private javax.swing.JLabel NickNamejLabel;
    private javax.swing.JTextField NicknamejTextField;
    private javax.swing.JLabel TicketsjLabel;
    private javax.swing.JTextField TicketsjTextField;
    private javax.swing.JTextArea UsuariosDisponiblesjTextArea;
    private javax.swing.JLabel UsuariosjLabel;
    private javax.swing.JTextField VecesDeUsojTextField;
    private javax.swing.JLabel VecesUsojLabel;
    private javax.swing.JButton VolverAInicioDeSesionjButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
