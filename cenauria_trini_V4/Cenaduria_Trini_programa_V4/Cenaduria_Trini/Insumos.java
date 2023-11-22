package Cenaduria_Trini;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import com.toedter.calendar.JDateChooser;
import java.awt.Label;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Insumos extends JFrame {
	
	Conexion con1 = new Conexion();
	Connection conet;
	Statement st;
	ResultSet rs;
	
	DefaultTableModel modeloInsumos;

	private JPanel contentPane;
	private JTable table;
	private JTextField txtInsumo;
	private JTextField txtID;
	private JTextField txtCantidad;
	private JTextField txtPrecio;
	private JDateChooser dateChooser;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Insumos() {
		setIconImage(getIconImage());
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamañoP = pantalla.getScreenSize();
		
		double alturaPantalla = tamañoP.getHeight();
		
		double anchoPantalla = tamañoP.getHeight();
		
		setSize((int) (anchoPantalla/0.66), (int) (alturaPantalla/1.12));
		
		setLocation((int) (anchoPantalla/7), (int) alturaPantalla/27);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel Pac = new JPanel();
		Pac.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(51, 153, 51)));
		Pac.setLayout(new GridLayout(2, 15, 0, 0));
		
		JLabel lblNewLabel_6 = new JLabel("ID");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBorder(new MatteBorder(2, 2, 1, 2, (Color) new Color(0, 0, 0)));
		Pac.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_2 = new JLabel("Insumo");
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6_2.setBorder(new MatteBorder(2, 2, 1, 2, (Color) new Color(0, 0, 0)));
		Pac.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_1 = new JLabel("Cantidad");
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6_1.setBorder(new MatteBorder(2, 2, 1, 2, (Color) new Color(0, 0, 0)));
		Pac.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_3 = new JLabel("Precio");
		lblNewLabel_6_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6_3.setBorder(new MatteBorder(2, 2, 1, 2, (Color) new Color(0, 0, 0)));
		Pac.add(lblNewLabel_6_3);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Agregar();
				consultar();
			}
		});
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnAgregar.setBorder(new MatteBorder(0, 3, 1, 1, (Color) new Color(51, 153, 51)));
		btnAgregar.setBackground(Color.YELLOW);
		Pac.add(btnAgregar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Modificar();
				consultar();
			}
		});
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnModificar.setBorder(new MatteBorder(0, 3, 1, 1, (Color) new Color(51, 153, 51)));
		btnModificar.setBackground(Color.YELLOW);
		Pac.add(btnModificar);
		
		txtID = new JTextField();
		txtID.setEditable(false);
		txtID.setHorizontalAlignment(SwingConstants.CENTER);
		txtID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtID.setColumns(10);
		txtID.setBorder(new MatteBorder(0, 2, 2, 2, (Color) new Color(0, 0, 0)));
		Pac.add(txtID);
		
		txtInsumo = new JTextField();
		txtInsumo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtInsumo.getText().length() == 40) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		txtInsumo.setHorizontalAlignment(SwingConstants.CENTER);
		txtInsumo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtInsumo.setColumns(10);
		txtInsumo.setBorder(new MatteBorder(0, 2, 2, 2, (Color) new Color(0, 0, 0)));
		Pac.add(txtInsumo);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		txtCantidad = new JTextField();
		txtCantidad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtCantidad.getText().length() == 20) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		txtCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCantidad.setColumns(10);
		txtCantidad.setBorder(new MatteBorder(0, 2, 2, 2, (Color) new Color(0, 0, 0)));
		Pac.add(txtCantidad);
		contentPane.add(Pac, BorderLayout.SOUTH);
		
		txtPrecio = new JTextField();
		txtPrecio.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int key = e.getKeyChar();
				
				boolean numeros = key >= 48 && key <= 57 || key == 8 || key == 46;
					
					if(!numeros) {
						getToolkit().beep();
						e.consume();
						
						JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
					}else if(txtPrecio.getText().matches("[0-9]*[.][0-9][0-9]|[.]|[0-9][0-9][0-9][0-9]") ) {
						getToolkit().beep();
						e.consume();
						
					}
			}
		});
		txtPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrecio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPrecio.setColumns(10);
		txtPrecio.setBorder(new MatteBorder(0, 2, 2, 2, (Color) new Color(0, 0, 0)));
		Pac.add(txtPrecio);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBorder(new MatteBorder(0, 3, 1, 1, (Color) new Color(51, 153, 51)));
		btnCancelar.setBackground(new Color(255, 255, 0));
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eliminar();
				consultar();
			}
		});
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int filas = table.getRowCount();
				
				try {
					
					if(filas == 0) {
						
						JOptionPane.showMessageDialog(null, "No hay datos para enviar");
						limpiarTabla();
						
					}else {
					
					PreparedStatement actu = conet.prepareStatement("call enviarInsumos");
					actu.executeUpdate();
					JOptionPane.showMessageDialog(null, "Se enviaron los datos de insumos");
					autoIncrementar();
					limpiarTabla();
					}
					
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, e1 + "No se logro enviar los datos");
				}
				
			}
		});
		btnAceptar.setBorder(new MatteBorder(0, 1, 1, 3, (Color) new Color(51, 153, 51)));
		btnAceptar.setBackground(new Color(255, 255, 0));
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 40));
		Pac.add(btnAceptar);
		Pac.add(btnCancelar);
		
		JPanel panelCabecera = new JPanel();
		panelCabecera.setBorder(null);
		panelCabecera.setBackground(Color.WHITE);
		contentPane.add(panelCabecera, BorderLayout.NORTH);
		panelCabecera.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panelCabecera.add(panel_2, BorderLayout.WEST);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2_2 = new JLabel("New label");
		lblNewLabel_2_2.setOpaque(true);
		lblNewLabel_2_2.setForeground(SystemColor.menu);
		lblNewLabel_2_2.setBorder(null);
		lblNewLabel_2_2.setBackground(SystemColor.menu);
		panel_2.add(lblNewLabel_2_2, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Venta.class.getResource("/Imagenes/loguititito.png")));
		panel_2.add(lblNewLabel_1, BorderLayout.CENTER);
		
		JLabel lblNewLabel_2_1 = new JLabel("New lab");
		lblNewLabel_2_1.setOpaque(true);
		lblNewLabel_2_1.setForeground(SystemColor.menu);
		lblNewLabel_2_1.setBorder(null);
		lblNewLabel_2_1.setBackground(SystemColor.menu);
		panel_2.add(lblNewLabel_2_1, BorderLayout.WEST);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setForeground(SystemColor.menu);
		lblNewLabel_2.setBorder(null);
		lblNewLabel_2.setBackground(SystemColor.menu);
		panel_2.add(lblNewLabel_2, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setForeground(SystemColor.menu);
		panel_2.add(lblNewLabel_3, BorderLayout.EAST);
		
		JPanel panel = new JPanel();
		panelCabecera.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("INSUMOS");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 128, 0), 4));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		panel.add(lblNewLabel, BorderLayout.CENTER);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4.setForeground(SystemColor.menu);
		panel.add(lblNewLabel_4, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_5.setForeground(SystemColor.menu);
		panel.add(lblNewLabel_5, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.EAST);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("yyyy-MM-dd");
		panel_1.add(dateChooser);
		
		dateChooser.setFont(new java.awt.Font("Tahoma,",0,20));
		
		Calendar calendario = new GregorianCalendar();
		
		dateChooser.setCalendar(calendario);
		
		Label label = new Label("-----------------------------");
		label.setForeground(SystemColor.menu);
		dateChooser.add(label, BorderLayout.SOUTH);
		
		Label label_1 = new Label("");
		dateChooser.add(label_1, BorderLayout.NORTH);
		
		((JTextField)this.dateChooser.getDateEditor()).setEditable(false);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(0, 128, 0), 4));
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int fila = table.getSelectedRow();
				if(fila == -1) {
					
					JOptionPane.showMessageDialog(null, "No se selecciono fila");
					
				}else {
					int id = Integer.parseInt((String) table.getValueAt(fila, 0).toString());
					String ins = (String) table.getValueAt(fila, 1);
				    String cant = (String) table.getValueAt(fila, 2);
					float pre = Float.parseFloat((String) table.getValueAt(fila, 3).toString());
		
					
					txtID.setText(""+id);
					txtInsumo.setText(ins);
					txtCantidad.setText(""+cant);
					txtPrecio.setText(""+pre);
					
					
				}
			}
		});
		scrollPane.setViewportView(table);
		table.setRowHeight(30);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "INSUMO", "CANTIDAD", "PRECIO"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(150);
		table.getColumnModel().getColumn(0).setMaxWidth(150);
		table.getColumnModel().getColumn(2).setPreferredWidth(150);
		table.getColumnModel().getColumn(2).setMaxWidth(150);
		table.getColumnModel().getColumn(3).setPreferredWidth(150);
		table.getColumnModel().getColumn(3).setMaxWidth(150);
		table.setFont(new java.awt.Font("Tahoma,",0,20));
		
		consultar();
		
			
	}
	
	public void consultar() {
		// TODO Auto-generated method stub
		String sql = "select idInsumo,insumo,cantidad,precio from insumos";
				
			try {
				conet = con1.getConnection();
				st = conet.createStatement();
				rs = st.executeQuery(sql);
				Object[] insumos = new Object[4];
				modeloInsumos = (DefaultTableModel) table.getModel();
				while (rs.next()) {
					insumos [0] = rs.getInt("idInsumo");
					insumos [1] = rs.getString("insumo");
					insumos [2] = rs.getString("cantidad");
					insumos [3] = rs.getFloat("precio");
				
						
					modeloInsumos.addRow(insumos);
				}
				table.setModel(modeloInsumos);
				
			}catch (Exception e){
					
			}	
	}
	
	private void Agregar() {
		String idIns = txtID.getText();
		String ins = txtInsumo.getText();
		String cant = txtCantidad.getText();
		String pre = txtPrecio.getText();
		String date =((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
		int totalCharacters = 0;
        char temp;
        
        
		try {
			
			for (int i = 0; i < txtPrecio.getText().length(); i++) {

	            temp = txtPrecio.getText().charAt(i);
	            if (temp == '.')
	                totalCharacters++;
	        }
			
			if (ins.equals("") || cant.equals("") || pre.equals("")) {
				
				JOptionPane.showMessageDialog(null, "DATOS VACIOS","ERROR",JOptionPane.INFORMATION_MESSAGE);
				limpiarTabla();
			}else if(totalCharacters>1 || txtPrecio.getText().matches("[.]")) {
				
				JOptionPane.showMessageDialog(null, "Valores invalidos en Precio. Ingresar solo numeros");
				limpiarTabla();
				
			}else {
				String sql = "insert into insumos(insumo, cantidad, precio, fecha)"
						+ "values ('"+ins+"','"+cant+"','"+pre+"','"+date+"')";
				conet = con1.getConnection();
				st = conet.createStatement();
				st.executeUpdate(sql);
				txtInsumo.setText("");
				txtCantidad.setText("");
				txtPrecio.setText("");
				
				JOptionPane.showMessageDialog(null, "Nuevo insumo registrado");
				limpiarTabla();
			}
			
		}catch (Exception e) {
			
			System.out.println(e);
			
		}
		
	}
	
	public String recorridoTabla() {
		int contar = table.getRowCount();
		
		String idIgual = "";
		
		for(int i=0; i<contar; i++) {
			
			idIgual = table.getValueAt(i, 0).toString();
			
			if(txtID.getText().equals(idIgual)) {
				return idIgual;
			}
			
		}
		return idIgual;
		
	}
	
	
	public void limpiarTabla() {
		
		for(int i = 0; i <= table.getRowCount(); i++) {
			modeloInsumos.removeRow(i);
			i = i-1;
		}
	}
	
	
	private void Modificar() {
		String idIns = txtID.getText();
		String ins = txtInsumo.getText();
		String cant = txtCantidad.getText();
		String pre = txtPrecio.getText();
		String date =((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
		
		int totalCharacters = 0;
        char temp;
		
		try {
			
			for (int i = 0; i < txtPrecio.getText().length(); i++) {

	            temp = txtPrecio.getText().charAt(i);
	            if (temp == '.')
	                totalCharacters++;
	        }
			
			if (ins.equals("") || cant.equals("") || pre.equals("") || date.equals("")) {
				
				JOptionPane.showMessageDialog(null, "No se han seleccionado datos o son invalidos","ERROR",JOptionPane.INFORMATION_MESSAGE);
				limpiarTabla();
				
			}else if(totalCharacters>1 || txtPrecio.getText().matches("[.]")) {
					JOptionPane.showMessageDialog(null, "Valores invalidos en Precio. Ingresar solo numeros");
					limpiarTabla();
			}else {
				String sql = "Update insumos set insumo= '"+ins+"',cantidad= '"+cant+"',precio= '"+pre+"',fecha= '"+date+"'where idInsumo= "+idIns;
				conet = con1.getConnection();
				st = conet.createStatement();
				st.executeUpdate(sql);
				txtInsumo.setText("");
				txtCantidad.setText("");
				txtPrecio.setText("");
				
				JOptionPane.showMessageDialog(null, "Insumo modificado");
				limpiarTabla();
			}
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void autoIncrementar() {
		try {
			
			PreparedStatement actu = conet.prepareStatement("call Autoinsumos");
			actu.executeUpdate();
			
		} catch (SQLException e1) {
			System.out.println(e1);
	}
	}
	
	private void Eliminar() {
		int fila = table.getSelectedRow();
		String id = txtID.getText();
		
		try {
			if(fila<0) {
				JOptionPane.showMessageDialog(null, "Insumo no seleccionado");
				limpiarTabla();
			
			}else {
				String sql = "delete from insumos where idInsumo= "+id;
				conet = con1.getConnection();
				st = conet.createStatement();
				st.executeUpdate(sql);
				txtInsumo.setText("");
				txtCantidad.setText("");
				txtPrecio.setText("");
				txtID.setText("");
				
				JOptionPane.showMessageDialog(null, "Insumo eliminado");
				limpiarTabla();
			}
		}catch (Exception e) {
			
		}
	}
	
	
	
	
	
	@Override
	public Image getIconImage() {
	Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/loguititito.png"));
	return retValue;
	}
}
