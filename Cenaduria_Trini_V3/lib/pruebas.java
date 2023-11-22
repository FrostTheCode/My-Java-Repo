package lib;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;

public class pruebas extends JFrame {

	int numeroVenta = 1;
	int capturarVenta;
	private JPanel contentPane;
	private JTable table;
	private JButton btnNewButton;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pruebas frame = new pruebas();
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
	public pruebas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "1", null},
				{"2", "2", null},
				{"3", "3", null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(recorridoTabla().equals(textField.getText())) {
					System.out.println("Iguales");
				}
				
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.EAST);
		textField.setColumns(10);
		
	}
	
	public int ultimoValor() {
		
		int contar = table.getRowCount();
		int valor=0;
		
		for(int i=0; i<contar; i++) {
			
			
			valor = Integer.parseInt(table.getValueAt(i, 0).toString());
		}
		
		return valor;
		
	}
	
	public int totalVenta() {
		int contar = table.getRowCount();
		int suma = 0;
		for(int i = 0; i<contar; i++) {
			suma = suma+Integer.parseInt(table.getValueAt(i, 1).toString());
			
		}
		
		return suma;
	}
	
	public String recorridoTabla() {
		int contar = table.getRowCount();
		
		String idIgual = "";
		
		for(int i=0; i<contar; i++) {
			
			idIgual = table.getValueAt(i, 0).toString();
			
			if(textField.getText().equals(idIgual)) {
				return idIgual;
			}
			
		}
		return idIgual;
		
		
	}
	

}
