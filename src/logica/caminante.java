package logica;

import java.awt.Image;
import javax.swing.ImageIcon;
import presentacion.Modelo;

/**
 *
 * @author George
 */
public class caminante implements personaje {
    
    private DecoradorFuego df;
    private Modelo elModelo;
    private static int numero = 1;
    private Image imagen;
    private int posInX, posInY;
    private Objeto ob;

    public int getPosInY() {
        return posInY;
    }
    private int posMovX, posMovY;
    private int posFinX, posFinY;

    public caminante(int coorX, int coorY, Modelo modelo) {
        
        
        posInX = 25; // posicion inicial del caminante en el eje X
        posInY = 250;
        posMovY = 250;// posicion inicial del caminante en el eje Y
        System.out.println("AHuuu" + posInX);
        elModelo = modelo;
        imagen = new ImageIcon(this.getClass().getResource("/imagenes/personaje" + numero + ".png")).getImage();
        ob = elModelo.getob();
    }

    
    public void caminar() {

        posFinX = elModelo.getMiSistema().getPosX();
        posFinY = elModelo.getMiSistema().getPosY();

        if (posInX < posFinX || posInX > posFinX) { // condicion para avanzar a la posicion requerida          
            for (int i = posInX; i <= posFinX; i++) {
                posInX = i;
                posMovX = (posInX - 35);
                
                elModelo.esperar(6);
                elModelo.dibujar();
                this.cambiarImagen();
                i+=7;
                if(ob.getx()==this.getx()){
                    elModelo.setBandera(true);
                }
            }
        }

    }

    public int getPosFinX() {
        return posFinX;
    }

    @Override
    public void cambiarImagen() {

        numero++;
        if (numero == 9) {
            numero = 1;
        }
        imagen = new ImageIcon(this.getClass().getResource("/imagenes/personaje" + numero + ".png")).getImage();
    }

    public int getPosInX() {
        return posInX;
    }

    public Image getImagen() {
        return imagen;
    }

    public int getPosMovX() {
        return posMovX;
    }

    public int getPosMovY() {
        return posMovY;
    }

    @Override
    public int getx() {
         return getPosInX();
    }

    @Override
    public int gety() {
        return getPosInY();
    }

    

}
