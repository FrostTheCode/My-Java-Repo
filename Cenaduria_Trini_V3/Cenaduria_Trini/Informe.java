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
import java.sql.Connection;
import java.sql.ResultSet;
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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Informe extends JFrame {
	
	Conexion con1 = new Conexion();
	Connection conet;
	Statement st;
	ResultSet rs;
	int idB;
	
	DefaultTableModel modeloInforme;

	private JPanel contentPane;
	public JTable tablaInforme;

	
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
		Pac.setLayout(new GridLayout(1, 1, 0, 0));
		
		JButton btnActualizar_1 = new JButton("Actualizar");
		btnActualizar_1.setEnabled(false);
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btnActualizar_1.isEnabled()) {
					btnActualizar_1.setEnabled(true);
				}
				limpiarTabla();
			}
		});
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnLimpiar.setBorder(new MatteBorder(0, 1, 1, 3, (Color) new Color(51, 153, 51)));
		btnLimpiar.setBackground(Color.YELLOW);
		Pac.add(btnLimpiar);
		
		
		btnActualizar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnLimpiar.isEnabled()) {
					btnActualizar_1.setEnabled(false);
				}
				consultar();
			}
		});
		btnActualizar_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnActualizar_1.setBorder(new MatteBorder(0, 1, 1, 3, (Color) new Color(51, 153, 51)));
		btnActualizar_1.setBackground(Color.YELLOW);
		Pac.add(btnActualizar_1);
		
		JButton btnNewButton_4 = new JButton("Aceptar");
		btnNewButton_4.setBorder(new MatteBorder(0, 1, 1, 3, (Color) new Color(51, 153, 51)));
		btnNewButton_4.setBackground(new Color(255, 255, 0));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 40));
		Pac.add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBorder(new MatteBorder(0, 3, 1, 1, (Color) new Color(51, 153, 51)));
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(new BorderLayout(0, 0));
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
		
		JLabel lblNewLabel = new JLabel("INFORME");
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
		
		JDateChooser dateChooser = new JDateChooser();
		panel_1.add(dateChooser);
		
		dateChooser.setFont(new java.awt.Font("Tahoma,",0,20));
		
		Calendar calendario = new GregorianCalendar();
		
		dateChooser.setCalendar(calendario);
		
		dateChooser.setDateFormatString("yyyy-MM-dd");
		
		Label label = new Label("-----------------------------");
		label.setForeground(SystemColor.menu);
		dateChooser.add(label, BorderLayout.SOUTH);
		
		Label label_1 = new Label("");
		dateChooser.add(label_1, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(0, 128, 0), 4));
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		tablaInforme = new JTable();
		scrollPane.setViewportView(tablaInforme);
		tablaInforme.setRowHeight(30);
		tablaInforme.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID venta", "FECHA VENTA", "TOTAL VENTA", "ID insumos", "FECHA INSUMOS", "TOTAL INSUMOS"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tablaInforme.getColumnModel().getColumn(0).setPreferredWidth(137);
		tablaInforme.getColumnModel().getColumn(0).setMaxWidth(150);
		tablaInforme.getColumnModel().getColumn(1).setPreferredWidth(188);
		tablaInforme.getColumnModel().getColumn(1).setMaxWidth(194);
		tablaInforme.getColumnModel().getColumn(3).setPreferredWidth(137);
		tablaInforme.getColumnModel().getColumn(3).setMaxWidth(150);
		tablaInforme.setFont(new java.awt.Font("Tahoma,",0,20));
		
		consultar();
		
		
	}
	
	@Override
	public Image getIconImage() {
	Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/loguititito.png"));
	return retValue;
	}
	
	
	public void consultar() {
		// TODO Auto-generated method stub
		String sql = "select * from informe";
				
			try {
				conet = con1.getConnection();
				st = conet.createStatement();
				rs = st.executeQuery(sql);
				Object[] insumos = new Object[6];
				modeloInforme = (DefaultTableModel) tablaInforme.getModel();
				while (rs.next()) {
					insumos [0] = rs.getInt("idVenta");
					insumos [1] = rs.getString("fechaVenta");
					insumos [2] = rs.getString("totalVenta");
					insumos [3] = rs.getInt("idInsumos");
					insumos [4] = rs.getString("fechaInsumos");
					insumos [5] = rs.getString("totalInsumos");
				
				
						
					modeloInforme.addRow(insumos);
				}
				tablaInforme.setModel(modeloInforme);
				
			}catch (Exception e){
					
			}	
			
	}
	
	public void tablaLlena() {
		
		
		
	}

	
	public void limpiarTabla() {
		
		for(int i = 0; i <= tablaInforme.getRowCount(); i++) {
			modeloInforme.removeRow(i);
			i = i-1;
		}
	}
}
