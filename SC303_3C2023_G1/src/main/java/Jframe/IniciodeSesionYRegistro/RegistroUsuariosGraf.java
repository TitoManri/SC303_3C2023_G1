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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Registro Usuarios");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Agregar nuevo usuario");

        labelNombreUsuario.setText("Nombre");

        nombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreUsuarioActionPerformed(evt);
            }
        });

        labelApellidosUsuario.setText("Apellidos");

        apellidosUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidosUsuarioActionPerformed(evt);
            }
        });

        labelNicknameUsuario.setText("Nickname");

        nicknameUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicknameUsuarioActionPerformed(evt);
            }
        });

        labelContUsuario.setText("Contraseña");

        contUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contUsuarioActionPerformed(evt);
            }
        });

        registrarUsuarioBot.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registrarUsuarioBot.setText("Registrar");
        registrarUsuarioBot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarUsuarioBotActionPerformed(evt);
            }
        });

        botonVolver.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Inactivar Usuario");

        inactivarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inactivarUsuarioActionPerformed(evt);
            }
        });

        jLabel4.setText("Ingrese el nickname:");

        inactivatBot.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inactivatBot.setText("Inactivar");
        inactivatBot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inactivatBotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonVolver)
                .addGap(99, 99, 99))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelNombreUsuario)
                            .addComponent(nombreUsuario)
                            .addComponent(labelNicknameUsuario)
                            .addComponent(nicknameUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelApellidosUsuario)
                            .addComponent(apellidosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelContUsuario)
                            .addComponent(contUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(inactivarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(registrarUsuarioBot)))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inactivatBot)
                .addGap(276, 276, 276))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(botonVolver))
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreUsuario)
                    .addComponent(labelApellidosUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNicknameUsuario)
                    .addComponent(labelContUsuario))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nicknameUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(registrarUsuarioBot)
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inactivarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(inactivatBot)
                .addContainerGap(51, Short.MAX_VALUE))
        );

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
