package JTree;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class ArbolSimple {

	public static void main(String[] args) {
		JFrame m=new marco();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setVisible(true);
		

	}

}
class marco extends JFrame{
	public marco() {
		setTitle("arbol sencillo");
		setBounds(350,300,600,600);
		DefaultMutableTreeNode raiz=new DefaultMutableTreeNode("mundo");
		DefaultMutableTreeNode pais=new DefaultMutableTreeNode("mexico");
		raiz.add(pais);
		DefaultMutableTreeNode estado=new DefaultMutableTreeNode("Zacatecas");
		pais.add(estado);
		DefaultMutableTreeNode jer=new DefaultMutableTreeNode("jerez");
		estado.add(jer);
		DefaultMutableTreeNode gpe=new DefaultMutableTreeNode("guadalupe");
		estado.add(gpe);
		DefaultMutableTreeNode apo=new DefaultMutableTreeNode("apozol");
		estado.add(apo);
		DefaultMutableTreeNode frez=new DefaultMutableTreeNode("fresnillo");
		estado.add(frez);
		pais=new DefaultMutableTreeNode("Canada");
		raiz.add(pais);
		estado=new DefaultMutableTreeNode("Quebbec");
		pais.add(estado);
		DefaultMutableTreeNode mont=new DefaultMutableTreeNode("Montreal");
		estado.add(mont);
		
		JTree ar=new JTree(raiz);
		//panelAr mip=new panelAr(ar);
		//add(mip);
		
		Container con=new Container();
		con.add(new JScrollPane(ar));
	}
}
class panelAr extends JPanel{
	public panelAr(JTree ar) {
		setLayout(new BorderLayout());
		add(ar, BorderLayout.WEST);
	}
}
