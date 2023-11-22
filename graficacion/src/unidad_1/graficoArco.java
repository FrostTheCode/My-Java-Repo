package unidad_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class graficoArco extends JFrame{
	private JPanel contentPane;
	
	//launch the app
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				try{
					graficoArco frame = new graficoArco();
					frame.setVisible(true);
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
			
		});

	}
	
	//create the frame
	public graficoArco() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		setBounds(0,0,800,600);
	}
	
	public void paint (Graphics g) {
		super.paint(g);
		g.setColor(Color.blue);
		g.drawArc(5,60,80,40,60,40);
		
	}
	
}
