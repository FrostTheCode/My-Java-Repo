package eventos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class eMouse {

	public static void main(String[] args) {
		evemo em=new evemo();
		em.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class evemo extends JFrame{
	public evemo () {
		setVisible(true);
		setBounds(100,100,600,450);
		
		mais m=new mais();
		addMouseMotionListener(m);
	}
}
class mais implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent arg0) {
		System.out.println("estas arrastrando el mouse");
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		System.out.println("estas moviendo el mouse");
		
	}
	
}


		//extends MouseAdapter{
	/*public void mouseClicked(MouseEvent e) {
		System.out.println("Coordenada X: "+e.getX());
		System.out.println("Coordenada Y: "+e.getY());
		
		System.out.println("Clicleos: "+e.getClickCount());
	}*/
	
	/*public void mousePressed(MouseEvent e) {
		System.out.println(e.getModifiersEx());
		if (e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK)
			System.out.println("has pulsado el boton izquierdo");
		else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK)
			System.out.println("has pulsado la rueda del raton");
		else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK)
			System.out.println("has pulsado el boton derecho");
	}*/


	/*implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent m) {
		System.out.println("has hecho click");
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("acabas de entrar");
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		System.out.println("acabas de salir");
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		System.out.println("acabas de presionar el mouse");
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		System.out.println("Acabas de levantar el mouse");
		
	}
	
}*/
