package trabajos;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a,b,c;
          Scanner in = new Scanner(System.in);
 		 System.out.println("inserte el numero A");
 		 a = in.nextInt();
 		 System.out.println("inserte el numero B");
 		 b = in.nextInt();
 		System.out.println("inserte el numero C");
		 c = in.nextInt();
		 System.out.println("el area de un triangulo es:"+(a+b+c/2)*(a+b+c/2-a)+((a+b+c/2-b)*(a+b+c/2-c))*1/2);
		 
		 
	}

}
