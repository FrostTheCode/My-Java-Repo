package hilos_prueba;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class hilos {
public static void main(String[] args) {
 JFrame marco=new Marco();
marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
marco.setVisible(true);
}
}
class PelHil implements Runnable{
	
	public PelHil(Pelota pe, Component com) {
		pelota=pe;
		component=com;
	}
	private Pelota pelota;
	private Component component;
	@Override
	public void run() {
		System.out.println("Estado de hilo al comenzar: "+ Thread.currentThread().isInterrupted());
		//for (int i=1; i<=5000; i++){
		//while(!Thread.interrupted());{
		  while (!Thread.currentThread().isInterrupted()) {
			pelota.mueve_pelota(component.getBounds());
			//System.out.println(i+"=,x="+pelota.getShape().getX()+",y="+pelota.getShape().getY());
			component.paint(component.getGraphics());

				/*try {
				 Thread.sleep(4);
				}catch(InterruptedException e) {
					//e.printStackTrace();
					//System.out.println("Hilo Bloqueado. Imposible su Interrupcion");
					System.exit(0);
				}*/
		
	}
		  System.out.println("Estado de hilo al Terminar: "+ Thread.currentThread().isInterrupted());
}
//Movimiento de la pelota-----------------------------------------------------------------------------------------
class Pelota{
//Atributos de la pelota
private static final int TAMX=15; //ancho de la pelota
private static final int TAMY=15; //alto de la pelota
private double x=0; //coordenada x inicial
private double y=0; //coordenada y inicial
private double dx=1; //incremento de la posicion en x
private double dy=1;//incremento de la posicion en y
// Mueve la pelota invirtiendo posición si choca con límites
public void mueve_pelota(Rectangle2D limites){
x+=dx;
y+=dy;
if(x<limites.getMinX()){
x=limites.getMinX();
dx=-dx;
}
if(x + TAMX>=limites.getMaxX()){
x=limites.getMaxX() - TAMX;
dx=-dx;
}
if(y<limites.getMinY()){
y=limites.getMinY();
dy=-dy;
}
if(y + TAMY>=limites.getMaxY()){
y=limites.getMaxY()-TAMY;
dy=-dy;
}
}
//Forma de la pelota en su posición inicial
public Ellipse2D getShape(){
return new Ellipse2D.Double(x,y,TAMX,TAMY);
}
}
// Lámina que dibuja las pelotas----------------------------------------------------------------------
class LaminaPelota extends JPanel{
//Arreglo de pelotas
private ArrayList<Pelota> pelotas=new ArrayList<Pelota>();//Inicialmente solo se añade una pelota
//Añadimos pelota a la lámina
public void add(Pelota b){
pelotas.add(b);
}
public void paintComponent(Graphics g){
super.paintComponent(g);
Graphics2D g2=(Graphics2D)g;
for(Pelota b: pelotas){
g2.fill(b.getShape());
}
}
}
//Marco con lámina y botones------------------------------------------------------------------------------
class Marco extends JFrame{
//Atributos
private LaminaPelota lamina;
//Constructor
public Marco(){
setBounds(600,300,400,350);
setTitle ("Rebotes");
lamina=new LaminaPelota();
add(lamina, BorderLayout.CENTER);
JPanel laminaBotones=new JPanel();
ponerBoton(laminaBotones, "Dale!", new ActionListener(){
public void actionPerformed(ActionEvent evento)
{
try {
comienza_el_juego();
} catch (InterruptedException e) {
System.out.println("Error");
}
}
});
	ponerBoton(laminaBotones, "Salir", new ActionListener(){
		public void actionPerformed(ActionEvent evento){
			System.exit(0);
	}
});
	ponerBoton(laminaBotones, "Detener", new ActionListener(){
		public void actionPerformed(ActionEvent evento){
			detener();
		}
		});
add(laminaBotones, BorderLayout.SOUTH);
}
//Ponemos botones
public void ponerBoton(Container c, String titulo, ActionListener oyente){
JButton boton=new JButton(titulo);
c.add(boton);
boton.addActionListener(oyente);
}
//Añade pelota y la bota 5000 veces
	public void comienza_el_juego () throws InterruptedException{
		Pelota pelota=new Pelota();
		lamina.add(pelota);
	
		Runnable r=new PelHil(pelota, lamina);
		t=new Thread(r);
		 t.start();
}
	public void detener(){
		//t.stop();
		t.interrupt();
	}
	Thread t;
}
}
