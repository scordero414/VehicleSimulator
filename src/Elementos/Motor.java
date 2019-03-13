/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

/**
 * Clase en la cual se conoce los atributos del motor.
 * @author Daniel Gutiérrez Duque
 * @author Sebastián Cordero Ramírez
 * @version 20190312
 * @since 2.0
 */
public abstract class Motor {
    
    /**
     * Velocidad máxima que resiste el motor con determinado cilindraje.
     */
    private int velocidadMaxima;

    public Motor(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
}
