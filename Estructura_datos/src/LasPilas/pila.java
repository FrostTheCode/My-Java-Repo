package LasPilas;

public class pila {
	private  int tope=0,maxi;
	private String pil[];
	
	public pila (int max)
	{
		maxi=max;
		pil=new String[maxi];
	}
	public void agr(String co)
	{
		if (tope<maxi)
		{
			pil[tope]=co;
			tope++;
			System.out.println("el dato se ha agregado!");
		}
		else System.out.println("la pila esta llena");
	}

	public void eli()
	{
		if (tope>0)
		{
			System.out.println("el dato ha sido eliminado");
			tope--;
		}
		else System.out.println("no hay datos a eliminar");
	}
	
	public boolean vac()
	{
		if (tope<=0)
			return true;
		else return false;
	}
	
	public boolean bus(String dat)
	{
		boolean find=false;
		if (!vac())
		{
			for (int i=(tope-1);i>=0;i--)
			{
				if (pil[i].equals(dat))
				find=true;
				
			}
		}
		else System.out.println("no existe datos para buscar");
		return find;
	}
	
	public void mos()
	{
		if (!vac())
		for (int i=(tope-1);i>=0;i--)
			System.out.println(pil[i]);
		else System.out.println("la pila esta vacia!");
	}
	
}
