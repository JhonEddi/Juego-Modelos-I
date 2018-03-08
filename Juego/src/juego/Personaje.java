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
public abstract class Personaje  implements Clonable{
    
    private int duracion;
    private int preciomadera;
    private int preciometal;
    private int preciocarne;
    private boolean Disponible;

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getPreciomadera() {
        return preciomadera;
    }

    public void setPreciomadera(int preciomadera) {
        this.preciomadera = preciomadera;
    }

    public int getPreciometal() {
        return preciometal;
    }

    public void setPreciometal(int preciometal) {
        this.preciometal = preciometal;
    }

    public int getPreciocarne() {
        return preciocarne;
    }

    public void setPreciocarne(int preciocarne) {
        this.preciocarne = preciocarne;
    }
    
    @Override
    public  Personaje clone(){
        Personaje clon = null;
        try{
            clon = (Personaje) super.clone();
            clon.setDuracion(duracion);
            clon.setPreciocarne(preciocarne);
            clon.setPreciomadera(preciomadera);
            clon.setPreciometal(preciometal);
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } 
        return clon;
    }
    public void producir(){
        
    }
    
}
