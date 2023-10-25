/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogos.Personal;

import Jframe.Usuario;
import java.util.ArrayList;
/**
 *
 * @author manri
 */
public class Empleado extends Usuario {
    
    protected String cuidad;
    protected String dirrecion;
    protected String telefono;
    protected String email;

    public Empleado(String cuidad, String dirrecion, String telefono, String email, String nombre, String apellidos, String nickname, String password) {
        super(nombre, apellidos, nickname, password);
        this.cuidad = cuidad;
        this.dirrecion = dirrecion;
        this.telefono = telefono;
        this.email = email;
    }
    
    public void agregarEmpleado(){
    
    }
    
    public void editarEmpleado(){
    
    }
    
    public void inactivarEmpleado(){
    
    }
    
    
}
