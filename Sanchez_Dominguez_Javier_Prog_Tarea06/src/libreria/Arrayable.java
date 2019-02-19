/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

/**
 * Interfaz que incorpora la capacidad de obtener el contenido del objeto en forma de arrays.
 * 
 * @author Javier Sánchez Domínguez
 */
public interface Arrayable {
    
    /**
     * Crea array con los nombres de los atributos
     * @return 
     */
    String[] toArrayAtribNames();
    
    /**
     * Crea array con los nombres de los atributos
     * @return 
     */
    String[] toArrayAtribValues();
}
