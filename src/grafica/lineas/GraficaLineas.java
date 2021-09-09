
package grafica.lineas;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
//las librerias que se usaron para la realizacion del programa
/**
 *
 * @author ariana
 */
public class GraficaLineas extends JPanel {
@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        
        g.setColor(Color.RED);     //g.setColor se utiliza para el color de la linea
        g.drawLine(2, 2, 1360, 2); // una línea desde la coordenada (60,60)
        //es decir columna 60 y fila 60 en píxeles, hasta la coordenada (650,60)
        g.setColor(Color.BLUE);
        g.drawLine(2, 2, 2, 740);
        g.setColor(Color.RED);
        g.drawLine(2, 740, 1360, 740);         
        g.setColor(Color.BLUE);
        g.drawLine(1360, 2, 1360, 740); 
        
       
        //procedemos con el mismo procedimiento con todas las demas lineas
        g.setColor(Color.black);
        g.drawLine(32, 32, 1330,32);
        g.setColor(Color.GREEN);
        g.drawLine(32, 32, 32, 710);
        g.setColor(Color.black);
        g.drawLine(32, 710, 1330, 710);     
        g.setColor(Color.GREEN);
        g.drawLine(1330, 32, 1330, 710);
        
        
        g.setColor(Color.RED);
        g.drawLine(62, 62, 1300, 62);        
        g.setColor(Color.BLUE);
        g.drawLine(62, 62, 62, 680);
        g.setColor(Color.RED);
        g.drawLine(62, 680, 1300, 680);        
        g.setColor(Color.BLUE);
        g.drawLine(1300,62, 1300, 680);
        
        
        g.setColor(Color.black);
        g.drawLine(92, 92, 1270, 92);      
        g.setColor(Color.GREEN);
        g.drawLine(92, 92, 92, 650);
        g.setColor(Color.black);
        g.drawLine(92, 650, 1270, 650);        
        g.setColor(Color.GREEN);
        g.drawLine(1270, 92, 1270, 650);
        
        
        g.setColor(Color.RED);
        g.drawLine(122, 122, 1240, 122);        
        g.setColor(Color.BLUE);
        g.drawLine(122, 122, 122, 620);
        g.setColor(Color.RED);
        g.drawLine(122, 620, 1240, 620);        
        g.setColor(Color.BLUE);
        g.drawLine(1240, 122, 1240, 620);
        
        
        g.setColor(Color.black);
        g.drawLine(152, 152, 1210, 152);       
        g.setColor(Color.GREEN);
        g.drawLine(152, 152, 152, 590);
        g.setColor(Color.black);
        g.drawLine(152, 590, 1210, 590);        
        g.setColor(Color.GREEN);
        g.drawLine(1210, 152, 1210, 590);
        
        
        g.setColor(Color.RED);
        g.drawLine(184, 184, 1178, 184);        
        g.setColor(Color.BLUE);
        g.drawLine(184, 184, 184, 558);
        g.setColor(Color.RED);
        g.drawLine(184, 558, 1178, 558);        
        g.setColor(Color.BLUE);
        g.drawLine(1178, 184, 1178, 558);
        
        
        g.setColor(Color.black);
        g.drawLine(218, 218, 1144, 218);       
        g.setColor(Color.GREEN);
        g.drawLine(218, 218, 218, 524);
        g.setColor(Color.black);
        g.drawLine(218, 524, 1144, 524);        
        g.setColor(Color.GREEN);
        g.drawLine(1144, 218, 1144, 524);
        
        
        g.setColor(Color.RED);
        g.drawLine(254, 254, 1108, 254);       
        g.setColor(Color.BLUE);
        g.drawLine(254, 254, 254, 488);
        g.setColor(Color.RED);
        g.drawLine(254, 488, 1108, 488);       
        g.setColor(Color.BLUE);
        g.drawLine(1108, 254, 1108, 488);

        g.setColor(Color.black);
        g.drawLine(292, 292, 1070, 292);       
        g.setColor(Color.GREEN);
        g.drawLine(292, 292, 292, 450);
        g.setColor(Color.black);
        g.drawLine(292, 450, 1070, 450);        
        g.setColor(Color.GREEN);
        g.drawLine(1070, 292, 1070, 450);
        
        g.setColor(Color.RED);
        g.drawLine(332, 332, 1030, 332);       
        g.setColor(Color.BLUE);
        g.drawLine(332, 332, 332, 410);
        g.setColor(Color.RED);
        g.drawLine(332, 410, 1030, 410);       
        g.setColor(Color.BLUE);
        g.drawLine(1030, 332, 1030, 410);
    }
    public static void main(String []args){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame ventana = new JFrame ("____LINEAS___"); 
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //se utiliza para que cuando se cierre la ventana
        //tambien se cierre la aplicacion
        ventana.setBackground(Color.WHITE);
        ventana.setSize(900, 900); // Las coordenadas de lo lago y ancho de la ventana
        GraficaLineas panel= new GraficaLineas(); //se crea el objeto Grafica llamado panel
        ventana.add(panel); //el panel anterior lo agregamos a la ventana
        ventana.setVisible(true);
    }
    
    
}
