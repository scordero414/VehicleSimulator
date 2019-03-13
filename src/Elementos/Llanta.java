/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

/**
 * Clase en la cual se conoce los atributos de la llanta.
 * @author Daniel Gutiérrez Duque
 * @author Sebastián Cordero Ramírez
 * @version 20190312
 * @since 2.0
 */
public abstract class Llanta {
    
    /**
     * Límite de velocidad permitido con un determinado tipo de llantas.
     */
    private int limitePermitido;

    public Llanta(int limitePermitido) {
        this.limitePermitido = limitePermitido;
    }

    public int getLimitePermitido() {
        return limitePermitido;
    }

    public void setLimitePermitido(int limitePermitido) {
        this.limitePermitido = limitePermitido;
    }
    
}
