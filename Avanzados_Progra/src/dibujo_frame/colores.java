package dibujo_frame;
import java.awt.GraphicsEnvironment;
import javax.swing.*;

public class colores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fu=JOptionPane.showInputDialog("introduce la fuente deseada");
		boolean efu=false;
		String []nfus=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for(String nfu: nfus)
		{
			if(nfu.equals(fu))
			{
				efu=true;
			}
		}
		if(efu)
		{
			System.out.println("Fuente instalada");
		}else {
			System.out.println("No esta instalada la fuente");
		}
		
	}

}
