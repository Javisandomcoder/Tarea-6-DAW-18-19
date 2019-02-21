/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

/**
 * Clase que representa un producto de tipo Libro Físico Los objetos de esta clase contienen atributos
 * que permiten almacenar toda la información relativa a un producto de tipo libro físico (no electrónico) 
 * en una tienda. Además de los atributos propios de un libro en abstracto, 
 * deberá contener los específicos de un libro físico, que son: Número de páginas del libro.
 *
 * @version v0.1 febrero_2019
 * @author Javier Sánchez Domínguez
 */
public class LibroFisico extends Libro {

    private int numPag;
    public static final int MIN_PAGINAS = 20;
    public static final int MAX_PAGINAS = 5000;

    /**
     * Crea un objeto LibroFisico con un nombre, precio, texto de descripción, autor, año de edición y número de páginas.
     * @param nombre Título de libro
     * @param precio Precio del libro
     * @param descripcion Descripción del libro
     * @param autorLibro Autor del libro
     * @param year Año de publicación del libro
     * @param numPag Número de paginas del libro
     * @throws IllegalArgumentException Si algunos de los parámetros no es válido
     */
    public LibroFisico(String nombre, double precio, String descripcion, String autorLibro, int year, int numPag) throws IllegalArgumentException {
        super(nombre, precio, descripcion, autorLibro, year);
        if (numPag > MIN_PAGINAS && numPag < MAX_PAGINAS) {
            this.numPag = numPag;
        } else {
            throw new IllegalArgumentException("Error: parámetros de creación del libro físico invalidos."
                    + " El número de páginas (" + numPag + ") no está en el rango permitido");
        }

    }
    
    /**
     * Devuelve el número de páginas del libro
     * @return El número de páginas del libro
     */
    public int getNumPaginas(){
        return this.numPag;
    }
    
    /**
     * Genera array de nombres de atributos
     * @return Array de String con los nombres de los atributos del objeto
     */
        @Override
    public String[] toArrayAtribNames() {
        String[] nombAtrib = {"numPag"};
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
        String[] valorAtrib = {Integer.toString(this.getNumPaginas())};
        String[] resultante = new String[super.toArrayAtribValues().length + valorAtrib.length];
        System.arraycopy(super.toArrayAtribValues(), 0, resultante, 0, super.toArrayAtribValues().length);
        System.arraycopy(valorAtrib, 0, resultante, super.toArrayAtribValues().length, valorAtrib.length);
        return resultante; 
    }
   
}
