package Catalogos.Atracciones;

import Catalogos.Categorias.Categorias;
import Catalogos.Personal.Empleado;
import java.util.ArrayList;
public class Atracciones {
    
    protected String nombreAtraccion;
    protected Categorias categoria;
    protected Empleado empleadoACargo;
    ArrayList<Categorias> atracciones = new ArrayList();;

    //Constructores
    public Atracciones() {
        this.nombreAtraccion = "";
        this.categoria = categoria;
        this.empleadoACargo = empleadoACargo;
    }
    
    
    //Gets y Sets
    public String getNombreAtraccion() {
        return nombreAtraccion;
    }

    public void setNombreAtraccion(String nombreAtraccion) {
        this.nombreAtraccion = nombreAtraccion;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public Empleado getEmpleadoACargo() {
        return empleadoACargo;
    }

    public void setEmpleadoACargo(Empleado empleadoACargo) {
        this.empleadoACargo = empleadoACargo;
    }

    
    /*Metodos
      Agrecacion Editacion e inactivacion de las atracciones*/
    public void agregarAtracciones(){
        
    }
    
    public void editarAtracciones(){
    
    }
    
    public void inactivarAtracciones(){
    
    }
    
}
