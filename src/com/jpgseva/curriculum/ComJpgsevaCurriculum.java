/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpgseva.curriculum;

import com.jpgseva.curriculum.interfaz.VentanaLoad;
import com.jpgseva.curriculum.interfaz.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 * Clase iniciadora de la app
 * @author Jorge
 */
public class ComJpgsevaCurriculum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
             for (javax.swing.UIManager.LookAndFeelInfo info :  javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equalsIgnoreCase(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
             }
         }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        VentanaLoad load = new VentanaLoad(); 
        load.setVisible(true);
        VentanaPrincipal vp = new VentanaPrincipal();
        vp.setVisible(true);
        Timer timer = new Timer(1500, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                load.setVisible(false);
                load.dispose();
            }
        });
        timer.start();
    }
    
}
