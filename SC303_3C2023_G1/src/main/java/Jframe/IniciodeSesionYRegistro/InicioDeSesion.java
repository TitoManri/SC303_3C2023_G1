/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Jframe.IniciodeSesionYRegistro;

import Jframe.Administrador.Catalogos;
import Jframe.Cliente.Facturacion.Facturacion;

/**
 *
 * @author manri
 */
public class InicioDeSesion extends javax.swing.JFrame {

    /**
     * Creates new form InicioDeSesion
     */
    public InicioDeSesion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        irACatalogo = new javax.swing.JButton();
        irAFacturacion = new javax.swing.JButton();
        inicioDeSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        irACatalogo.setBackground(new java.awt.Color(255, 255, 255));
        irACatalogo.setFont(irACatalogo.getFont().deriveFont(irACatalogo.getFont().getStyle() | java.awt.Font.BOLD, irACatalogo.getFont().getSize()+11));
        irACatalogo.setForeground(new java.awt.Color(0, 0, 0));
        irACatalogo.setText("Administrador");
        irACatalogo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        irACatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irACatalogoActionPerformed(evt);
            }
        });
        getContentPane().add(irACatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 200, 60));

        irAFacturacion.setBackground(new java.awt.Color(255, 255, 255));
        irAFacturacion.setFont(irAFacturacion.getFont().deriveFont(irAFacturacion.getFont().getStyle() | java.awt.Font.BOLD, irAFacturacion.getFont().getSize()+11));
        irAFacturacion.setForeground(new java.awt.Color(0, 0, 0));
        irAFacturacion.setText("Usuario");
        irAFacturacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        irAFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irAFacturacionActionPerformed(evt);
            }
        });
        getContentPane().add(irAFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 190, 60));

        inicioDeSesion.setBackground(new java.awt.Color(255, 255, 255));
        inicioDeSesion.setFont(inicioDeSesion.getFont().deriveFont(inicioDeSesion.getFont().getSize()+5f));
        inicioDeSesion.setForeground(new java.awt.Color(0, 0, 0));
        inicioDeSesion.setText("Volver a Inicio de Sesion");
        inicioDeSesion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        inicioDeSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioDeSesionActionPerformed(evt);
            }
        });
        getContentPane().add(inicioDeSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 520, 270, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tipoUsuario.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void irACatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irACatalogoActionPerformed
        Catalogos catalogos = new Catalogos();
        catalogos.setVisible(true);
        catalogos.pack();
        catalogos.setLocationRelativeTo(null); 
        this.dispose();
    }//GEN-LAST:event_irACatalogoActionPerformed

    // boton para ir a panel de facturacion
    private void irAFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irAFacturacionActionPerformed
        Facturacion fact1 = new Facturacion();
        fact1.setVisible(true);
        fact1.pack();
        fact1.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_irAFacturacionActionPerformed

    private void inicioDeSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioDeSesionActionPerformed
        Inicio2 sesion1 = new Inicio2();
        sesion1.setVisible(true);
        sesion1.pack();
        sesion1.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_inicioDeSesionActionPerformed

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
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioDeSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inicioDeSesion;
    private javax.swing.JButton irACatalogo;
    private javax.swing.JButton irAFacturacion;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
