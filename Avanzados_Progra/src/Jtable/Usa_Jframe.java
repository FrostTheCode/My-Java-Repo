package Jframe;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Usa_Jframe {

	public static void main(String[] args) {
		JFrame ma=new marcoT();
		ma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ma.setVisible(true);
		

	}

}
class marcoT extends JFrame{
	public marcoT() {
		setTitle("The planets");
		setBounds(300,300,400,200);
		
		JTable tabPla=new JTable(datFil,names);
		add(new JScrollPane(tabPla),BorderLayout.CENTER);
		JButton bim=new JButton("imprimir tabla");
		bim.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					tabPla.print();
				}catch(Exception e2) {
					e2.printStackTrace();
				}
				
			}
			
		});
		JPanel lam=new JPanel();
		lam.add(bim);
		add(lam,BorderLayout.SOUTH);
	}
	private String[]names= {"nombres","radio","lunas","gaseoso"};
	private Object [][] datFil= {
			{"mercurio",2440.0,0,false},
			{"venus",6052.0,0,false},
			{"tierra",6378.0,1,false},
			{"marte",3397.0,2,"falso"},
			{"Jupiter",71492.0,16,true},
			{"saturno",60268.0,18,true},
			{"urano",25559.0,17,true},
			{"pluto",1137.0,1,false}
	};
}
