package co.edu.uniquindio.poo;

import java.sql.Date;

public class Producto {

     private String nombre;
     private String codigo;
     private Date fechaVen;
     private double precio;

     public Producto ( String nombre, String codigo, Date fechaVen, double precio){

        this.nombre=nombre;
        this.codigo=codigo;
        this.fechaVen=fechaVen;
        this.precio=precio;

     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFechaVen() {
        return fechaVen;
    }

    public void setFechaVen(Date fechaVen) {
        this.fechaVen = fechaVen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
     
     
        
     


}
