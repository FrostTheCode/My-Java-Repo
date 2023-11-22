package io;

import java.util.Scanner;

public class SalarioEmpleado {

	public static void main(String[] args) {
		// Calcula el salario de un empleado
		String empresa;
		String empleado;
        double salario;
        int diasTrabajados;
        double isr;
        double bono;
        Scanner entrada = new Scanner (System.in);
        System.out.println("ingresa el nombre de la empresa:");
        empresa= entrada.nextLine(); //Monstern Company
        System.out.println("ingresa el nombre del empleado:");
        empleado= entrada.nextLine(); //jose antonio juarez lopez
        System.out.println("ingresa los dias Trabajados:");
        diasTrabajados= entrada.nextInt();// 18
        System.out.println("ingresa el salario del trabajador:");
        salario= entrada.nextDouble();//420
        System.out.println("ingresa el isr:");
        isr= entrada.nextDouble();//30%
        System.out.println("ingresa la cantidad del bono otorgado:");
        bono= entrada.nextDouble();//2150
        System.out.println(empresa);
      //(salario*diastrabajados)*0.30/100+2150
        System.out.println("El empleado:"+ empleado +" tiene un salario de:"+(salario*diasTrabajados)*0.30/100+bono);
       
	}

}
