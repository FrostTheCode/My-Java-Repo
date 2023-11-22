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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Observable;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.RowFilter;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import com.toedter.calendar.JDateChooser;
import java.awt.Label;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class Informe extends JFrame {
	
	Conexion con1 = new Conexion();
	Connection conet;
	Statement st;
	ResultSet rs;
	int idB;
	
	DefaultTableModel modeloVentas;
	DefaultTableModel modeloInsumos;

	private JPanel contentPane;
	public JTable tablaInforme;
	private JTable table;
	private JTextField txtFiltrarVentas;
	private JTextField txtFiltrarInsumos;
	private JDateChooser dateChooser;
	private JButton btnTotalVenta;
	private JButton btnTotalInsumos;
	
	TableRowSorter sorter;

	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Informe() {
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
		Pac.setLayout(new GridLayout(0, 4, 0, 0));
		
		txtFiltrarVentas = new JTextField();
		txtFiltrarVentas.setHorizontalAlignment(SwingConstants.CENTER);
		
		//CAJA DE TEXTO PARA FILTRAR VENTAS
		txtFiltrarVentas.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				filtroVentas(txtFiltrarVentas.getText());
				btnTotalVenta.setText(Float.toString(sumaVenta()));
			}
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
		});
		txtFiltrarVentas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		txtFiltrarVentas.setIgnoreRepaint(true);
		txtFiltrarVentas.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "FILTRAR VENTAS POR FECHA", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		Pac.add(txtFiltrarVentas);
		txtFiltrarVentas.setColumns(10);
		
		
		//CAJA DE TEXTO PARA FILTRAR INSUMOS
		txtFiltrarInsumos = new JTextField();
		txtFiltrarInsumos.setHorizontalAlignment(SwingConstants.CENTER);
		txtFiltrarInsumos.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				filtroInsumos(txtFiltrarInsumos.getText());
				btnTotalInsumos.setText(Float.toString(sumaInsumos()));
			}
		});
		
		
		//BOTON PARA OBTENER EL TOTAL DE VENTAS
		
		btnTotalVenta = new JButton("Total de venta");
		btnTotalVenta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTotalVenta.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnTotalVenta.setBackground(new Color(169, 169, 169));
		btnTotalVenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnTotalVenta.setText(Float.toString(sumaVenta()));
			}
		});
		Pac.add(btnTotalVenta);
		txtFiltrarInsumos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtFiltrarInsumos.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "FILTRAR INSUMOS POR FECHA", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		Pac.add(txtFiltrarInsumos);
		txtFiltrarInsumos.setColumns(10);
		
		//BOTON PARA ACTUALIZAR VENTAS
		
		JButton btnActualizarVentas = new JButton("Actualizar ventas");
		btnActualizarVentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizarVentas();
				consultarVentas();
				btnTotalVenta.setText(Float.toString(sumaVenta()));
				txtFiltrarVentas.setText("");
				
			}
		});
		
		//BOTON PARA OBTENER EL TOTAL DE INSUMOS
		
		btnTotalInsumos = new JButton("Total de insumos");
		btnTotalInsumos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnTotalInsumos.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnTotalInsumos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTotalInsumos.setBackground(new Color(169, 169, 169));
		Pac.add(btnTotalInsumos);
		btnActualizarVentas.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnActualizarVentas.setBorder(new MatteBorder(0, 1, 1, 3, (Color) new Color(51, 153, 51)));
		btnActualizarVentas.setBackground(Color.YELLOW);
		Pac.add(btnActualizarVentas);
		
		
		
		JButton btnActualizarIns = new JButton("Actualizar insumos");
		btnActualizarIns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizarInsumos();
				consultarInsumos();
				btnTotalInsumos.setText(Float.toString(sumaInsumos()));
				txtFiltrarInsumos.setText("");
				
			}
		});
		
		JLabel lblNewLabel_6 = new JLabel("");
		Pac.add(lblNewLabel_6);
		btnActualizarIns.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnActualizarIns.setBorder(new MatteBorder(0, 1, 1, 3, (Color) new Color(51, 153, 51)));
		btnActualizarIns.setBackground(Color.YELLOW);
		Pac.add(btnActualizarIns);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new GridLayout(1, 2, 0, 0));
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
		
		JLabel lblNewLabel = new JLabel("INFORME");
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
		
		Calendar calendario = new GregorianCalendar();
		
		dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("yyyy-MM-dd");
		panel_1.add(dateChooser);
		
		dateChooser.setFont(new java.awt.Font("Tahoma,",0,20));
		
		dateChooser.setCalendar(calendario);
		
		Label label = new Label("-----------------------------");
		label.setForeground(SystemColor.menu);
		dateChooser.add(label, BorderLayout.SOUTH);
		
		Label label_1 = new Label("");
		dateChooser.add(label_1, BorderLayout.NORTH);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_4.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		panel.add(panel_4, BorderLayout.SOUTH);
		
		//BOTON PARA OBTENER GANACIAS O PERDIDAS
		
		JButton btnNewButton = new JButton("Obtener ganancia");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float total = sumaVenta()-sumaInsumos();
				if(total <= 0) {
					
					JOptionPane.showMessageDialog(null, "Perdida: "+total);
					
				}else {
					JOptionPane.showMessageDialog(null, "Ganancia: "+total);
				}
					
					
				
			}
		});
		panel_4.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(0, 128, 0), 4));
		panel_3.add(scrollPane);
		
		//TABLA DE INFORME DE VENTAS
		
		tablaInforme = new JTable();
		tablaInforme.setAutoCreateRowSorter(true);
		sorter = new TableRowSorter<>(modeloVentas);
		tablaInforme.setRowSorter(sorter);
		scrollPane.setViewportView(tablaInforme);
		tablaInforme.setRowHeight(30);
		tablaInforme.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID VENTA", "Platillo/Bebida", "FECHA VENTA", "TOTAL VENTA"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tablaInforme.getColumnModel().getColumn(0).setResizable(false);
		tablaInforme.getColumnModel().getColumn(0).setPreferredWidth(88);
		tablaInforme.getColumnModel().getColumn(0).setMaxWidth(150);
		tablaInforme.getColumnModel().getColumn(1).setResizable(false);
		tablaInforme.getColumnModel().getColumn(1).setPreferredWidth(160);
		tablaInforme.getColumnModel().getColumn(2).setResizable(false);
		tablaInforme.getColumnModel().getColumn(2).setPreferredWidth(188);
		tablaInforme.getColumnModel().getColumn(2).setMaxWidth(194);
		tablaInforme.getColumnModel().getColumn(3).setResizable(false);
		tablaInforme.getColumnModel().getColumn(3).setPreferredWidth(86);
		tablaInforme.setFont(new java.awt.Font("Tahoma,",0,20));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new MatteBorder(4, 0, 4, 4, (Color) new Color(0, 128, 0)));
		panel_3.add(scrollPane_1);
		
		//TABLA DE INFORME DE INSUMOS
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		table.setRowHeight(30);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"INSUMOS", "FECHA", "TOTAL"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		table.setFont(new java.awt.Font("Tahoma,",0,20));
		
	
		
		txtFiltrarVentas.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
				
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
		consultarInsumos();
		consultarVentas();
		
	}
	
	@Override
	public Image getIconImage() {
	Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/loguititito.png"));
	return retValue;
	}
	
	
	//METODO PARA CONSULTAR VENTAS
	
	public void consultarVentas() {
		// TODO Auto-generated method stub
		String sql = "select idVenta, platillo, fechaVenta, totalVenta from informeVentas";
				
			try {
				conet = con1.getConnection();
				st = conet.createStatement();
				rs = st.executeQuery(sql);
				Object[] ventas = new Object[4];
				modeloVentas = (DefaultTableModel) tablaInforme.getModel();
				while (rs.next()) {
					ventas [0] = rs.getInt("idVenta");
					ventas [1] = rs.getString("platillo");
					ventas [2] = rs.getString("fechaVenta");
					ventas [3] = rs.getString("totalVenta");
				
				
						
					modeloVentas.addRow(ventas);
				}
				tablaInforme.setModel(modeloVentas);
				
			}catch (SQLException e){
					
				System.out.println(e);
			}	
			
	}
	
	//METODO PARA CONSULTAR INSUMOS
	
	public void consultarInsumos() {
		// TODO Auto-generated method stub
		String sql = "select insumo,fechaInsumos,totalInsumos from informeInsumos";
		
		try {
			conet = con1.getConnection();
			st = conet.createStatement();
			rs = st.executeQuery(sql);
			Object[] insumos = new Object[3];
			modeloInsumos = (DefaultTableModel) table.getModel();
			while (rs.next()) {
				insumos [0] = rs.getString("insumo");
				insumos [1] = rs.getString("fechaInsumos");
				insumos [2] = rs.getFloat("totalInsumos");
			
					
				modeloInsumos.addRow(insumos);
				
			}
			table.setModel(modeloInsumos);
			
		}catch (Exception e){
			
			System.out.println(e);
				
		}	
			
	}
	
	
	
	//METODO PARA LIMPIAR LA TABLA DE VENTAS
	
	public void limpiarTablaVentas() {
		
		for(int i = 0; i <= tablaInforme.getRowCount(); i++) {
			modeloVentas.removeRow(i);
			i = i-1;
		}
		
		System.out.println("Entro en el metodo ventas");
	}
	
	
	//METODO PARA LIMPIAR LA TABLA DE INSUMOS
	
	public void limpiarTablaInsumos() {
		
		for(int i = 0; i <= table.getRowCount(); i++) {
			modeloInsumos.removeRow(i);
			i = i-1;
		}
		
		System.out.println("Entro en el metodo");
		
	}
	
	
	//METODO PARA SUMAR VENTAS
	
	public float sumaVenta() {
		int contar = tablaInforme.getRowCount();
		float suma = 0;
		for (int i = 0; i < contar; i++) {
			suma = suma+Float.parseFloat(tablaInforme.getValueAt(i, 3).toString());
		}
		
		return suma;
	}
	
	//METODO PARA SUMAR INSUMOS
	
	public float sumaInsumos() {
		int contar = table.getRowCount();
		float suma = 0;
		for (int i = 0; i < contar; i++) {
			suma = suma+Float.parseFloat(table.getValueAt(i, 2).toString());
		}
		
		return suma;
	}
	
	
	//METODO PARA FILTRAR VENTAS POR FECHA
	
	public void filtroVentas(String dato) {
		// TODO Auto-generated method stub
		String [] titulos= {"ID venta","Platillo/Bebida","Fecha","Total"};
		
		String [] registros = new String[4];
		
		String sql = "select idVenta, platillo, fechaVenta, totalVenta from informeVentas where fechaVenta like '%"+dato+"%'";
			
		modeloVentas = new DefaultTableModel(null,titulos);
		
		
			try {
				conet = con1.getConnection();
				st = conet.createStatement();
				rs = st.executeQuery(sql);
				
				while (rs.next()) {
					registros [0] = rs.getString("idVenta");
					registros [1] = rs.getString("platillo");
					registros [2] = rs.getString("fechaVenta");
					registros [3] = rs.getString("totalVenta");
				modeloVentas.addRow(registros);

				}
				
				tablaInforme.setModel(modeloVentas);
				
				
			}catch (SQLException e){
					
				System.out.println(e);
			}	
			
	}
	
	
	//METODO PARA FILTRAR INSUMOS POR FECHA
	
	public void filtroInsumos(String dato) {
		// TODO Auto-generated method stub
		String [] titulos= {"Insumos","Fecha","Total"};
		
		String [] registros = new String[3];
		
		String sql = "select insumo,fechaInsumos,totalInsumos from informeInsumos where fechaInsumos like '%"+dato+"%'";
			
		modeloInsumos = new DefaultTableModel(null,titulos);
		
		
			try {
				conet = con1.getConnection();
				st = conet.createStatement();
				rs = st.executeQuery(sql);
				
				while (rs.next()) {
					registros [0] = rs.getString("insumo");
					registros [1] = rs.getString("fechaInsumos");
					registros [2] = rs.getString("totalInsumos");
				modeloInsumos.addRow(registros);

				}
				
				table.setModel(modeloInsumos);
				
				
			}catch (SQLException e){
					
				System.out.println(e);
			}	
			
	}
	
	//METODO PARA ACTUALIZAR LAS VENTAS
	
	public void actualizarVentas() {
		
		try {
			
			limpiarTablaVentas();
			
		}catch(Exception e) {
			
		}
	}
	
	//METODO PARA ACTUALIZAR LOS INSUMOS
	
	public void actualizarInsumos() {
		
		try {
			
			limpiarTablaInsumos();
			
		}catch(Exception e) {
			
		}
	}
	
	
	
	
}
