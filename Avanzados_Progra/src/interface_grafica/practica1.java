package interface_grafica;

	import java.awt.Color;
import java.awt.FlowLayout;
	import java.awt.GridLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JTextField;

	public class practica1 extends JFrame implements ActionListener
	{
	    JButton boton1; //aqui se inserta los botones para los programas
	    JButton boton2;
	    JLabel etiqueta;//aqui se inserta la etiqueta
	    
	    public void iniciar() {
	        getContentPane().setLayout(new GridLayout(2, 1));
	        
	        // contenedor para botones
	        JPanel panelBotones = new JPanel(new FlowLayout());
	        boton1 = new JButton("Elegir 1");// aque esta el text dentro de los botones.
	        boton2 = new JButton("Elegir 2");//esta solo es el metodo para los botones
	        panelBotones.add(boton1);
	        panelBotones.add(boton2);
	        
	        boton1.addActionListener(this);
	        boton2.addActionListener(this);
	       
	        etiqueta = new JLabel("No has elegido nada"); //este es el texto que aparece abajo de la seleccion del boton.
	        getContentPane().add(panelBotones);
	        getContentPane().add(etiqueta);
	        etiqueta.setHorizontalAlignment(0); //se ocupa este comando para alinear el texto de la etiqueta con numeros.
	        									//centro 0, arriba 1, izquierda 2, abajo 3, derecha 4
	        
	        pack();
	        setVisible(true);
	    }
	    
	    
	    public void actionPerformed(ActionEvent e)//aqui se muestra las opciones a tener cuando se selecciona el boton
	    {
	            if (e.getSource() == boton1) {
	                etiqueta.setText("Has elegido la opción 1"); //la etiqueta que muestra que boton se selecciono en cada caso 
	                boton1.setEnabled(false); 
	            } else {
	                etiqueta.setText("Has elegido la opción 2");
	                boton2.setEnabled(false);
	            }

	    }


	    /**
	     * @param args
	     */
	    public static void main(String[] args)
	    {
	        final practica1 ventana = new practica1();
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                ventana.iniciar();
	            }
	        });
	    }

	}


