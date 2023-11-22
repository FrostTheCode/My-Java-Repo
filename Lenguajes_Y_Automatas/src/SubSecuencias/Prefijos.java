package SubSecuencias;

import java.util.Scanner;

public class Prefijos {
	
	
		
	public static void Prefijoscrear(String cad) {
		
		int tamc=cad.length();
		
		int let=cad.length();
		for(int i=0;i<=tamc;i++) {
			
			String prefiFras=cad.substring(0,let);
			System.out.println(prefiFras);
			let--;
		
		
		
		}
	}
	

}
