package unidad_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Grafico_4 extends JFrame{
	private JPanel contentPane;
	/*launch the app*/
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grafico_4 frame = new Grafico_4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	/*create the frame*/
	
	public Grafico_4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		setBounds(0,0,800,600);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		Toolkit t = Toolkit.getDefaultToolkit();
		Image im=t.getImage("src/ok joto.png");
		g.drawImage(im,0,0,this);
		
		/*g.setColor(Color.blue);
		g.drawLine("Primera linea", 10, 200);
		g.drawLine("Segunda linea", 10, 300);*/
		
	}
}