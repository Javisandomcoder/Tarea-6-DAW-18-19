/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

/**
 *Los objetos de esta clase contienen atributos que permiten almacenar la mínima información necesaria de un producto
 * para ser comercializado en la tienda: Nombre del producto, Precio del producto (valor real en el rango 0.01-10000.00 euros).
 *  y Descripción del producto.
 *
 * @version v0.1 febrero_2019
 * @author Javier Sánchez Domínguez
 */
public abstract class Producto implements Arrayable{
    private String nombre;
    private double precio;
    private String descripcion;
    public static final double MIN_PRECIO = 0.01;
    public static final double MAX_PRECIO = 10000;
    
    /**
     * Crea un objeto Producto con un nombre, un precio y un texto de descripción.
     * @param nombre Nombre del producto
     * @param precio Precio del producto
     * @param descripcion Descripción del producto
     * @throws IllegalArgumentException Si alguno de los parámetros no son válidos
     */
    public Producto(String nombre, double precio, String descripcion)throws IllegalArgumentException{
        if(precio <= Producto.MAX_PRECIO && precio >= Producto.MIN_PRECIO){
            this.nombre = nombre;
            this.precio = precio;
            this.descripcion = descripcion;
        }else{
            throw new IllegalArgumentException("Error: parámetros de creación del producto invalidos. "
                    + "El precio (" + String.format("%.2f", precio) + ") no está en el rango permitido");
        }
    }

    /**
     * Devuelve el nombre del producto
     * @return El nombre del producto
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Devuelve el precio del producto
     * @return El precio del producto
     */
    public double getPrecio() {
        return this.precio;
    }

    /**
     * Devuelve la descripción del producto
     * @return La descripción del producto
     */
    public String getDescripcion() {
        return this.descripcion;
    }

    /**
     * Genera array de nombres de atributos
     * @return Array de String con los nombres de los atributos del objeto
     */
    @Override
    public String[] toArrayAtribNames() {
        String[] nombAtrib = {"Nombre", "Descripción", "Precio"};
        return nombAtrib;
    }

    /**
     * Genera array de valores de atributos
     * @return Array de String con los valores de los atributos del objeto
     */
    @Override
    public String[] toArrayAtribValues() {
        String[] valorAtrib = {this.getNombre(), this.getDescripcion(), Double.toString(this.getPrecio())};
        return valorAtrib;
    }
}
