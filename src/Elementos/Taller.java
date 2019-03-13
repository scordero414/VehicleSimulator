/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

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
    private String tipoLlanta;
    /**
     * Cilindraje perteneciente al motor.
     */
    private String cilindrajeMotor;

    private LectorArchivoTextoPlano lectorArchivoTextoPlano;
    
    /**
     * Se configura los atributos de motor y llanta, del carro
     * obteniendo los datos ingresados en el archivo de texto.
     */
    public void configurarCarro() {
        setTipoLlanta(lectorArchivoTextoPlano.entregarLlanta());
        setCilindrajeMotor(lectorArchivoTextoPlano.entregarMotor());
    }
    
    public Taller(String tipoLlanta, String cilindrajeMotor) {
        this.tipoLlanta = tipoLlanta;
        this.cilindrajeMotor = cilindrajeMotor;
    }

    public String getTipoLlanta() {
        return tipoLlanta;
    }

    public void setTipoLlanta(String tipoLlanta) {
        this.tipoLlanta = tipoLlanta;
    }

    public String getCilindrajeMotor() {
        return cilindrajeMotor;
    }

    public void setCilindrajeMotor(String cilindrajeMotor) {
        this.cilindrajeMotor = cilindrajeMotor;
    }
}
