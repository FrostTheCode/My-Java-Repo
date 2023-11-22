package eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.*;

public class focoVen extends JFrame implements WindowFocusListener{

	public static void main(String[] args) {
		focoVen miv=new focoVen();
		miv.iniciar();
		
	}
	public void iniciar() {
		
		m1=new focoVen();
		m2=new focoVen();
		m1.setVisible(true);
		m2.setVisible(true);
		m1.setBounds(100,100,600,350);
		m2.setBounds(700, 100, 600, 350);
		m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m1.addWindowFocusListener(this);
		m2.addWindowFocusListener(this);
	}
		
	@Override
	public void windowGainedFocus(WindowEvent e) {
		if(e.getSource()==m1) {
			m1.setTitle("tengo el foco");
		}else {
			m2.setTitle("tengo el foco");
		}
		
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		if(e.getSource()==m1) {
			m1.setTitle("");
		}else {
			m2.setTitle("");
		}
		
	}
	
	focoVen m1;
	focoVen m2;

}
