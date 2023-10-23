/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogos.Categorias;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author manri
 */
public class Categorias {
    //Variables
    protected String nombreCategorias;
    protected String caracteristicas;
    protected boolean estadoCategorias;
    ArrayList<Categorias> categoria = new ArrayList();
    //Constructor
    public Categorias() {
        this.nombreCategorias = "";
        this.caracteristicas = "";
        this.estadoCategorias = true;
    }

    //Getters and Setters
    public String getNombreCategorias() {
        return nombreCategorias;
    }

    public void setNombreCategorias(String nombreCategorias) {
        this.nombreCategorias = nombreCategorias;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }


    public boolean isEstadoCategorias() {
        return estadoCategorias;
    }

    public void setEstadoCategorias(boolean estadoCategorias) {
        this.estadoCategorias = estadoCategorias;
    }
    
    
    //Metodos
    public void agregarCategorias(){
        Categorias c = new Categorias();
        c.setNombreCategorias(JOptionPane.showInputDialog(null,"Digite el nombre de la categoria: "));
        c.setCaracteristicas(JOptionPane.showInputDialog(null,"Digite las caracteristicas de la atraccion"));
        c.setEstadoCategorias(estadoCategorias);
        categoria.add(c);
        
    }
    
    public void editarCategorias(){
    
    }
    
    public void inactivarCategorias(){
    
    }
    
}
