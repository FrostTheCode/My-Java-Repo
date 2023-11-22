package repaso;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		int l;
		Scanner in = new Scanner(System.in);
		System.out.println("ingresa el limite: ");
		l=in.nextInt();
		for (int i=1;i<=l;i++)
		{
			if (i%5==0)
		System.out.println(i+"\t");
		}
	}

}
