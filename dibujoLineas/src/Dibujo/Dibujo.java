package Dibujo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Dibujo extends JPanel {
 public void paintComponent (Graphics g){
 super.paintComponent(g);
 int ancho, alto;
 int x2,y2, x1, y1;
 ancho = getWidth();
 alto = getHeight();
 g.setColor(Color.GREEN);
 x1=0;
 for (y2=alto/2; y2>=5; y2-=10){
 g.drawLine(x1, alto/2, ancho/2, y2);
 x1+=20;
 }
 x1=100;
 for (y2=alto/2; y2>=5; y2-=10){
 g.drawLine(x1, alto/2, ancho/2, y2);
 x1+=20;
 }
 x2=0;
 for (y2=alto/2; y2>=5; y2-=10){
 g.drawLine(x1, alto/2, ancho/2, y2);
 x1+=20;
 }
 x2=100;
 for (y2=alto/2; y2>=5; y2-=10){
 g.drawLine(x1, alto/2, ancho/2, y2);
 x1+=20;
 }
 
 


 }
}