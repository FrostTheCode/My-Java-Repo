package SubSecuencias;

public class SubSecs {
	
public static void SubSecu(String cad) {
		
		int tamc=cad.length();
		int man=0;
		int let=cad.length();
		for(int i=0;i<=tamc;i++) {
			
			String prefiFras=cad.substring(0,let);
			System.out.println("");
			System.out.println(prefiFras);
			System.out.println("");
			
			CharSequence subsc=cad.subSequence(man, tamc);
			System.out.println(subsc);
			man++;
			let--;
		
			}
			
		}
}
