package JTEXT;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class ejemploJT {

	public static void main(String[] args) {
		marco m=new marco();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class marco extends JFrame{
	public marco() {
		
		setBounds(50,50,650,300);
		panel p=new panel();
		add(p);
		setVisible(true);
		
	}
}
class panel extends JPanel{
	public panel() {
		mya=new JTextArea(8,20);
		JScrollPane barra=new JScrollPane(mya);
		//mya.setLineWrap(true);
		add(mya);
		
		JButton b1=new JButton("dale");
		b1.addActionListener(new GestionArea());
		add(b1);
	}
	private class GestionArea implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(mya.getText());
			
		}
		
	}
	private JTextArea mya;
}
