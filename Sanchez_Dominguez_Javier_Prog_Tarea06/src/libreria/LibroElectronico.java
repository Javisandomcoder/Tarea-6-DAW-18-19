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
public class LibroElectronico extends Libro implements Downloadable {

    private int tamanioArch;
    private int descargasLibro;
    public static final int MIN_SIZE = 20;
    public static final int MAX_SIZE = 65535;

    public LibroElectronico(String nombre, double precio, String descripcion, String autorLibro, int year, int tamanioArch) throws IllegalArgumentException {
        super(nombre, precio, descripcion, autorLibro, year);
        if (tamanioArch > MIN_SIZE && tamanioArch < MAX_SIZE) {
            this.tamanioArch = tamanioArch;
        } else {
            throw new IllegalArgumentException("Error: Parámetros de creación del libro electrónico inválidos"
                    + " el tamaño (" + tamanioArch + "kb) no está permitido");
        }
    }

    public int getSize() {
        return this.tamanioArch;
    }

    public int getNumDescargas() {
        return this.descargasLibro;
    }

    @Override
    public String[] toArrayAtribValues() {
        String[] valorAtrib = {Integer.toString(this.descargasLibro), Integer.toString(this.tamanioArch)};
        String[] resultante = new String[super.toArrayAtribValues().length + valorAtrib.length];
        System.arraycopy(super.toArrayAtribValues(), 0, resultante, 0, super.toArrayAtribValues().length);
        System.arraycopy(valorAtrib, 0, resultante, super.toArrayAtribValues().length, valorAtrib.length);
        return resultante;
    }

    @Override
    public String[] toArrayAtribNames() {
        String[] nombAtrib = {"tamanioArch", "descargasLibro"};
        String[] resultante = new String[super.toArrayAtribNames().length + nombAtrib.length];
        System.arraycopy(super.toArrayAtribNames(), 0, resultante, 0, super.toArrayAtribNames().length);
        System.arraycopy(nombAtrib, 0, resultante, super.toArrayAtribNames().length, nombAtrib.length);
        return resultante;
    }

    @Override
    public double descargar(double anchoBanda) throws IllegalArgumentException{
        if(anchoBanda <= 0){
            throw new IllegalArgumentException("Error: Parámetro de descarga inválido. Ancho de banda incompatible (" +
                    anchoBanda + ")");
        }else{
            double tiempo = this.getSize() / anchoBanda;
            this.descargasLibro++;
            return tiempo;
        }
    }

}
