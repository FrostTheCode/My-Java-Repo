package checkbox;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class eventosBotonRadio {

	public static void main(String[] args) {
		frame f=new frame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class frame extends JFrame{
	public frame() {
		setTitle("ventana para editar eventos en botones");
		setBounds(50,50,500,300);
		setVisible(true);
		paneles ps=new paneles();
		add(ps);
	}
}
class paneles extends JPanel{
	public paneles() {
		setLayout(new BorderLayout());
		txt=new JLabel("los colores del rio pintados de rojo como la acuarela del villano ...");
		txt.setFont(new Font("Serif",Font.PLAIN,10));
		add(txt, BorderLayout.CENTER);
		pa =new JPanel(); 
		g1=new ButtonGroup();
		
		colb("paqueno", false, 10);
		colb("mediano", false, 12);
		colb("grande", false, 18);
		colb("muy grande", false, 26);
		
		add(pa, BorderLayout.SOUTH);
		/*ButtonGroup g1=new ButtonGroup();
		

		JRadioButton b1=new JRadioButton("pequeno", false);
		JRadioButton b2=new JRadioButton("media", false);
		JRadioButton b3=new JRadioButton("grande", false);
		JRadioButton b4=new JRadioButton("muy grande", false);
		
		JPanel pa =new JPanel();
		
		eventor ev=new eventor();
		b1.addActionListener(ev);
		b2.addActionListener(ev);
		b3.addActionListener(ev);
		b4.addActionListener(ev);
		
		g1.add(b1);
		g1.add(b2);
		g1.add(b3);
		g1.add(b4);
		
		pa.add(b1);
		pa.add(b2);
		pa.add(b3);
		pa.add(b4);
		
		add(pa, BorderLayout.SOUTH);*/
		
	}
	public void colb(String name,boolean sele, int tam ) {
		JRadioButton bo=new JRadioButton(name,sele);
		g1.add(bo);
		pa =new JPanel();
		pa.add(bo);
		ActionListener mye=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				txt.setFont(new Font("Serif",Font.PLAIN,tam));
			}
			
		};
		bo.addActionListener(mye);
	}
	/*private class eventor implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b1) {
				//System.out.println("has pulsado el 1");
				txt.setFont(new Font("Arial", Font.PLAIN,10));
			}
			else if(e.getSource()==b2) {
				txt.setFont(new Font("Serif", Font.PLAIN,14));
			}
			else if(e.getSource()==b3) {
				txt.setFont(new Font("Serif", Font.PLAIN,18));
			}
			else if(e.getSource()==b4) {
				txt.setFont(new Font("Serif", Font.PLAIN,22));
			}
			
		}
		
	}*/
	private JPanel pa;
	private ButtonGroup g1;
	private JLabel txt;
	private JRadioButton b1,b2,b3,b4;
}
