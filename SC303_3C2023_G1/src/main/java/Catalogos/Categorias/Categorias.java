package Catalogos.Categorias;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Categorias {

    //Variables
    protected String nombreCategorias;
    protected String caracteristicasCategorias;
    protected boolean estadoCategorias;
    protected int numeros = 0;
    ArrayList<Categorias> categoria = new ArrayList();

    //Constructor
    public Categorias(){
    
    }
    
    public Categorias(String nombreCategoria, String caracteristicasCategorias, boolean estadoCategorias) {    
        this.nombreCategorias = nombreCategoria;
        this.caracteristicasCategorias = caracteristicasCategorias;
        this.estadoCategorias = true;
    }
    
    

    //Getters and Setters
    public String getNombreCategorias() {
        return nombreCategorias;
    }

    public void setNombreCategorias(String nombreCategorias) {
        this.nombreCategorias = nombreCategorias;
    }

    public String getCaracteristicasCategorias() {
        return caracteristicasCategorias;
    }

    public void setCaracteristicaCategorias(String caracteristicasCategorias) {
        this.caracteristicasCategorias = caracteristicasCategorias;
    }

    public boolean isEstadoCategorias() {
        return estadoCategorias;
    }

    public void setEstadoCategorias(boolean estadoCategorias) {
        this.estadoCategorias = estadoCategorias;
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }
    public ArrayList<Categorias> getCategoria() {
        return categoria;
    }

    //Metodos
    public void estado() {
        if (estadoCategorias == true) {
            JOptionPane.showMessageDialog(null, "La atraccion esta activa");
        } else {
            JOptionPane.showMessageDialog(null, "La atraccion esta desactiva");
        }
    }

    public void agregarCategorias(Categorias categorias) {
        categoria.add(categorias);
    }

    public void editarCategorias() {
        String categoriaCambio = JOptionPane.showInputDialog(null, "Digite el nombre de la categoria a cambiar: ");
        for (Categorias categorias : categoria) {
            if (categoriaCambio.equals(categorias.getNombreCategorias())) {
                switch (getNumeros()) {
                    case 1 -> {
                        String nombreCategoriasCambio = JOptionPane.showInputDialog("Digite el nuevo nombre de la categoria: ");
                        categorias.setNombreCategorias(nombreCategoriasCambio);
                    }
                    case 2 -> {
                        String caracteristicasCategoriasCambio = JOptionPane.showInputDialog("Digite las nuevas caracteristicas de la categoria: ");
                        categorias.setCaracteristicaCategorias(caracteristicasCategoriasCambio);
                    }
                    case 3 -> {
                        boolean estadoCategoriasCambio = Boolean.parseBoolean(JOptionPane.showInputDialog("Digite si la categoria esta activa o inactiva: "));
                        categorias.setEstadoCategorias(estadoCategoriasCambio);
                    }
                    default ->
                        JOptionPane.showMessageDialog(null, "Vuelva a Intentarlo!");
                }
            }
        }
    }

    public void inactivarCategorias() {

    }

}
