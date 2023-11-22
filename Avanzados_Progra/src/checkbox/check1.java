package checkbox;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class check1 {

	public static void main(String[] args) {
		marco m=new marco();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class marco extends JFrame{
	public marco() {
		setTitle("programa de prueba para checkboxes");
		setBounds(50,50,700,500);
		setVisible(true);
		panel p=new panel();
		add(p);
	}
	
}
class panel extends JPanel{
	public panel() {
		setLayout(new BorderLayout());
		Font letra=new Font("Consola", Font.PLAIN,24);
		txt=new JLabel("llegue a ese pueblo, foraneo a mi entender llamado...");
		txt.setFont(letra);
		JPanel panelL=new JPanel();
		panelL.add(txt);
		add(panelL,BorderLayout.CENTER);
		ch1=new JCheckBox("Negrita");
		ch2=new JCheckBox("Cursiva");
		
		ch1.addActionListener(new ManCheck());
		ch2.addActionListener(new ManCheck());
		JPanel pcheck=new JPanel();
		pcheck.add(ch1);
		pcheck.add(ch2);
		
		add(pcheck, BorderLayout.SOUTH);
		
	}
	private class ManCheck implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			int t=0;
			
			if(ch1.isSelected()) t+=Font.BOLD;
			if(ch2.isSelected()) t+=Font.ITALIC;
			
			txt.setFont(new Font("Serif", t,24));
			
		}
		
	}
	private JLabel txt;
	private JCheckBox ch1,ch2;
}