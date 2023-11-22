package unidad_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class grafico_3 extends JFrame{
	
	private JPanel contentpane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				try {
					grafico_3 frame = new grafico_3();
					frame.setVisible(true);
					
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
	
	public grafico_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
		contentpane=new JPanel();
		contentpane.setBorder(new EmptyBorder(5,5,5,5));
		contentpane.setLayout(new BorderLayout(0,0));
		setContentPane(contentpane);
		setBounds(0,0,800,255);
		
	}
	public void paint (Graphics g) {
		super.paint(g);
		int fila=0;
		for(int red=0;red<=255;red++) {
			Color col=new Color(red,0,0);
			g.setColor(col);
			g.drawLine(0, fila, 800, fila);
			fila++;
		}
	}

}
