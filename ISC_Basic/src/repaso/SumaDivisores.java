package repaso;

import javax.swing.JOptionPane;

public class SumaDivisores {

	public static void main(String[] args) {
		int lim,nd,s=0;//calcula la sumatoria de un determinado multiplo
		do {
		lim=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el limite","limite",JOptionPane.INFORMATION_MESSAGE));
		if (lim<=0)
			JOptionPane.showMessageDialog(null, "el limite debe ser mayor que cero","Error!!",JOptionPane.ERROR_MESSAGE);
		}while (lim<=0);
		do {
		nd=Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el numero divisor: ","Divisor",JOptionPane.INFORMATION_MESSAGE));
		if (nd<=0)
			JOptionPane.showMessageDialog(null, "el divisor debe ser mayor que cero","Error!!",JOptionPane.ERROR_MESSAGE);
		}while (nd<=0);
		for(int i=1;1<=lim;i++)
		{
			if (i%nd==0)
				s+=nd;
		}
		JOptionPane.showMessageDialog(null, "el resultado de la suma"+s,"suma de multiplos",JOptionPane.INFORMATION_MESSAGE);
	}

}
