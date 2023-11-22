package ComboBox;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class marcoJSlider {

	public static void main(String[] args) {
		marco2 m2=new marco2();
		m2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class marco2 extends JFrame{
	public marco2() {
		setBounds(550,400,550,350);
		lamina2 l=new lamina2();
		add(l);
		setVisible(true);
		
		
	}
}
class lamina2 extends JPanel{
	public lamina2() {
		setLayout(new BorderLayout());
		rot=new JLabel("conocido como el franero maarcial topo la nueva ciudad...");
		add(rot,BorderLayout.CENTER);
		
		con=new JSlider(8,50,12);
		con.setMajorTickSpacing(20);
		con.setMinorTickSpacing(5);
		con.setPaintTicks(true);
		con.setPaintLabels(true);
		con.setFont(new Font("Serif",Font.ITALIC,10));
		con.addChangeListener(new evslider());
		
		JPanel barra=new JPanel();
		barra.add(con);
		add(barra,BorderLayout.NORTH);
	}
	private class evslider implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			
			//cont ++;
			//System.out.println("estas manipulando la barra deslizante"+con.getValue());
			rot.setFont(new Font("Serif",Font.PLAIN,con.getValue()));
			
		}
		
	}
	private JLabel rot;
	private JSlider con;
	private static int cont;
}
