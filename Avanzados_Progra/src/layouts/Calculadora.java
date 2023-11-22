package layouts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {
		frame f=new frame();
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class frame extends JFrame{
	public frame() {
		setVisible(true);
		setTitle("Calculadora");
		setBounds(500,300,450,300);
	
		panel p=new panel();
		add(p);
		//pack(); sirve para compactar lo mas posible la base grafica
	}
}
class panel extends JPanel{
	public panel() {
		princ=true;
		setLayout(new BorderLayout());
		pantalla=new JButton("0");
		pantalla.setEnabled(false);
		add(pantalla,BorderLayout.NORTH);
		
		myp=new JPanel();
		myp.setLayout(new GridLayout(4,4));
		
		ActionListener ins= new innum();
		ActionListener ord=new orden();
		
		ponerB("7",ins);
		ponerB("8",ins);
		ponerB("9",ins);
		ponerB("/",ord);
		
		ponerB("4",ins);
		ponerB("5",ins);
		ponerB("6",ins);
		ponerB("*",ord);
		
		ponerB("1",ins);
		ponerB("2",ins);
		ponerB("3",ins);
		ponerB("-",ord);
		
		ponerB("0",ins);
		ponerB(".",ins);
		ponerB("=",ord);
		ponerB("+",ord);
		
		add(myp,BorderLayout.CENTER);
		
		ultop="=";
	}
	private void ponerB(String rot,ActionListener oy) {
		JButton bn=new JButton(rot);
		bn.addActionListener(oy);
		myp.add(bn);
		myp.setBackground(Color.BLACK);
	}
	private class innum implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String ent=e.getActionCommand();
			if(princ) {
			pantalla.setText("");
			princ=false;
			}
			pantalla.setText(pantalla.getText()+ent);
		}
		
	}
	private class orden implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String op=e.getActionCommand();
			System.out.println(op);
			calcular(Double.parseDouble(pantalla.getText()));
			ultop=op;
			princ=true;
		}
		public void calcular(double x) {
			if (ultop.equals("+")){
				resultado+=x;
			}
			else if(ultop.equals("=")) {
				resultado=x;
			}
			else if(ultop.equals("-")) {
				resultado-=x;
			}
			else if(ultop.equals("*")) {
				resultado*=x;
			}
			else if(ultop.equals("/")) {
				resultado/=x;
			}
			pantalla.setText(""+resultado);
		}
		
	}
	private JButton pantalla;
	private JPanel myp;
	private boolean princ;
	public double resultado;
	public String ultop;
}