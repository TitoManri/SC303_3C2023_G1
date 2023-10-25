package Jframe;

<<<<<<< HEAD
public class Usuario extends Persona{
=======


public class Usuario {
   protected String nombre;
   protected String apellidos;
   protected String nickname;
   protected String password;
   protected boolean estado; // true es activo | false es inactivo
>>>>>>> Modulo1

    public Usuario(String nombre, String apellidos, String nickname, String password) {
        super(nombre, apellidos, nickname, password);
    }

<<<<<<< HEAD
=======

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
   
   
>>>>>>> Modulo1
}
