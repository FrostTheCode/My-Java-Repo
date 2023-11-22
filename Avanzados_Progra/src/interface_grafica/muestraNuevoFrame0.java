package interface_grafica;

import javax.swing.*;

public class muestraNuevoFrame0 {

	public static void main(String[] args) {
		frame f=new frame();
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class frame extends JFrame{
	public frame() {
		setVisible(true);
		setBounds(10,10,700,450);
	}
}
