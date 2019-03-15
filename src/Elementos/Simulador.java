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
import Exceptions.PatinarException;
import vistas.VistaMenuPrincipal;
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
        vehiculo = new Vehiculo(false, false, false);
        taller = new Taller(vehiculo);
        //System.out.println(vehiculo.getLlanta().getLimitePermitido());
    }

    
    public static void main(String[] args) throws Exception {
        Simulador simulador = new Simulador();
        VistaVehiculo vistaVehiculo =  new VistaVehiculo(simulador);
        //vistaVehiculo.setSimulador(simulador);
        
    }
    public void leerTxt(){
        taller.iniciarLectura();
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
    /**
     * Se llama el método de la clase vehículo para establecer como prendido 
     * el estado del vehículo.
     */
    public void prenderVehiculo(){
        vehiculo.prender();
    }
    /**
     * Se llama el método de la clase vehículo para establecer como apagadp 
     * el estado del vehículo, por lo que no es posible realizar ninguna acción.
     */
    public void apagarVehiculo(){
        vehiculo.apagar();
    }
    /**
     * Se deshabilitan las funciones de acelerar o frenar el vehículo, ya que 
     * éste se encuentra en estado apagado.
     * @return método de la clase vehículo.
     * @throws AccionesApagadoException 
     */
    public boolean desactivarFrenarAcelerarApagado() throws AccionesApagadoException {
        return vehiculo.desactivarFrenarAcelerarApagado();
    }
    /**
     * Al estar el vehículo en estado apagado, éste ya no se puede apagar
     * de nuevo.
     * @return método de la clase vehículo.
     * @throws ApagarDeNuevoException 
     */
    public boolean desactivarApagarApagado() throws ApagarDeNuevoException {
        return vehiculo.desactivarApagarApagado();
    }
    /**
     * Al estar el vehículo en estado encendido, éste ya no se puede encender
     * de nuevo.
     * @return método de la clase vehículo.
     * @throws EncenderDeNuevoException 
     */
    public boolean desactivarEncenderEncendido() throws EncenderDeNuevoException{
        return vehiculo.desactivarEncenderEncendido();
    }
    /**
     * Al estar el vehículo detenido (velocidad = 0), no será posible
     * frenar más.
     * @return método de la clase vehículo.
     * @throws FrenadoDetenidoException 
     */
    public boolean validarFrenarDetenido() throws FrenadoDetenidoException {
        return vehiculo.frenarDetenido();
    }
    /**
     * Al apagar el vehículo a una gran velocidad (60 km/h), éste se accidentará.
     * @return método de la clase vehículo.
     * @throws AccidenteException 
     */
    public boolean apagarAltaVelocidad() throws AccidenteException {
        return vehiculo.apagarAltaVelocidad();
    }
    /**
     * Se verifica si se ha sobrepasado la velocidad límite para las llantas.
     * @param vel velocidad del vehículo
     * @return método de la clase vehículo.
     * @throws PatinarException 
     */
    public boolean sobrepasarVelocidadLlantas(float vel) throws PatinarException{
        return vehiculo.sobrepasarVelocidadLlantas(vel);
    }
    /**
     * Se verifica si se ha sobrepasado la velocidad límite para el motor. 
     * @return método de la clase vehículo.
     * @throws AccidenteException 
     */
    public boolean sobrepasarLimiteMotor() throws AccidenteException{
        return vehiculo.sobrepasarLimiteMotor();
    }
    /**
     * Conociendo la velocidad del vehículo, si ésta es igual a 0, y el vehículo
     * ha estado patinando, se detiene la patinación.
     * @return método de la clase vehículo.
     */
    public boolean detenerPatinado() {
        return vehiculo.detenerPatinado();
    }
    /**
     * Se cambia el estado del vehículo, si está accidentado, o no. 
     */
    public void cambiarEstadoAccidentado(){
        vehiculo.setEstadoAccidentado(false);
    }
    /**
     * Se conoce el estado del vehículo (Si éste está accidentado o no).
     * @return método de la clase vehículo.
     */
    public boolean entregarEstadoAccidente(){
        return vehiculo.isEstadoAccidentado();
    }
    /**
     * Si la velocidad del vehículo es negativa, en este caso -1. 
     * Se modifica la velocidad a 0.
     */
    public void detenerVehiculo() {
        if(extraerVelocidad() == -1) 
            vehiculo.setVelocidad(0);
    }
    
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public String entregarTipoLlanta(){
        return taller.entregarNombreLlanta();
    }
    public String entregarTipoMotor(){
        return taller.entregarNombreMotor();
    }
}
