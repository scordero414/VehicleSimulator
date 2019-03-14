/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Elementos.Llanta;
import Elementos.Simulador;
import Elementos.Vehiculo;
import Exceptions.AccidenteException;
import Exceptions.AccionesApagadoException;
import Exceptions.ApagarDeNuevoException;
import Exceptions.EncenderDeNuevoException;
import Exceptions.FrenadoDetenidoException;
import Exceptions.PatinarException;
import java.applet.AudioClip;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class VistaVehiculo extends javax.swing.JFrame {
    
    private int verificadorVelocidad;
    private long milisegs;
    private long milisegs2;
    private Simulador simulador;
    private Vehiculo vehiculo;
    
    public void setSimulador(Simulador simulador) {
        this.simulador = simulador;
    }
    
    
    /**
     * Creates new form VistaVehiculo
     */
    public VistaVehiculo() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        iniciarVidriosInvisibles();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAcelerar = new javax.swing.JButton();
        btnFreno = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        lblVelocidad = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEncender = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnReparar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblVidrio = new javax.swing.JLabel();
        lblVidrioLateral = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAcelerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PedalAc.png"))); // NOI18N
        btnAcelerar.setToolTipText("");
        btnAcelerar.setBorderPainted(false);
        btnAcelerar.setContentAreaFilled(false);
        btnAcelerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcelerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAcelerarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAcelerarMouseReleased(evt);
            }
        });
        btnAcelerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcelerarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcelerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 520, 90, 140));

        btnFreno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PedalFr.png"))); // NOI18N
        btnFreno.setBorderPainted(false);
        btnFreno.setContentAreaFilled(false);
        btnFreno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFreno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFrenoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFrenoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnFrenoMouseReleased(evt);
            }
        });
        getContentPane().add(btnFreno, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 550, 80, 110));

        btnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/On_Off.png"))); // NOI18N
        btnApagar.setBorderPainted(false);
        btnApagar.setContentAreaFilled(false);
        btnApagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });
        getContentPane().add(btnApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 620, 60, 50));

        lblVelocidad.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        lblVelocidad.setForeground(new java.awt.Color(204, 204, 204));
        lblVelocidad.setText("---");
        getContentPane().add(lblVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, 140, 50));

        jLabel3.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("km/h");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 280, 120, 50));

        btnEncender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/On_Off.png"))); // NOI18N
        btnEncender.setBorderPainted(false);
        btnEncender.setContentAreaFilled(false);
        btnEncender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncenderActionPerformed(evt);
            }
        });
        getContentPane().add(btnEncender, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 510, 60, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Apagar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 570, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Encender");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 570, -1, -1));

        btnReparar.setBackground(new java.awt.Color(0, 0, 0));
        btnReparar.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        btnReparar.setForeground(new java.awt.Color(255, 0, 51));
        btnReparar.setText("Reparar");
        btnReparar.setToolTipText("");
        btnReparar.setBorderPainted(false);
        btnReparar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReparar.setDefaultCapable(false);
        btnReparar.setFocusPainted(false);
        btnReparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepararActionPerformed(evt);
            }
        });
        getContentPane().add(btnReparar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 90, 270, 120));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setBorderPainted(false);
        jButton2.setEnabled(false);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 80, 270, 130));

        lblVidrio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vidrioRoto (1).png"))); // NOI18N
        getContentPane().add(lblVidrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, -1, 100));

        lblVidrioLateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vidrioLateral.png"))); // NOI18N
        getContentPane().add(lblVidrioLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 270, 280));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VehiculoF.jpg"))); // NOI18N
        fondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcelerarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcelerarMousePressed
        String mensaje = "El vehículo está apagado, debes encenderlo para utilizarlo.";
        String mensajeAccidente = "El vehículo está accidentadom, no puedes utilizarlo hasta que lo repares";
        String mensajePatinar = "El vehículo esta patinando, por favor frena para poder detener el vehículo.";
        try {
            if(verificadorVelocidad == 2) {
                throw new PatinarException(mensajePatinar);
            }
            if(simulador.desactivarFrenarAcelerarApagado()) {
                milisegs = (System.currentTimeMillis())/1000;
                generarSonidoAutoAcelerando();
            } else {
                if(simulador.entregarEstadoAccidente()){
                    throw new AccidenteException(mensajeAccidente);
                }else{
                    throw new AccionesApagadoException(mensaje);
                }
            }
        } catch (AccionesApagadoException e) {
            JOptionPane.showMessageDialog(null, mensaje);
        } catch (PatinarException pe) {
            JOptionPane.showMessageDialog(null, mensajePatinar);
            audioCarroAcelerando.stop();
        }catch (AccidenteException ae){
            JOptionPane.showMessageDialog(null, mensajeAccidente);
        }
    }//GEN-LAST:event_btnAcelerarMousePressed

    private void btnAcelerarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcelerarMouseReleased
        milisegs2 = (System.currentTimeMillis()/1000) - milisegs;
        simulador.acelerarVehiculo(milisegs2);
        dibujarVelocidad();
        sobrePasarLimiteMotor();
        audioCarroAcelerando.stop();
        System.out.println("Me presionaron : "+milisegs2+" segundos");
    }//GEN-LAST:event_btnAcelerarMouseReleased
    
    public void sobrePasarLimiteMotor(){
        String mensaje = "Pasaste el limite de velocidad del motor, te has accidentado.";
        try {
            if(simulador.sobrepasarLimiteMotor()) {
                audioCarroAcelerando.stop();
                iniciarAccidente();
                throw new AccidenteException(mensaje);
            }
        } catch (AccidenteException ae) {
            JOptionPane.showMessageDialog(null, mensaje);
            
        }
    }
    
    private void btnFrenoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFrenoMousePressed
        String mensaje = "El vehículo está apagado, debes encenderlo para utilizarlo.";
        String mensajeAccidente = "El vehículo está accidentado, no puedes utilizarlo hasta que lo repares";
        try {
            if(simulador.desactivarFrenarAcelerarApagado()) {
                milisegs = (System.currentTimeMillis())/1000;
                generarSonidoAutoFrenando(); 
                dibujarVelocidad();
            } else {
                if(simulador.entregarEstadoAccidente()){
                    throw new AccidenteException(mensajeAccidente);
                }
                throw new AccionesApagadoException(mensaje);
            }
        } catch (AccionesApagadoException e) {
            JOptionPane.showMessageDialog(null, mensaje);
        }catch (AccidenteException ae){
            JOptionPane.showMessageDialog(null, mensajeAccidente);
        }
        
        if(simulador.sobrePasarVelocidadLlantas())
            verificadorVelocidad = 1;
        
    }//GEN-LAST:event_btnFrenoMousePressed

    public void frenarMinimo() {
        String mensaje = "El vehículo ya está detenido no se puede frenar más.";
        try {
            if(simulador.validarFrenarDetenido()) {
                throw new FrenadoDetenidoException(mensaje);
            }
        } catch (FrenadoDetenidoException e) {
            JOptionPane.showMessageDialog(null, mensaje);
            
        }
    }
    
    private void btnFrenoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFrenoMouseReleased
        milisegs2 = (System.currentTimeMillis()/1000) - milisegs;
        frenarMinimo();
        simulador.frenarVehiculo(milisegs2);
        patinar();
        dibujarVelocidad();
        audioCarroFreno.stop();
        System.out.println("Me presionaron : "+milisegs2+" segundos");
        String mensaje = "El vehículo ha patinado, has frenado bruscamente y tus llantas no soportan tanta tension.";
        try{
            if(verificadorVelocidad == 1){
                dibujarVelocidad();
                audioCarroFreno.stop();
                throw new PatinarException(mensaje);
            } 
        }catch (PatinarException pe){
            JOptionPane.showMessageDialog(null, mensaje);
            verificadorVelocidad = 2;
        }
    }//GEN-LAST:event_btnFrenoMouseReleased

    private void btnFrenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFrenoMouseClicked

    }//GEN-LAST:event_btnFrenoMouseClicked

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        String mensaje = "El carro ya está apagado";
        String mensajeAccidente = "Te haz accidentado!!!! Haz pagado el vehìculo a una velocidad no permitida, se te apagará el vehículo.";
        String mensajePatinar = "El vehículo esta patinando, por favor frena para poder detener el vehículo.";
        
        try {
            if(verificadorVelocidad == 2) {
                throw new PatinarException(mensajePatinar);
            }
            if(!simulador.desactivarApagarApagado()) {
                throw new ApagarDeNuevoException(mensaje);
            }
            if(!simulador.frenarAltaVelocidad()) {
                apagarVehiculo();
            } else {
                if(simulador.entregarEstadoAccidente()){
                    iniciarAccidente();
                    throw new AccidenteException(mensajeAccidente);
                }
            }
        } catch (ApagarDeNuevoException e) {
            JOptionPane.showMessageDialog(null, mensaje);
        } catch (AccidenteException ex) {
            JOptionPane.showMessageDialog(null, mensajeAccidente);   
        } catch (PatinarException pe) {
            JOptionPane.showMessageDialog(null, mensajePatinar);
            audioCarroAcelerando.stop();
        }
    }//GEN-LAST:event_btnApagarActionPerformed

    public void apagarVehiculo() {
        audioCarroAndando.stop();
        simulador.apagarVehiculo();
        dibujarVelocidad();
    }
    
    private void btnEncenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncenderActionPerformed
        String mensaje = "El vehículo ya está encendido y listo para funcionar.";
        String mensajeAccidente = "El vehículo está accidentadom, no puedes utilizarlo hasta que lo repares";
        try {
            if(simulador.entregarEstadoAccidente()){
                throw new AccidenteException(mensajeAccidente);
            }else{
                if(!simulador.desactivarEncenderEncendido()) {
                    generarSonidoAutoPrendiendo();
                    generarSonidoAutoMarcha();
                    simulador.prenderVehiculo();
                    dibujarVelocidad();
                } else {
                    throw new EncenderDeNuevoException(mensaje);
                }
            }
        } catch (EncenderDeNuevoException e) {
            JOptionPane.showMessageDialog(null, mensaje);
        } catch (AccidenteException ae){
            JOptionPane.showMessageDialog(null, mensajeAccidente);
        }
    }//GEN-LAST:event_btnEncenderActionPerformed

    private void btnAcelerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcelerarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAcelerarActionPerformed

    private void btnRepararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepararActionPerformed
        reparar();
    }//GEN-LAST:event_btnRepararActionPerformed
    
    public void patinar() {
        if(simulador.detenerPatinado())
            verificadorVelocidad = 0;
    }
    
    public void activarReparacion(){
        if(simulador.entregarEstadoAccidente()){
            btnReparar.setVisible(true);
        }
    }
    
    public void reparar(){
        desactivarVidrios();
        simulador.cambiarEstadoAccidentado();
    }
    
    public void dibujarVelocidad(){
        float velocidad = simulador.extraerVelocidad();
        lblVelocidad.setText(Float.toString(velocidad));
    }
    private AudioClip audioCarroAndando;
    /**
     * Se genera el sonido del auto en su marcha normal.
     */
    public void generarSonidoAutoMarcha() {
        audioCarroAndando = java.applet.Applet.newAudioClip(getClass().getResource("/Audios/autoEnMarcha.wav"));
        audioCarroAndando.loop();
    }
    
    private AudioClip audioCarroAcelerando;
    /**
     * Se genera el sonido del auto acelerando.
     */
    public void generarSonidoAutoAcelerando() {
        audioCarroAcelerando = java.applet.Applet.newAudioClip(getClass().getResource("/Audios/autoAceleracion.wav"));
        audioCarroAcelerando.loop();
    }
    
    private AudioClip audioCarroPrendiendo;
    /**
     * Se genera el sonido del auto prendiendo.
     */
    public void generarSonidoAutoPrendiendo() {
        audioCarroPrendiendo = java.applet.Applet.newAudioClip(getClass().getResource("/Audios/autoPrendiendo.wav"));
        audioCarroPrendiendo.play();
    }
    
    private AudioClip audioCarroAccidente;
    /**
     * Se genera el sonido del auto prendiendo.
     */
    public void generarSonidoAutoChoque() {
        audioCarroPrendiendo = java.applet.Applet.newAudioClip(getClass().getResource("/Audios/choque.wav"));
        audioCarroPrendiendo.play();
    }
    
     private AudioClip audioCarroFreno;
    /**
     * Se genera el sonido del auto prendiendo.
     */
    public void generarSonidoAutoFrenando() {
        audioCarroFreno = java.applet.Applet.newAudioClip(getClass().getResource("/Audios/autoFreno.wav"));
        audioCarroFreno.loop();
    }
    
    public void iniciarAccidente(){
        apagarVehiculo();
        generarSonidoAutoChoque();
        activarVidrio();
        activarReparacion();
        //desactivarAccionesVehiculo();
    }
    
    public void activarVidrio(){
        lblVidrio.setVisible(true);
        lblVidrioLateral.setVisible(true);
    }
    public void desactivarVidrios(){
        lblVidrio.setVisible(false);
        lblVidrioLateral.setVisible(false);
        btnReparar.setVisible(false);
    }
    public void iniciarVidriosInvisibles(){
        btnReparar.setVisible(false);
        lblVidrio.setVisible(false);
        lblVidrioLateral.setVisible(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcelerar;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnEncender;
    private javax.swing.JButton btnFreno;
    private javax.swing.JButton btnReparar;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblVelocidad;
    private javax.swing.JLabel lblVidrio;
    private javax.swing.JLabel lblVidrioLateral;
    // End of variables declaration//GEN-END:variables
}
