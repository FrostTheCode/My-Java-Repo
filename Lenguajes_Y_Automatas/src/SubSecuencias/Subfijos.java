package SubSecuencias;

public class Subfijos {
	
public static void subFijoscrear(String cad) {
		
		int tamc=cad.length();
		int zero=0;
		for(int j=0;j<=tamc;j++) {
			
			String subFras=cad.substring(zero,tamc);
			System.out.println(subFras);
			zero++;
		
			}
		}
}
