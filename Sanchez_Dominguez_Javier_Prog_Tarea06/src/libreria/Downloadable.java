/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

/**
 * Interfaz que incorpora la capacidad de ser descargado de la red.
 * @author Javier Sánchez Domínguez
 */
public interface Downloadable {
    
    /**
     * Descarga el elemento por la red.
     * 
     * @param anchoBanda ancho de banda del sistema (en Kb/seg)
     * @return tiempo que se tarda en descargar el elemento (en segundos)
     */
    double descargar(double anchoBanda);
}
