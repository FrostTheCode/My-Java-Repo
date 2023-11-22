package eventos_multiples;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class prueba_acciones {

	public static void main(String[] args) {
		marco m=new marco();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setVisible(true);

	}

}
class marco extends JFrame{
	public marco() {
		setTitle("Prueba de acciones");
		setBounds(100,350,600,300);
		
		lamina l=new lamina();
		add(l);
	}
}
class lamina extends JPanel{
	public lamina() {
		
		AccionColor accAma=new AccionColor("Amarillo",new ImageIcon("src/bin/eventos_multiples/amarillo.jpg"),Color.yellow);
		AccionColor accVer=new AccionColor("Verde",new ImageIcon("src/bin/eventos_multiples/verde.jpg"),Color.green);
		AccionColor accNeg=new AccionColor("Negro",new ImageIcon("src/bin/eventos_multiples/negro.jpg"
				+ ""),Color.black);
		
		add(new JButton(accAma));
		add(new JButton(accVer));
		add(new JButton(accNeg));
		/*JButton ba=new JButton("amarillo");
		JButton bv=new JButton("verde");
		JButton bn=new JButton("negro");
		
		add(ba);
		add(bv);
		add(bn);*/
		
	}
	class AccionColor extends AbstractAction{
		public AccionColor(String name,Icon ic,Color cboton) {
			putValue(Action.NAME, name);
			putValue(Action.SMALL_ICON, ic);
			putValue(Action.SHORT_DESCRIPTION,"poner la lamina de color: "+name);
			putValue("color_de_fondo",cboton);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Color c=(Color)getValue("color_de_fondo");
			setBackground(c);
			System.out.println("Nombre: "+getValue(Action.NAME)+"Descripcion: "+getValue(Action.SHORT_DESCRIPTION));
			
		}
	}
}
