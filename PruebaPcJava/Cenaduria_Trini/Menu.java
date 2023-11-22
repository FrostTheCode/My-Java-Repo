package Cenaduria_Trini;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import javax.swing.border.MatteBorder;
import java.awt.Panel;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setIconImage(getIconImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamañoP = pantalla.getScreenSize();
		
		double alturaPantalla = tamañoP.getHeight();
		
		double anchoPantalla = tamañoP.getHeight();
		
		setSize((int) (anchoPantalla/0.66), (int) (alturaPantalla/1.12)); 
		
		setLocation((int) (anchoPantalla/7), (int) alturaPantalla/27);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Cenaduria Trini");
		lblNewLabel.setBackground(new Color(0, 0, 205));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 99));
		
		JLabel imagen1 = new JLabel("New label");
		imagen1.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/imagen1.jpg")));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/imagen2.jpg")));
		
		JLabel LPlogo = new JLabel("New label");
		LPlogo.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/loguititito.png")));
		
		JPanel panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(37)
							.addComponent(LPlogo, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(154)
							.addComponent(imagen1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
							.addGap(57)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(76)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 656, GroupLayout.PREFERRED_SIZE)))
					.addGap(53))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(imagen1, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addGap(196))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(21)
							.addComponent(LPlogo)
							.addGap(30)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton Bventa = new JButton("Venta");
		Bventa.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel.add(Bventa);
		Bventa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Accion del boton Venta
				Venta v = new Venta();
				v.setVisible(true);
			}
		});
		Bventa.setFont(new Font("Tahoma", Font.PLAIN, 40));
		Bventa.setBackground(new Color(143, 188, 143));
		
		JButton Binsumo = new JButton("Insumo");
		Binsumo.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel.add(Binsumo);
		Binsumo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//es la accion del boton
				Insumos ins = new Insumos();
				ins.setVisible(true);
			}
		});
		Binsumo.setFont(new Font("Tahoma", Font.PLAIN, 40));
		Binsumo.setBackground(new Color(143, 188, 143));
		
		JButton Binforme = new JButton("Informe");
		Binforme.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel.add(Binforme);
		Binforme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Informe info = new Informe();
				info.setVisible(true);
			}
		});
		Binforme.setFont(new Font("Tahoma", Font.PLAIN, 40));
		Binforme.setBackground(new Color(143, 188, 143));
		contentPane.setLayout(gl_contentPane);
	}
	
	//icono del programas
	@Override
	public Image getIconImage() {
	Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/loguititito.png"));
	return retValue;
	}
	
}
