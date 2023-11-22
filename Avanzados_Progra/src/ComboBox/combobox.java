package ComboBox;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class combobox {

	public static void main(String[] args) {
		marco m=new marco();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class marco extends JFrame{
	public marco() {
		setVisible(true);
		setBounds(500,300,550,400);
		panel p=new panel();
		add(p);
		
	}
}
class panel extends JPanel{
	public panel() {
		setLayout(new BorderLayout());
		txt=new JLabel("calmado entre las olas vibrantes sonidos de alicantes....");
		txt.setFont(new Font("Serif", Font.PLAIN,18));
		add(txt,BorderLayout.CENTER);
		
		JPanel panor=new JPanel();
		box=new JComboBox();
		
		box.setEditable(true);
		box.addItem("Serif");
		box.addItem("SansSerif");
		box.addItem("Monospaced");
		box.addItem("Dialog");
		
		evcom ev=new evcom();
		box.addActionListener(ev);
		
		panor.add(box);
		add(panor,BorderLayout.NORTH);
	}
	private class evcom implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			txt.setFont(new Font((String)box.getSelectedItem(),Font.PLAIN,18));
			
		}
		
	}
	private JLabel txt;
	private JComboBox box;
}