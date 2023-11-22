package eventos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;
import java.awt.*;

public class eFoco {

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
		setLayout(null);
		
		c1=new JTextField();
		c2=new JTextField();
		
		c1.setBounds(120,10,150,20);
		c2.setBounds(120,50,150,20);
		
		add(c1);
		add(c2);
		
		lanzafoco fo=new lanzafoco();
		c1.addFocusListener(fo);
	}
	JTextField c1;
	JTextField c2;
	private class lanzafoco implements FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			
			
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			String email=c1.getText();
			boolean comp=false;
			
			for(int i=0;i<email.length();i++) {
				if(email.charAt(i)=='@') {
					comp=true;
				}
			}
			if (comp==true) {
				System.out.println("correcto");
			}else {
				System.out.println("incorrecto");
			}
			
		}
		
	}
}

