package checkbox;
import javax.swing.*;

public class botonRadio {

	public static void main(String[] args) {
		marcos m=new marcos();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setVisible(true);
	}

}
class marcos extends JFrame{
	public marcos() {
		setTitle("prueba de botones redondos");
		setBounds(550,300,500,300);
		panels p=new panels();
		add(p);
		
	}
}
class panels extends JPanel{
	public panels() {
		ButtonGroup g1=new ButtonGroup();
		ButtonGroup g2=new ButtonGroup();
		
		JRadioButton b1=new JRadioButton("azul", false);
		JRadioButton b2=new JRadioButton("rojo", false);
		JRadioButton b3=new JRadioButton("verde", false);
		
		JRadioButton b4=new JRadioButton("masculino", false);
		JRadioButton b5=new JRadioButton("femenino", false);
		
		g1.add(b1);
		g1.add(b2);
		g1.add(b3);
		
		g2.add(b4);
		g2.add(b5);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		
	}
}
