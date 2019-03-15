/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

import Exceptions.TextoPlanoException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Se lee y se busca el archivo del texto, conociendo los datos deseados.
 * @author Daniel Gutiérrez Duque
 * @author Sebastián Cordero Ramírez
 * @version 20190312
 * @since 1.0
 */
public class LectorArchivoTextoPlano implements Lector {
    
    @Override
    public String[] leerTexto() throws FileNotFoundException, IOException,NullPointerException{
        /**
         * Ruta del archivo de texto.
         */
        String texto = "src/Archivos/EditarVehiculo.txt";
        File file = new File(texto);
        
        /**
        * Arreglo donde se guardarán los datos como tipo de llanta y 
        * cilindraje del motor, guardados n el archivo de texto.
        */
        String arr [] = new String[4];
            if(file.length() != 0) {
                FileReader fileR = new FileReader(texto);
                BufferedReader reader = new BufferedReader(fileR);

                String text = "";
                String line = reader.readLine();
                while (line != null) {
                    text += line;
                    line = reader.readLine();
                }
                arr = text.split(" ");
            }
        return arr;
    }

    /**
     * Se retorna el tipo de llanta guardado en el archivo de texto.
     * @return tipo de llanta, guardado en la posición 1 del array.
     */
    public String obtenerNombreLlanta() {
        String arr[];
        try {
            arr = leerTexto();
            return arr[1];
        } catch (IOException ex) {
            Logger.getLogger(LectorArchivoTextoPlano.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    /**
     * Se retorna el cilindraje del motor guardado en el archivo de texto.
     * @return cilindraje del motor, guardado en la posición 3 del array.
     */
    public String obtenerNombreMotor() {
        String arr[];
        try {
            arr = leerTexto();
            return arr[3];
        } catch (IOException ex) {
            Logger.getLogger(LectorArchivoTextoPlano.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
