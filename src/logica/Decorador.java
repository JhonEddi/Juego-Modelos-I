/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Juancho
 */
public class Decorador  implements personaje{
    
    private personaje Per;
    @Override
    public void cambiarImagen() {
        
    }
    public Decorador (personaje pe){
        SetPersona(pe);
    }
    
    public void SetPersona(personaje pe){
        this.Per = pe;
    }

    @Override
    public int getx() {
        return 0;
    }

    @Override
    public int gety() {
        return 0;
    }

   
    
}
