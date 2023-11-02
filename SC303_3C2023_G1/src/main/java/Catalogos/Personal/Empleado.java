/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogos.Personal;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author manri
 */
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
    private ArrayList<Empleado> listaEmpleados;

    //Constructor
    
    public Empleado() {
        this.nombre = "";
        this.apellidos = "";
        this.cuidad = "";
        this.dirrecion = "";
        this.telefono = "";
        this.email = "";
        this.numeroEditar = 0;
    }

    public Empleado(String nombre, String apellidos, String cuidad, String dirrecion, String telefono, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cuidad = cuidad;
        this.dirrecion = dirrecion;
        this.telefono = telefono;
        this.email = email;
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
    
    
    
    
    //Metodos
    //nombre del empleado, apellidos, ciudad, dirección, teléfono, correo electrónico y estado
    public void agregarEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
        
    }
    
    public void buscarUsuario(){
        
    }
    
    public void editarEmpleado(){
        
        String nombreEmpleadoTemporal = JOptionPane.showInputDialog("Digite el nombre de empleado que quiere editar: ");
        String emailEmpleadoTemporal = JOptionPane.showInputDialog("Digite el correo electronico del empleado que quiere editar: ");
        for(Empleado empleado : listaEmpleados) {
            if (nombreEmpleadoTemporal.equals(empleado.getNombre()) && emailEmpleadoTemporal.equals(empleado.getEmail())) {
            switch(getNumeroEditar()){
            case 1 -> {
                String nombreEmpleadoEdicion = JOptionPane.showInputDialog("Digite el nuevo nombre del empleado: ");
                empleado.setNombre(nombreEmpleadoEdicion);
                    }
            case 2 -> {
                String apellidosEmpleadoEdicion = JOptionPane.showInputDialog("Digite el nuevo apellido del empleado: ");
                empleado.setApellidos(apellidosEmpleadoEdicion);
                    }
            case 3 -> {
                String cuidadEmpleadoEdicion = JOptionPane.showInputDialog("Digite la nueva cuidad del empleado: ");
                empleado.setCuidad(cuidadEmpleadoEdicion);
                    }
            case 4 -> {
                String direccionEmpleadoEdicion = JOptionPane.showInputDialog("Digite la nueva direccion del empleador: ");
                empleado.setDirrecion(direccionEmpleadoEdicion);
                    }
            case 5 -> {
                String telefonoEmpleadoEdicion = JOptionPane.showInputDialog("Digite el nuevo telefono del empleado ");
                empleado.setTelefono(telefonoEmpleadoEdicion);
                    }
            case 6 -> {
                String emailEmpleadoEdicion = JOptionPane.showInputDialog("Digite el nuevo correo de electronico del empleado ");
                empleado.setEmail(emailEmpleadoEdicion);
                    }
            default -> JOptionPane.showMessageDialog(null, "Vuelva a Intentarlo!"); 
        }
            
        }
    }
        
        
        
    }
    
    public void inactivarEmpleado(){
    
        String nombreEmpleadoTemporal = JOptionPane.showInputDialog("Digite el nombre de empleado que quiere editar: ");
        String emailEmpleadoTemporal = JOptionPane.showInputDialog("Digite el correo electronico del empleado que quiere editar: ");
        for(Empleado empleado : listaEmpleados) {
            if (nombreEmpleadoTemporal.equals(empleado.getNombre()) && emailEmpleadoTemporal.equals(empleado.getEmail())) {
                empleado.setEstado(false);
        }
    }
}
    
    
}
