package ToolBar;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class pruebaAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marco m=new marco();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setVisible(true);
	}

}
class marco extends JFrame{
	public marco() {
		setTitle("Marco con Barra");
		setBounds(200,350,600,300);
		panel pa=new panel();
		add(pa);
		
		//configuracion de acciones
		
	}
}
class panel extends JPanel{
	public panel() {
		
	}
}
