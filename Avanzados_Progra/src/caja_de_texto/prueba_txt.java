package caja_de_texto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class prueba_txt {

	public static void main(String[] args) {
		frame f=new frame();
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   

	}

}
class frame extends JFrame{
	public frame() {
		setVisible(true);
		setBounds(600,300,700,450);
	
		add(new panel());
	}
}
class panel extends JPanel{
	public panel() {
		setLayout(new BorderLayout());
		JPanel pan2=new JPanel();
		pan2.setLayout(new FlowLayout());
		
		resu=new JLabel("",JLabel.CENTER);
		JLabel txt1=new JLabel("Email: ");
		pan2.add(txt1);
		camp1=new JTextField(20);
		add(camp1);
		add(resu,BorderLayout.CENTER);
		//System.out.println(tx1.getText());
		
		JButton myb=new JButton("dale");
		GibTx ev1=new GibTx();
		myb.addActionListener(ev1);
		pan2.add(myb);
		
		add(pan2,BorderLayout.NORTH);
		
	}
	private class GibTx implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			int corre=0;
			String email=camp1.getText().trim();
			for (int i=0;i<email.length();i++) {
				if(email.charAt(i)=='@') {
					corre++;
				}
			}
			if(corre!=1) {
				resu.setText("incorrecto");
			}
			else {
				resu.setText("correcto");
			}
			System.out.println(camp1.getText().trim());
		}
	
	}
	private JTextField camp1;
	private JLabel resu;
}