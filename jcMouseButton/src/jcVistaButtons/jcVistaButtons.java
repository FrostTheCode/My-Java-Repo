package jcVistaButtons;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class jcVistaButtons extends javax.swing.JLabel implements MouseListener {
 public jcVistaButtons(){
 super();
 //se le da un tama�o 
 this.setPreferredSize(new Dimension(260,60));
 //se le coloca una imagen
 this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/B1.png"))); 
 //se cambia de cursor default por otro, el de la "manito"
 this.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
 //se a�ade los eventos del mouse
 this.addMouseListener(this); 
 }
 public void mouseClicked(MouseEvent e) { 
 
 }
 public void mousePressed(MouseEvent e) {
 this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/b3.png"))); 
 }
 public void mouseReleased(MouseEvent e) {
 this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/b2.png"))); 
 }
 public void mouseEntered(MouseEvent e) {
 this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/b2.png"))); 
 }
 public void mouseExited(MouseEvent e) {
 this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/B1.png"))); 
 } 
}