package Cenaduria_Trini;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Choice;
import java.awt.Label;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class datosVenta extends JFrame {
	
	Conexion con1 = new Conexion();
	Connection conet;
	Statement st;
	ResultSet rs;
	int idB;

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtCant;
	private JTextField txtPre;
	private JTextField txtPlat;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public datosVenta() {
		setBounds(100, 100, 514, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("REGISTRO DE VENTA");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 11, 464, 54);
		contentPane.add(lblNewLabel_1);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		horizontalBox.setBounds(10, 11, 475, 54);
		contentPane.add(horizontalBox);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(154, 96, 33, 38);
		contentPane.add(lblNewLabel);
		
		txtID = new JTextField();
		txtID.setBounds(230, 96, 94, 29);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		JLabel lblPlatillo = new JLabel("PLATILLO");
		lblPlatillo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPlatillo.setBounds(93, 173, 94, 38);
		contentPane.add(lblPlatillo);
		
		JLabel lblCantidad = new JLabel("CANTIDAD");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCantidad.setBounds(84, 243, 103, 38);
		contentPane.add(lblCantidad);
		
		txtCant = new JTextField();
		txtCant.setColumns(10);
		txtCant.setBounds(230, 243, 94, 29);
		contentPane.add(txtCant);
		
		JLabel lblPrecio = new JLabel("PRECIO");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrecio.setBounds(109, 316, 78, 38);
		contentPane.add(lblPrecio);
		
		JButton btnNewButton = new JButton("AGREGAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertarDatos();
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(10, 365, 141, 48);
		contentPane.add(btnNewButton);
		
		txtPlat = new JTextField();
		txtPlat.setBounds(232, 173, 139, 29);
		contentPane.add(txtPlat);
		txtPlat.setColumns(10);
		
		txtPre = new JTextField();
		txtPre.setColumns(10);
		txtPre.setBounds(230, 316, 94, 29);
		contentPane.add(txtPre);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(datosVenta.class.getResource("/Imagenes/fondo.jpg")));
		lblNewLabel_2.setBounds(0, 0, 498, 424);
		contentPane.add(lblNewLabel_2);
	}
	
	public void insertarDatos() {
		
		String id = txtID.getText();
		String platillo = txtPlat.getText();
		String cantidad = txtCant.getText();
		String precio = txtPre.getText();
		
		
		try {
			if (id.equals("") || platillo.equals("") || cantidad.equals("") || precio.equals("")) {
				
				JOptionPane.showMessageDialog(null, "No se han ingresado datos");
				limpiarTabla();
			}else {
				String sql = "insert into venta(idVenta, platillo, cantidad, precio)"
						+ "values ('"+id+"','"+platillo+"','"+cantidad+"','"+precio+"')";
				conet = con1.getConnection();
				st = conet.createStatement();
				st.executeUpdate(sql);
				
				JOptionPane.showMessageDialog(null, "Nueva venta registrada");
				limpiarTabla();
			}
			
		}catch (Exception e) {
			
		}
		
	}
	
	private void limpiarTabla() {
		
		Venta v = new Venta();
		for(int i = 0; i <= v.table.getRowCount(); i++) {
			v.modeloVenta.removeRow(i);
			i = i-1;
		}
	}
}
