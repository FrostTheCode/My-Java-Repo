package Jspinerss;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;

import javax.swing.*;
public class spn {

	public static void main(String[] args) {
		marco m=new marco();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class marco extends JFrame{
	public marco() {
		setTitle("spn");
		setBounds(500,300,500,300);
		panel p=new panel();
		add(p);
		setVisible(true);
		
	}
}
class panel extends JPanel{
	public panel() {
		//String lista[]= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		JSpinner spn=new JSpinner(new SpinnerNumberModel(5,0,10,1) {
			public Object getNextValue() {
				return super.getPreviousValue();
			}
			public Object getPreviousValue() {
				return super.getNextValue();
			}	
		});

		Dimension d=new Dimension(100,20);
		spn.setPreferredSize(d);
		add(spn);
	}
	/*private class mysp extends SpinnerNumberModel{
		public mysp() {
			super(5,0,10,1);
		}
		public Object getNextValue() {
			return super.getPreviousValue();
		}
		public Object getPreviousValue() {
			return super.getNextValue();
		}
	}*/
}