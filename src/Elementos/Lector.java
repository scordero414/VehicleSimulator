package Elementos;

import java.io.IOException;

/**
 * Interface en la cual se crean métodos para la lectura de archivo de texto.
 * @author Daniel Gutiérrez Duque.
 * @author Sebastián Cordero Ramírez.
 * @version 20190312
 * @since 1.0
 */
public interface Lector {
    
    /**
     * Método para la lectura del archivo de texto.
     * @throws IOException 
     */
    public String[] leerTexto() throws IOException;
    
    public String obtenerNombreLlanta();
    public String obtenerNombreMotor();
}
