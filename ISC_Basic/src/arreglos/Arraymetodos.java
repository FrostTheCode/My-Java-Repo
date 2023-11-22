package arreglos;

import java.util.Random;

public class Arraymetodos {

	public static void main(String[] args) {
		// inicializa dos arreglos con numeros random
		inicializa();
	}

	private static void inicializa() {
		int []array1 = new int[10];//declaramos el arreglo de tamano 1-
		int []array2 = new int [10];
		Random nr = new Random();//declara un objeto de la clase random
		//inicializar los arreglos con numeros random
		for (int i=0;i<array1.length;i++)
		{
			array1[i]=nr.nextInt(50);//asigna datos enteros de 0 a 50
			array2[i]=nr.nextInt(50);	
		}//fin del for
		//llamamos al metodo suma arreglos 
		sumaarreglos(array1,array2);
		restaArreglos(array1,array2);
		multiplicaArreglos(array1,array2);
		divicionarr(array1,array2);
		residuoArr(array1,array2);
	}//finb del metodo inicializa

	private static void residuoArr(int[] ar1, int[] array2) {
		// TODO Auto-generated method stub
		System.out.println("Arreglo 1\tArreglo2\tResiduo");
		System.out.println("___________________________________________________");
		for(int i=0;i<ar1.length;i++)
		System.out.println(ar1[i]+"\t"+array2[i]+"\t"+ar1[i]%array2[i]);
		
	}

	private static void divicionarr(int[] array1, int[] array2) {
		System.out.println("Arreglo 1\tArreglo2\tDivicion");
		System.out.println("___________________________________________________");
		for (int i=0;i<array1.length;i++)
			System.out.println(array1[i]+"\t"+array2[i]+"\t"+array1[i]/array2[i]);
	}

	private static void restaArreglos(int[] array1, int[] array2) {
		// TODO Auto-generated method stub
		System.out.println("Arreglo 1\tArreglo2\tResta");
		System.out.println("___________________________________________________");
		for (int i=0;i<array1.length;i++)
			System.out.println(array1[i]+"\t"+array2[i]+"\t"+(array1[i]-array2[i]));
	}

	private static void multiplicaArreglos(int[] array1, int[] array2) {
		System.out.println("Arreglo 1\tArreglo2\tMultiplicacion");
		System.out.println("___________________________________________________");
		for (int i=0;i<array1.length;i++)
			System.out.println(array1[i]+"\t"+array2[i]+"\t"+array1[i]*array2[i]);
		
	}

	private static void sumaarreglos(int[] ar1, int[] ar2) {
	    //realiza la suma de los arreglos y los imprime en pantalla 
		System.out.println("arreglo 1\tarreglo 2\tSuma");
		System.out.println("___________________________________________");
		for (int i=0;i<ar1.length;i++)
			System.out.println(ar1[i]+"\t\t"+ar2[i]+"\t"+"\t"+ar1[i]+ar2[i]);
		
	}

}
