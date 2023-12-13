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

        registro = new javax.swing.JButton();
        inicioDeSesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registro.setBackground(new java.awt.Color(255, 255, 255));
        registro.setFont(registro.getFont().deriveFont(registro.getFont().getSize()+5f));
        registro.setForeground(new java.awt.Color(0, 0, 0));
        registro.setText("Registro");
        registro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        registro.setMaximumSize(new java.awt.Dimension(165, 28));
        registro.setMinimumSize(new java.awt.Dimension(165, 28));
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });
        getContentPane().add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 230, 60));

        inicioDeSesion.setBackground(new java.awt.Color(255, 255, 255));
        inicioDeSesion.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        inicioDeSesion.setForeground(new java.awt.Color(0, 0, 0));
        inicioDeSesion.setText("Inicio de Sesion");
        inicioDeSesion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        inicioDeSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioDeSesionActionPerformed(evt);
            }
        });
        getContentPane().add(inicioDeSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 226, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inicio.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton registro;
    // End of variables declaration//GEN-END:variables
}
