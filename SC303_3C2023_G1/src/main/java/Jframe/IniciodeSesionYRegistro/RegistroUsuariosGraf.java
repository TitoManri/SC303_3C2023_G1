package Jframe.IniciodeSesionYRegistro;

import Personas.Usuario;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RegistroUsuariosGraf extends javax.swing.JFrame {
    
    ArrayList<Usuario> listaUsuarios = new ArrayList<>();
            
    public RegistroUsuariosGraf() {
        initComponents();
        cargarDesdeArchivo();
    }
    
    public void serListaUsuarios(ArrayList<Usuario> listaUsuarios){
        this.listaUsuarios = listaUsuarios;
    }
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelNombreUsuario = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JTextField();
        labelApellidosUsuario = new javax.swing.JLabel();
        apellidosUsuario = new javax.swing.JTextField();
        labelNicknameUsuario = new javax.swing.JLabel();
        nicknameUsuario = new javax.swing.JTextField();
        labelContUsuario = new javax.swing.JLabel();
        contUsuario = new javax.swing.JTextField();
        registrarUsuarioBot = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        inactivarUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inactivatBot = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+21));
        jLabel1.setText("Registro Usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 26, -1, -1));

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getStyle() | java.awt.Font.BOLD, jLabel2.getFont().getSize()+11));
        jLabel2.setText("Agregar nuevo usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        labelNombreUsuario.setFont(labelNombreUsuario.getFont().deriveFont(labelNombreUsuario.getFont().getSize()+5f));
        labelNombreUsuario.setText("Nombre");
        getContentPane().add(labelNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        nombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 210, -1));

        labelApellidosUsuario.setFont(labelApellidosUsuario.getFont().deriveFont(labelApellidosUsuario.getFont().getSize()+5f));
        labelApellidosUsuario.setText("Apellidos");
        getContentPane().add(labelApellidosUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        apellidosUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidosUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(apellidosUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 230, -1));

        labelNicknameUsuario.setFont(labelNicknameUsuario.getFont().deriveFont(labelNicknameUsuario.getFont().getSize()+5f));
        labelNicknameUsuario.setText("Nombre de Usuario");
        getContentPane().add(labelNicknameUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        nicknameUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicknameUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(nicknameUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 210, -1));

        labelContUsuario.setFont(labelContUsuario.getFont().deriveFont(labelContUsuario.getFont().getSize()+5f));
        labelContUsuario.setText("Contraseña");
        getContentPane().add(labelContUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        contUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(contUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 230, -1));

        registrarUsuarioBot.setFont(registrarUsuarioBot.getFont().deriveFont(registrarUsuarioBot.getFont().getSize()+3f));
        registrarUsuarioBot.setText("Registrar");
        registrarUsuarioBot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarUsuarioBotActionPerformed(evt);
            }
        });
        getContentPane().add(registrarUsuarioBot, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 160, 40));

        botonVolver.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 520, 160, 30));

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getStyle() | java.awt.Font.BOLD, jLabel3.getFont().getSize()+11));
        jLabel3.setText("Inactivar Usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, -1, -1));

        inactivarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inactivarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(inactivarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 175, -1));

        jLabel4.setFont(jLabel4.getFont().deriveFont(jLabel4.getFont().getSize()+5f));
        jLabel4.setText("Nombre de Usuario");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, -1, 22));

        inactivatBot.setFont(inactivatBot.getFont().deriveFont(inactivatBot.getFont().getSize()+3f));
        inactivatBot.setText("Inactivar");
        inactivatBot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inactivatBotActionPerformed(evt);
            }
        });
        getContentPane().add(inactivatBot, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 440, 140, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

////////////////////////////////////////////////////////////////////////////////
    // TextField de nombre
    private void nombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreUsuarioActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_nombreUsuarioActionPerformed

    // boton de registrar
    private void registrarUsuarioBotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarUsuarioBotActionPerformed
        try{
            cargarDesdeArchivo();
            
            String nombreUsuario1 = nombreUsuario.getText();
            String apellidosUsuario1 = apellidosUsuario.getText();
            String nicknameUsuario1 = nicknameUsuario.getText();
            String contUsuario1 = contUsuario.getText();
            boolean estado = true;
            
            if(nombreUsuario1.isEmpty() || apellidosUsuario1.isEmpty() || nicknameUsuario1.isEmpty() || contUsuario1.isEmpty()){
                throw new Exception("Algun espacio esta sin completar");
            } else {
                Usuario existente = encontrarUsuario(nombreUsuario1, nicknameUsuario1);
                if (existente != null){
                    JOptionPane.showMessageDialog(null, "El usuario ya existe");
                }else{
                    Usuario usuario = new Usuario();
                    usuario.setNombre(nombreUsuario1);
                    usuario.setApellidos(apellidosUsuario1);
                    usuario.setNickname(nicknameUsuario1);
                    usuario.setPassword(contUsuario1);
                    usuario.setEstado(true);
                    
                    listaUsuarios.add(usuario);
                    guardarEnArchivo();
                    JOptionPane.showMessageDialog(null, "Usuario agregado con exito");
                }
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error agregando al usuario: "+ e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_registrarUsuarioBotActionPerformed
    
    //  TextField de apellidos
    private void apellidosUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidosUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidosUsuarioActionPerformed

    // TextField de nickname
    private void nicknameUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicknameUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicknameUsuarioActionPerformed

    // TextField de contrasena
    private void contUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contUsuarioActionPerformed

    // boton de volver
    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        inicio.pack();
        inicio.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    // TextField nickname para inactivar
    private void inactivarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inactivarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inactivarUsuarioActionPerformed

    // Boton de inactivar
    private void inactivatBotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inactivatBotActionPerformed
        try {
        String nicknameUsuarioInactivar = inactivarUsuario.getText();

        if (nicknameUsuarioInactivar.isEmpty()) {
            throw new Exception("Por favor, ingrese un nickname");
        } else {
            InactivarUsuario(nicknameUsuarioInactivar);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al inactivar usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_inactivatBotActionPerformed
////////////////////////////////////////////////////////////////////////////////
    
    public void agregarUsuario(Usuario usuario){
      listaUsuarios.add(usuario);
    }
      private void cargarDesdeArchivo(){
        listaUsuarios.clear();
        try(BufferedReader archivo = new BufferedReader(new FileReader("src/main/java/BaseDeDatos/Usuarios.txt"))){
            String line;
            while((line = archivo.readLine()) != null){
                Usuario usuario = partesUsuario(line);
                if(usuario != null){
                    listaUsuarios.add(usuario);
                }
            }
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, "Error con el archivo: " + e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
      
      private Usuario partesUsuario(String line){
          String[] partes = line.split(",");
          if(partes.length >=5){
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
      
      private void guardarEnArchivo(){
          try(BufferedWriter archivo = new BufferedWriter(new FileWriter("src/main/java/BaseDeDatos/Usuarios.txt"))){
              for(Usuario usu : listaUsuarios){
                  archivo.write(formatoUsuario(usu));
                  archivo.newLine();
              }
          } catch (IOException e){
              JOptionPane.showMessageDialog(null, "Error en archivo: " + e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
          }
      }
      
      private String formatoUsuario(Usuario usu){
          return usu.getNombre()+","+usu.getApellidos()+","+usu.getNickname()+","+usu.getPassword()+","+usu.isEstado();
      }
      
      private Usuario encontrarUsuario (String nombreUsuario, String nicknameUsuario){
          for (Usuario usuario : listaUsuarios){
              if(usuario.getNombre().equals(nombreUsuario) && usuario.getNickname().equals(nicknameUsuario)){
                  return usuario;
              }
          }
          return null;
      }
    
      private Usuario encontrarUsuarioPorNickname(String nicknameUsuario) {
    for (Usuario usuario : listaUsuarios) {
        if (usuario.getNickname().equals(nicknameUsuario)) {
            return usuario;
        }
    }
    return null;
    }
      
     private void InactivarUsuario(String nicknameUsuario) {
    Usuario usuario = encontrarUsuarioPorNickname(nicknameUsuario);

    if (usuario != null) {
        usuario.setEstado(false); 
        guardarEnArchivo(); 
        JOptionPane.showMessageDialog(null, "Usuario inactivado con éxito");
    } else {
        JOptionPane.showMessageDialog(null, "No se encontró un usuario con el nickname proporcionado");
    }
}
      
  
    
    
          
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroUsuariosGraf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidosUsuario;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField contUsuario;
    private javax.swing.JTextField inactivarUsuario;
    private javax.swing.JButton inactivatBot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelApellidosUsuario;
    private javax.swing.JLabel labelContUsuario;
    private javax.swing.JLabel labelNicknameUsuario;
    private javax.swing.JLabel labelNombreUsuario;
    private javax.swing.JTextField nicknameUsuario;
    private javax.swing.JTextField nombreUsuario;
    private javax.swing.JButton registrarUsuarioBot;
    // End of variables declaration//GEN-END:variables
}
