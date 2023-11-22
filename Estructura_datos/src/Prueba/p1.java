package Prueba;
import java.util.Scanner;
public class p1 {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int num,opc;
		System.out.println("ingrese el numero deseado: ");
		num=read.nextInt();
		System.out.println("elija la tabla deseada:/n1.-suma/n2.-multiplicacion:");
		opc=read.nextInt();
		switch (opc)
		{
		case 1:
			int i;
			for (i=1;i<=10;i++)
				System.out.println(num+" + "+i+" = "+(num+i));
			break;
		case 2:
			int j;
			for (j=1;j<=10;j++)
				System.out.println(num+" * "+j+" = "+(num*j));
			break;
		}	
	}
}
