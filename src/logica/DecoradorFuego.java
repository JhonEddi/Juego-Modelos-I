/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import javax.swing.ImageIcon;
import java.awt.Image;


/**
 *
 * @author Juancho
 */
public class DecoradorFuego extends Decorador{
    Image imagen;
    int numero;
    public DecoradorFuego(personaje pe) {
        super(pe);
        imagen = new ImageIcon(this.getClass().getResource("/imagenes/00" + numero + ".png")).getImage();
    }
    
    public Image getImagen() {
        return imagen;
    }
    public void cambiarImagen() {

        numero++;
        if (numero == 9) {
            numero = 1;
        }
        imagen = new ImageIcon(this.getClass().getResource("/imagenes/personaje" + numero + ".png")).getImage();
    }
    
}
