package eventos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class prueba {

	public static void main(String[] args) {
		MBoton mb=new MBoton();
		mb.setVisible(true);
		mb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
class MBoton extends JFrame{
	public MBoton() {
		setTitle("botones y eventos");
		setBounds(100,100,700,450);
		Frame f=new Frame();
		add(f);
	}
}

class Frame extends JPanel {
	JButton btn=new JButton("Azul");
	JButton bn=new JButton("Negro");
	JButton ba=new JButton("Amarillo");
	public Frame() {
		add(btn);
		add(bn);
		add(ba);
		
		fondo azul=new fondo(Color.blue);
		fondo negro=new fondo(Color.black);
		fondo amarillo=new fondo(Color.yellow);
		
		btn.addActionListener(azul);
		bn.addActionListener(negro);
		ba.addActionListener(amarillo);
	}
	 private class fondo implements ActionListener{
			
			public fondo(Color c) {
				colorf=c;
			}
			public void actionPerformed(ActionEvent e) {
			setBackground(colorf);
			}
			private Color colorf;
		}
}
 
	
	/*public void actionPerformed(ActionEvent e){
		Object bpl=e.getSource();
		if(bpl==btn) {
			setBackground(Color.blue);
		}
		else if(bpl==ba) {
			setBackground(Color.yellow);
		}
		else
		{setBackground(Color.black);}
		
	}
	
}*/
	
