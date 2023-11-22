package Dibujo;

import javax.swing.JFrame;
public class grafico {
 public static void main(String[] args) {
 Dibujo lienzo = new Dibujo();
 JFrame ventana = new JFrame();
 ventana.add(lienzo);
 ventana.setSize(500,500);
 ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 ventana.setVisible(true);
 }
}