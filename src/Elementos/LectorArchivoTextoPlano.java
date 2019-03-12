/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

import Exceptions.TextoVacioException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
/**
 *
 * @author USUARIO
 */
public class LectorArchivoTextoPlano {
    
    private String texto = "src/Archivos/EditarVehiculo.txt";
    
    public void leerTexto() throws Exception {
        
            File file = new File(texto);
            FileReader fileR = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileR);
        
            String text = "";
        
        try {

            while ((text = reader.readLine()) != null) {
                System.out.println(text);
            }

        } catch (IOException e) {
            if(file.length() == 0) {
                throw new TextoVacioException("No se ha ingresado una especificación correcta.");
            }
        }
    }
}
