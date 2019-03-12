/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

/**
 *
 * @author USUARIO
 */
public class Taller {
    private String tipoLlanta;
    private String cilindrajeMotor;

    private LectorArchivoTextoPlano lectorArchivoTextoPlano;
    
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
