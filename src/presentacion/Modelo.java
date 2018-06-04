package presentacion;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import logica.caminante;
import logica.sistema;
import logica.Objeto;

/**
 *
 * @author George
 */
public class Modelo implements Runnable {

    private caminante elCaminante;
    private Objeto ob;
    private sistema miSistema;
    private Canvas lienzo;
    private int anchura;
    private Thread hiloDibujo;
    private BufferedImage dobleImagen;
    private boolean bandera;

    public boolean isBandera() {
        return bandera;
    }

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }
    private VistaPrincipal ventanaPrincipal;

    public Modelo() {
        hiloDibujo = new Thread(this);
        ob = new Objeto(this);
        elCaminante = new caminante(256, 256, this);
        bandera=false;
        anchura = 2000;
        lienzo = getVentanaPrincipal().getLienzo();
        lienzo.setSize(anchura, getVentanaPrincipal().getLienzo().getHeight());
        dobleImagen = new BufferedImage(anchura, getVentanaPrincipal().getLienzo().getHeight(), BufferedImage.TYPE_INT_ARGB);

    }

    public void iniciar() {

        empezarVentana();
        hiloDibujo.start();
        

    }

    @Override
    public void run() {

        while (getMiSistema().isEstaDibujando()) {
           
            dibujar();
            elCaminante.caminar();
            elCaminante.cambiarImagen();
            ob.cambiarImagen();
            try {
                Thread.sleep(100);

            } catch (InterruptedException ex) {
                Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
    public void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 10);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public void dibujar() {

        int x = getMiSistema().getPosX();
        int y = getMiSistema().getPosY();
        String mensaje;
        Graphics Fondo = lienzo.getGraphics();
        Graphics SegundoFondo = dobleImagen.getGraphics();

        Color colorTablero = new Color(144, 199, 249);
        SegundoFondo.setColor(colorTablero);
        SegundoFondo.fillRect(0, 0, lienzo.getWidth(), lienzo.getHeight());
        Image imagen;
        imagen = new ImageIcon(this.getClass().getResource("/imagenes/fondo.png")).getImage();

        
        SegundoFondo.drawImage(imagen, 0, 86, lienzo);

        SegundoFondo.setColor(Color.BLACK);
        mensaje = "X: " + x + ", Y: " + y;
        SegundoFondo.drawString(mensaje, 10, 30);

        //------------------------------------------------------------------------------------------
        int posicionInicialX = elCaminante.getPosInX();
        int posicionFinalX = elCaminante.getPosFinX();
        Image imagenPersonaje = elCaminante.getImagen();
        Image imagenchile = ob.getImagen();

        int posicionMovimiento  = elCaminante.getPosMovX();
         System.out.println("Esta es "+posicionFinalX+ " y "+ posicionInicialX);
        
        SegundoFondo.drawImage(imagenPersonaje, posicionMovimiento, elCaminante.getPosMovY(), lienzo);
        SegundoFondo.drawImage(imagenchile, ob.getPosInX(), ob.getPosInY(), lienzo);
        
        if(bandera){
            SegundoFondo.drawImage(imagenPersonaje, posicionMovimiento, elCaminante.getPosMovY(), lienzo);
        }
        Fondo.drawImage(dobleImagen, 0, 0, lienzo);

    }

    public void enviarCoordenadas(int x, int y) {
        getMiSistema().setPosX(x);
        getMiSistema().setPosY(y);
    }

    public void empezarVentana() {

        getMiSistema().setEstaDibujando(true);
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        getVentanaPrincipal().setSize(900, 350);
        getVentanaPrincipal().setTitle("JuegoArdiente");// Coloca nombre a la ventana        
        getVentanaPrincipal().setDefaultCloseOperation(EXIT_ON_CLOSE);
        getVentanaPrincipal().setVisible(true);
    }

    public VistaPrincipal getVentanaPrincipal() {
        if (ventanaPrincipal == null) {
            ventanaPrincipal = new VistaPrincipal(this);
        }
        return ventanaPrincipal;
    }

    public sistema getMiSistema() { // Crear un metodo para usar la clase que dara el inicio de dibujo
        if (miSistema == null) {
            miSistema = new sistema();
        }
        return miSistema;
    }
    
    public Objeto getob(){
        return ob;
    }

}
