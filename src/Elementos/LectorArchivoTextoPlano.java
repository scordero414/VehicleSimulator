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
    
    /**
     * Ruta del archivo de texto.
     */
    private String texto = "src/Archivos/EditarVehiculo.txt";
    /**
     * Arreglo donde se guardarán los datos como tipo de llanta y 
     * cilindraje del motor, guardados n el archivo de texto.
     */
    private String arr[];

    public LectorArchivoTextoPlano() {
        leerTexto();
    }
    
    @Override
    public void leerTexto(){
            
        File file = new File(texto);
        
        try {
            if(file.length() != 0) {
                conocerArchivoTexto();
            } else {
                throw new TextoPlanoException("Debe ingresar los datos correctamente.");
            }
        } catch (TextoPlanoException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            //Logger.getLogger(LectorArchivoTextoPlano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Se busca y se conoce el contenido del archivo de texto.
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void conocerArchivoTexto() throws FileNotFoundException, IOException {
        
        FileReader fileR = new FileReader(texto);
        BufferedReader reader = new BufferedReader(fileR);
        
        String text = "";
        String line = reader.readLine();
        while (line != null) {
            text += line;
            line = reader.readLine();
        }
        arr = text.split(" ");
        System.out.println(arr[1] +" " + arr[3]);
    }
    
    /**
     * Se retorna el tipo de llanta guardado en el archivo de texto.
     * @return tipo de llanta, guardado en la posición 1 del array.
     */
    public String entregarLlanta() {
        return arr[1];
    }
    
    /**
     * Se retorna el cilindraje del motor guardado en el archivo de texto.
     * @return cilindraje del motor, guardado en la posición 3 del array.
     */
    public String entregarMotor() {
        return arr[3];
    }
}
