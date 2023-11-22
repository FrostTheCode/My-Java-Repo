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
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

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
	
	TableRowSorter sorter;

	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Informe() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				
			}
		});
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
		txtFiltrarVentas.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				filtroVentas(txtFiltrarVentas.getText());
			}
		});
		txtFiltrarVentas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		txtFiltrarVentas.setIgnoreRepaint(true);
		txtFiltrarVentas.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "FILTRAR VENTAS POR FECHA", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		Pac.add(txtFiltrarVentas);
		txtFiltrarVentas.setColumns(10);
		
		txtFiltrarInsumos = new JTextField();
		txtFiltrarInsumos.setHorizontalAlignment(SwingConstants.CENTER);
		txtFiltrarInsumos.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				filtroInsumos(txtFiltrarInsumos.getText());
			}
		});
		
		JButton btnTotalVenta = new JButton("Click para sacar el total");
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
		
		JButton btnActualizarVentas = new JButton("Actualizar ventas");
		btnActualizarVentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizarVentas();
				consultarVentas();
				
			}
		});
		
		JButton btnTotalInsumos = new JButton("Click para sacar el total");
		btnTotalInsumos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnTotalInsumos.setText(Float.toString(sumaInsumos()));
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
		
		JButton btnNewButton = new JButton("Obtener ganancia");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ganancia bruto: "+(sumaVenta()-sumaInsumos()));
			}
		});
		panel_4.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(0, 128, 0), 4));
		panel_3.add(scrollPane);
		
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
				"ID VENTA", "FECHA VENTA", "TOTAL VENTA"
			}
		));
		tablaInforme.getColumnModel().getColumn(0).setPreferredWidth(137);
		tablaInforme.getColumnModel().getColumn(0).setMaxWidth(150);
		tablaInforme.getColumnModel().getColumn(1).setPreferredWidth(188);
		tablaInforme.getColumnModel().getColumn(1).setMaxWidth(194);
		tablaInforme.setFont(new java.awt.Font("Tahoma,",0,20));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new MatteBorder(4, 0, 4, 4, (Color) new Color(0, 128, 0)));
		panel_3.add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		table.setRowHeight(30);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"INSUMOS", "FECHA", "TOTAL"
			}
		));
		
		table.setFont(new java.awt.Font("Tahoma,",0,20));
		
		
		consultarInsumos();
		consultarVentas();
		
	}
	
	@Override
	public Image getIconImage() {
	Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/loguititito.png"));
	return retValue;
	}
	
	
	public void consultarVentas() {
		// TODO Auto-generated method stub
		String sql = "select idVenta, fechaVenta, totalVenta from informeVentas";
				
			try {
				conet = con1.getConnection();
				st = conet.createStatement();
				rs = st.executeQuery(sql);
				Object[] ventas = new Object[3];
				modeloVentas = (DefaultTableModel) tablaInforme.getModel();
				while (rs.next()) {
					ventas [0] = rs.getInt("idVenta");
					ventas [1] = rs.getString("fechaVenta");
					ventas [2] = rs.getString("totalVenta");
				
				
						
					modeloVentas.addRow(ventas);
				}
				tablaInforme.setModel(modeloVentas);
				
			}catch (SQLException e){
					
				System.out.println(e);
			}	
			
	}
	
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

	
	public void limpiarTablaVentas() {
		
		for(int i = 0; i <= tablaInforme.getRowCount(); i++) {
			modeloVentas.removeRow(i);
			i = i-1;
		}
		
		System.out.println("Entro en el metodo ventas");
	}
	
	public void limpiarTablaInsumos() {
		
		for(int i = 0; i <= table.getRowCount(); i++) {
			modeloInsumos.removeRow(i);
			i = i-1;
		}
		
		System.out.println("Entro en el metodo");
		
	}
	
	public float sumaVenta() {
		int contar = tablaInforme.getRowCount();
		float suma = 0;
		for (int i = 0; i < contar; i++) {
			suma = suma+Float.parseFloat(tablaInforme.getValueAt(i, 2).toString());
		}
		
		return suma;
	}
	
	public float sumaInsumos() {
		int contar = table.getRowCount();
		float suma = 0;
		for (int i = 0; i < contar; i++) {
			suma = suma+Float.parseFloat(table.getValueAt(i, 2).toString());
		}
		
		return suma;
	}
	
	public void filtroVentas(String dato) {
		// TODO Auto-generated method stub
		String [] titulos= {"ID venta","Fecha","Total"};
		
		String [] registros = new String[3];
		
		String sql = "select idVenta, fechaVenta, totalVenta from informeVentas where fechaVenta like '%"+dato+"%'";
			
		modeloVentas = new DefaultTableModel(null,titulos);
		
		
			try {
				conet = con1.getConnection();
				st = conet.createStatement();
				rs = st.executeQuery(sql);
				
				while (rs.next()) {
					registros [0] = rs.getString("idVenta");
					registros [1] = rs.getString("fechaVenta");
					registros [2] = rs.getString("totalVenta");
				modeloVentas.addRow(registros);

				}
				
				tablaInforme.setModel(modeloVentas);
				
			}catch (SQLException e){
					
				System.out.println(e);
			}	
			
	}
	
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
	
	public void actualizarVentas() {
		
		try {
			
			limpiarTablaVentas();
			
		}catch(Exception e) {
			
		}
	}
	
	public void actualizarInsumos() {
		
		try {
			
			limpiarTablaInsumos();
			
		}catch(Exception e) {
			
		}
	}
	
	
	
}
