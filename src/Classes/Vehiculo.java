/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author USUARIO
 */
public class Vehiculo {
    
    /**
     * Tipo de la llanta del vehículo (Bueno, bonito o barato)
     */
    private String tipoLlanta;
    /**
     * Capacidad del cilindraje del motor del vehículo.
     */
    private int cilindrajeMotor;
    /**
     * La velocidad a la que andará el vehículo, esta varía constantemente.
     */
    private int velocidad;
    /**
     * El estado en que permanece el vehículo.
     */
    private int estado;

    public Vehiculo(String tipoLlanta, int cilindrajeMotor, int velocidad, int estado) {
        this.tipoLlanta = tipoLlanta;
        this.cilindrajeMotor = cilindrajeMotor;
        this.velocidad = velocidad;
        this.estado = estado;
    }

    public String getTipoLlanta() {
        return tipoLlanta;
    }

    public void setTipoLlanta(String tipoLlanta) {
        this.tipoLlanta = tipoLlanta;
    }

    public int getCilindrajeMotor() {
        return cilindrajeMotor;
    }

    public void setCilindrajeMotor(int cilindrajeMotor) {
        this.cilindrajeMotor = cilindrajeMotor;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}
