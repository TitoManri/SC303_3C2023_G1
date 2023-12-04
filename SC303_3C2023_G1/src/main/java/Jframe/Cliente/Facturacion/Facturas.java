package Jframe.Cliente.Facturacion;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Facturas {
    
    protected String nickname;
    protected String nombreAtraccion;
    protected String categoria;
    protected String precioEnTicketes;
    private int entrada;
    private LocalDateTime fechaYHora;
    private String usosAtraccion;
    
    //Constructores
    public Facturas() {
        this.nickname = "";
        this.nombreAtraccion = "";
        this.categoria = "";
        this.precioEnTicketes = "";
        this.entrada = 5000;
        this.fechaYHora = LocalDateTime.now();
        this.usosAtraccion="";
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

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

    public String getPrecioEnTicketes() {
        return precioEnTicketes;
    }

    public void setPrecioEnTicketes(String precioEnTicketes) {
        this.precioEnTicketes = precioEnTicketes;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }
   
    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }
    
    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }
    
     public String getFechaYHoraFormateada() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return fechaYHora.format(formato);
    }

    public String getUsosAtraccion() {
        return usosAtraccion;
    }

    public void setUsosAtraccion(String usosAtraccion) {
        this.usosAtraccion = usosAtraccion;
    }
    
     
     
}

