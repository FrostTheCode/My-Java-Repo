package Examen;

import java.util.Random;

import javax.swing.JOptionPane;

public class opArreglos {
	public void menuArreglos()
	{
		int opc;
		int a[]=new int[10];
		int b[]=new int[10];
		SumaAr sa=new SumaAr();
		multiplicacion ma=new multiplicacion();
		inversa in=new inversa();
	
		do {
			opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-inicializar arreglos\n2.-suma\n3.-multiplicacion\n4.-inversa\n5.-salir","jaja mira un menu de op",JOptionPane.INFORMATION_MESSAGE));
			switch(opc)
			{
			case 1:
				iniarr(a,b);
				break;
			case 2:
				sa.sum(a, b);
				break;
			case 3:
				ma.mul(a, b);
				break;
			case 4:
				in.in(a, b);
				break;
			case 5:
				System.exit(0);
				break;
				default:
					JOptionPane.showMessageDialog(null, "puso una opcion incorrecta","jaja te salio mal XD",JOptionPane.ERROR_MESSAGE);
			}
		}while(opc!=5);
		}
	public void iniarr(int[] a,int[] b)
	{
	Random nr=new Random();	
	for (int i=0;i<a.length;i++)
	{
		a[i]+=nr.nextInt(20)+1;
		b[i]+=nr.nextInt(20)+1;
	}
	
	
	
	}
	}
	


