package Cenaduria_Trini;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.GridBagLayout;

public class Insumos extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Insumos() {
		setIconImage(getIconImage());
		
		// OBJETOS Y METODOS PARA CALCULAR EL TAMAÑO DE LA PANTALLA Y AJUSTAR EL TAMAÑO DE LA VENTANA DEL MENU
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamañoP = pantalla.getScreenSize();
		
		double alturaPantalla = tamañoP.getHeight();
		
		double anchoPantalla = tamañoP.getHeight();
		
		setSize((int) (anchoPantalla/0.66), (int) (alturaPantalla/1.12)); 
		
		setLocation((int) (anchoPantalla/7), (int) alturaPantalla/27);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		//BOTON X PARA CERRAR LA VENTANA
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				Menu m = new Menu();
				m.setVisible(true);
				dispose();
			}
		});
		
		btnX.setBackground(new Color(220, 20, 60));
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		//AÑADIENDO LA IMAGEN
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/Imagenes/loguititito.png")));
		
		
		//TITULO DE LA VENTANA
		
		lblNewLabel_1 = new JLabel("Cenaduria Trini");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 99));
		
		JPanel Pac = new JPanel();
		Pac.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(51, 153, 51)));
		
		JPanel taIn = new JPanel();
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
							.addGap(133)
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED, 318, Short.MAX_VALUE)
							.addComponent(btnX)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(191)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(110)
									.addComponent(Pac, GroupLayout.PREFERRED_SIZE, 817, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(26)
									.addComponent(taIn, GroupLayout.PREFERRED_SIZE, 1039, GroupLayout.PREFERRED_SIZE)))
							.addGap(19))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel)
						.addComponent(btnX))
					.addGap(3)
					.addComponent(taIn, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(Pac, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		taIn.setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		taIn.add(table, BorderLayout.CENTER);
		Pac.setLayout(new GridLayout(1, 1, 0, 0));
		
		JButton btnAceIn = new JButton("Aceptar");
		btnAceIn.setBorder(new MatteBorder(1, 1, 1, 3, (Color) new Color(51, 153, 51)));
		btnAceIn.setBackground(new Color(255, 255, 0));
		btnAceIn.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Pac.add(btnAceIn);
		
		JButton btnCanIn = new JButton("Cancelar");
		btnCanIn.setBorder(new MatteBorder(1, 3, 1, 1, (Color) new Color(51, 153, 51)));
		btnCanIn.setBackground(new Color(255, 255, 0));
		btnCanIn.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnCanIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Pac.add(btnCanIn);
		
		contentPane.setLayout(gl_contentPane);
		
		
		
	}
	
	@Override
	public Image getIconImage() {
	Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/loguititito.png"));
	return retValue;
	}
}
