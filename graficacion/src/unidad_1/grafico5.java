package unidad_1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class grafico5 extends JFrame{
	private JPanel contentPane;
	private int columna;
	/*launch the app*/
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					grafico5 fr = new grafico5();
					fr.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	/*create the frame*/
	
	public grafico5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton bi = new JButton("izquierda");
		bi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				columna = 400-100;
				repaint();	
			}
			
		});
		bi.setBounds(105,482,89,23);
		contentPane.add(bi);
		
		JButton bd = new JButton("Derecha");
		bi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				columna = 400+100;
				repaint();
      	}
	});
		bd.setBounds(556,482,89,23);
		contentPane.add(bd);
		setBounds(0,0,800,600);
		columna = 300;
}
	
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.RED);
		g.fillOval(columna, 300, 100, 100);
		
	}
}
