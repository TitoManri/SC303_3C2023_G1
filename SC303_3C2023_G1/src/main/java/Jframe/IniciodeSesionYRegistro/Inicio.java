/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Jframe.IniciodeSesionYRegistro;
import Jframe.Administrador.Empleados.CatalogoEmpleado;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author manri
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        registro = new javax.swing.JButton();
        inicioDeSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("Bienvenidos al Parque de Diversiones");

        registro.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        registro.setText("Registro");
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });

        inicioDeSesion.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        inicioDeSesion.setText("Inicio de Sesion");
        inicioDeSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioDeSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inicioDeSesion)
                        .addGap(137, 137, 137)
                        .addComponent(registro))
                    .addComponent(jLabel1))
                .addGap(239, 239, 239))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel1)
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registro)
                    .addComponent(inicioDeSesion))
                .addGap(213, 213, 213))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        RegistroUsuariosGraf registro1 = new RegistroUsuariosGraf();
        registro1.setVisible(true);
        registro1.pack();
        registro1.setLocationRelativeTo(null); 
        this.dispose();
    }//GEN-LAST:event_registroActionPerformed

    private void inicioDeSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioDeSesionActionPerformed
        Inicio2 inicio2 = new Inicio2();
        inicio2.setVisible(true);
        inicio2.pack();
        inicio2.setLocationRelativeTo(null); 
        this.dispose();
    }//GEN-LAST:event_inicioDeSesionActionPerformed

    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inicioDeSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton registro;
    // End of variables declaration//GEN-END:variables
}
