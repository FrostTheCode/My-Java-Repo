package layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class layout {

	public static void main(String[] args) {
		frame f=new frame();
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class frame extends JFrame{
	public frame() {
		setVisible(true);
		setBounds(10,10,700,450);
		panel p=new panel();
		panel_2 p2=new panel_2();
		//aqui da la disposicion de los botones en que parte de la pantalla se desean
		//FlowLayout dis=new FlowLayout(FlowLayout.RIGTH);
		//p.setLayout(dis);
		//p.setLayout(new FlowLayout(FlowLayout.CENTER,70,30));el primer numero da la separacion horizontal y el segundo en vertical 
		add(p,BorderLayout.NORTH);
		add(p2,BorderLayout.SOUTH);
	}
}
class panel extends JPanel{
	public panel() {
		//setLayout(new FlowLayout(FlowLayout.CENTER,30,50));
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JButton("amarillo"),BorderLayout.NORTH);
		add(new JButton("Rojo"));

	}
}
class panel_2 extends JPanel{
	public panel_2() {
		setLayout(new BorderLayout());
		add(new JButton("Azul"),BorderLayout.WEST);
		add(new JButton("Verde"),BorderLayout.EAST);
		add(new JButton("Negro"),BorderLayout.CENTER);
	}
}