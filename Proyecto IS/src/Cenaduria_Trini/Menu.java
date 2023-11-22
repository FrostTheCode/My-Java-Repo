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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		
		JLabel lblTitulo = new JLabel("CENADURIA TRINI");
		lblTitulo.setBounds(276, 15, 910, 203);
		lblTitulo.setBackground(new Color(0, 0, 205));
		lblTitulo.setFont(new Font("Times New Roman", Font.PLAIN, 99));
		
		JLabel lblimagen1 = new JLabel("New label");
		lblimagen1.setBounds(390, 387, 300, 233);
		lblimagen1.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/imagen1.jpg")));
		
		JLabel lblimagen2 = new JLabel("New label");
		lblimagen2.setBounds(757, 224, 309, 200);
		lblimagen2.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/imagen2.jpg")));
		
		JLabel LPlogo = new JLabel("New label");
		LPlogo.setBounds(83, 26, 125, 159);
		LPlogo.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/loguititito.png")));
		
		JPanel PBotones = new JPanel();
		PBotones.setBounds(46, 210, 193, 410);
		PBotones.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton Bventa = new JButton("Venta");
		PBotones.add(Bventa);
		Bventa.setPreferredSize(new Dimension(51, 21));
		Bventa.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		Bventa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Accion del boton Venta
				Venta v = new Venta();
				v.setVisible(true);
				dispose();
				
			}
		});
		Bventa.setFont(new Font("Tahoma", Font.PLAIN, 40));
		Bventa.setBackground(new Color(143, 188, 143));
		
		JButton Binsumo = new JButton("Insumo");
		Binsumo.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		PBotones.add(Binsumo);
		Binsumo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//es la accion del boton
				Insumos ins = new Insumos();
				ins.setVisible(true);
				dispose();
			}
		});
		Binsumo.setFont(new Font("Tahoma", Font.PLAIN, 40));
		Binsumo.setBackground(new Color(143, 188, 143));
		
		JButton Binforme = new JButton("Informe");
		Binforme.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		PBotones.add(Binforme);
		Binforme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Informe info = new Informe();
				info.setVisible(true);
				dispose();
			}
		});
		Binforme.setFont(new Font("Tahoma", Font.PLAIN, 40));
		Binforme.setBackground(new Color(143, 188, 143));
		contentPane.setLayout(null);
		contentPane.add(LPlogo);
		contentPane.add(PBotones);
		contentPane.add(lblimagen1);
		contentPane.add(lblimagen2);
		contentPane.add(lblTitulo);
	}
	
	//icono del programas
	@Override
	public Image getIconImage() {
	Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/loguititito.png"));
	return retValue;
	}
	
}