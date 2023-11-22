package procesoII;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class procesador2 {

	public static void main(String[] args) {
	  menuPro me=new menuPro();
	  me.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class menuPro extends JFrame{
	public menuPro() {
		setBounds(500,300,550,400);
		laminaPro la=new laminaPro();
		add(la);
		setVisible(true);
	}
}
class laminaPro extends JPanel{
	public laminaPro() {
		setLayout(new BorderLayout());
		JPanel Pmenu=new JPanel();
		JMenuBar bar=new JMenuBar();
		
		 fuente=new JMenu("Fuente");
		 estilo=new JMenu("Estilo");
		 size=new JMenu("Size");
		 
		 conf_menu("arial","fuente","Arial",9,10);
		 conf_menu("courier","fuente","Courier",9,10);
		 conf_menu("verdana","fuente","Verdana",9,10);
	//----------------------------------------------------
		 conf_menu("negritas","estilo","",Font.BOLD,1);
		 conf_menu("cursiva","estilo","",Font.ITALIC,1);
	//----------------------------------------------------
		 conf_menu("12","size","",9,12);
		 conf_menu("16","size","",9,16);
		 conf_menu("20","size","",9,20);
		 conf_menu("24","size","",9,24);
	//----------------------------------------------------	 
		
		 bar.add(fuente);
		 bar.add(estilo);
		 bar.add(size);
		 Pmenu.add(bar);
		 add(Pmenu,BorderLayout.NORTH);
		 
		 JTextPane mia=new JTextPane();
		 add(mia,BorderLayout.CENTER);
	}
	public void conf_menu(String rotulo,String menu, String tipo_letra, int est, int tam) {
		JMenuItem menu_ele=new JMenuItem(rotulo);
		if (menu=="fuente") {
			fuente.add(menu_ele);
		}else if(menu=="estilo") {
			estilo.add(menu_ele);
		}else if(menu=="size") {
			size.add(menu_ele);
		}
		menu_ele.addActionListener(new GesEv(rotulo,tipo_letra,est,tam));
	}
	private class GesEv implements ActionListener{
		
		String tipo_txt,menu;
		
		int estilo_letra,tamagno_letra;
		
		GesEv(String elem,String txt2,int esti2,int tam2){
			tipo_txt=txt2;
			estilo_letra=esti2;
			tamagno_letra=tam2;
			menu=elem;
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			letra=mia.getFont();
			if(menu=="Arial"|| menu=="Courier"|| menu=="Verdana") {
				estilo_letra=letra.getStyle();
				tamagno_letra=letra.getSize();
			}else if(menu=="12"||menu=="16"||menu=="20"||menu=="24") {
				estilo_letra=letra.getStyle();
				tipo_txt=letra.getFontName();
			}
			mia.setFont(new Font(tipo_txt,estilo_letra,tamagno_letra));
			System.out.println("Tipo: "+tipo_txt+"Estilo: "+estilo_letra+"Size: "+tamagno_letra);
		}
		
	}
	
	JTextPane mia;
	JMenu fuente, estilo, size;
	Font letra;
}