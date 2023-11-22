package Varios_Eventos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana {

	public static void main(String[] args) {
		venta v=new venta();
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venta v2=new venta();
		v2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		v.setTitle("ventana");
		v2.setTitle("ventana pero cool");
		v.setBounds(100,100, 500, 350);
		v2.setBounds(700,100,500,350);
		
	}

}
class venta extends JFrame{
	public venta() {
		//setTitle("ventana prrona");
		//setBounds(100,100,700,300);
		setVisible(true);
		
		/*MVentana mv=new MVentana();
		addWindowListener(mv);*/
		//addWindowListener(new MVentana());
		Cestado ce=new Cestado();
		addWindowStateListener(ce);
	}
	
}
class Cestado implements WindowStateListener{
	public void windowStateChanged(WindowEvent e)
	{
		//System.out.println("La ventana ha cambiado de estado");
		//System.out.println(e.getNewState());
		if(e.getNewState()==Frame.MAXIMIZED_BOTH)
			System.out.println("la ventana esta a pantalla completa");
		else if(e.getNewState()==Frame.NORMAL)
			System.out.println("la ventana esta en forma normal");
		else if(e.getNewState()==Frame.ICONIFIED)
			System.out.println("la ventana esta minimizada");
	}
}

/*class MVentana extends WindowAdapter{
	public void windowActivated(WindowEvent e) {
		System.out.println("Ventana activada");
	}
	public void windowClosed(WindowEvent e) {
		System.out.println("la ventana ha sido cerrada");
	}
	public void windowClosing(WindowEvent e) {
		System.out.println("ventana cerrada");
	}
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Ventana desactivada");
	}
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana minimizada");
	}	
	public void windowOpened(WindowEvent e) {
		System.out.println("ventana abierta");
	}
	public void windowDeiconified(WindowEvent e) {
		System.out.println("ventana restaurada");
	}
	
}*/