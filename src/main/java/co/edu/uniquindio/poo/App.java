package co.edu.uniquindio.poo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
   
    

    // 1)crear sucursal , 2)eliminar sucursal, 3)agregar producto, 4) eliminar producto
    //5)vender producto, 6)verificar producto, 7)agregar ciudad

 public static void ejecutarCasoPrueba1(){

    Scanner dato = new Scanner(System.in);

    System.out.println("ingrese el nombre de la sucursal");
    String nombre=dato.nextLine();

    System.out.println("ingrese el codigo de la sucursal");
    int id=dato.nextInt();

    System.out.println("ingrese la direccion de la sucursal");
    String direccion=dato.nextLine();

    System.out.println("ingrese el telefono de la sucursal");
    String telefono=dato.nextLine();

    Sucursal sucursal1= new Sucursal(nombre, id, direccion, telefono);

    System.out.println("la nueva sucursal es "+ sucursal1);


 }



}



