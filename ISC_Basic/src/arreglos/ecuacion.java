package arreglos;

import java.util.Random;

public class ecuacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
inicio();

	}

	private static void inicio() {
		// TODO Auto-generated method stub
		int []x=new int [10];
		int []y=new int [10];//declara los arreglos y su tamano de 10
		Random nr=new Random();//importa el objeto random
		int sx=0,sy=0,sx2y2=0,sx2y=0,sxy2=0,sx_y=0;
		for (int i=0;i<x.length;i++)//
		{
			x[i]=nr.nextInt(10)+1;
			y[i]=nr.nextInt(10)+1;
		}//manda a llamar a los metodos
		sx=sumaX(x);
		sy=sumaY(y);//metodo que manda a llamar a un x y regresa un valor 
		sx2y2=sumax2y2(x,y);
		sx2y=sumax2y(x,y);
		sxy2=sumaxy2(x,y);
		sx_y=sumax_y2(x,y);
		inprimedatos(x,y,sx,sy,sx2y2,sx2y,sxy2,sx_y);
	}

	private static void inprimedatos(int[] x, int[] y, int sx, int sy, int sx2y2, int sx2y, int sxy2, int sx_y) {
		//imprime el resultado de la ecuacion 
		int a=0,b=0,c=0;
		System.out.println("x\t\ty\t\tx2*y2\t\tx2*y\t\tx*y2\t\tx-y\t\t");
		System.out.println("__________________________________________________________________________________");
		for (int i=0;i<x.length;i++)
			System.out.println(x[i]+"\t\t"+y[i]+"\t\t"+(int)Math.pow(x[i], 2)*(int)Math.pow(y[i], 2)+"\t\t"+(int)Math.pow(x[i], 2)*y[i]+"\t\t"+x[i]*(int)Math.pow(y[i], 2)+"\t\t"+(x[i]-y[i]));
		System.out.println("__________________________________________________________________________________");
		System.out.println(sx+"\t\t"+sy+"\t\t"+sx2y2+"\t\t"+sx2y+"\t\t"+sxy2+"\t\t"+sx_y);
		//imprime los datos de la ecuacion
		a=sx+sx2y2-sx2y;
		b=sxy2+sy-a;
		c=sx_y+a-b;
		System.out.println("Resultado de z = "+(a+b+c));
	}

	private static int sumax_y2(int[] x, int[] y) {
		int sx_y=0;
		for (int i=0;i<x.length;i++)
			sx_y+=x[i]-y[i];
		return sx_y;
	}

	private static int sumaxy2(int[] x, int[] y) {
		int sxy2=0;
		for (int i=0;i<x.length;i++)
			sxy2+=x[i]*Math.pow(y[i], 2);
		return sxy2;
	}

	private static int sumax2y(int[] x, int[] y) {
		int sx2y=0;
		for (int i=0;i<x.length;i++)
			sx2y+=Math.pow(x[i], 2)*y[i];
		return sx2y;
	}
	

	private static int sumax2y2(int[] x, int[] y) {
		int sx2y2=0;
		for (int i=0;i<x.length;i++)
			sx2y2+=Math.pow(x[i], 2)*Math.pow(y[i], 2);
		return sx2y2;
	}

	private static int sumaY(int[] y) {
		//obtiene la suma de los arreglos
	int sum=0;
	for (int i=0;i<y.length;i++)
		sum+=y[i];
	return sum;//se retorna la sumatoria de los arreglos 
	
	}

	private static int sumaX(int[] x) {
		//obtener suma de arreglos
		int su=0;
		for (int i=0;i<x.length;i++)
			su+=x[i];
		return su;
		
	}

}
