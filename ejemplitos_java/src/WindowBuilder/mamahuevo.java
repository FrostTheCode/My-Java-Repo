package WindowBuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JEditorPane;
import java.awt.Font;

public class mamahuevo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mamahuevo frame = new mamahuevo();
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
	public mamahuevo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextPane txtpnElMamahuevo = new JTextPane();
		txtpnElMamahuevo.setBackground(Color.ORANGE);
		txtpnElMamahuevo.setText("                                                           El Mamahuevo");
		contentPane.add(txtpnElMamahuevo, BorderLayout.NORTH);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		contentPane.add(editorPane, BorderLayout.CENTER);
	}

}
