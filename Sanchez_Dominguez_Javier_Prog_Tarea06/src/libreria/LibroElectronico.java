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
public class LibroElectronico extends Libro implements Downloadable{
    private int tamanioArch;
    private int descargasLibro;
    public static final int MIN_SIZE = 20;
    public static final int MAX_SIZE = 65535;

    public LibroElectronico(String nombre, double precio, String descripcion, String autorLibro, int year, int tamanioArch, int descargasLibro) throws IllegalArgumentException {
        super(nombre, precio, descripcion, autorLibro, year);
        if(tamanioArch > MIN_SIZE && tamanioArch < MAX_SIZE){
            this.tamanioArch = tamanioArch;
            this.descargasLibro = descargasLibro;
        }
        else{
            throw new IllegalArgumentException("Error: Parámetros de creación del libro electrónico inválidos"
                    + " el tamaño (" + tamanioArch +") no está permitido" );
        }
    }
    
    public int getSize(){
        return this.tamanioArch;
    }
    
    public int getNumDescargas(){
        return this.descargasLibro;
    }

    @Override
    public String[] toArrayAtribValues() {
        return super.toArrayAtribValues(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[] toArrayAtribNames() {
        return super.toArrayAtribNames(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    @Override
    public double descargar(double anchoBanda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
