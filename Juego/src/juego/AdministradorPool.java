/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;
import juego.Fabrica;
/**
 *
 * @author Juancho
 */
public class AdministradorPool {
    private static AdministradorPool instancia;
    private Fabrica fabrica;
    private Jugador ju;
    /**
     *
     * @return
     */
  
    
    
    public AdministradorPool(Jugador ju){
        fabrica = new Fabrica();
        this.ju = ju;
    }

    public static AdministradorPool getInstancia(Jugador ju) {
        if(instancia==null ){
            instancia = new AdministradorPool(ju);
        }
        return instancia;
    }
    
   public Personaje retornar(int n){
       if ((ju.getCazador() + ju.getLeñador() + ju.getMinero()) <= 10) {
           return fabrica.devolver(n);
       }
       return null;
   }
   
}
