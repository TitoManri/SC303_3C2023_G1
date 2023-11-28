package Personas;

public class Usuario {
  
   //Variables
   protected String nombre;
   protected String apellidos;
   protected String nickname;
   protected String password;
   protected boolean estado; // true es activo | false es inactivo
 
   // constructor sin parametros
    public Usuario() {
        this.nombre = "";
        this.apellidos = "";
        this.nickname = "";
        this.password = "";
    }

    // constructor con parametros
    public Usuario(String nombre, String apellidos, String nickname, String password, boolean estado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nickname = nickname;
        this.password = password;
        this.estado = true; // Por defecto, un nuevo usuario se crea como activo
    }


    // getters setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setEstado(boolean estado) {
    this.estado = estado;
    }
    
    public boolean estaActivo(){
        return estado;
    }
    
    public void inactivarUsuario(){
        this.estado = false;
    }

    public boolean isEstado() {
        return estado;
    }

}
