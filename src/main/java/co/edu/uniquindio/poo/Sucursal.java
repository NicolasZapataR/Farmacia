package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Sucursal {
    
    private String nombre;
    private int iD;
    private String direccion;
    private String telefono;
    private Collection<Producto> inventario;
    





    public Sucursal(String nombre, int id, String direccion, String telefono ){

        this.nombre=nombre;
        this.iD=id;
        this.direccion=direccion;
        this.telefono=telefono;
        
        inventario= new LinkedList<>();
    }


    


    public String getNombre() {
        return nombre;
    }




    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getiD() {
        return iD;
    }


    public void setiD(int iD) {
        this.iD = iD;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public Collection<Producto> getInventario() {
        return inventario;
    }





    public void setInventario(Collection<Producto> inventario) {
        this.inventario = inventario;
    }


    public  void agregarProducto( Producto producto){

                inventario.add(producto);
                System.out.println("El producto" + producto.getNombre() + " fue agregado al inventario" );

            
    }

    public int eliminarProducto( String nombre){

        
        for (Producto producto : inventario) {
            if (producto.getNombre().equals(nombre)) {
                inventario.remove(producto);
                System.out.println(" el producto " + nombre + " fue eliminado ");
                break;
            }
        }

        return -1;
    }





    @Override
    public String toString() {
        return "Sucursal [inventario=" + inventario + "]";
    }

    

   




    

    



}
