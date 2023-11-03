package Catalogos.Categorias;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Categorias {
    
    //Variables
    protected String nombreCategorias;
    protected String caracteristicas;
    protected boolean estadoCategorias;
    protected int numeros = 0;
    ArrayList<Categorias> categoria = new ArrayList();
    
    //Constructor
    public Categorias() {
        this.nombreCategorias = "";
        this.caracteristicas = "";
        this.estadoCategorias = true;
        this.numeros = 0;
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

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }   
    
    //Metodos
    public void estado(){
        if(estadoCategorias==true){
            JOptionPane.showMessageDialog(null, "La atraccion esta activa");
        }else{
            JOptionPane.showMessageDialog(null, "La atraccion esta desactiva");
        }
    }
    
    public void agregarCategorias(Categorias categorias){
        categoria.add(categorias);
    }
    
    public void editarCategorias(){
        String categoriaCambio=JOptionPane.showInputDialog(null,"Digite el nombre de la categoria a cambiar: ");
        for(Categorias categorias : categoria) {
            if (categoriaCambio.equals(categorias.getNombreCategorias())){
            switch(getNumeros()){
            case 1 -> {
                String nombreCategoriasCambio = JOptionPane.showInputDialog("Digite el nuevo nombre del empleado: ");
                categorias.setNombreCategorias(nombreCategoriasCambio);
            }
            case 2 -> {
                String categoriasCambio = JOptionPane.showInputDialog("Digite el nuevo apellido del empleado: ");
                categorias.setCaracteristicas(categoriasCambio);
            }
            case 3 -> {
                boolean estadoCategoriasCambio = Boolean.parseBoolean(JOptionPane.showInputDialog("Digite la nueva cuidad del empleado: "));
                categorias.setEstadoCategorias(estadoCategoriasCambio);
            }
            default -> JOptionPane.showMessageDialog(null, "Vuelva a Intentarlo!"); 
            }
            }
        }        
    }
    
    
    public void inactivarCategorias(){

    }
    
}
