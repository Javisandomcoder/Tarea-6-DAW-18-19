/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

/**
 * Clase que representa un producto de tipo EReader, los atributos de esta clase son los heredados de la clase 
 * Producto, más el suyo propio (nombreFabricante)
 * 
 * @version v0.1 febrero_2019
 * @author Javier Sánchez Domínguez
 */
public class EReader extends Producto{
    private String nombreFabricante;
    
    /**
     * Crea un objeto ERreader con un nombre, precio, texto de descripción y fabricante.
     * @param nombre Nobre del dispositivo
     * @param precio Precio del dispositivo
     * @param descripcion Descripción del dispositivo
     * @param nombFabricante Nombre del fabricante del dispositivo
     * @throws IllegalArgumentException si alguno de los parámetros no es válido
     */
    public EReader(String nombre, double precio, String descripcion, String nombFabricante)throws IllegalArgumentException{
        super(nombre, precio, descripcion);
        if(nombFabricante != null){
            this.nombreFabricante = nombFabricante;
        }
        else{
            throw new IllegalArgumentException("Nombre fabricante no válido");
        }
    }
    
    /**
     * Devuelve el nombre del fabricante del dispositivo
     * @return Nombre del fabricante
     */
    public String getFabricante(){
        return this.nombreFabricante;
    }
    
    /**
     * Genera array de valores de atributos
     * @return Array de String con los valores de los atributos del objeto
     */
    @Override
    public String[] toArrayAtribValues() {
        String[] valorAtrib = {this.nombreFabricante};
        String[] resultante = new String[super.toArrayAtribValues().length + valorAtrib.length];
        System.arraycopy(super.toArrayAtribValues(), 0, resultante, 0, super.toArrayAtribValues().length);
        System.arraycopy(valorAtrib, 0, resultante, super.toArrayAtribValues().length, valorAtrib.length);
        return resultante;
    }

    /**
     * Genera array de nombres de atributos
     * @return Array de String con los nombres de los atributos del objeto
     */
    @Override
    public String[] toArrayAtribNames() {
        String[] nombAtrib = {"nombreFabricante"};
        String[] resultante = new String[super.toArrayAtribNames().length + nombAtrib.length];
        System.arraycopy(super.toArrayAtribNames(), 0, resultante, 0, super.toArrayAtribNames().length);
        System.arraycopy(nombAtrib, 0, resultante, super.toArrayAtribNames().length, nombAtrib.length);
        return resultante;
    }
    
    
}
