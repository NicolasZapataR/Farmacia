package co.edu.uniquindio.poo;

import java.util.Collection;

public class Farmacia {
    
    private String nombre;
    private Collection<Sucursal> sucursales;


    public Farmacia(String nombre){

        this.nombre=nombre;

    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void crearSucursal(String nombre, int id, String direccion, String telefono){

        Sucursal sucursalArmenia = new Sucursal(nombre, id, direccion, telefono);

    }

    public void eliminarSucursal( int id){

        for (Sucursal sucursal : sucursales) {
            if (sucursal.getiD()==(id)) {
                sucursales.remove(sucursal);
                System.out.println(" la sucursal fue eliminada");
                break;
            }
        }
    }


    
}