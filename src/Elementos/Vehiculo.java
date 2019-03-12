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
    
    /**
     * La velocidad a la que andará el vehículo, esta varía constantemente.
     */
    private float velocidad = 0; 
    /**
     * El estado en que permanece el vehículo.
     */
    private boolean estado;

    public Vehiculo(float velocidad, boolean estado) {
        this.velocidad = velocidad;
        this.estado = estado;
    }
    
    public void acelerar(float aceleracion){
        
        if(aceleracion  > 0){
            velocidad += aceleracion * 6;
        }else if(aceleracion > 3){
            velocidad += aceleracion * 12;
        }else if(aceleracion > 5){
            velocidad += aceleracion * 16;
        }else if(aceleracion > 7){
            velocidad += aceleracion * 20;
        }
        System.out.println(velocidad);
    }
    
    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
