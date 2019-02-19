/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.time.LocalDate;

/**
 * Clase abstracta que representa un producto de tipo Libro. Además de los atributos propios de un producto,
 * deberá contener los específicos de un libro, que son: Autor del libro(autorLibro) y el año de publicación (year)
 * 
 * 
 * @version v0.1 febrero_2019
 * @author Javier Sánchez Domínguez
 */
public abstract class Libro extends Producto {

    private String autorLibro;
    private int year;//año de publicación del libro
    public static final int MIN_YEAR = 1500;

    /**
     * Crea un objeto Libro con un nombre, precio, un texto de descripción y autor
     * 
     * @param nombre Título del libro
     * @param precio Precio del libro
     * @param descripcion Descripción del libro
     * @param autorLibro Autor del libro
     * @param year Año de publicación del libro
     * @throws IllegalArgumentException  Si alguno de los parámetros no es válido
     */
    public Libro(String nombre, double precio, String descripcion, String autorLibro, int year) throws IllegalArgumentException {
        super(nombre, precio, descripcion);
        if (year > MIN_YEAR && year <= LocalDate.now().getYear()) {
            this.autorLibro = autorLibro;
            this.year = year;
        } else {
            throw new IllegalArgumentException("Error: parámetros de creación invalidos el año de edición ("
                    + year + ") no está en el rango permitido");
        }
    }

    /**
     * Devuelve el nombre del autor del libro
     * @return El nombre del autor
     */
    public String getAutorLibro() {
        return this.autorLibro;
    }

    /**
     * Devuelve el año de publicación del libro
     * @return El año de publicación
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Genera array de nombres de atributos
     * @return Array de String con los nombres de los atributos del objeto
     */
    @Override
    public String[] toArrayAtribNames() {
        String[] nombAtrib = {"Autor", "Year"};
        String[] resultante = new String[super.toArrayAtribNames().length + nombAtrib.length];
        System.arraycopy(super.toArrayAtribNames(), 0, resultante, 0, super.toArrayAtribNames().length);
        System.arraycopy(nombAtrib, 0, resultante, super.toArrayAtribNames().length, nombAtrib.length);
        return resultante;
    }

    /**
     * Genera array de valores de atributos
     * @return Array de String con los valores de los atributos del objeto
     */
    @Override
    public String[] toArrayAtribValues() {
        String[] valorAtrib = {this.getAutorLibro(), Integer.toString(this.getYear())};
        String[] resultante = new String[super.toArrayAtribValues().length + valorAtrib.length];
        System.arraycopy(super.toArrayAtribValues(), 0, resultante, 0, super.toArrayAtribValues().length);
        System.arraycopy(valorAtrib, 0, resultante, super.toArrayAtribValues().length, valorAtrib.length);
        return resultante;
    }

}
