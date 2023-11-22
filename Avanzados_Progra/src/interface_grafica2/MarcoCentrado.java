package interface_grafica2;

import java.awt.Toolkit;

import javax.swing.*;
import java.awt.*;

public class MarcoCentrado {

	public static void main(String[] args) {
		MarcoC m=new MarcoC();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setVisible(true);

	}

}
class MarcoC extends JFrame
{
	public MarcoC()
	{
		Toolkit pan=Toolkit.getDefaultToolkit();
		Dimension tap=pan.getScreenSize();
		
		int ap=tap.width;
		int hp=tap.height;
		
		setSize(ap/2,hp/2);
		setLocation(ap/4,hp/4);
		setTitle("ventana de prueba");
		Image i=pan.getImage("src/imagenes_JFrame/prussia.jpg");
		setIconImage(i);
	}
}
