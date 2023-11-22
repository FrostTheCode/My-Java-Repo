package JTEXT;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class area {

	public static void main(String[] args) {
		marco m =new marco();
		

	}

}
class marco extends JFrame{
	public marco() {
		setTitle("probando el area de texto");
		setBounds(500,300,500,350);
		setLayout(new BorderLayout());
		panelB=new JPanel();
		bin=new JButton("inserta");
		bin.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				areatxt.append("en la caida de la torre he de tomar la primera piedra del colapso metal");
				
			}
			
		});
		panelB.add(bin);
		bsal=new JButton("salto lineal");
		bsal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				boolean salta=!areatxt.getLineWrap();
				areatxt.setLineWrap(salta);
				/*if(salta) {
					bsal.setText("quitar salto");
				}else {
					bsal.setText("salto linea");
				}*/
				bsal.setText(salta ? "quitar salto":"salta");
			}
			
		});
		panelB.add(bsal);
		add(panelB, BorderLayout.SOUTH);
		
		areatxt=new JTextArea(8,20);
		ba=new JScrollPane(areatxt);
		add(ba,BorderLayout.CENTER);
	}
	private JPanel panelB;
	private JButton bin,bsal;
	private JTextArea areatxt;
	private JScrollPane ba;
}
