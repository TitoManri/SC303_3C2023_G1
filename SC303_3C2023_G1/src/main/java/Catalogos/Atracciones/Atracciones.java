package Catalogos.Atracciones;

public class Atracciones {
    
    protected String nombreAtraccion;
    protected String categoria;
    protected String empleadoACargo;
    protected String precioEnTicketes;
    protected boolean estado;

    //Constructores
    public Atracciones() {
        this.nombreAtraccion = "";
        this.categoria = "";
        this.empleadoACargo = "";
        this.precioEnTicketes = "";
    }
    
    
    //Gets y Sets
    public String getNombreAtraccion() {
        return nombreAtraccion;
    }

    public void setNombreAtraccion(String nombreAtraccion) {
        this.nombreAtraccion = nombreAtraccion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEmpleadoACargo() {
        return empleadoACargo;
    }

    public void setEmpleadoACargo(String empleadoACargo) {
        this.empleadoACargo = empleadoACargo;
    }

    public String getPrecioEnTicketes() {
        return precioEnTicketes;
    }

    public void setPrecioEnTicketes(String precioEnTicketes) {
        this.precioEnTicketes = precioEnTicketes;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    
}
