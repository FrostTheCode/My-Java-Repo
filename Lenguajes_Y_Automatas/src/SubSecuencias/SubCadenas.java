package SubSecuencias;

public class SubCadenas {
	
	public void SubCadCrea(String cad) {
		int tamc=cad.length();
		
		int let=cad.length();
		for(int i=0;i<=tamc;i++) {
			
			String prefiFras=cad.substring(0,let);
			System.out.println(prefiFras);
			System.out.println("");
			int zero=0;
			for(int j=0;j<=let;j++) {
				
				String subc=cad.substring(zero,let);
				System.out.println(subc);
				zero++;
			}
			let--;
		}
		
	}

}
