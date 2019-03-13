/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

import Exceptions.AccidenteException;
import Exceptions.AccionesApagadoException;
import Exceptions.ApagarDeNuevoException;
import Exceptions.EncenderDeNuevoException;
import Exceptions.FrenadoDetenidoException;
import Exceptions.PatinarFrenadoBruscoException;

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
     * El estado en el que esta fisicamente el vehiculo.
     */
    private boolean estadoAccidentado;
    /**
     * El estado cambia dependiendo de la accion del usuario.
     */
    private boolean estadoFrenoBrusco;

    /**
     * El estado en que está el vehículo cuando frena (Patinando).
     */
    private boolean estadoPatinado;

    public Vehiculo(boolean estadoPrendido, boolean estadoAccidentado, boolean estadoPatinado) {
        this.estadoPrendido = estadoPrendido;
        this.estadoAccidentado = estadoAccidentado;
        this.estadoPatinado = estadoPatinado;
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
       
        if(frenado  >= 0 & frenado < 3){
            velocidad -= frenado * 2;
            determinarVelocidadNegativa();
            System.out.println(velocidad);
        }else if(frenado >= 3 & frenado < 5){
            velocidad -= frenado * 3;
            determinarVelocidadNegativa();
            System.out.println(velocidad);
        }else if(frenado >=4 & frenado < 5){
            velocidad -= frenado * 5;
            determinarVelocidadNegativa();
            System.out.println(velocidad);
            System.out.println(frenarBruscamente());
        }else if(frenado >= 5){
            velocidad -= frenado *6;
            estadoFrenoBrusco = true;
            determinarVelocidadNegativa();
            System.out.println(velocidad);
            System.out.println(frenarBruscamente());
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
    public boolean frenarBruscamente(){
        if(estadoFrenoBrusco){
            return true;
        }
        return false;
    }
    public boolean desactivarFrenarAcelerarApagado(String mensaje) throws AccionesApagadoException {
        return conocerEstadoVehiculo();
    }
    
    public boolean desactivarApagarApagado(String mensaje) throws ApagarDeNuevoException {
        return conocerEstadoVehiculo();
    }
    
    public boolean desactivarEncenderEncendido(String mensaje) throws EncenderDeNuevoException{
        return conocerEstadoVehiculo();
    }
    
    public boolean conocerEstadoVehiculo() {
        if(isEstadoPrendido()) 
            return true;
        return false;
    }
    
    public boolean frenarDetenido() throws FrenadoDetenidoException {
        if(velocidad <= 0) {
            velocidad = 0;
            return true;
        }
        return false;
    }
    
    public boolean frenarAltaVelocidad() throws AccidenteException {
        if(velocidad > 60) {
            estadoAccidentado = true;
            return true;
        }
        return false;
    }
    
    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
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
    
    public boolean isEstadoPatinado() {
        return estadoPatinado;
    }

    public void setEstadoPatinado(boolean estadoPatinado) {
        this.estadoPatinado = estadoPatinado;
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
    
    public void determinarVelocidadNegativa(){
        if(velocidad<0){
            velocidad = 0;
        }
    }
    
    
}
