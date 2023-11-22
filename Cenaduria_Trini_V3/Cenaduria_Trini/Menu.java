package Cenaduria_Trini;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;

import javax.swing.JSeparator;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Metodo main para iniciar la aplicacion.
	 */
	public static void main(String[] args) {
		Conexion conexion = new Conexion();
		
		
		
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
		
		// OBJETOS Y METODOS PARA CALCULAR EL TAMAÑO DE LA PANTALLA Y AJUSTAR EL TAMAÑO DE LA VENTANA DEL MENU
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamañoP = pantalla.getScreenSize();
		
		double alturaPantalla = tamañoP.getHeight();
		
		double anchoPantalla = tamañoP.getHeight();
		
		setSize(1150,670); 
		
		setLocation((int) (anchoPantalla/7), (int) alturaPantalla/27);
		
		setResizable(false);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		//CREAR EL contentPane AÑADIENDO LOS COLORES Y EL LAYOUT
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		//PANEL DE LA CABECERA DONDE VA EL TITULO Y LA IMAGEN
		
		JPanel panelCabecera = new JPanel();
		panelCabecera.setBackground(Color.WHITE);
		panelCabecera.setBorder(null);
		contentPane.add(panelCabecera, BorderLayout.NORTH);
		panelCabecera.setLayout(new BorderLayout(0, 0));
		
		//TITULO DE LA VENTANA PRINCIPAL
		
		JLabel lblTitulo = new JLabel("CENADURIA TRINI");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 90));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		panelCabecera.add(lblTitulo, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panelCabecera.add(panel_2, BorderLayout.WEST);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		
		//AÑADIENDO LA IMAGEN
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/loguititito.png")));
		panel_2.add(lblNewLabel);
		
		//JLabel's PARA AJUSTAR LA IMAGEN A LA POSICION DESEADA
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBorder(null);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		panel_2.add(lblNewLabel_2, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_2_1 = new JLabel("New lab");
		lblNewLabel_2_1.setOpaque(true);
		lblNewLabel_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setBorder(null);
		panel_2.add(lblNewLabel_2_1, BorderLayout.WEST);
		
		JLabel lblNewLabel_2_2 = new JLabel("New label");
		lblNewLabel_2_2.setOpaque(true);
		lblNewLabel_2_2.setBackground(Color.WHITE);
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setBorder(null);
		panel_2.add(lblNewLabel_2_2, BorderLayout.NORTH);
		
		
		//CREACION DEL PANEL DE LOS BOTONES
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.add(panelBotones, BorderLayout.WEST);
		panelBotones.setPreferredSize(new Dimension(193, 410));
		panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		//CREACION DEL BOTON VENTAS CON SU EVENTO DE BOTON PARA ABRIR LA VENTANA VENTAS Y DESACTIVAR EL BOTON
		
		JButton btnVentas = new JButton("Ventas");
		Venta v = new Venta();
		btnVentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				v.setVisible(true);
				if(v.isVisible()) {
					btnVentas.setEnabled(false);
				}
				
			}
			
		});
		
		btnVentas.setIcon(null);
		btnVentas.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		btnVentas.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnVentas.setBackground(new Color(143,188,143));
		btnVentas.setPreferredSize(new Dimension(193, 137));
		panelBotones.add(btnVentas);
		
		
		//CREACION DEL BOTON INSUMOS CON SU EVENTO DE BOTON PARA ABRIR LA VENTANA INSUMOS Y DESACTIVAR EL BOTON
		
		JButton btnInsumos = new JButton("Insumos");
		Insumos i = new Insumos();
		
		btnInsumos.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				i.setVisible(true);
				if(i.isVisible()) {
					btnInsumos.setEnabled(false);
				}
				
				
			}
		});
		

		
		btnInsumos.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		btnInsumos.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnInsumos.setBackground(new Color(143,188,143));
		btnInsumos.setPreferredSize(new Dimension(193, 137));
		panelBotones.add(btnInsumos);
		
		
		//CREACION DEL BOTON INFORME CON SU EVENTO DE BOTON PARA ABRIR LA VENTANA INFORME Y DESACTIVAR EL BOTON
		
		JButton btnInforme = new JButton("Informe");
		Informe inf = new Informe();
		btnInforme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				inf.setVisible(true);
				if(inf.isVisible()) {
					btnInforme.setEnabled(false);
				}
			}
		});
		btnInforme.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		btnInforme.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnInforme.setBackground(new Color(143,188,143));
		btnInforme.setPreferredSize(new Dimension(193, 137));
		panelBotones.add(btnInforme);
		
		
		
		//ACTIVAR EL BOTON DE VENTAS AL CERRAR LA VENTANA DE VENTAS
		
		v.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				
				btnVentas.setEnabled(true);
			}
		});
		
		
		//ACTIVAR EL BOTON DE INSUMOS AL CERRAR LA VENTANA DE INSUMOS
		
		i.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				btnInsumos.setEnabled(true);
			}
		});
		
		
		//ACTIVAR EL BOTON DE INFORME AL CERRAR LA VENTANA DE INFORME
		
		inf.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				btnInforme.setEnabled(true);
				
				
			}
		});
		
		
		
		//PANEL PARA LAS IMAGENES
		
		JPanel panelImagenes = new JPanel();
		panelImagenes.setBackground(Color.WHITE);
		contentPane.add(panelImagenes, BorderLayout.CENTER);
		panelImagenes.setLayout(null);
		
		
		//JLabel's PARA AÑADIR LAS IMAGENES DE LA VENTANA PRINCIPAL
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/imagen1.jpg")));
		lblNewLabel_4.setBounds(35, 11, 300, 225);
		panelImagenes.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/imagen2.jpg")));
		lblNewLabel_5.setBounds(625, 247, 309, 179);
		panelImagenes.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/imagen3.jpg")));
		lblNewLabel_6.setBounds(354, 11, 251, 225);
		panelImagenes.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/imagen4.jpeg")));
		lblNewLabel_7.setBounds(625, 12, 309, 224);
		panelImagenes.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/imagen2.jpg")));
		lblNewLabel_8.setBounds(35, 247, 300, 179);
		panelImagenes.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/imagen1.jpg")));
		lblNewLabel_9.setBounds(354, 247, 251, 179);
		panelImagenes.add(lblNewLabel_9);
		
	
		setIconImage(new ImageIcon(getClass().getResource("/Imagenes/loguititito.png")).getImage());
	}
}

	