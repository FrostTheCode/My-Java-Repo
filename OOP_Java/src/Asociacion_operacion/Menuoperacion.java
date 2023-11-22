package Asociacion_operacion;

import javax.swing.JOptionPane;

public class Menuoperacion {
	public void menu()
	{
		Suma s=new Suma();
		Resta r=new Resta();
		Multiplicacion m=new Multiplicacion();
		Divicion d=new Divicion();
		Promedio p=new Promedio();
		String name;
		int opc,n1,n2,n3,n4,n5,rs,rr,rm,rd;
		do {
		opc=Integer.parseInt(JOptionPane.showInputDialog("1.-Suma\n2.-Resta\n3.-Multiplicacion\n4.-Divicion\n5.-Promedio\n6.-Salir"));
		switch (opc)
		{
		case 1:
		{
			n1=Integer.parseInt(JOptionPane.showInputDialog("ingresa el primer valor"));
			n2=Integer.parseInt(JOptionPane.showInputDialog("ingresa el segundo valor"));
			rs=s.sum(n1, n2);
			JOptionPane.showMessageDialog(null, "el resultado de"+n1+" + "+n2+" es = "+rs);
		}
			break;
		case 2:
			n1=Integer.parseInt(JOptionPane.showInputDialog("ingresa el primer valor"));
			n2=Integer.parseInt(JOptionPane.showInputDialog("ingresa el segundo valor"));
			rr=r.rest(n1, n2);
			JOptionPane.showMessageDialog(null, "el resultado de"+n1+" - "+n2+" es = "+(r));
			break;
		case 3:
			n1=Integer.parseInt(JOptionPane.showInputDialog("ingresa el primer valor"));
			n2=Integer.parseInt(JOptionPane.showInputDialog("ingresa el segundo valor"));
            m.max(n1, n2);
			break;
		case 4:
			n1=Integer.parseInt(JOptionPane.showInputDialog("ingresa el primer valor"));
			n2=Integer.parseInt(JOptionPane.showInputDialog("ingresa el segundo valor"));
			d.div(n1, n2);
			break;
		case 5:
			name=JOptionPane.showInputDialog("ingrese el nombre del estudiante");
			p.prom(name);
			break;
		case 6:
			System.exit(0);
			break;
			default:
				JOptionPane.showMessageDialog(null, "opcion no valida !!!!!!");
		}
		}while(opc!=6); 
	}

}
