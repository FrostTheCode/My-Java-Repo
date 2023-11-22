package memoria_recursiva;

public class eje_recursivo {

	public static void main(String[] args) {
		eje_recursivo ol=new eje_recursivo();
		ol.baj_esc(20);
	}
	// crear un metodo para bajar una escalera de manera recursiva
			public void baj_esc(int esc)
			{
				if (esc==0)
				{//caso base, respuesta explicita
					System.out.println("has bajado las escaleras");
				}
				else 
				{//dominio, division del problema og prom-1
					try {
						Thread.sleep(1000);
					} 
					catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("bajando el escalon "+esc);
					//usando la recursividad
					baj_esc(esc-1);
				}
				
			}


}
