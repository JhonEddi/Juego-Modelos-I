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

public class Fabrica {
    private Minero minero;
    private Leñador leñador;
    private Cazador cazador;
    
    public Fabrica(){
        minero = new Minero();
        minero.setDuracion(8);
        minero.setPreciocarne(200);
        minero.setPreciomadera(100);
        minero.setPreciometal(150);
        
        leñador = new Leñador();
        leñador.setDuracion(5);
        leñador.setPreciocarne(200);
        leñador.setPreciomadera(50);
        leñador.setPreciometal(150);
        
        cazador = new Cazador();
        cazador.setDuracion(10);
        cazador.setPreciocarne(300);
        cazador.setPreciomadera(100);
        cazador.setPreciometal(150);
    }
    
    public Personaje devolver(int des){
        switch(des){
            case 1:
                return (Personaje) minero.clone();
            case 2:
                return (Personaje) cazador.clone();
            case 3:
                return (Personaje) leñador.clone();   
        }
        return null;
    }
}
