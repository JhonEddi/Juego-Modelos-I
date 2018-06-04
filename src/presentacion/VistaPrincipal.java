
package presentacion;

import java.awt.Canvas;
import java.awt.ScrollPane;
import java.awt.Toolkit;


public class VistaPrincipal extends javax.swing.JFrame {

    private final Modelo modelo;
    private Controlador control;
    
    public VistaPrincipal(Modelo aThis) {
        modelo = aThis;
        initComponents();
        capturarEventos();
        barDesp.setPreferredSize(new java.awt.Dimension(900, 350));
        
    }
    public Modelo getModelo (){
    return modelo;
        }   

    public Controlador getControl() {
        if(control==null){
        control= new Controlador(this);
        }
        return control;
    }

    public Canvas getLienzo() {
        return lienzo;
    }

    public ScrollPane getBarDesp() {
        return barDesp;
    }
    
    
    
    

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barDesp = new java.awt.ScrollPane();
        barDesp.setSize(this.getWidth(),this.getHeight());
        lienzo = new java.awt.Canvas();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        barDesp.setMaximumSize(barDesp.getSize());
        barDesp.add(lienzo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barDesp, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barDesp, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        barDesp.setSize(Toolkit.getDefaultToolkit().getScreenSize());

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.ScrollPane barDesp;
    private java.awt.Canvas lienzo;
    // End of variables declaration//GEN-END:variables

private void capturarEventos (){

lienzo.addMouseListener(getControl());
}
    
}
