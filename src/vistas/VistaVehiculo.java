/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Elementos.Simulador;
import Elementos.Vehiculo;
import java.applet.AudioClip;

/**
 *
 * @author ASUS
 */
public class VistaVehiculo extends javax.swing.JFrame {
    private long milisegs;
    private long milisegs2;
    private Simulador simulador;
    
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
        getContentPane().add(btnAcelerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 710, 90, 140));

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
        getContentPane().add(btnFreno, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 740, 80, 110));

        btnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/On_Off.png"))); // NOI18N
        btnApagar.setBorderPainted(false);
        btnApagar.setContentAreaFilled(false);
        btnApagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });
        getContentPane().add(btnApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 520, 60, 50));

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

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VehiculoF.jpg"))); // NOI18N
        fondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcelerarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcelerarMousePressed
        //milisegs = (System.currentTimeMillis())/1000;
        milisegs = (System.currentTimeMillis())/2000;
        generarSonidoAutoAcelerando();
        
    }//GEN-LAST:event_btnAcelerarMousePressed

    private void btnAcelerarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcelerarMouseReleased
        milisegs2 = (System.currentTimeMillis()/1000) - milisegs;
        simulador.acelerarVehiculo(milisegs2);
        dibujarVelocidad();
        audioCarroAcelerando.stop();
        System.out.println("Me presionaron : "+milisegs2+" segundos");
    }//GEN-LAST:event_btnAcelerarMouseReleased

    private void btnFrenoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFrenoMousePressed
        milisegs = (System.currentTimeMillis())/1000;
        generarSonidoAutoFrenando(); 
        dibujarVelocidad();
    }//GEN-LAST:event_btnFrenoMousePressed

    private void btnFrenoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFrenoMouseReleased
        milisegs2 = (System.currentTimeMillis()/1000) - milisegs;
        simulador.frenarVehiculo(milisegs2);
        dibujarVelocidad();
        audioCarroFreno.stop();
        System.out.println("Me presionaron : "+milisegs2+" segundos");
    }//GEN-LAST:event_btnFrenoMouseReleased

    private void btnFrenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFrenoMouseClicked

    }//GEN-LAST:event_btnFrenoMouseClicked

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        audioCarroAndando.stop();
        simulador.apagarVehiculo();
        dibujarVelocidad();
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnEncenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncenderActionPerformed
        generarSonidoAutoPrendiendo();
        generarSonidoAutoMarcha();
        simulador.prenderVehiculo();
        dibujarVelocidad();
    }//GEN-LAST:event_btnEncenderActionPerformed

    private void btnAcelerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcelerarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAcelerarActionPerformed
    
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
     private AudioClip audioCarroFreno;
    /**
     * Se genera el sonido del auto prendiendo.
     */
    public void generarSonidoAutoFrenando() {
        audioCarroFreno = java.applet.Applet.newAudioClip(getClass().getResource("/Audios/autoFreno.wav"));
        audioCarroFreno.loop();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcelerar;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnEncender;
    private javax.swing.JButton btnFreno;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblVelocidad;
    // End of variables declaration//GEN-END:variables
}
