package interface_grafica2;

import java.awt.Frame;

import javax.swing.*;

public class Marco {

	public static void main(String[] args) {
		
		miMarco m1=new miMarco();
		m1.setVisible(true);
		m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}

}

class miMarco extends JFrame{
	public miMarco()
	{
		//setSize(500,300);este es para determinar el tamano del frame
		//setLocation(500,300);este es para determinar la posicion del frame
		setBounds(500,300,600,400);//este hace los anteriores
		//setResizable(true); este es para que el frame se pueda cambiar de tamano
		//setExtendedState(6);es para determinar el tamano total de la ventana sin numeros
		setTitle("la ventana prrona");
	}
	
}
