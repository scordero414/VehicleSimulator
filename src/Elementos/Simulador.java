/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

import Exceptions.AccionesApagadoException;
import Exceptions.ApagarDeNuevoException;
import Exceptions.EncenderDeNuevoException;
import Exceptions.FrenadoDetenidoException;
import vistas.VistaVehiculo;

/**
 * Clase control, donde se definen las excepciones, y se acciona el vehículo.
 * @author Daniel Gutiérrez Duque.
 * @author Sebastián Cordero Ramírez.
 * @version 20190312
 * @since 2.0
 */
public class Simulador {
    private Vehiculo vehiculo;
    private Taller taller;
    public Simulador() {
        vehiculo = new Vehiculo(false, false);
        taller = new Taller();
        VistaVehiculo vistaVehiculo =  new VistaVehiculo();
        vistaVehiculo.setSimulador(this);
        taller.ensamblarLlantaMotor(vehiculo);
        System.out.println(vehiculo.getLlanta());
    }

    
    public static void main(String[] args) throws Exception {
        Simulador simulador = new Simulador();
        
    }
    
    /**
     * Se llama el método de acelerar ubicado en el vehículo,
     * para que éste aumente su velocidad.
     * @param aceleracion utilizado para determinar la velocidad 
     * del vehículo.
     */
    public void acelerarVehiculo(float aceleracion){
        vehiculo.acelerar(aceleracion);
    }
    /**
     * Se llama el método de frenar, ubicado en vehículo para
     * poder disminuir la velocidad de éste.
     * @param frenado es utilizado para determinar los km/h que 
     * el vehículo disminuye.
     */
    public void frenarVehiculo(float frenado){
        vehiculo.frenar(frenado);
    }
    /**
     * Se conoce la velocidad que obtiene el vehículo actualmente.
     * @return 
     */
    public float extraerVelocidad(){
        return vehiculo.getVelocidad();
    }
    public void prenderVehiculo(){
        vehiculo.prender();
    }
    public void apagarVehiculo(){
        vehiculo.apagar();
    }
    
    public boolean desactivarFrenarAcelerarApagado(String mensaje) throws AccionesApagadoException {
        if(vehiculo.desactivarFrenarAcelerarApagado(mensaje)) 
            return true;
        return false;
    }
    
    public boolean desactivarApagarApagado(String mensaje) throws ApagarDeNuevoException {
        if(vehiculo.desactivarApagarApagado(mensaje)) 
            return true;
        return false;
    }
    
    public boolean desactivarEncenderEncendido(String mensaje) throws EncenderDeNuevoException{
        if(vehiculo.desactivarEncenderEncendido(mensaje))
            return true;
        return false;
    }
    
    public boolean validarFrenarDetenido(String mensaje) throws FrenadoDetenidoException {
        if(vehiculo.frenarDetenido()) 
            return true;
        return false;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
