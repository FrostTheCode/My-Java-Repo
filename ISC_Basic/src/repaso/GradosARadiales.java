package repaso;

import java.util.Scanner;

public class GradosARadiales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double g,r;
		Scanner in=new Scanner(System.in);
		System.out.println("ingresa los grados c ");
		g=in.nextDouble();
		if (g>=360)
			g=(g%360);
		r=((g*Math.PI)/180);
		System.out.println("la equivalencia de grados a radiales es: "+r);

	}

}
