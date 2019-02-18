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
public class EReader extends Producto{
    private String nombreFabricante;
    
    public EReader(String nombre, double precio, String descripcion, String nombFabricante){
        super(nombre, precio, descripcion);
        this.nombreFabricante = nombFabricante;
    }
    
    public String getFabricante(){
        return this.nombreFabricante;
    }

    @Override
    public String[] toArrayAtribValues() {
        String[] valorAtrib = {this.nombreFabricante};
        String[] resultante = new String[super.toArrayAtribValues().length + valorAtrib.length];
        System.arraycopy(super.toArrayAtribValues(), 0, resultante, 0, super.toArrayAtribValues().length);
        System.arraycopy(valorAtrib, 0, resultante, super.toArrayAtribValues().length, valorAtrib.length);
        return resultante;
    }

    @Override
    public String[] toArrayAtribNames() {
        String[] nombAtrib = {"nombreFabricante"};
        String[] resultante = new String[super.toArrayAtribNames().length + nombAtrib.length];
        System.arraycopy(super.toArrayAtribNames(), 0, resultante, 0, super.toArrayAtribNames().length);
        System.arraycopy(nombAtrib, 0, resultante, super.toArrayAtribNames().length, nombAtrib.length);
        return resultante;
    }
    
    
}
