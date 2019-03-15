/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Se configura los atributos del vehículo, como lo son el tipo de llanta 
 * y el cilindraje del motor.
 * @author Daniel Gutiérrez Duque
 * @author Sebastián Cordero Ramírez
 * @version 20190213
 * @since 2.0
 */
public class Taller {
    
    /**
     * Tipo de llanta.
     */
    private Llanta tipoLlanta;
    /**
     * Cilindraje perteneciente al motor.
     */
    private Motor tipoMotor;

    private Vehiculo vehiculoTaller;
    
    private Lector lector;
    public Taller(Vehiculo vehiculo) {
        this.vehiculoTaller = vehiculo;
    }
    /**
     * Se crea un lector el cual leerá los datos dados en la clase 
     * de LectorArchivoTextoPlano.
     * @return el lector.
     */
    public Lector crearLector(){
        Lector  lector = new LectorArchivoTextoPlano();
        return lector;
    }
    /**
     * Al ser creado el lector, se conocen los datos requeridos para
     * la llanta y el motor, y se modifica el vehículo.
     */
    public void iniciarLectura(){
        lector = crearLector();
        crearLlanta(lector);
        crearMotor(lector);
        ensamblarLlantaMotor(vehiculoTaller);
    }
    /**
     * Se configura los atributos de motor y llanta, del carro
     * obteniendo los datos ingresados en el archivo de texto.
     
    public void configurarCarro() {
        setTipoLlanta(lectorArchivoTextoPlano.entregarLlanta());
        setCilindrajeMotor(lectorArchivoTextoPlano.entregarMotor());
    }*/
    
    /**
     * Conociendo los datos pedidos para la llanta, éste se le asigna 
     * a la llanta.
     * @param lector 
     */
    public void crearLlanta(Lector lector) {
        String archivoLlanta;
        try {
            archivoLlanta = lector.leerTexto()[1];
            if(archivoLlanta.equalsIgnoreCase("bonitas")){
            Llanta llanta = new LlantaBonita(70);
            tipoLlanta = llanta;
            }
            if(archivoLlanta.equalsIgnoreCase("buenas")){
                Llanta llanta = new LlantaBuena(110);
                tipoLlanta = llanta;
            }
            if(archivoLlanta.equalsIgnoreCase("baratas")){
                Llanta llanta = new LlantaBuena(50);
                tipoLlanta = llanta;
            }
        } catch (IOException ex) {
            Logger.getLogger(Taller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    /**
     * Conociendo los datos pedidos para el motor, éste se le asigna 
     * al motor.
     * @param lector 
     */
    public void crearMotor(Lector lector){
        String archivoLlanta;
        try {
            archivoLlanta = lector.leerTexto()[3];
            if(archivoLlanta.equalsIgnoreCase("1000")){
            Motor motor = new Motor1000(100);
            tipoMotor = motor;
            }
            if(archivoLlanta.equalsIgnoreCase("2000")){
                Motor motor = new Motor2000(160);
                tipoMotor = motor;
            }
            if(archivoLlanta.equalsIgnoreCase("3000")){
                Motor motor = new Motor3000(220);
                tipoMotor = motor;
            }
        } catch (IOException ex) {
            Logger.getLogger(Taller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    /**
     * Se le ensamblan la llanta y el motor al vehículo.
     * @param vehiculo 
     */
    public void ensamblarLlantaMotor(Vehiculo vehiculo){
        vehiculo.setLlanta(tipoLlanta);
        vehiculo.setMotor(tipoMotor);
    }
    /**
     * Se conoce el tipo de llanta pedido.
     * @return Tipo de llanta.
     */
    public Llanta getTipoLlanta() {
        return tipoLlanta;
    }

    public void setTipoLlanta(Llanta tipoLlanta) {
        this.tipoLlanta = tipoLlanta;
    }
    /**
     * Se conoce el tipo de motor pedido.
     * @return Tipo de motor.
     */
    public Motor getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(Motor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

//    public LectorArchivoTextoPlano getLectorArchivoTextoPlano() {
//        return lectorArchivoTextoPlano;
//    }
//
//    public void setLectorArchivoTextoPlano(LectorArchivoTextoPlano lectorArchivoTextoPlano) {
//        this.lectorArchivoTextoPlano = lectorArchivoTextoPlano;
//    }
//    
    public String entregarNombreLlanta(){
        return lector.obtenerNombreLlanta();
    }
    public String entregarNombreMotor(){
        return lector.obtenerNombreMotor();
    }
}
