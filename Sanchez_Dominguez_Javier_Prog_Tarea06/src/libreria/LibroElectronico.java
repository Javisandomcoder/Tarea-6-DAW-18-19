/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

/**
 * Clase que representa un producto de tipo Libro Electrónico 
 * Los objetos de esta clase contienen atributos que permiten almacenar toda la información relativa a un producto 
 * de tipo libro electrónico,  Además de los atributos propios de un libro en abstracto, deberá contener los 
 * específicos de un libro electrónico: Tamaño del archivo (en kb) y Número de veces que se ha descargado el archivo.
 * 
 * @version v0.1 febrero_2019
 * @author Javier Sánchez Domínguez
 */
public class LibroElectronico extends Libro implements Downloadable {

    private int tamanioArch;
    private int descargasLibro;
    public static final int MIN_SIZE = 20;
    public static final int MAX_SIZE = 65535;

    /**
     * Crea un objeto LibroElectronico con un nombre, precio, texto de descripción, autor, año de edición y tamaño en Kbytes.
     * @param nombre Título del libro
     * @param precio Precio del libro
     * @param descripcion Descripción del libro
     * @param autorLibro Autor del libro
     * @param year Año de publicación del libro
     * @param tamanioArch Tamaño del archivo del libro electrónico
     * @throws IllegalArgumentException Si alguno de los parámetros no es válido
     */
    public LibroElectronico(String nombre, double precio, String descripcion, String autorLibro, int year, int tamanioArch) throws IllegalArgumentException {
        super(nombre, precio, descripcion, autorLibro, year);
        if (tamanioArch > MIN_SIZE && tamanioArch < MAX_SIZE) {
            this.tamanioArch = tamanioArch;
        } else {
            throw new IllegalArgumentException("Error: Parámetros de creación del libro electrónico inválidos"
                    + " el tamaño (" + tamanioArch + "kb) no está permitido");
        }
    }

    /**
     * Devuelve el tamaño en kb del libro electrónico
     * @return El tamaño en kb
     */
    public int getSize() {
        return this.tamanioArch;
    }

    /**
     * Devuelve el número de descargas del libro electrónico
     * @return El número de descargas
     */
    public int getNumDescargas() {
        return this.descargasLibro;
    }

    /**
     * Genera array de valores de atributos
     * @return Array de String con los valores de los atributos del objeto
     */
    @Override
    public String[] toArrayAtribValues() {
        String[] valorAtrib = {Integer.toString(this.descargasLibro), Integer.toString(this.tamanioArch)};
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
        String[] nombAtrib = {"tamanioArch", "descargasLibro"};
        String[] resultante = new String[super.toArrayAtribNames().length + nombAtrib.length];
        System.arraycopy(super.toArrayAtribNames(), 0, resultante, 0, super.toArrayAtribNames().length);
        System.arraycopy(nombAtrib, 0, resultante, super.toArrayAtribNames().length, nombAtrib.length);
        return resultante;
    }

    /**
     * Descarga el libro electrónico por la red
     * @param AnchoBanda Ancho de banda del sistema (en kb/seg)
     * @return Tiempo de duración de la descarga (en segundos)
     * @throws IllegalArgumentException si el anco de banda no es mayor que cero
     */
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
