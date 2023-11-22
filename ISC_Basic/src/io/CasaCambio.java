package io;

import java.util.Scanner;

public class CasaCambio {

	public static void main(String[] args) {
		int dollar;
		double peso = 19.79;
		double euro = 21.80;
		double yen = 0.10;
		double libras = 24.12;
		double colombiano = 0.0057;
		double bolivar = 12737.99;
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingresa la cantidad de dolares:");
		dollar =entrada.nextInt(); 
		System.out.print("_____________________________________________________________________________________________________________________________________\n");
		System.out.println("Divisas");
		System.out.println("_________________________________________________________________________________________________________________________________");
		System.out.print("Dolar\t"+"Peso\t"+"\t\tEuro\t\t\t"+"Yen\t\t"+"\tLibras\t\t\t"+"Colombiano\t"+"\tBolivar\t"+"\n");
	    System.out.print((dollar)+"\t"+(dollar*peso)+"\t"+(peso/euro)*dollar+"\t"+(peso/yen)*dollar+"\t"+(peso/libras)*dollar+"\t"+(peso/colombiano)*dollar+"\t"+(peso/bolivar)*dollar);
		

	}

}
