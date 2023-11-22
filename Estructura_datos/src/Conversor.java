	import java.util.Scanner;
// clase pa convertir de decimal a binario, octal y hexadesimal
public class Conversor {
	public static String binario(int deci)
	{
		String bin="";
		int cosiente,residuo;
		cosiente=deci;
		do {
			residuo=cosiente%2;
			bin=residuo+bin;
			cosiente=cosiente/2;
		}while (cosiente!=0);
		return bin;
	}
	public static String octal(int deci)
	{
		String oct="";
		int cosiente,residuo;
		cosiente=deci;
		do {
			residuo=cosiente%8;
			oct=residuo+oct;
			cosiente=cosiente/8;
		}while (cosiente!=0);
		return oct;
	}
	public static String hexadecimal(int deci)
	{
		String hex="";
		hex=Integer.toHexString(deci);
		return hex;
	}
}
