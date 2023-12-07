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

        jLabel3 = new javax.swing.JLabel();
        irACatalogo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        irAFacturacion = new javax.swing.JButton();
        inicioDeSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getStyle() | java.awt.Font.BOLD, jLabel3.getFont().getSize()+23));
        jLabel3.setText("Elige el tipo de Usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, 40));

        irACatalogo.setFont(irACatalogo.getFont().deriveFont((float)18));
        irACatalogo.setText("Ir a Catalogo");
        irACatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irACatalogoActionPerformed(evt);
            }
        });
        getContentPane().add(irACatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 200, 60));

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+11));
        jLabel1.setText("Administrador");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, 30));

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getStyle() | java.awt.Font.BOLD, jLabel2.getFont().getSize()+11));
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, -1, -1));

        irAFacturacion.setFont(irAFacturacion.getFont().deriveFont(irAFacturacion.getFont().getSize()+5f));
        irAFacturacion.setText("Ir a facturacion");
        irAFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irAFacturacionActionPerformed(evt);
            }
        });
        getContentPane().add(irAFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 190, 60));

        inicioDeSesion.setFont(inicioDeSesion.getFont().deriveFont(inicioDeSesion.getFont().getSize()+5f));
        inicioDeSesion.setText("Volver a Inicio de Sesion");
        inicioDeSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioDeSesionActionPerformed(evt);
            }
        });
        getContentPane().add(inicioDeSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 530, 270, 40));

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
        // TODO add your handling code here:
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
