package MD_Pila;

public class Pila {
	private nodoP cima;
	int ta;
	public Pila()
	{
		cima=null;
		ta=0;
	}
	public boolean esVacia()
	{
		return cima==null;
	}
	public void emp(int ele)
	{
		nodoP nu=new nodoP(ele);
		nu.sig=cima;
		cima=nu;
		ta++;
	}
	public int sacar()
	{
		int aux=cima.dato;
		cima=cima.sig;
		ta--;
		return aux;
	}
	public int Cima()
	{
		return cima.dato;
	}
	public int tamanioPila()
	{
		return ta;
	}
	public void limpPila()
	{
		while (!esVacia())
		{
			sacar();
		}
			
	}

}
