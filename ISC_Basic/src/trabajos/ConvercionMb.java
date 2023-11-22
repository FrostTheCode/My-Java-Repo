package trabajos;

import java.util.Scanner;

public class ConvercionMb {

	public static void main(String[] args) {
		// Mb 1 = Kb 1000
        
         double Kb = 1000;
         int Mb;
         Scanner entrada = new Scanner(System.in);
         System.out.println("inserte los megabytes;");
         Mb =entrada.nextInt();
         System.out.println("esta es la convercion de megabytes a kilobytes: "+(Mb*Kb));
	}

}
