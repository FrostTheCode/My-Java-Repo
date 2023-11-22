package Prueba;
import java.util.Scanner;
public class p2 {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int opc;
		System.out.println("1.-no. de tres digitos/n2.-no. de cuatro digitos");
		opc=read.nextInt();
		switch(opc)
		{
		case 1:
		String nu = "312";
		 if (nu.length()==3) {
		 System.out.println("El número es "+nu);
		 }else{
		 System.out.println("El numero es muy grande");
		 }
		 break;
		case 2:
			String no = "3124";
			 if (no.length()==4) {
			 System.out.println("El número es "+no);
			 }else{
			 System.out.println("El numero es muy grande");
			 }
		}
	}
}
