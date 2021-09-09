
package grafica.lineas;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ariana
 */
public class GraficaLineas extends JPanel {
@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        
        g.setColor(Color.RED);     //g.setColor se utiliza para el color de la linea
        g.drawLine(60, 60, 650, 60); // una línea desde la coordenada (60,60)
        //es decir columna 60 y fila 60 en píxeles, hasta la coordenada (650,60)
        g.setColor(Color.BLUE);
        g.drawLine(60, 60, 60, 400);
        g.setColor(Color.RED);
        g.drawLine(60, 400, 650, 400);        
        g.setColor(Color.BLUE);
        g.drawLine(650, 60, 650, 400);
        
        //procedemos con el mismo procedimiento con todas las demas lineas
        g.setColor(Color.black);
        g.drawLine(80, 80, 630, 80);
        g.setColor(Color.GREEN);
        g.drawLine(80, 80, 80, 380);
        g.setColor(Color.black);
        g.drawLine(80, 380, 630, 380);     
        g.setColor(Color.GREEN);
        g.drawLine(630, 80, 630, 380);
        
        
        g.setColor(Color.RED);
        g.drawLine(100, 100, 610, 100);        
        g.setColor(Color.BLUE);
        g.drawLine(100, 100, 100, 360);
        g.setColor(Color.RED);
        g.drawLine(100, 360, 610, 360);        
        g.setColor(Color.BLUE);
        g.drawLine(610, 100, 610, 360);
        
        
        g.setColor(Color.black);
        g.drawLine(120, 120, 590, 120);      
        g.setColor(Color.GREEN);
        g.drawLine(120, 120, 120, 340);
        g.setColor(Color.black);
        g.drawLine(120, 340, 590, 340);        
        g.setColor(Color.GREEN);
        g.drawLine(590, 120, 590, 340);
        
        
        g.setColor(Color.RED);
        g.drawLine(140, 140, 570, 140);        
        g.setColor(Color.BLUE);
        g.drawLine(140, 140, 140, 320);
        g.setColor(Color.RED);
        g.drawLine(140, 320, 570, 320);        
        g.setColor(Color.BLUE);
        g.drawLine(570, 140, 570, 320);
        
        
        g.setColor(Color.black);
        g.drawLine(160, 160, 550, 160);       
        g.setColor(Color.GREEN);
        g.drawLine(160, 160, 160, 300);
        g.setColor(Color.black);
        g.drawLine(160, 300, 550, 300);        
        g.setColor(Color.GREEN);
        g.drawLine(550, 160, 550, 300);
        
        
        g.setColor(Color.RED);
        g.drawLine(180, 180, 530, 180);        
        g.setColor(Color.BLUE);
        g.drawLine(180, 180, 180, 280);
        g.setColor(Color.RED);
        g.drawLine(180, 280, 530, 280);        
        g.setColor(Color.BLUE);
        g.drawLine(530, 180, 530, 280);
        
        
        g.setColor(Color.black);
        g.drawLine(200, 200, 510, 200);       
        g.setColor(Color.GREEN);
        g.drawLine(200, 200, 200, 260);
        g.setColor(Color.black);
        g.drawLine(200, 260, 510, 260);        
        g.setColor(Color.GREEN);
        g.drawLine(510, 200, 510, 260);
        
        
        g.setColor(Color.RED);
        g.drawLine(220, 220, 490, 220);       
        g.setColor(Color.BLUE);
        g.drawLine(220, 220, 220, 240);
        g.setColor(Color.RED);
        g.drawLine(220, 240, 490, 240);       
        g.setColor(Color.BLUE);
        g.drawLine(490, 220, 490, 240);           
    }
    public static void main(String []args){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame ventana = new JFrame ("____LINEAS___"); 
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //se utiliza para que cuando se cierre la ventana
        //tambien se cierre la aplicacion
        ventana.setBackground(Color.WHITE);
        ventana.setSize(700, 450); // Las coordenadas de lo lago y ancho de la ventana
        GraficaLineas panel= new GraficaLineas(); //se crea el objeto Grafica llamado panel
        ventana.add(panel); //el panel anterior lo agregamos a la ventana
        ventana.setVisible(true);
    
    }
    
    
}
