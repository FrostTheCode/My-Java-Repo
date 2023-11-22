package selecion;

import java.util.Scanner;

public class Digito {

	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
        System.out.println("ingresa el numero: ");
        num=in.nextInt();
        if(num <= 9 && num >=-9) {
        	{
        	System.out.println("tu numero tiene un digito" );
        	}
        }
        else if(num <=99  && num >=-99)
        {
        	System.out.println("tu numero tiene dos digitos");
        }	
        else if (num <= 999 && num >=-999)
        {
        	System.out.println("tu numero tiene tres digitos");
        }
        else if (num <=9999 && num >= -9999)
        {
        	System.out.println("tu numero tiene cuatro digitos");
        }
        else System.out.println("tu numero tiene mas digitos");

	}

}
