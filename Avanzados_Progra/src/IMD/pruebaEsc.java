package IMD;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class pruebaEsc {
	
	public static void main( String args[] )
	{
	nani marcoEscritorio = new nani();
	marcoEscritorio.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	marcoEscritorio.setSize( 600, 480 ); // establece el tama�o del marco
	marcoEscritorio.setVisible( true ); // muestra el marco
	} // fin de main
	}
 class nani extends JFrame
{
private JDesktopPane elEscritorio;
// establece la GUI
public nani()
{
super( "Uso de JDesktopPane" );
JMenuBar barra = new JMenuBar(); // crea la barra de men�s
JMenu menuAgregar = new JMenu( "Agregar" ); // crea el men� Agregar
JMenuItem nuevoMarco = new JMenuItem( "Marco interno" );
menuAgregar.add( nuevoMarco ); // agrega nuevo elemento marco al men� Agregar
barra.add( menuAgregar ); // agrega el men� Agregar a la barra de men�s
setJMenuBar( barra ); // establece la barra de men�s para esta aplicaci�n
elEscritorio = new JDesktopPane(); // crea el panel de escritorio
add( elEscritorio ); // agrega el panel de escritorio al marco
// establece componente de escucha para el elemento de men� nuevoMarco
nuevoMarco.addActionListener(
new ActionListener() // clase interna an�nima
{
// muestra la nueva ventana interna
public void actionPerformed( ActionEvent evento )
{
// crea el marco interno
JInternalFrame marco = new JInternalFrame("Marco interno", true, true, true, true );
MiJPanel panel = new MiJPanel(); // crea nuevo panel
marco.add( panel, BorderLayout.CENTER ); // agrega el panel
marco.pack(); // establece marco interno al tama�o del contenido
elEscritorio.add( marco ); // adjunta marco interno
marco.setVisible( true ); // muestra marco interno
} // fin del m�todo actionPerformed
} // fin de la clase interna an�nima
); // fin de la llamada a addActionListener
} // fin del constructor de MarcoEscritorio
} // fin de la clase MarcoEscritorio

//clase para mostrar un objeto ImageIcon en un panel
	class MiJPanel extends JPanel
	{
	private static Random generador = new Random();
	private ImageIcon imagen; // imagen a mostrar
	private String[] imagenes = { "floresamarillas.png", "floresmoradas.png", "floresrojas.png", "floresrojas2.png", "floreslavanda.png" };
	// carga la imagen
	public MiJPanel()
	{
	int numeroAleatorio = generador.nextInt( 5 );
	imagen = new ImageIcon( imagenes[ numeroAleatorio ] ); // establece el icono
	} // fin del constructor de MiJPanel
	// muestra el objeto imageIcon en el panel
	public void paintComponent( Graphics g )
	{
	super.paintComponent( g );
	imagen.paintIcon( this, g, 0, 0 ); // muestra el icono
	} // fin del m�todo paintComponent
	// devuelve las medidas de la imagen
	public Dimension getPreferredSize()
	{
	return new Dimension( imagen.getIconWidth(),
	imagen.getIconHeight() );
	} // fin del m�todo getPreferredSize
	} // fin de la clase MiJPanel
	