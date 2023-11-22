package Asosioacion;

import java.util.Scanner;

public class Mayordetres {
	public void mayortres()
	{
		int x,y,z;
		Scanner in =new Scanner (System.in);
		System.out.println("ingresa el primer valor");
	    x=in.nextInt();
	    System.out.println("ingresa el segundo valor");
	    y=in.nextInt();
	    System.out.println("ingresa el tercer valor");
	    z=in.nextInt();
	    if (x>y && x>z)
	    	System.out.println("el numero mayor es "+x);
	    else if(y>x&&y>z)
	    	System.out.println("el numero mayor es "+y);
	    else 
	    	System.out.println("el numero mayor es "+z);
	}
	

}
