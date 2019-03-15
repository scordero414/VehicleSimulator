/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

import java.io.FileNotFoundException;
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
    public void iniciarLectura() throws IOException,FileNotFoundException,NullPointerException{
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
    public Llanta crearLlanta(Lector lector) throws IOException ,NullPointerException,FileNotFoundException {
        String archivoLlanta;
        archivoLlanta = lector.leerTexto()[1];
        if(archivoLlanta.equalsIgnoreCase("bonitas")){
            Llanta llanta = new LlantaBonita(70);
            return llanta;
        }
        if(archivoLlanta.equalsIgnoreCase("buenas")){
            Llanta llanta = new LlantaBuena(110);
            return llanta;
        }
        if(archivoLlanta.equalsIgnoreCase("baratas")){
            Llanta llanta = new LlantaBuena(50);
            return llanta;
        }
        return null;
    }
    /**
     * Conociendo los datos pedidos para el motor, éste se le asigna 
     * al motor.
     * @param lector 
     */
    public Motor crearMotor(Lector lector) throws FileNotFoundException, NullPointerException, IOException{
        String archivoLlanta;
        archivoLlanta = lector.leerTexto()[3];
        if(archivoLlanta.equalsIgnoreCase("1000")){
            Motor motor = new Motor1000(100);
            return motor;
        }
        if(archivoLlanta.equalsIgnoreCase("2000")){
            Motor motor = new Motor2000(160);
            return motor;
        }
        if(archivoLlanta.equalsIgnoreCase("3000")){
            Motor motor = new Motor3000(220);
            return motor;
        }
        return null;        
    }
    /**
     * Se le ensamblan la llanta y el motor al vehículo.
     * @param vehiculo 
     */
    public void ensamblarLlantaMotor(Vehiculo vehiculo) throws IOException,NullPointerException{
        vehiculo.setLlanta(crearLlanta(lector));
        vehiculo.setMotor(crearMotor(lector));
    }
    

    public String entregarNombreLlanta(){
        return lector.obtenerNombreLlanta();
    }
    public String entregarNombreMotor(){
        return lector.obtenerNombreMotor();
    }
}
