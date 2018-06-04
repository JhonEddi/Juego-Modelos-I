
package presentacion;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;




/**
 *
 * @author USER
 */
public class Controlador implements  MouseListener{

    private final VistaPrincipal ventana;

    public Controlador(VistaPrincipal aThis) {
        ventana = aThis;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        int x, y;
        x = e.getX();
        y = e.getY();
        ventana.getModelo().enviarCoordenadas(x, y);
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }




    
}

    
