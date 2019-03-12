/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

/**
 *
 * @author USUARIO
 */
public class Llanta {
    
    /**
     * Tipo de la llanta (Bueno, Bonito ó Barato).
     */
    private String tipo;
    /**
     * Límite de velocidad permitido con un determinado tipo de llantas.
     */
    private int limitePermitido;

    public Llanta(String tipo, int limitePermitido) {
        this.tipo = tipo;
        this.limitePermitido = limitePermitido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLimitePermitido() {
        return limitePermitido;
    }

    public void setLimitePermitido(int limitePermitido) {
        this.limitePermitido = limitePermitido;
    }
    
}
