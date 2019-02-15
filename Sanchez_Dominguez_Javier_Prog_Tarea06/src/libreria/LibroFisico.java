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
public class LibroFisico extends Libro {

    private int numPag;
    public static final int MIN_PAGINAS = 20;
    public static final int MAX_PAGINAS = 5000;

    public LibroFisico(String nombre, double precio, String descripcion, String autorLibro, int year, int numPag) throws IllegalArgumentException {
        super(nombre, precio, descripcion, autorLibro, year);
        if (numPag > MIN_PAGINAS && numPag < MAX_PAGINAS) {
            this.numPag = numPag;
        } else {
            throw new IllegalArgumentException("Error: parámetros de creación del libro físico invalidos."
                    + " El número (" + numPag + ") no está en el rango permitido");
        }

    }
    
    public int getNumPaginas(){
        return this.numPag;
    }
    
        @Override
    public String[] toArrayAtribNames() {
        String[] nombAtrib = {Double.toString(this.getNumPaginas())};
        String[] resultante = new String[nombAtrib.length + super.toArrayAtribNames().length];
        System.arraycopy(super.toArrayAtribNames(), 0, resultante, 0, super.toArrayAtribNames().length);
        System.arraycopy(nombAtrib, 0, resultante, super.toArrayAtribNames().length, nombAtrib.length);
        return resultante; 
    }

    @Override
    public String[] toArrayAtribValues() {
        String[] valorAtrib = {Double.toString(this.getNumPaginas())};
        String[] resultante = new String[super.toArrayAtribValues().length + valorAtrib.length];
        System.arraycopy(super.toArrayAtribValues(), 0, resultante, 0, super.toArrayAtribValues().length);
        System.arraycopy(valorAtrib, 0, resultante, super.toArrayAtribValues().length, valorAtrib.length);
        return resultante; 
    }
   
}
