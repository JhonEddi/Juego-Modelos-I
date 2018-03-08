/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author Juancho
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nuevapartida();
    }

    private static void nuevapartida() {
        VentanaPrincipal v = new VentanaPrincipal();
        v.setBounds(0, 0,546, 251);
        v.setVisible(true);
    }
    
    
}
