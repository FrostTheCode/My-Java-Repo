package eventos_multiples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Multy_oyente {


	public static void main(String[] args) {
		frame f=new frame();
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.setVisible(true);
	}

}
class frame extends JFrame{
	public frame() {
		setTitle("prueva de varios oyentes");
		setBounds(10,10,700,450);
		pan p=new pan();
		add(p);
		
	}
}
class pan extends JPanel{
	public pan() {
		JButton b1=new JButton("nuevo");
		add(b1);
		JButton b2=new JButton("cerrar todo");
		add(b2);
		
		Oyeniu oy1=new Oyeniu();
		b1.addActionListener(oy1);
	}
	private class Oyeniu implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			frame_eme eme=new frame_eme(b2);
			eme.setVisible(true);
			
		}
		
	}
	JButton b2;
}

class frame_eme extends JFrame{
	public frame_eme(JButton Bp) {
		con++;
		setTitle("marco emergente" + con);
		setBounds(40*con,40*con,300,150);
		
		CierraTodo oyC=new CierraTodo();
		Bp.addActionListener(oyC);
		
	}
	private class CierraTodo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			
		}
		
	}
	private static int con=0;
}