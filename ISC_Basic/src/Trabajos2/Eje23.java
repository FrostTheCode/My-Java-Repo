package Trabajos2;

import java.util.Scanner;

public class Eje23 {

	public static void main(String[] args) {
	    int d,a;
	    String m;
		Scanner in = new Scanner(System.in);
		System.out.println("inserta el year: ");
		a=in.nextInt();
		if (a>=1000 && a<=10000) {
			System.out.println("el year esta correcto");
			System.out.println("inserta el mes: ");
			m=in.nextLine();
		switch (m)
		{
		case "enero":
			System.out.println("la fecha es correcta");
			System.out.println("inserte el dia");
			d=in.nextInt();
			if(d<=31&&d>=1) {
				System.out.println("la fecha es correcta");
			    System.out.println("la fecha es: "+a+"\t"+m+"\t"+d);
			}
		    else System.out.println("la fecha es incorrecta");
		case "febrero":
			System.out.println("la fecha es correcta");
			System.out.println("inserte el dia");
			d=in.nextInt();
			if(d<=28&&d>=1) {
				System.out.println("la fecha es correcta");
			    System.out.println("la fecha es: "+a+"\t"+m+"\t"+d);
			}
		    else System.out.println("la fecha es incorrecta");
		case "marzo":
			System.out.println("la fecha es correcta");
			System.out.println("inserte el dia");
			d=in.nextInt();
			if(d<=31&&d>=1) {
				System.out.println("la fecha es correcta");
			    System.out.println("la fecha es: "+a+"\t"+m+"\t"+d);
			}
		    else System.out.println("la fecha es incorrecta");
		case "abril":
			System.out.println("la fecha es correcta");
			System.out.println("inserte el dia");
			d=in.nextInt();
			if(d<=30&&d>=1) {
				System.out.println("la fecha es correcta");
			    System.out.println("la fecha es: "+a+"\t"+m+"\t"+d);
			}
		    else System.out.println("la fecha es incorrecta");
		case "mayo":
			System.out.println("la fecha es correcta");
			System.out.println("inserte el dia");
			d=in.nextInt();
			if(d<=31&&d>=1) {
				System.out.println("la fecha es correcta");
			    System.out.println("la fecha es: "+a+"\t"+m+"\t"+d);
			}
		    else System.out.println("la fecha es incorrecta");
		case "junio":
			System.out.println("la fecha es correcta");
			System.out.println("inserte el dia");
			d=in.nextInt();
			if(d<=30&&d>=1) {
				System.out.println("la fecha es correcta");
			    System.out.println("la fecha es: "+a+"\t"+m+"\t"+d);
			}
		    else System.out.println("la fecha es incorrecta");
		case "julio":
			System.out.println("la fecha es correcta");
			System.out.println("inserte el dia");
			d=in.nextInt();
			if(d<=31&&d>=1) {
				System.out.println("la fecha es correcta");
			    System.out.println("la fecha es: "+a+"\t"+m+"\t"+d);
			}
		    else System.out.println("la fecha es incorrecta");
		case "agosto":
			System.out.println("la fecha es correcta");
			System.out.println("inserte el dia");
			d=in.nextInt();
			if(d<=31&&d>=1) {
				System.out.println("la fecha es correcta");
			    System.out.println("la fecha es: "+a+"\t"+m+"\t"+d);
			}
		    else System.out.println("la fecha es incorrecta");
		case "septiembre":
			System.out.println("la fecha es correcta");
			System.out.println("inserte el dia");
			d=in.nextInt();
			if(d<=30&&d>=1) {
				System.out.println("la fecha es correcta");
			    System.out.println("la fecha es: "+a+"\t"+m+"\t"+d);
			}
		    else System.out.println("la fecha es incorrecta");
		case "octubre":
			System.out.println("la fecha es correcta");
			System.out.println("inserte el dia");
			d=in.nextInt();
			if(d<=31&&d>=1) {
				System.out.println("la fecha es correcta");
			    System.out.println("la fecha es: "+a+"\t"+m+"\t"+d);
			}
		    else System.out.println("la fecha es incorrecta");
		case "noviembre":
			System.out.println("la fecha es correcta");
			System.out.println("inserte el dia");
			d=in.nextInt();
			if(d<=30&&d>=1) {
				System.out.println("la fecha es correcta");
			    System.out.println("la fecha es: "+a+"\t"+m+"\t"+d);
			}
		    else System.out.println("la fecha es incorrecta");
		case "diciembre":
			System.out.println("la fecha es correcta");
			System.out.println("inserte el dia");
			d=in.nextInt();
			if(d<=31&&d>=1) {
				System.out.println("la fecha es correcta");
			    System.out.println("la fecha es: "+a+"\t"+m+"\t"+d);
			}
			    else System.out.println("la fecha es incorrecta");
			    	
		}
		}
		else
			System.out.println("la fecha es incorrecta");
 
	}

}
