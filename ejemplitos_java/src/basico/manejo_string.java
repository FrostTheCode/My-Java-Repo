package basico;

public class manejo_string {

	public static void main(String[] args) {
		String cad="Televisa";
		
		System.out.println("mi nombre es: "+cad);//aqui solo muestra que es lo que tiene la var cad
		System.out.println("mi nombre tiene :"+cad.length()+" letras"); //la var cad con el metodo length cuenta la cantidad de letras que tiene la cadena cad
		System.out.println("la primera letra de mi nombre es: "+cad.charAt(0));//la var cad con el metodo charAt escribe la letra de la posicion marcada con el numero en charAt
		System.out.println("la primera letra de "+cad+" es: "+cad.charAt(0));
		
		//ejemplito para el uso conjugado de este pedo
		int ult;
		ult=cad.length();
		System.out.println("la primera letra de "+cad+" es: "+cad.charAt(ult-1));
		//termino del ejemplito
		
		//ejemplo de manejo del subString, alv si funciona
		String frase="ABC";
		ult=frase.length();
		String prefiFrase=frase.substring(0,ult);//subString maneja dos parametros 0 es donde inicia la palabra y ult es donde termina la frase
		System.out.println(prefiFrase);
		System.out.println("");
		//termino del ejemplo
		
		//ejemplo prefijos de una cadena
		int let=frase.length();
		for(int i=0;i<=ult;i++) {
			
			String prefiFras=frase.substring(0,let);
			System.out.println(prefiFras);
			let--;
		}
		//termino del prefijo
			
			//ejemplo subfijos de una cadena
			int gag=frase.length();
			int man=0;
			for(int j=0;j<=gag;j++) {
				
				String subFras=frase.substring(man,gag);
				System.out.println(subFras);
				man++;
			}
			//termino del ejemplo
			System.out.println("pinches subsecs");
			System.out.println("");
			int sep=ult;
			int mans=0;
			for(int l=0;l<=ult;l++) {
				
				String prefiFras=cad.substring(0,let);
				System.out.println("");
				System.out.println(prefiFras);
				System.out.println("");
				CharSequence subsc=cad.subSequence(man, ult);
				System.out.println(subsc);
				man++;
				let--;
			
				}
			  }
			

}
