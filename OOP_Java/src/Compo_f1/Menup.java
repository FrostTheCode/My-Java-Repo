package Compo_f1;
import javax.swing.JOptionPane;
public class Menup {
	public void men() {
	IM im=new IM();
	IN in=new IN();
	
	int op;
	do {
	op=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Datos imprimibles\n2.-Datos ingresables\n3.-Salir","menu del F1",JOptionPane.INFORMATION_MESSAGE));	
	switch(op)
	{
	case 1:
		JOptionPane.showMessageDialog(null,im.im(),"Datos de la F1",JOptionPane.INFORMATION_MESSAGE);
		break;
	case 2:
		JOptionPane.showMessageDialog(null,in.in(),"Datos de la F1",JOptionPane.INFORMATION_MESSAGE);
		break;
	case 3:
		System.exit(0);
		break;
		default:
			JOptionPane.showMessageDialog(null, "opcion incorrecta","Error del input",JOptionPane.ERROR_MESSAGE);
	}
	}while(op!=3);
	}
}
