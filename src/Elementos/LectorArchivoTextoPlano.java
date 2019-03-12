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
import javax.swing.JOptionPane;
/**
 *
 * @author USUARIO
 */
public class LectorArchivoTextoPlano implements Lector {
    
    private String texto = "src/Archivos/EditarVehiculo.txt";
    private String arr[];
    
    @Override
    public void leerTexto() throws IOException {
            
        File file = new File(texto);
        
        try {
            if(file.length() != 0) {
                conocerArchivoTexto();
            } else {
                throw new TextoPlanoException("Debe ingresar los datos correctamente.");
            }
        } catch (TextoPlanoException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
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
    }
    
    public String entregarLlanta() {
        return arr[1];
    }
    
    public String entregarMotor() {
        return arr[3];
    }
}
