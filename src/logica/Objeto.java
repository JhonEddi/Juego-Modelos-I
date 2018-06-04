/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.Image;
import javax.swing.ImageIcon;
import presentacion.Modelo;
import logica.personaje;

/**
 *
 * @author Juancho
 */
public class Objeto implements personaje{
    private Modelo elModelo;
    private static int numero = 1;
    private Image imagen;
    private int posInX, posInY;

    public int getPosInX() {
        return posInX;
    }

    public int getPosInY() {
        return posInY;
    }
    
    public Objeto( Modelo modelo){
        posInX = 500; // posicion inicial del caminante en el eje X
        posInY = 250;
        System.out.println("AHuuu" + posInX);
        elModelo = modelo;
        imagen = new ImageIcon(this.getClass().getResource("/imagenes/chile" + numero + ".png")).getImage();
    }
    
    @Override
    public void cambiarImagen() {

        numero++;
        if (numero == 3) {
            numero = 1;
        }
        imagen = new ImageIcon(this.getClass().getResource("/imagenes/chile" + numero + ".png")).getImage();
    }
    public Image getImagen() {
        return imagen;
    }

    @Override
    public int getx() {
        return getPosInX();
    }

    @Override
    public int gety() {
        return getPosInY();
    }

    public Objeto returnobj(){
        return this;
    }
}
