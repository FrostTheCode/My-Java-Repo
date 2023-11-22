package unidad_1;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class grafico6 extends JFrame{
	private JPanel Cp;
	private JSpinner sp1;
	private JSpinner sp2;
	private JComboBox cb;

	/* sale el app*/
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
			   try {
				   grafico6 frame= new grafico6();
				   frame.setVisible(true);
			   }catch (Exception e) {
				   e.printStackTrace();
				   
			   }
				
			}
			
		});
		
	}
	
	/* crea el marco */
	public grafico6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,573,481);
		Cp = new JPanel();
		Cp.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(Cp);
		Cp.setLayout(null);
		sp1 = new JSpinner();
		sp1.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent arg0) {
				repaint();
			}
			
		});
		
		sp1.setModel(new SpinnerNumberModel(0,0,10,1));
		sp1.setBounds(162,51,55,28); 
		Cp.add(sp1);
		
		sp2 = new JSpinner();
		sp2.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent arg0) {
				repaint();
			}
			
		});
		
		sp2.setModel(new SpinnerNumberModel(0,0,10,1));
		sp2.setBounds(162,150,55,28); 
		Cp.add(sp2);
		
		JLabel lblMI = new JLabel("Margen Inferior");
		lblMI.setBounds(162,26,109,14);
		Cp.add(lblMI);
		
		
		
		
		
		
	}

}
