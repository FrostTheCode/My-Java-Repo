package arreglos;

public class Arreglos2 {

	public static void main(String[] args) {
		int[] edad = {19,18,18,0,18,18,19,20}; //tamano 8
		String[]nombre = {"h","s","j","n","e","c","j","y"};//tamano 8
		System.out.println(nombre.length);//imprime el tamano del arreglo
		for(int i=0;i<nombre.length;i++)
		{
			System.out.println("la edad de "+nombre[i]+" es "+edad[i]);
		}

	}

}
