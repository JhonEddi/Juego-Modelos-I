
package main;

import logica.caminante;
import presentacion.Modelo;


/**
 *
 * @author George
 */
public class juegoArdiente {

     private final Modelo miApp;

    public juegoArdiente() {
      miApp = new Modelo ();
       miApp.iniciar();
    }
     
    public static void main(String[] args) {
              new juegoArdiente();
              
    }
    
}
