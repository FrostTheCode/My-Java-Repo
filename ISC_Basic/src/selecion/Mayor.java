package selecion;

import java.util.Scanner;

public class Mayor {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner in = new Scanner(System.in);
		System.out.println("ingresa el numero 1:");
		num1 =in.nextInt();
        System.out.println("ingresa el numero 2:");
        num2 =in.nextInt();
        if(num1 >num2) {
        	System.out.println("el numero "+num1+" es mayor que "+num2);
        }
        
        else if (num2>num1)
        	System.out.println("el numero "+num2+" es mayor que "+num1);
        else 
        	System.out.println(num1+"  es igual que "+num2);
	
	}
}
