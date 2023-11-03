package Jframe;
import Catalogos.Personal.Empleado;
public class Empleados extends javax.swing.JPanel {

    public Empleados() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registrarEmpleado = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        apellidosEmpleado = new javax.swing.JTextField();
        labelApellidos = new javax.swing.JLabel();
        cuidadEmpleado = new javax.swing.JTextField();
        labelCuidad = new javax.swing.JLabel();
        direccionEmpleado = new javax.swing.JTextField();
        labelDireccion = new javax.swing.JLabel();
        telefonoEmpleado = new javax.swing.JTextField();
        labelTelefono = new javax.swing.JLabel();
        emailEmpleado = new javax.swing.JTextField();
        labelEmaill = new javax.swing.JLabel();

        registrarEmpleado.setText("Registrar Empleado");
        registrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarEmpleadoActionPerformed(evt);
            }
        });

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        labelNombre.setText("Nombre");

        apellidosEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidosEmpleadoActionPerformed(evt);
            }
        });

        labelApellidos.setText("Apellidos");

        cuidadEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuidadEmpleadoActionPerformed(evt);
            }
        });

        labelCuidad.setText("Cuidad");

        direccionEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionEmpleadoActionPerformed(evt);
            }
        });

        labelDireccion.setText("Dirección");

        telefonoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoEmpleadoActionPerformed(evt);
            }
        });

        labelTelefono.setText("Teléfono");

        emailEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailEmpleadoActionPerformed(evt);
            }
        });

        labelEmaill.setText("Correo Electronico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre)
                    .addComponent(cuidadEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCuidad)
                    .addComponent(labelTelefono)
                    .addComponent(telefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelApellidos)
                            .addComponent(apellidosEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDireccion)
                            .addComponent(direccionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(146, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEmaill))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(registrarEmpleado)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(labelApellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidosEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCuidad)
                    .addComponent(labelDireccion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuidadEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefono)
                    .addComponent(labelEmaill))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(registrarEmpleado)
                .addGap(95, 95, 95))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEmpleadoActionPerformed
        String nombreEmpleado = nombre.getText();
        String apellidos = apellidosEmpleado.getText();
        String ciudad = cuidadEmpleado.getText();
        String direccion = direccionEmpleado.getText();
        String telefono = telefonoEmpleado.getText();
        String email = emailEmpleado.getText();
        boolean estado = true;
        
        Empleado empleado = new Empleado(nombreEmpleado, apellidos, ciudad, direccion, telefono, email, estado);
        empleado.agregarEmpleado(empleado);

    }//GEN-LAST:event_registrarEmpleadoActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void apellidosEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidosEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidosEmpleadoActionPerformed

    private void cuidadEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuidadEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuidadEmpleadoActionPerformed

    private void direccionEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionEmpleadoActionPerformed

    private void telefonoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoEmpleadoActionPerformed

    private void emailEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailEmpleadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidosEmpleado;
    private javax.swing.JTextField cuidadEmpleado;
    private javax.swing.JTextField direccionEmpleado;
    private javax.swing.JTextField emailEmpleado;
    private javax.swing.JLabel labelApellidos;
    private javax.swing.JLabel labelCuidad;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelEmaill;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton registrarEmpleado;
    private javax.swing.JTextField telefonoEmpleado;
    // End of variables declaration//GEN-END:variables
}
