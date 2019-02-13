/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

/**
 *
 * @author javisandom
 */
public abstract class Producto {
    private String nombre;
    private double precio;
    private String descripcion;
    public static final double MIN_PRECIO = 0.01;
    public static final double MAX_PRECIO = 10000;
    
    public Producto(String nombre, double precio, String descripcion)throws IllegalArgumentException{
        if(precio <= Producto.MAX_PRECIO && precio >= Producto.MIN_PRECIO){
            this.nombre = nombre;
            this.precio = precio;
            this.descripcion = descripcion;
        }else{
            throw new IllegalArgumentException("Error: parámetros de creación del producto invalidos. "
                    + "El precio " + String.format("%2f", this.precio) + " no está en el rango permitido");
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
    
    /*public String[] toArrayAtribNames(){
        
    }*/
}
