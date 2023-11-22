package caja_de_texto;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class prueba_eventos {

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
	public panel() {
		
	}
}
