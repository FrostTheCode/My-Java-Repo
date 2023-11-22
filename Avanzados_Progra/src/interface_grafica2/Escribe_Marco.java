package interface_grafica2;

import javax.swing.*;
import java.awt.*;

public class Escribe_Marco {

	public static void main(String[] args) {
		TextoM ma=new TextoM();
		ma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class TextoM extends JFrame{
	public TextoM()
	{
		setVisible(true);
		setSize(600,450);
		setLocation(400,200);
		setTitle("primer TxT");
		lamina l=new lamina();
		add(l);
		
	}
}
class lamina extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawString("toma con pasiencia", 100, 100);
	}
}
