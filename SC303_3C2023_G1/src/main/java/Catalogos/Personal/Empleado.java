package Catalogos.Personal;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Empleado{
    //Variables
    protected String nombre;
    protected String apellidos;
    protected String cuidad;
    protected String dirrecion;
    protected String telefono;
    protected String email;
    protected boolean estado;
    protected int numeroEditar = 0;

    //Constructor sin parametros
    public Empleado() {
        this.nombre = "";
        this.apellidos = "";
        this.cuidad = "";
        this.dirrecion = "";
        this.telefono = "";
        this.email = "";
        this.numeroEditar = 0;
    }

    // Constructor con parametros
    public Empleado(String nombre, String apellidos, String cuidad, String dirrecion, String telefono, String email, boolean estado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cuidad = cuidad;
        this.dirrecion = dirrecion;
        this.telefono = telefono;
        this.email = email;
        this.estado = estado;
    }
    //Getters and Setters
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {    
        this.estado = estado;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumeroEditar() {
        return numeroEditar;
    }

    public void setNumeroEditar(int numeroEditar) {
        this.numeroEditar = numeroEditar;
    }


}

