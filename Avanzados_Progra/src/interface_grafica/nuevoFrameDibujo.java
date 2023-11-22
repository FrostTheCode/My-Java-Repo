package interface_grafica;

import java.awt.Graphics;

import javax.swing.*;

public class nuevoFrameDibujo {

	public static void main(String[] args) {
		frame f=new frame();
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class frame extends JFrame{
	public frame() {
		setVisible(true);
		setBounds(10,10,700,450);
	
		add(new panel());
	}
}
class panel extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
}

