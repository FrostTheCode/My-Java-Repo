package SubSecuencias;

import java.util.Scanner;

public class Principal_Sub {

	public static void main(String[] args) {
		Prefijos pre=new Prefijos();
		Subfijos sfj=new Subfijos();
		SubCadenas sbc=new SubCadenas();
		SubSecs ssc=new SubSecs();
		
		int tam;
		String cad;
		Scanner read = new Scanner (System.in);
		System.out.println("Ingrese la cadena a modificar: ");
		cad=read.next();
		
		System.out.println("Prefijos de la cadena: "+cad);
		System.out.println("");
		pre.Prefijoscrear(cad);
		System.out.println("");
		
		System.out.println("Subfijos de la cadena: "+cad);
		System.out.println("");
		sfj.subFijoscrear(cad);
		System.out.println("");
		
		System.out.println("Subcadenas de la cadena: "+cad);
		System.out.println("");
		sbc.SubCadCrea(cad);
		System.out.println("");
		
		System.out.println("SubSecuencis de la cadena: "+cad);
		System.out.println("");
		ssc.SubSecu(cad);
		System.out.println("");
		
	}

}
