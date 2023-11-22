package arreglos;

import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ArreglosMenu {

	public static void main(String[] args) {
		menuar();

	}

	private static void menuar() {
		int []x=new int [10];
		int []y=new int [10];
		Random nr=new Random();
		for (int i=0;i<x.length;i++)
		{
			x[i]=nr.nextInt(20)+1;//llenar arreglos del 1 al 20;
			y[i]=nr.nextInt(20)+1;
		}
		int opc;
		do {
		opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Suma \n2.-Resta \n3.-divicion\n4.-multiplicacion\n5.-residuo\n6.-Intercalacion\n7.-Salir","menu Principalarreglos",JOptionPane.INFORMATION_MESSAGE));
		switch(opc)		{
		case 1:
			suma(x,y);
			break;
		case 2:
			resta(x,y);
			break;
		case 3:
			divicion(x,y);
			break;
		case 4:
			multiplicacion(x,y);
			break;
		case 5:
			residuo(x,y);
			break;
		case 6:
			inter(x,y);
			break;
		case 7:
		System.exit(0);
		break;
		default:JOptionPane.showMessageDialog(null, "error","opcion incorrecta",JOptionPane.ERROR_MESSAGE);
			
		}//fin del nintendo
		}while(opc!=7);
	}

	private static void suma(int[] x, int[] y) {
		//suma dos arreglos
		JTextArea sal=new JTextArea();
		String datos="x\ty\tx+y\n";
		for (int i=0;i<x.length;i++)
		{
			datos+=x[i]+"\t"+y[i]+"\t"+(x[i]+y[i])+"\n";
			sal.setText(datos);//meter los datos en sal
					}
		JOptionPane.showMessageDialog(null, sal,"suma de arreglos",JOptionPane.INFORMATION_MESSAGE);

		
	}

	private static void resta(int[] x, int[] y) {
		// TODO Auto-generated method stub
		JTextArea sal=new JTextArea();
		String datos="x\ty\tx+y\n";
		for (int i=0;i<x.length;i++)
		{
			datos+=x[i]+"\t"+y[i]+"\t"+(x[i]-y[i])+"\n";
			sal.setText(datos);//meter los datos en sal	
	}
		JOptionPane.showMessageDialog(null, sal,"resta de arreglos",JOptionPane.INFORMATION_MESSAGE);
	}

	private static void divicion(int[] x, int[] y) {
		JTextArea sal=new JTextArea();
		String datos="x\ty\tx+y\n";
		for (int i=0;i<x.length;i++)
		{
			datos+=x[i]+"\t"+y[i]+"\t"+(x[i]/y[i])+"\n";
			sal.setText(datos);//meter los datos en sal
	}
		JOptionPane.showMessageDialog(null, sal,"suma de arreglos",JOptionPane.INFORMATION_MESSAGE);
	}

	private static void multiplicacion(int[] x, int[] y) {
		// TODO Auto-generated method stub
		JTextArea sal=new JTextArea();
		String datos="x\ty\tx+y\n";
		for (int i=0;i<x.length;i++)
		{
			datos+=x[i]+"\t"+y[i]+"\t"+(x[i]*y[i])+"\n";
			sal.setText(datos);//meter los datos en sal
			
	}
	JOptionPane.showMessageDialog(null, sal,"suma de arreglos",JOptionPane.INFORMATION_MESSAGE);	
	}

	private static void residuo(int[] x, int[] y) {
		// TODO Auto-generated method stub
		JTextArea sal=new JTextArea();
		String datos="x\ty\tx+y\n";
		for (int i=0;i<x.length;i++)
		{
			datos+=x[i]+"\t"+y[i]+"\t"+(x[i]%y[i])+"\n";
			sal.setText(datos);//meter los datos en sal
			
	}
		JOptionPane.showMessageDialog(null, sal,"suma de arreglos",JOptionPane.INFORMATION_MESSAGE);
	}

	private static void inter(int[] x, int[] y) {
		// intercalacionde dos arreglos
        int []z	=new int[20];
        for (int i=0,j=0,k=1;i<z.length;i+=2,j++,k+=2)
        {
        	z[i]=x[j];//pares
        	z[k]=y[j];//impares
        }//imprime los tres arreglos 
        for (int i=0;i<x.length;i++)
        	JOptionPane.showMessageDialog(null, x[i]+"\t");
        JOptionPane.showMessageDialog(null, null);
        for (int i=0;i<y.length;i++)
        	System.out.print(y[i]+"\t");
        System.out.println();
       for (int i=0;i<z.length;i++)
        System.out.print(z[i]+"\t");
		
		
	}

}
