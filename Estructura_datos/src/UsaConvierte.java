import java.util.Scanner;
public class UsaConvierte {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int num;
		System.out.println("por favor ingrese un numero decimal: "); 
		num=read.nextInt();
		System.out.println("el binario del numero es: "+Conversor.binario(num));
		System.out.println("el octal del numero es: "+Conversor.octal(num));
		System.out.println("el hexadecimal del numero es: "+Conversor.hexadecimal(num));

	}

}
