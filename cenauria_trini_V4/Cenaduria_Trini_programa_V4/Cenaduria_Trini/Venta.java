package Cenaduria_Trini;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
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
import java.awt.Insets;
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
import java.util.Date;
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
import java.sql.Statement;


import java.awt.Label;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Venta extends JFrame{	
	Conexion con1 = new Conexion();
	Connection conet;
	Statement st;
	ResultSet rs;
	
	
	DefaultTableModel modeloVenta;
	JDateChooser dateChooser;
	
	private JPanel contentPane;
	public JTable table;
	private JTextField txtPlatillo;
	private JTextField txtID;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JTextField txtVenta;
	public JButton btnAceptar;
	private int valor;
	Informe inf;
	Venta v;
	

	/**
	 * Create the frame.
	 */
	public Venta() {
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
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_6 = new JLabel("ID");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBorder(new MatteBorder(2, 2, 1, 2, (Color) new Color(0, 0, 0)));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		Pac.add(lblNewLabel_6);
		
		JLabel labelPlatillo = new JLabel("Platillo o Bebida");
		labelPlatillo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelPlatillo.setBorder(new MatteBorder(2, 2, 1, 2, (Color) new Color(0, 0, 0)));
		labelPlatillo.setHorizontalAlignment(SwingConstants.CENTER);
		Pac.add(labelPlatillo);
		
		JLabel lblNewLabel_8 = new JLabel("Cantidad");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_8.setBorder(new MatteBorder(2, 2, 0, 2, (Color) new Color(0, 0, 0)));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		Pac.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Precio");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_9.setBorder(new MatteBorder(2, 2, 1, 2, (Color) new Color(0, 0, 0)));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		Pac.add(lblNewLabel_9);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Agregar();
				consultar();
			}
		});
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnAgregar.setBorder(new MatteBorder(0, 1, 1, 3, (Color) new Color(51, 153, 51)));
		btnAgregar.setBackground(Color.YELLOW);
		Pac.add(btnAgregar);
		
		JButton btnNewButton_4_1 = new JButton("Modificar");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Modificar();
				consultar();
				
			}
		});
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_4_1.setBorder(new MatteBorder(0, 1, 1, 3, (Color) new Color(51, 153, 51)));
		btnNewButton_4_1.setBackground(Color.YELLOW);
		Pac.add(btnNewButton_4_1);
		
		txtID = new JTextField();
		txtID.setEditable(false);
		txtID.setHorizontalAlignment(SwingConstants.CENTER);
		txtID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtID.setBorder(new MatteBorder(0, 2, 2, 2, (Color) new Color(0, 0, 0)));
		Pac.add(txtID);
		txtID.setColumns(10);
		
		txtPlatillo = new JTextField();
		txtPlatillo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtPlatillo.getText().length() == 50) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		txtPlatillo.setHorizontalAlignment(SwingConstants.CENTER);
		txtPlatillo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPlatillo.setBorder(new MatteBorder(0, 2, 2, 2, (Color) new Color(0, 0, 0)));
		Pac.add(txtPlatillo);
		txtPlatillo.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 int key = e.getKeyChar();

				 boolean numeros = key >= 48 && key <= 57 || key == 8;
					
					if(!numeros) {
						getToolkit().beep();
						e.consume();
						
						JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
					}else if(txtCantidad.getText().matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")){
						getToolkit().beep();
						e.consume();
					}
			}
		});
		txtCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCantidad.setBorder(new MatteBorder(1, 2, 2, 2, (Color) new Color(0, 0, 0)));
		Pac.add(txtCantidad);
		txtCantidad.setColumns(10);
		
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
		txtPrecio.setBorder(new MatteBorder(0, 2, 2, 2, (Color) new Color(0, 0, 0)));
		Pac.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBorder(new MatteBorder(0, 3, 1, 1, (Color) new Color(51, 153, 51)));
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eliminar();
				consultar();
			}
		});
		
		btnAceptar = new JButton("Aceptar");
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int filas = table.getRowCount();
				
				try {
					
					if(filas == 0) {
						
						JOptionPane.showMessageDialog(null, "No hay datos para enviar");
						limpiarTabla();
						
					}else {
					
					PreparedStatement actu = conet.prepareStatement("call enviarVentas");
					actu.executeUpdate();
					JOptionPane.showMessageDialog(null, "Se enviaron los datos de venta");
					totalVenta();
					autoIncrementar();
					txtVenta.setText("VENTA "+ultimoValor());
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
		Pac.add(btnNewButton);
		contentPane.add(Pac, BorderLayout.SOUTH);
		
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
		
		JLabel lblNewLabel = new JLabel("VENTA");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 128, 0), 4));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		panel.add(lblNewLabel, BorderLayout.CENTER);
		
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
		
		txtVenta = new JTextField("VENTA");
		txtVenta.setEditable(false);
		txtVenta.setBackground(SystemColor.menu);
		txtVenta.setForeground(Color.RED);
		
		txtVenta.setHorizontalAlignment(SwingConstants.RIGHT);
		txtVenta.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(txtVenta, BorderLayout.SOUTH);
		txtVenta.setColumns(10);
		
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
					String plat = (String) table.getValueAt(fila, 1);
				    int cant = Integer.parseInt((String) table.getValueAt(fila, 2).toString());
					float pre = Float.parseFloat((String) table.getValueAt(fila, 3).toString());
		
					
					txtID.setText(""+id);
					txtPlatillo.setText(plat);
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
				"ID", "PLATILLO/BEBIDA", "CANTIDAD", "PRECIO"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, Float.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
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
		String sql = "select * from venta";
				
			try {
				conet = con1.getConnection();
				st = conet.createStatement();
				rs = st.executeQuery(sql);
				Object[] ventas = new Object[4];
				modeloVenta = (DefaultTableModel) table.getModel();
				while (rs.next()) {
					ventas [0] = rs.getInt("idPlatillo");
					ventas [1] = rs.getString("platillo");
					ventas [2] = rs.getString("cantidad");
					ventas [3] = rs.getFloat("precio");
				
				
				
						
					modeloVenta.addRow(ventas);
				}
				table.setModel(modeloVenta);
				
			}catch (Exception e){
					
			}	
	}
	
	public void actualizarDatos() {
		int fila = table.getSelectedRow();
		
		int id = Integer.parseInt(this.table.getValueAt(fila, 0).toString());
		
		String platillo = table.getValueAt(fila, 1).toString();
		
		int cant = Integer.parseInt(this.table.getValueAt(fila, 2).toString());
		
		float pre = Float.parseFloat(this.table.getValueAt(fila, 3).toString());
		
		try {
			
			PreparedStatement actu = conet.prepareStatement("UPDATE venta SET idVenta='"+id+"',platillo='"+platillo+"',cantidad='"+cant+"',precio='"+pre+"'WHERE idVenta = '"+id+"'");
			actu.executeUpdate();
			consultar();
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e + "No se logro actualizar");
		}
		
		
	}
	
	public void limpiarTabla() {
		
		for(int i = 0; i <= table.getRowCount(); i++) {
			modeloVenta.removeRow(i);
			i = i-1;
		}
	}
	
	
	
	
	private void Agregar() {
		int idVenta = ultimoValor();
		String plat = txtPlatillo.getText();
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
			
			if (plat.equals("") || cant.equals("") || pre.equals("") || date.equals("")) {
				
				JOptionPane.showMessageDialog(null, "DATOS VACIOS","ERROR",JOptionPane.INFORMATION_MESSAGE);
				limpiarTabla();
				
				
			}else if(totalCharacters>1 || txtPrecio.getText().matches("[.]")) {
				
					JOptionPane.showMessageDialog(null, "Valores invalidos en Precio. Ingresar solo numeros");
					limpiarTabla();
				
			}else {
				String sql = "insert into venta(idVenta, platillo, cantidad, precio, fecha)"
						+ "values ('"+idVenta+"','"+plat+"','"+cant+"','"+pre+"','"+date+"')";
				conet = con1.getConnection();
				st = conet.createStatement();
				st.executeUpdate(sql);
				txtPlatillo.setText("");
				txtCantidad.setText("");
				txtPrecio.setText("");
				
				JOptionPane.showMessageDialog(null, "Nueva venta registrada");
				limpiarTabla();
			}
			
		}catch (Exception e) {
			
		}
		
	}
	
	
	private void Eliminar() {
		int fila = table.getSelectedRow();
		String id = txtID.getText();
		try {
			if(fila<0) {
				JOptionPane.showMessageDialog(null, "Venta no seleccionada");
				limpiarTabla();
			
			}else {
				String sql = "delete from venta where idPlatillo= "+id;
				conet = con1.getConnection();
				st = conet.createStatement();
				st.executeUpdate(sql);
				txtPlatillo.setText("");
				txtCantidad.setText("");
				txtPrecio.setText("");
				txtID.setText("");
				
				JOptionPane.showMessageDialog(null, "Venta eliminada");
				limpiarTabla();
			}
		}catch (Exception e) {
			
		}
	}
	
	
	private void Modificar() {
		String plat = txtPlatillo.getText();
		String cant = txtCantidad.getText();
		String pre = txtPrecio.getText();
		String id = txtID.getText();
		String date =((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
		
		
		int totalCharacters = 0;
        char temp;
		
		try {
			
			for (int i = 0; i < txtPrecio.getText().length(); i++) {

	            temp = txtPrecio.getText().charAt(i);
	            if (temp == '.')
	                totalCharacters++;
	        }
			
			if (id.equals("") || plat.equals("") || cant.equals("") || pre.equals("") || date.equals("")) {
				
				JOptionPane.showMessageDialog(null, "NO SE HAN SELECCIONADO DATOS O SON INVALIDOS","ERROR",JOptionPane.INFORMATION_MESSAGE);
				limpiarTabla();
			}else if(totalCharacters>1 || txtPrecio.getText().matches("[.]")) {
				JOptionPane.showMessageDialog(null, "Valores invalidos en Precio");
				limpiarTabla();
			}else {
				String sql = "Update venta set idVenta='"+id+"',platillo= '"+plat+"',cantidad= '"+cant+"',precio= '"+pre+"',fecha= '"+date+"'where idPlatillo= "+id;
				conet = con1.getConnection();
				st = conet.createStatement();
				st.executeUpdate(sql);
				txtPlatillo.setText("");
				txtCantidad.setText("");
				txtPrecio.setText("");
				
				JOptionPane.showMessageDialog(null, "Venta modificada");
				limpiarTabla();
				
			}
			
		}catch (Exception e) {
			
		}
		

	}
	
	public void totalVenta() {
		
		float fila = 0;
		float total = 0;
		
		for(int i=0; i<table.getRowCount(); i++) {
			fila = Float.parseFloat(table.getValueAt(i, 3).toString());
			total +=  fila;
		}
		
		JOptionPane.showMessageDialog(null, "El total es: "+total);
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
	
	
	public int ultimoValor() {
		
		inf = new Informe();
		
		int contar = inf.tablaInforme.getRowCount();
		
		for(int i=0; i<contar; i++) {
			
			valor = Integer.parseInt(inf.tablaInforme.getValueAt(i, 0).toString());
		}
		
		return valor+1;
		
	}
	
	public void autoIncrementar() {
		try {
			
			PreparedStatement actu = conet.prepareStatement("call Autoventas");
			actu.executeUpdate();
			
		} catch (SQLException e1) {
			System.out.println(e1);
	}
	}
	
	
	@Override
	public Image getIconImage() {
	Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/loguititito.png"));
	return retValue;
	}
	
	
	}
