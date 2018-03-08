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
public class Jugador {
        
        private static Jugador instancia;
        private int madera;
        private int metal;
        private int carne;
        private int leñador;
        private int minero;
        private int cazador;

    public int getMadera() {
        return madera;
    }

    public void setMadera(int madera) {
        this.madera = madera;
    }

    public int getMetal() {
        return metal;
    }

    public void setMetal(int metal) {
        this.metal = metal;
    }

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public int getLeñador() {
        return leñador;
    }

    public void setLeñador(int leñador) {
        this.leñador = leñador;
    }

    public int getMinero() {
        return minero;
    }

    public void setMinero(int minero) {
        this.minero = minero;
    }

    public int getCazador() {
        return cazador;
    }

    public void setCazador(int cazador) {
        this.cazador = cazador;
    }
        
        
    public Jugador() {
        madera=200;
        metal=200;
        carne=500;
        leñador=0;
        minero=0;
        cazador=0;
    }
    public static Jugador getInstancia() {
        if (instancia == null) {
            instancia = new Jugador();
        }
        return instancia;
    }
    
    
}
