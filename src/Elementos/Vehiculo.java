/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

import Exceptions.AccionesApagadoException;

/**
 *
 * @author USUARIO
 */
public class Vehiculo {
    /**
     * El tipo de llanta que va a tener el vehiculo.
     */
    private Llanta llanta;
    /**
     * El tipo de motor que va a tener el vehiculo.
     */
    private Motor motor;
    /**
     * La velocidad a la que andará el vehículo, esta varía constantemente.
     */
    private float velocidad = 0; 
    /**
     * El estado en que permanece el vehículo (Prendido).
     */
    private boolean estadoPrendido;
    /**
     * El estado en que permanece el vehículo (Prendido).
     */
    private boolean estadoAccidentado;


    public Vehiculo(boolean estadoPrendido, boolean estadoAccidentado) {
        this.estadoPrendido = estadoPrendido;
        this.estadoAccidentado = estadoAccidentado;
    }

    
    /**
     * Acelera el vehiculo, dependiendo a la aceleracion, varia su velocidad.
     * @param aceleracion determina la velociadad del vehiculo.
     */
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
    }
    /**
     * Frena el vehiculo, disminuye la velocidad, dependiendo la potencia de frenado.
     * @param frenado determina cuanta velocidad hay que disminurile al vehiculo.
     */
    public void frenar(float frenado){
        
        if(frenado  > 0){
            velocidad -= frenado * 6;
        }else if(frenado > 3){
            velocidad -= frenado * 12;
        }else if(frenado > 5){
            velocidad -= frenado * 16;
        }else if(frenado > 7){
            velocidad -= frenado * 20;
        }
    }
    public void prender(){
        estadoPrendido = true;
        velocidad = 0;
    }
    public void apagar(){
        estadoPrendido = false;
        velocidad = 0;
    }
    
    public boolean desactivarAccionesApagado(String mensaje) throws AccionesApagadoException {
        if(isEstadoPrendido()) 
            return true;
        return false;
    }
    
    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isEstadoPrendido() {
        return estadoPrendido;
    }

    public void setEstadoPrendido(boolean estadoPrendido) {
        this.estadoPrendido = estadoPrendido;
    }

    public boolean isEstadoAccidentado() {
        return estadoAccidentado;
    }

    public void setEstadoAccidentado(boolean estadoAccidentado) {
        this.estadoAccidentado = estadoAccidentado;
    }

    public Llanta getLlanta() {
        return llanta;
    }

    public void setLlanta(Llanta llanta) {
        this.llanta = llanta;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    
    
    
}
