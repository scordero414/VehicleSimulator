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
    private Llanta tipoLlanta;
    /**
     * Cilindraje perteneciente al motor.
     */
    private Motor tipoMotor;

    private LectorArchivoTextoPlano lectorArchivoTextoPlano;
    
    public Taller() {
        lectorArchivoTextoPlano = new LectorArchivoTextoPlano();
        crearLlanta();
        crearMotor();
    }
    /**
     * Se configura los atributos de motor y llanta, del carro
     * obteniendo los datos ingresados en el archivo de texto.
     
    public void configurarCarro() {
        setTipoLlanta(lectorArchivoTextoPlano.entregarLlanta());
        setCilindrajeMotor(lectorArchivoTextoPlano.entregarMotor());
    }*/
    
    public void crearLlanta(){
        String archivoLlanta = lectorArchivoTextoPlano.entregarLlanta();
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
    }
    public void crearMotor(){
        String archivoLlanta = lectorArchivoTextoPlano.entregarMotor();
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
    }

    public void ensamblarLlantaMotor(Vehiculo vehiculo){
        vehiculo.setLlanta(tipoLlanta);
        vehiculo.setMotor(tipoMotor);
    }

    public Llanta getTipoLlanta() {
        return tipoLlanta;
    }

    public void setTipoLlanta(Llanta tipoLlanta) {
        this.tipoLlanta = tipoLlanta;
    }

    public Motor getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(Motor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public LectorArchivoTextoPlano getLectorArchivoTextoPlano() {
        return lectorArchivoTextoPlano;
    }

    public void setLectorArchivoTextoPlano(LectorArchivoTextoPlano lectorArchivoTextoPlano) {
        this.lectorArchivoTextoPlano = lectorArchivoTextoPlano;
    }
    
}
