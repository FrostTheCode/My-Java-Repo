package jpopup;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;

public class JpopupM {

	public static void main(String[] args) {
		marco m=new marco();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
class marco extends JFrame{
	public marco() {
		setBounds(100,100,300,250);
		panelE pan = new panelE();
		add(pan);
		setVisible(true);
		
	}
}
class panelE extends JPanel{
	public panelE() {
		
		
		setLayout(new BorderLayout());
		JPanel lamenu=new JPanel();
		JMenuBar bar=new JMenuBar();
		JMenu fuente=new JMenu("fuente");
		JMenu estilo=new JMenu("estilo");
		JMenu tama=new JMenu("tamano");
		
		bar.add(fuente);
		bar.add(estilo);
		bar.add(tama);
		lamenu.add(bar);
		add(lamenu,BorderLayout.NORTH);
		JTextPane miarea=new JTextPane();
		add(miarea,BorderLayout.CENTER); 
		
//------------------------------------------------------------------------------------------
		JPopupMenu jmen=new JPopupMenu();
		JMenuItem op1=new JMenuItem("opcion 1");
		JMenuItem op2=new JMenuItem("opcion 2");
		JMenuItem op3=new JMenuItem("opcion 3");
		jmen.add(op1);
		jmen.add(op2);
		jmen.add(op3);
		setComponentPopupMenu(jmen);
		miarea.setComponentPopupMenu(jmen);
	}
}
