/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

import vistas.VistaVehiculo;

/**
 *
 * @author USUARIO
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
    public void acelerarVehiculo(float aceleracion){
        vehiculo.acelerar(aceleracion);
    }
    public void frenarVehiculo(float frenado){
        vehiculo.frenar(frenado);
    }
    public float extraerVelocidad(){
        return vehiculo.getVelocidad();
    }
    

}
