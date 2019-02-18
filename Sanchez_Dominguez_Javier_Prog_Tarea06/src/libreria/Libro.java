/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.time.LocalDate;

/**
 *
 * @author javisandom
 */
public abstract class Libro extends Producto {

    private String autorLibro;
    private int year;//año de publicación del libro
    public static final int MIN_YEAR = 1500;

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

    public String getAutorLibro() {
        return this.autorLibro;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public String[] toArrayAtribNames() {
        String[] nombAtrib = {"Autor", "Year"};
        String[] resultante = new String[super.toArrayAtribNames().length + nombAtrib.length];
        System.arraycopy(super.toArrayAtribNames(), 0, resultante, 0, super.toArrayAtribNames().length);
        System.arraycopy(nombAtrib, 0, resultante, super.toArrayAtribNames().length, nombAtrib.length);
        return resultante;
    }

    @Override
    public String[] toArrayAtribValues() {
        String[] valorAtrib = {this.getAutorLibro(), Integer.toString(this.getYear())};
        String[] resultante = new String[super.toArrayAtribValues().length + valorAtrib.length];
        System.arraycopy(super.toArrayAtribValues(), 0, resultante, 0, super.toArrayAtribValues().length);
        System.arraycopy(valorAtrib, 0, resultante, super.toArrayAtribValues().length, valorAtrib.length);
        return resultante;
    }

}
