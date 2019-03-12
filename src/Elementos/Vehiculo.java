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
public class Vehiculo {
    
    private int velocidad;
    /**
     * El estado en que permanece el vehículo.
     */
    private int estado;

    public Vehiculo(String tipoLlanta, int cilindrajeMotor, int velocidad, int estado) {
        this.velocidad = velocidad;
        this.estado = estado;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}
