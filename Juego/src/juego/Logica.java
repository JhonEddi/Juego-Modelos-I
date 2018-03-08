/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package juego;
/**
 *
 * @author Estudiantes
 */
import javax.swing.JOptionPane;
import juego.AdministradorPool;

public class Logica {
    AdministradorPool admin;
    Jugador ju;

    public Logica(Jugador ju) {
        admin =  AdministradorPool.getInstancia(ju);
        this.ju = ju;
    }
     
    public void crearAldeano(int i){
        Personaje personaje = new Personaje() {};
        personaje = admin.retornar(i);
        
        if((ju.getCarne()-personaje.getPreciocarne()) > 0 && (ju.getMadera() - personaje.getPreciomadera()) > 0 && (ju.getMetal() - personaje.getPreciometal()) > 0 ){
            ju.setCarne(ju.getCarne()-personaje.getPreciocarne());
            ju.setMadera(ju.getMadera() - personaje.getPreciomadera());
            ju.setMetal(ju.getMetal() - personaje.getPreciometal());
            if (i==1) {
                ju.setLeñador(ju.getLeñador()+1);
            }
            if (i==2) {
                ju.setMinero(ju.getMinero()+1);
            }
            if (i==3) {
                ju.setCazador(ju.getCazador()+1);
            }
            
        }else{
            //JOptionPane.showInputDialog("No cuenta con los recursos necesarios");
        }
    }
}
