/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

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

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public static void main(String[] args) throws Exception {
        LectorArchivoTextoPlano lector = new LectorArchivoTextoPlano();
        lector.leerTexto();
        Simulador simulador = new Simulador();
        VistaVehiculo vistaVehiculo =  new VistaVehiculo();
        Vehiculo vehiculo = new Vehiculo(0,false);
        vistaVehiculo.setSimulador(simulador);
        simulador.setVehiculo(vehiculo);
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
    

}
