package trabajos;

import java.util.Scanner;

public class OperacionesExamen {

	public static void main(String[] args) {
		int num1,num2;
		 Scanner in = new Scanner(System.in);
		 System.out.println("inserte el primer numero");
		 num1 = in.nextInt();
		 System.out.println("inserte el segundo numero");
		 num2 = in.nextInt();
		 System.out.println("valor 1\tvalor 2\tsuma\tresta\tmultiplicacion\tdivicion\tresiduo");
		 System.out.print(num1+"\t");
		 System.out.print(num2+"\t");
		 System.out.print(num1+num2+"\t");
		 System.out.print(num1-num2+"\t");
		 System.out.print(num1*num2+"\t\t");
		 System.out.print(num1/num2+"\t\t");
		 System.out.print(num1%num2+"\t");


	}

}
