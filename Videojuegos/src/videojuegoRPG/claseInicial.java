package videojuegoRPG;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class claseInicial {

	public static void main(String[] args) {
		marco m = new marco();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class marco extends JFrame{
	public marco() {
		setBounds(500,500,500,300);
		setTitle("la gran aventura");
		hoja h = new hoja();
		add(h);
	}
} 
class hoja extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawString("toma con pasiencia", 100, 100);
	}
}