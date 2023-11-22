import java.awt.event.*; //Para manejar los eventos
import javax.swing.*; //Para utilizar los componentes visuales de swing .
public class Boton
{
//Creamos un objeto marco (JFrame) que es una ventana tipica de window y la inicializamos su constructor recibe un
//parametro
//que es el titulo de la ventana.
JFrame marco = new JFrame("Boton personalizado");
//Creamos un objeto panel que es el contenedor del boton que usaremos en la aplicacion.
JPanel panel = new JPanel();
//Declaramos objetos de tipo ImageIcon que son los que podemos agregar a los JLabel,JButton
//los archivos tienen que estar en el path especificado
ImageIcon playBtn1 = new ImageIcon("src/botones/p1.png");
ImageIcon playBtn2 = new ImageIcon("src/botones/p2.png");
ImageIcon playBtn3 = new ImageIcon("src/botones/p3.png");
//Constructor –> Es lo primero que se ejecuta al inicializar un objeto de esta clase (Boton)
public Boton()
{
//Configuramos las propiedades de la ventana (tamaño,visibilidad,etc)
marco.setSize(500,400);
marco.setVisible(true);
marco.setResizable(false);
marco.setLocationRelativeTo(null); //Para que la ventana aparezca en el centro de la pantalla
//Agregamos un escucha para marco(JFrame), para controlar el evento closing de la ventana
marco.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
//Llamamos a la funcion inicializar componentes
inicializarComponentes();
}
public void inicializarComponentes()
{
//Configuramos el panel para que los componentes tengan un modo
//de diseño nulo o personalizado en donde nosotros indiquemos la
//posicion en pantalla de los mismos
panel.setLayout(null);
	JButton playButton =new JButton();
playButton.setBounds(200,150,67,62);
//Llamamos a la funcion ConfigurarBoton los parametro son : (JButton,ImageIcon,ImageIcon,ImageIcon)
ConfigurarBoton(playButton,playBtn1,playBtn2,playBtn3);
//Agregamos el boton al panel
panel.add(playButton);
//Finalmente agregamos el panel al marco(JFrame)
marco.setContentPane(panel);
}
public void ConfigurarBoton(JButton boton,ImageIcon img1,ImageIcon img2,ImageIcon img3)
{
//Definimos el icono por defecto que tendra la imagen
boton.setIcon(img1);
//Para que el boton no tenga borde …
boton.setBorderPainted(false);
//Para que no se pinte el boton
boton.setContentAreaFilled(false);
boton.setFocusable(false);
boton.setRolloverEnabled(true);
//Definimos el icono que se mostrara cuando el mouse este sobre el boton
boton.setRolloverIcon(img2);
//Configuramos el icono que se mostrara cuando se de click en el boton
boton.setPressedIcon(img3);
}
//El metodo principal crea e inicializa un nuevo objeto de tipo Boton
public static void main(String args[])
{
new Boton() ;
}
}
